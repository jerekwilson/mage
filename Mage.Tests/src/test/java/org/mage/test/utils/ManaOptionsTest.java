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
package org.mage.test.utils;

import mage.abilities.mana.ManaOptions;
import mage.constants.PhaseStep;
import mage.constants.Zone;
import mage.counters.CounterType;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mage.test.serverside.base.CardTestPlayerBase;

/**
 * This test checks if the calculated possible mana options are correct related
 * to the given mana sources available.
 *
 * @author LevelX2
 */
public class ManaOptionsTest extends CardTestPlayerBase {

    @Test
    public void testSimpleMana() {
        addCard(Zone.BATTLEFIELD, playerA, "Forest", 3);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 1, manaOptions.size());
        Assert.assertEquals("{G}{G}{G}", getManaOption(0, manaOptions));

    }

    // Tinder Farm enters the battlefield tapped.
    // {T}: Add {G} to your mana pool.
    // {T}, Sacrifice Tinder Farm: Add {R}{W} to your mana pool.
    @Test
    public void testTinderFarm() {
        addCard(Zone.BATTLEFIELD, playerA, "Tinder Farm", 3);

        setStopAt(2, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 4, manaOptions.size());
        Assert.assertEquals("{G}{G}{G}", getManaOption(0, manaOptions));
        Assert.assertEquals("{W}{R}{G}{G}", getManaOption(1, manaOptions));
        Assert.assertEquals("{W}{W}{R}{R}{G}", getManaOption(2, manaOptions));
        Assert.assertEquals("{W}{W}{W}{R}{R}{R}", getManaOption(3, manaOptions));

    }

    // Adarkar Wastes
    // {T}: Add {C} to your mana pool.
    // {T}: Add {W} or {U} to your mana pool. Adarkar Wastes deals 1 damage to you.
    @Test
    public void testAdarkarWastes() {
        addCard(Zone.BATTLEFIELD, playerA, "Adarkar Wastes", 3);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 10, manaOptions.size());
        Assert.assertEquals("{C}{C}{C}", getManaOption(0, manaOptions));
        Assert.assertEquals("{C}{C}{W}", getManaOption(1, manaOptions));
        Assert.assertEquals("{C}{C}{U}", getManaOption(2, manaOptions));
        Assert.assertEquals("{C}{W}{W}", getManaOption(3, manaOptions));
        Assert.assertEquals("{C}{W}{U}", getManaOption(4, manaOptions));
        Assert.assertEquals("{C}{U}{U}", getManaOption(5, manaOptions));
        Assert.assertEquals("{W}{W}{W}", getManaOption(6, manaOptions));
        Assert.assertEquals("{W}{W}{U}", getManaOption(7, manaOptions));
        Assert.assertEquals("{W}{U}{U}", getManaOption(8, manaOptions));
        Assert.assertEquals("{U}{U}{U}", getManaOption(9, manaOptions));
    }

    // Chromatic Sphere
    // {1}, {T}, Sacrifice Chromatic Sphere: Add one mana of any color to your mana pool. Draw a card.
    @Test
    public void testChromaticSphere() {
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 2);
        addCard(Zone.BATTLEFIELD, playerA, "Chromatic Sphere", 2);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 1, manaOptions.size());
        Assert.assertEquals("{Any}{Any}", getManaOption(0, manaOptions));
    }

    // Orochi Leafcaller
    // {G}: Add one mana of any color to your mana pool.
    @Test
    public void testOrochiLeafcaller() {
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 2);
        addCard(Zone.BATTLEFIELD, playerA, "Forest", 2);
        addCard(Zone.BATTLEFIELD, playerA, "Orochi Leafcaller", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 1, manaOptions.size());
        Assert.assertEquals("{W}{W}{Any}{Any}", getManaOption(0, manaOptions));
    }

    // Crystal Quarry
    // {T}: {1} Add  to your mana pool.
    // {5}, {T}: Add {W}{U}{B}{R}{G} to your mana pool.
    @Test
    public void testCrystalQuarry() {
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 2);
        addCard(Zone.BATTLEFIELD, playerA, "Forest", 2);
        addCard(Zone.BATTLEFIELD, playerA, "Crystal Quarry", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 1, manaOptions.size());
        Assert.assertEquals("{C}{W}{W}{G}{G}", getManaOption(0, manaOptions));
    }

    // Crystal Quarry
    // {T}: {1} Add  to your mana pool.
    // {5}, {T}: Add {W}{U}{B}{R}{G} to your mana pool.
    @Test
    public void testCrystalQuarry2() {
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 2);
        addCard(Zone.BATTLEFIELD, playerA, "Forest", 3);
        addCard(Zone.BATTLEFIELD, playerA, "Crystal Quarry", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 2, manaOptions.size());
        Assert.assertEquals("{C}{W}{W}{G}{G}{G}", getManaOption(0, manaOptions));
        Assert.assertEquals("{W}{U}{B}{R}{G}", getManaOption(1, manaOptions));
    }

    // Nykthos, Shrine to Nyx
    // {T}: Add {C} to your mana pool.
    // {2}, {T}: Choose a color. Add to your mana pool an amount of mana of that color equal to your devotion to that color. (Your devotion to a color is the number of mana symbols of that color in the mana costs of permanents you control.)
    @Test
    public void testNykthos1() {
        addCard(Zone.BATTLEFIELD, playerA, "Sedge Scorpion", 4);
        addCard(Zone.BATTLEFIELD, playerA, "Forest", 3);
        addCard(Zone.BATTLEFIELD, playerA, "Nykthos, Shrine to Nyx", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 2, manaOptions.size());
        Assert.assertEquals("{C}{G}{G}{G}", getManaOption(0, manaOptions));
        Assert.assertEquals("{G}{G}{G}{G}{G}", getManaOption(1, manaOptions));
    }

    @Test
    public void testNykthos2() {
        addCard(Zone.BATTLEFIELD, playerA, "Sedge Scorpion", 4);
        addCard(Zone.BATTLEFIELD, playerA, "Akroan Crusader", 3);
        addCard(Zone.BATTLEFIELD, playerA, "Forest", 3);
        addCard(Zone.BATTLEFIELD, playerA, "Nykthos, Shrine to Nyx", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 3, manaOptions.size());
        Assert.assertEquals("{C}{G}{G}{G}", getManaOption(0, manaOptions));
        Assert.assertEquals("{G}{G}{G}{G}{G}", getManaOption(1, manaOptions));
        Assert.assertEquals("{R}{R}{R}{G}", getManaOption(2, manaOptions));
    }

    @Test
    public void testNykthos3() {
        addCard(Zone.BATTLEFIELD, playerA, "Sylvan Caryatid", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Forest", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Nykthos, Shrine to Nyx", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 1, manaOptions.size());
        Assert.assertEquals("{C}{G}{Any}", getManaOption(0, manaOptions));
    }

    @Test
    public void testMix1() {
        // {1}, {T}, Sacrifice Chromatic Star: Add one mana of any color to your mana pool.
        // When Chromatic Star is put into a graveyard from the battlefield, draw a card.
        addCard(Zone.BATTLEFIELD, playerA, "Chromatic Star", 1);
        // {1}, {T}, Sacrifice Chromatic Sphere: Add one mana of any color to your mana pool. Draw a card.
        addCard(Zone.BATTLEFIELD, playerA, "Chromatic Sphere", 1);
        // {T}: Add {C} to your mana pool. If you control an Urza's Mine and an Urza's Power-Plant, add {C}{C}{C} to your mana pool instead.
        addCard(Zone.BATTLEFIELD, playerA, "Urza's Tower", 1);
        // {T}: Add {C} to your mana pool.
        // {T}: Add {R} or {G} to your mana pool. Each opponent gains 1 life.
        addCard(Zone.BATTLEFIELD, playerA, "Grove of the Burnwillows", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 2, manaOptions.size());
        Assert.assertEquals("{Any}{Any}", getManaOption(0, manaOptions));
        Assert.assertEquals("{Any}{Any}", getManaOption(1, manaOptions));
    }

    @Test
    public void testFetidHeath() {
        addCard(Zone.BATTLEFIELD, playerA, "Fetid Heath", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 4, manaOptions.size());
        Assert.assertEquals("{C}{W}", getManaOption(0, manaOptions));
        Assert.assertEquals("{W}{W}", getManaOption(1, manaOptions));
        Assert.assertEquals("{W}{B}", getManaOption(2, manaOptions));
        Assert.assertEquals("{B}{B}", getManaOption(3, manaOptions));
    }

    /**
     * Don't use mana sources that only reduce available mana
     */
    @Test
    public void testCabalCoffers1() {
        addCard(Zone.BATTLEFIELD, playerA, "Cabal Coffers", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 1, manaOptions.size());
        Assert.assertEquals("{W}{B}", getManaOption(0, manaOptions));
    }

    @Test
    public void testCabalCoffers2() {
        addCard(Zone.BATTLEFIELD, playerA, "Cabal Coffers", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 2);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 2, manaOptions.size());
        Assert.assertEquals("{W}{B}{B}", getManaOption(0, manaOptions));
        Assert.assertEquals("{B}{B}{B}", getManaOption(1, manaOptions));
    }

    @Test
    public void testMageRingNetwork() {
        // {T}: Add {C} to your mana pool.
        // {T}, {1} : Put a storage counter on Mage-Ring Network.
        // {T}, Remove X storage counters from Mage-Ring Network: Add {X} to your mana pool.
        addCard(Zone.BATTLEFIELD, playerA, "Mage-Ring Network", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 1, manaOptions.size());
        Assert.assertEquals("{C}{W}{B}", getManaOption(0, manaOptions));
    }

    @Test
    public void testMageRingNetwork2() {
        // {T}: Add {C} to your mana pool.
        // {T}, {1} : Put a storage counter on Mage-Ring Network.
        // {T}, Remove any number of storage counters from Mage-Ring Network: Add {C} to your mana pool for each storage counter removed this way.
        addCard(Zone.BATTLEFIELD, playerA, "Mage-Ring Network", 1);
        addCounters(1, PhaseStep.UPKEEP, playerA, "Mage-Ring Network", CounterType.STORAGE, 4);
        addCard(Zone.BATTLEFIELD, playerA, "Plains", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 1);

        setStopAt(1, PhaseStep.DRAW);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 1, manaOptions.size());
        Assert.assertEquals("{C}{C}{C}{C}{W}{B}", getManaOption(0, manaOptions));
    }

    @Test
    @Ignore  // TriggeredManaAbilities not supported yet for getAvailableMana
    public void testCryptGhast() {
        //Extort (Whenever you cast a spell, you may pay {WB}. If you do, each opponent loses 1 life and you gain that much life.)
        // Whenever you tap a Swamp for mana, add {B} to your mana pool (in addition to the mana the land produces).
        addCard(Zone.BATTLEFIELD, playerA, "Crypt Ghast", 1);

        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 1);

        setStopAt(1, PhaseStep.UPKEEP);
        execute();

        ManaOptions manaOptions = playerA.getAvailableManaTest(currentGame);

        Assert.assertEquals("mana variations don't fit", 1, manaOptions.size());
        Assert.assertEquals("{B}{B}", getManaOption(0, manaOptions));
    }

    // TODO
    // Test Calciform Pools combination mana lands
    private String getManaOption(int index, ManaOptions manaOptions) {
        if (manaOptions.size() < index + 1) {
            return "";
        }
        return manaOptions.get(index).toString();
    }
}
