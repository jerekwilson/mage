/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.c;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.common.TopLibraryCardTypeCondition;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.continuous.BoostAllEffect;
import mage.abilities.effects.common.continuous.PlayWithTheTopCardRevealedEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.filter.StaticFilters;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;

/**
 * @author jeffwadsworth
 */
public class CrownOfConvergence extends CardImpl {

    private static final String rule1 = "As long as the top card of your library is a creature card, creatures you control that share a color with that card get +1/+1";

    public CrownOfConvergence(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{2}");

        // Play with the top card of your library revealed.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new PlayWithTheTopCardRevealedEffect()));

        // As long as the top card of your library is a creature card, creatures you control that share a color with that card get +1/+1.
        ConditionalContinuousEffect effect = new ConditionalContinuousEffect(new CrownOfConvergenceColorBoostEffect(), new TopLibraryCardTypeCondition(CardType.CREATURE), rule1);
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, effect));

        // {G}{W}: Put the top card of your library on the bottom of your library.
        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD, new CrownOfConvergenceEffect(), new ManaCostsImpl("{G}{W}")));
    }

    public CrownOfConvergence(final CrownOfConvergence card) {
        super(card);
    }

    @Override
    public CrownOfConvergence copy() {
        return new CrownOfConvergence(this);
    }
}

class CrownOfConvergenceColorBoostEffect extends BoostAllEffect {

    private static final FilterControlledCreaturePermanent filter = new FilterControlledCreaturePermanent("creatures you control");

    private static final String effectText = "creatures you control that share a color with that card get +1/+1";

    CrownOfConvergenceColorBoostEffect() {
        super(1, 1, Duration.WhileOnBattlefield, StaticFilters.FILTER_PERMANENT_CREATURE, false);
        staticText = effectText;
    }

    CrownOfConvergenceColorBoostEffect(CrownOfConvergenceColorBoostEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player you = game.getPlayer(source.getControllerId());
        if (you != null) {
            Card topCard = you.getLibrary().getFromTop(game);
            if (topCard != null) {
                for (Permanent permanent : game.getBattlefield().getActivePermanents(filter, source.getControllerId(), source.getSourceId(), game)) {
                    if (permanent.getColor(game).shares(topCard.getColor(game)) && !permanent.getColor(game).isColorless()) {
                        permanent.addPower(power.calculate(game, source, this));
                        permanent.addToughness(toughness.calculate(game, source, this));
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public CrownOfConvergenceColorBoostEffect copy() {
        return new CrownOfConvergenceColorBoostEffect(this);
    }
}

class CrownOfConvergenceEffect extends OneShotEffect {

    public CrownOfConvergenceEffect() {
        super(Outcome.Neutral);
        staticText = "Put the top card of your library on the bottom of your library";
    }

    public CrownOfConvergenceEffect(final CrownOfConvergenceEffect effect) {
        super(effect);
    }

    @Override
    public CrownOfConvergenceEffect copy() {
        return new CrownOfConvergenceEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player you = game.getPlayer(source.getControllerId());
        if (you != null) {
            Card card = you.getLibrary().removeFromTop(game);
            if (card != null) {
                card.moveToZone(Zone.LIBRARY, source.getSourceId(), game, false);
            }
            return true;
        }
        return false;
    }

}
