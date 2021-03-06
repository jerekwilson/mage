/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class Magic2011 extends ExpansionSet {

    private static final Magic2011 instance = new Magic2011();

    public static Magic2011 getInstance() {
        return instance;
    }

    private Magic2011() {
        super("Magic 2011", "M11", ExpansionSet.buildDate(2010, 7, 16), SetType.CORE);
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Acidic Slime", 161, Rarity.UNCOMMON, mage.cards.a.AcidicSlime.class));
        cards.add(new SetCardInfo("Act of Treason", 121, Rarity.COMMON, mage.cards.a.ActOfTreason.class));
        cards.add(new SetCardInfo("Aether Adept", 41, Rarity.COMMON, mage.cards.a.AetherAdept.class));
        cards.add(new SetCardInfo("Air Servant", 42, Rarity.UNCOMMON, mage.cards.a.AirServant.class));
        cards.add(new SetCardInfo("Ajani Goldmane", 1, Rarity.MYTHIC, mage.cards.a.AjaniGoldmane.class));
        cards.add(new SetCardInfo("Ajani's Mantra", 2, Rarity.COMMON, mage.cards.a.AjanisMantra.class));
        cards.add(new SetCardInfo("Ajani's Pridemate", 3, Rarity.UNCOMMON, mage.cards.a.AjanisPridemate.class));
        cards.add(new SetCardInfo("Alluring Siren", 43, Rarity.UNCOMMON, mage.cards.a.AlluringSiren.class));
        cards.add(new SetCardInfo("Ancient Hellkite", 122, Rarity.RARE, mage.cards.a.AncientHellkite.class));
        cards.add(new SetCardInfo("Angelic Arbiter", 4, Rarity.RARE, mage.cards.a.AngelicArbiter.class));
        cards.add(new SetCardInfo("Angel's Feather", 201, Rarity.UNCOMMON, mage.cards.a.AngelsFeather.class));
        cards.add(new SetCardInfo("Arc Runner", 123, Rarity.COMMON, mage.cards.a.ArcRunner.class));
        cards.add(new SetCardInfo("Armored Ascension", 5, Rarity.UNCOMMON, mage.cards.a.ArmoredAscension.class));
        cards.add(new SetCardInfo("Armored Cancrix", 44, Rarity.COMMON, mage.cards.a.ArmoredCancrix.class));
        cards.add(new SetCardInfo("Assassinate", 81, Rarity.COMMON, mage.cards.a.Assassinate.class));
        cards.add(new SetCardInfo("Assault Griffin", 6, Rarity.COMMON, mage.cards.a.AssaultGriffin.class));
        cards.add(new SetCardInfo("Augury Owl", 45, Rarity.COMMON, mage.cards.a.AuguryOwl.class));
        cards.add(new SetCardInfo("Autumn's Veil", 162, Rarity.UNCOMMON, mage.cards.a.AutumnsVeil.class));
        cards.add(new SetCardInfo("Awakener Druid", 163, Rarity.UNCOMMON, mage.cards.a.AwakenerDruid.class));
        cards.add(new SetCardInfo("Azure Drake", 46, Rarity.COMMON, mage.cards.a.AzureDrake.class));
        cards.add(new SetCardInfo("Back to Nature", 164, Rarity.UNCOMMON, mage.cards.b.BackToNature.class));
        cards.add(new SetCardInfo("Baneslayer Angel", 7, Rarity.MYTHIC, mage.cards.b.BaneslayerAngel.class));
        cards.add(new SetCardInfo("Barony Vampire", 82, Rarity.COMMON, mage.cards.b.BaronyVampire.class));
        cards.add(new SetCardInfo("Berserkers of Blood Ridge", 124, Rarity.COMMON, mage.cards.b.BerserkersOfBloodRidge.class));
        cards.add(new SetCardInfo("Birds of Paradise", 165, Rarity.RARE, mage.cards.b.BirdsOfParadise.class));
        cards.add(new SetCardInfo("Black Knight", 83, Rarity.UNCOMMON, mage.cards.b.BlackKnight.class));
        cards.add(new SetCardInfo("Blinding Mage", 8, Rarity.COMMON, mage.cards.b.BlindingMage.class));
        cards.add(new SetCardInfo("Bloodcrazed Goblin", 125, Rarity.COMMON, mage.cards.b.BloodcrazedGoblin.class));
        cards.add(new SetCardInfo("Bloodthrone Vampire", 85, Rarity.COMMON, mage.cards.b.BloodthroneVampire.class));
        cards.add(new SetCardInfo("Blood Tithe", 84, Rarity.COMMON, mage.cards.b.BloodTithe.class));
        cards.add(new SetCardInfo("Bog Raiders", 86, Rarity.COMMON, mage.cards.b.BogRaiders.class));
        cards.add(new SetCardInfo("Brindle Boar", 166, Rarity.COMMON, mage.cards.b.BrindleBoar.class));
        cards.add(new SetCardInfo("Brittle Effigy", 202, Rarity.RARE, mage.cards.b.BrittleEffigy.class));
        cards.add(new SetCardInfo("Call to Mind", 47, Rarity.UNCOMMON, mage.cards.c.CallToMind.class));
        cards.add(new SetCardInfo("Cancel", 48, Rarity.COMMON, mage.cards.c.Cancel.class));
        cards.add(new SetCardInfo("Canyon Minotaur", 126, Rarity.COMMON, mage.cards.c.CanyonMinotaur.class));
        cards.add(new SetCardInfo("Captivating Vampire", 87, Rarity.RARE, mage.cards.c.CaptivatingVampire.class));
        cards.add(new SetCardInfo("Celestial Purge", 9, Rarity.UNCOMMON, mage.cards.c.CelestialPurge.class));
        cards.add(new SetCardInfo("Chandra Nalaar", 127, Rarity.MYTHIC, mage.cards.c.ChandraNalaar.class));
        cards.add(new SetCardInfo("Chandra's Outrage", 128, Rarity.COMMON, mage.cards.c.ChandrasOutrage.class));
        cards.add(new SetCardInfo("Chandra's Spitfire", 129, Rarity.UNCOMMON, mage.cards.c.ChandrasSpitfire.class));
        cards.add(new SetCardInfo("Child of Night", 88, Rarity.COMMON, mage.cards.c.ChildOfNight.class));
        cards.add(new SetCardInfo("Clone", 49, Rarity.RARE, mage.cards.c.Clone.class));
        cards.add(new SetCardInfo("Cloud Crusader", 10, Rarity.COMMON, mage.cards.c.CloudCrusader.class));
        cards.add(new SetCardInfo("Cloud Elemental", 50, Rarity.COMMON, mage.cards.c.CloudElemental.class));
        cards.add(new SetCardInfo("Combust", 130, Rarity.COMMON, mage.cards.c.Combust.class));
        cards.add(new SetCardInfo("Condemn", 11, Rarity.UNCOMMON, mage.cards.c.Condemn.class));
        cards.add(new SetCardInfo("Conundrum Sphinx", 51, Rarity.RARE, mage.cards.c.ConundrumSphinx.class));
        cards.add(new SetCardInfo("Corrupt", 89, Rarity.UNCOMMON, mage.cards.c.Corrupt.class));
        cards.add(new SetCardInfo("Crystal Ball", 203, Rarity.UNCOMMON, mage.cards.c.CrystalBall.class));
        cards.add(new SetCardInfo("Cudgel Troll", 167, Rarity.UNCOMMON, mage.cards.c.CudgelTroll.class));
        cards.add(new SetCardInfo("Cultivate", 168, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Cyclops Gladiator", 131, Rarity.RARE, mage.cards.c.CyclopsGladiator.class));
        cards.add(new SetCardInfo("Dark Tutelage", 90, Rarity.RARE, mage.cards.d.DarkTutelage.class));
        cards.add(new SetCardInfo("Day of Judgment", 12, Rarity.RARE, mage.cards.d.DayOfJudgment.class));
        cards.add(new SetCardInfo("Deathmark", 91, Rarity.UNCOMMON, mage.cards.d.Deathmark.class));
        cards.add(new SetCardInfo("Demolish", 132, Rarity.COMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Demon of Death's Gate", 92, Rarity.MYTHIC, mage.cards.d.DemonOfDeathsGate.class));
        cards.add(new SetCardInfo("Demon's Horn", 204, Rarity.UNCOMMON, mage.cards.d.DemonsHorn.class));
        cards.add(new SetCardInfo("Destructive Force", 133, Rarity.RARE, mage.cards.d.DestructiveForce.class));
        cards.add(new SetCardInfo("Diabolic Tutor", 93, Rarity.UNCOMMON, mage.cards.d.DiabolicTutor.class));
        cards.add(new SetCardInfo("Diminish", 52, Rarity.COMMON, mage.cards.d.Diminish.class));
        cards.add(new SetCardInfo("Disentomb", 94, Rarity.COMMON, mage.cards.d.Disentomb.class));
        cards.add(new SetCardInfo("Doom Blade", 95, Rarity.COMMON, mage.cards.d.DoomBlade.class));
        cards.add(new SetCardInfo("Dragon's Claw", 205, Rarity.UNCOMMON, mage.cards.d.DragonsClaw.class));
        cards.add(new SetCardInfo("Dragonskull Summit", 223, Rarity.RARE, mage.cards.d.DragonskullSummit.class));
        cards.add(new SetCardInfo("Drowned Catacomb", 224, Rarity.RARE, mage.cards.d.DrownedCatacomb.class));
        cards.add(new SetCardInfo("Dryad's Favor", 169, Rarity.COMMON, mage.cards.d.DryadsFavor.class));
        cards.add(new SetCardInfo("Duress", 96, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Duskdale Wurm", 170, Rarity.UNCOMMON, mage.cards.d.DuskdaleWurm.class));
        cards.add(new SetCardInfo("Earth Servant", 134, Rarity.COMMON, mage.cards.e.EarthServant.class));
        cards.add(new SetCardInfo("Elite Vanguard", 13, Rarity.UNCOMMON, mage.cards.e.EliteVanguard.class));
        cards.add(new SetCardInfo("Elixir of Immortality", 206, Rarity.UNCOMMON, mage.cards.e.ElixirOfImmortality.class));
        cards.add(new SetCardInfo("Elvish Archdruid", 171, Rarity.RARE, mage.cards.e.ElvishArchdruid.class));
        cards.add(new SetCardInfo("Ember Hauler", 135, Rarity.UNCOMMON, mage.cards.e.EmberHauler.class));
        cards.add(new SetCardInfo("Excommunicate", 14, Rarity.COMMON, mage.cards.e.Excommunicate.class));
        cards.add(new SetCardInfo("Fauna Shaman", 172, Rarity.RARE, mage.cards.f.FaunaShaman.class));
        cards.add(new SetCardInfo("Fiery Hellhound", 136, Rarity.COMMON, mage.cards.f.FieryHellhound.class));
        cards.add(new SetCardInfo("Fireball", 138, Rarity.UNCOMMON, mage.cards.f.Fireball.class));
        cards.add(new SetCardInfo("Fire Servant", 137, Rarity.UNCOMMON, mage.cards.f.FireServant.class));
        cards.add(new SetCardInfo("Flashfreeze", 53, Rarity.UNCOMMON, mage.cards.f.Flashfreeze.class));
        cards.add(new SetCardInfo("Fling", 139, Rarity.COMMON, mage.cards.f.Fling.class));
        cards.add(new SetCardInfo("Fog", 173, Rarity.COMMON, mage.cards.f.Fog.class));
        cards.add(new SetCardInfo("Foresee", 54, Rarity.COMMON, mage.cards.f.Foresee.class));
        cards.add(new SetCardInfo("Forest", 246, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 247, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 248, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 249, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Frost Titan", 55, Rarity.MYTHIC, mage.cards.f.FrostTitan.class));
        cards.add(new SetCardInfo("Gaea's Revenge", 174, Rarity.MYTHIC, mage.cards.g.GaeasRevenge.class));
        cards.add(new SetCardInfo("Gargoyle Sentinel", 207, Rarity.UNCOMMON, mage.cards.g.GargoyleSentinel.class));
        cards.add(new SetCardInfo("Garruk's Companion", 176, Rarity.COMMON, mage.cards.g.GarruksCompanion.class));
        cards.add(new SetCardInfo("Garruk's Packleader", 177, Rarity.UNCOMMON, mage.cards.g.GarruksPackleader.class));
        cards.add(new SetCardInfo("Garruk Wildspeaker", 175, Rarity.MYTHIC, mage.cards.g.GarrukWildspeaker.class));
        cards.add(new SetCardInfo("Giant Growth", 178, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Giant Spider", 179, Rarity.COMMON, mage.cards.g.GiantSpider.class));
        cards.add(new SetCardInfo("Glacial Fortress", 225, Rarity.RARE, mage.cards.g.GlacialFortress.class));
        cards.add(new SetCardInfo("Goblin Balloon Brigade", 140, Rarity.COMMON, mage.cards.g.GoblinBalloonBrigade.class));
        cards.add(new SetCardInfo("Goblin Chieftain", 141, Rarity.RARE, mage.cards.g.GoblinChieftain.class));
        cards.add(new SetCardInfo("Goblin Piker", 142, Rarity.COMMON, mage.cards.g.GoblinPiker.class));
        cards.add(new SetCardInfo("Goblin Tunneler", 143, Rarity.COMMON, mage.cards.g.GoblinTunneler.class));
        cards.add(new SetCardInfo("Goldenglow Moth", 15, Rarity.COMMON, mage.cards.g.GoldenglowMoth.class));
        cards.add(new SetCardInfo("Gravedigger", 98, Rarity.COMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Grave Titan", 97, Rarity.MYTHIC, mage.cards.g.GraveTitan.class));
        cards.add(new SetCardInfo("Greater Basilisk", 180, Rarity.COMMON, mage.cards.g.GreaterBasilisk.class));
        cards.add(new SetCardInfo("Harbor Serpent", 56, Rarity.COMMON, mage.cards.h.HarborSerpent.class));
        cards.add(new SetCardInfo("Haunting Echoes", 99, Rarity.RARE, mage.cards.h.HauntingEchoes.class));
        cards.add(new SetCardInfo("Hoarding Dragon", 144, Rarity.RARE, mage.cards.h.HoardingDragon.class));
        cards.add(new SetCardInfo("Holy Strength", 16, Rarity.COMMON, mage.cards.h.HolyStrength.class));
        cards.add(new SetCardInfo("Honor of the Pure", 17, Rarity.RARE, mage.cards.h.HonorOfThePure.class));
        cards.add(new SetCardInfo("Hornet Sting", 181, Rarity.COMMON, mage.cards.h.HornetSting.class));
        cards.add(new SetCardInfo("Howling Banshee", 100, Rarity.UNCOMMON, mage.cards.h.HowlingBanshee.class));
        cards.add(new SetCardInfo("Hunters' Feast", 182, Rarity.COMMON, mage.cards.h.HuntersFeast.class));
        cards.add(new SetCardInfo("Ice Cage", 57, Rarity.COMMON, mage.cards.i.IceCage.class));
        cards.add(new SetCardInfo("Incite", 145, Rarity.COMMON, mage.cards.i.Incite.class));
        cards.add(new SetCardInfo("Infantry Veteran", 18, Rarity.COMMON, mage.cards.i.InfantryVeteran.class));
        cards.add(new SetCardInfo("Inferno Titan", 146, Rarity.MYTHIC, mage.cards.i.InfernoTitan.class));
        cards.add(new SetCardInfo("Inspired Charge", 19, Rarity.COMMON, mage.cards.i.InspiredCharge.class));
        cards.add(new SetCardInfo("Island", 234, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 235, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 236, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 237, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jace Beleren", 58, Rarity.MYTHIC, mage.cards.j.JaceBeleren.class));
        cards.add(new SetCardInfo("Jace's Erasure", 59, Rarity.COMMON, mage.cards.j.JacesErasure.class));
        cards.add(new SetCardInfo("Jace's Ingenuity", 60, Rarity.UNCOMMON, mage.cards.j.JacesIngenuity.class));
        cards.add(new SetCardInfo("Jinxed Idol", 208, Rarity.RARE, mage.cards.j.JinxedIdol.class));
        cards.add(new SetCardInfo("Juggernaut", 209, Rarity.UNCOMMON, mage.cards.j.Juggernaut.class));
        cards.add(new SetCardInfo("Knight Exemplar", 20, Rarity.RARE, mage.cards.k.KnightExemplar.class));
        cards.add(new SetCardInfo("Kraken's Eye", 210, Rarity.UNCOMMON, mage.cards.k.KrakensEye.class));
        cards.add(new SetCardInfo("Lava Axe", 147, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Leyline of Anticipation", 61, Rarity.RARE, mage.cards.l.LeylineOfAnticipation.class));
        cards.add(new SetCardInfo("Leyline of Punishment", 148, Rarity.RARE, mage.cards.l.LeylineOfPunishment.class));
        cards.add(new SetCardInfo("Leyline of Sanctity", 21, Rarity.RARE, mage.cards.l.LeylineOfSanctity.class));
        cards.add(new SetCardInfo("Leyline of the Void", 101, Rarity.RARE, mage.cards.l.LeylineOfTheVoid.class));
        cards.add(new SetCardInfo("Leyline of Vitality", 183, Rarity.RARE, mage.cards.l.LeylineOfVitality.class));
        cards.add(new SetCardInfo("Lightning Bolt", 149, Rarity.COMMON, mage.cards.l.LightningBolt.class));
        cards.add(new SetCardInfo("Liliana's Caress", 103, Rarity.UNCOMMON, mage.cards.l.LilianasCaress.class));
        cards.add(new SetCardInfo("Liliana's Specter", 104, Rarity.COMMON, mage.cards.l.LilianasSpecter.class));
        cards.add(new SetCardInfo("Liliana Vess", 102, Rarity.MYTHIC, mage.cards.l.LilianaVess.class));
        cards.add(new SetCardInfo("Llanowar Elves", 184, Rarity.COMMON, mage.cards.l.LlanowarElves.class));
        cards.add(new SetCardInfo("Magma Phoenix", 150, Rarity.RARE, mage.cards.m.MagmaPhoenix.class));
        cards.add(new SetCardInfo("Mana Leak", 62, Rarity.COMMON, mage.cards.m.ManaLeak.class));
        cards.add(new SetCardInfo("Manic Vandal", 151, Rarity.COMMON, mage.cards.m.ManicVandal.class));
        cards.add(new SetCardInfo("Maritime Guard", 63, Rarity.COMMON, mage.cards.m.MaritimeGuard.class));
        cards.add(new SetCardInfo("Mass Polymorph", 64, Rarity.RARE, mage.cards.m.MassPolymorph.class));
        cards.add(new SetCardInfo("Merfolk Sovereign", 65, Rarity.RARE, mage.cards.m.MerfolkSovereign.class));
        cards.add(new SetCardInfo("Merfolk Spy", 66, Rarity.COMMON, mage.cards.m.MerfolkSpy.class));
        cards.add(new SetCardInfo("Mighty Leap", 22, Rarity.COMMON, mage.cards.m.MightyLeap.class));
        cards.add(new SetCardInfo("Mind Control", 67, Rarity.UNCOMMON, mage.cards.m.MindControl.class));
        cards.add(new SetCardInfo("Mind Rot", 105, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Mitotic Slime", 185, Rarity.RARE, mage.cards.m.MitoticSlime.class));
        cards.add(new SetCardInfo("Mountain", 242, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 243, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 244, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 245, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mystifying Maze", 226, Rarity.RARE, mage.cards.m.MystifyingMaze.class));
        cards.add(new SetCardInfo("Nantuko Shade", 106, Rarity.RARE, mage.cards.n.NantukoShade.class));
        cards.add(new SetCardInfo("Naturalize", 186, Rarity.COMMON, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Nature's Spiral", 187, Rarity.UNCOMMON, mage.cards.n.NaturesSpiral.class));
        cards.add(new SetCardInfo("Necrotic Plague", 107, Rarity.RARE, mage.cards.n.NecroticPlague.class));
        cards.add(new SetCardInfo("Negate", 68, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Nether Horror", 108, Rarity.COMMON, mage.cards.n.NetherHorror.class));
        cards.add(new SetCardInfo("Nightwing Shade", 109, Rarity.COMMON, mage.cards.n.NightwingShade.class));
        cards.add(new SetCardInfo("Obstinate Baloth", 188, Rarity.RARE, mage.cards.o.ObstinateBaloth.class));
        cards.add(new SetCardInfo("Ornithopter", 211, Rarity.UNCOMMON, mage.cards.o.Ornithopter.class));
        cards.add(new SetCardInfo("Overwhelming Stampede", 189, Rarity.RARE, mage.cards.o.OverwhelmingStampede.class));
        cards.add(new SetCardInfo("Pacifism", 23, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Palace Guard", 24, Rarity.COMMON, mage.cards.p.PalaceGuard.class));
        cards.add(new SetCardInfo("Phantom Beast", 69, Rarity.COMMON, mage.cards.p.PhantomBeast.class));
        cards.add(new SetCardInfo("Phylactery Lich", 110, Rarity.RARE, mage.cards.p.PhylacteryLich.class));
        cards.add(new SetCardInfo("Plains", 230, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 231, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 232, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 233, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Platinum Angel", 212, Rarity.MYTHIC, mage.cards.p.PlatinumAngel.class));
        cards.add(new SetCardInfo("Plummet", 190, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Preordain", 70, Rarity.COMMON, mage.cards.p.Preordain.class));
        cards.add(new SetCardInfo("Primal Cocoon", 191, Rarity.COMMON, mage.cards.p.PrimalCocoon.class));
        cards.add(new SetCardInfo("Primeval Titan", 192, Rarity.MYTHIC, mage.cards.p.PrimevalTitan.class));
        cards.add(new SetCardInfo("Prized Unicorn", 193, Rarity.UNCOMMON, mage.cards.p.PrizedUnicorn.class));
        cards.add(new SetCardInfo("Prodigal Pyromancer", 152, Rarity.UNCOMMON, mage.cards.p.ProdigalPyromancer.class));
        cards.add(new SetCardInfo("Protean Hydra", 194, Rarity.RARE, mage.cards.p.ProteanHydra.class));
        cards.add(new SetCardInfo("Pyretic Ritual", 153, Rarity.COMMON, mage.cards.p.PyreticRitual.class));
        cards.add(new SetCardInfo("Pyroclasm", 154, Rarity.UNCOMMON, mage.cards.p.Pyroclasm.class));
        cards.add(new SetCardInfo("Quag Sickness", 111, Rarity.COMMON, mage.cards.q.QuagSickness.class));
        cards.add(new SetCardInfo("Reassembling Skeleton", 112, Rarity.UNCOMMON, mage.cards.r.ReassemblingSkeleton.class));
        cards.add(new SetCardInfo("Redirect", 71, Rarity.RARE, mage.cards.r.Redirect.class));
        cards.add(new SetCardInfo("Relentless Rats", 113, Rarity.UNCOMMON, mage.cards.r.RelentlessRats.class));
        cards.add(new SetCardInfo("Reverberate", 155, Rarity.RARE, mage.cards.r.Reverberate.class));
        cards.add(new SetCardInfo("Rise from the Grave", 114, Rarity.UNCOMMON, mage.cards.r.RiseFromTheGrave.class));
        cards.add(new SetCardInfo("Roc Egg", 25, Rarity.UNCOMMON, mage.cards.r.RocEgg.class));
        cards.add(new SetCardInfo("Rootbound Crag", 227, Rarity.RARE, mage.cards.r.RootboundCrag.class));
        cards.add(new SetCardInfo("Rotting Legion", 115, Rarity.COMMON, mage.cards.r.RottingLegion.class));
        cards.add(new SetCardInfo("Royal Assassin", 116, Rarity.RARE, mage.cards.r.RoyalAssassin.class));
        cards.add(new SetCardInfo("Runeclaw Bear", 195, Rarity.COMMON, mage.cards.r.RuneclawBear.class));
        cards.add(new SetCardInfo("Sacred Wolf", 196, Rarity.COMMON, mage.cards.s.SacredWolf.class));
        cards.add(new SetCardInfo("Safe Passage", 26, Rarity.COMMON, mage.cards.s.SafePassage.class));
        cards.add(new SetCardInfo("Scroll Thief", 72, Rarity.COMMON, mage.cards.s.ScrollThief.class));
        cards.add(new SetCardInfo("Serra Angel", 27, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Serra Ascendant", 28, Rarity.RARE, mage.cards.s.SerraAscendant.class));
        cards.add(new SetCardInfo("Shiv's Embrace", 156, Rarity.UNCOMMON, mage.cards.s.ShivsEmbrace.class));
        cards.add(new SetCardInfo("Siege Mastodon", 29, Rarity.COMMON, mage.cards.s.SiegeMastodon.class));
        cards.add(new SetCardInfo("Sign in Blood", 117, Rarity.COMMON, mage.cards.s.SignInBlood.class));
        cards.add(new SetCardInfo("Silence", 30, Rarity.RARE, mage.cards.s.Silence.class));
        cards.add(new SetCardInfo("Silvercoat Lion", 31, Rarity.COMMON, mage.cards.s.SilvercoatLion.class));
        cards.add(new SetCardInfo("Sleep", 73, Rarity.UNCOMMON, mage.cards.s.Sleep.class));
        cards.add(new SetCardInfo("Solemn Offering", 32, Rarity.COMMON, mage.cards.s.SolemnOffering.class));
        cards.add(new SetCardInfo("Sorcerer's Strongbox", 213, Rarity.UNCOMMON, mage.cards.s.SorcerersStrongbox.class));
        cards.add(new SetCardInfo("Spined Wurm", 197, Rarity.COMMON, mage.cards.s.SpinedWurm.class));
        cards.add(new SetCardInfo("Squadron Hawk", 33, Rarity.COMMON, mage.cards.s.SquadronHawk.class));
        cards.add(new SetCardInfo("Stabbing Pain", 118, Rarity.COMMON, mage.cards.s.StabbingPain.class));
        cards.add(new SetCardInfo("Steel Overseer", 214, Rarity.RARE, mage.cards.s.SteelOverseer.class));
        cards.add(new SetCardInfo("Stone Golem", 215, Rarity.UNCOMMON, mage.cards.s.StoneGolem.class));
        cards.add(new SetCardInfo("Stormfront Pegasus", 34, Rarity.COMMON, mage.cards.s.StormfrontPegasus.class));
        cards.add(new SetCardInfo("Stormtide Leviathan", 74, Rarity.RARE, mage.cards.s.StormtideLeviathan.class));
        cards.add(new SetCardInfo("Sunpetal Grove", 228, Rarity.RARE, mage.cards.s.SunpetalGrove.class));
        cards.add(new SetCardInfo("Sun Titan", 35, Rarity.MYTHIC, mage.cards.s.SunTitan.class));
        cards.add(new SetCardInfo("Swamp", 238, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 239, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 240, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 241, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sword of Vengeance", 216, Rarity.RARE, mage.cards.s.SwordOfVengeance.class));
        cards.add(new SetCardInfo("Sylvan Ranger", 198, Rarity.COMMON, mage.cards.s.SylvanRanger.class));
        cards.add(new SetCardInfo("Temple Bell", 217, Rarity.RARE, mage.cards.t.TempleBell.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 229, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Thunder Strike", 157, Rarity.COMMON, mage.cards.t.ThunderStrike.class));
        cards.add(new SetCardInfo("Time Reversal", 75, Rarity.MYTHIC, mage.cards.t.TimeReversal.class));
        cards.add(new SetCardInfo("Tireless Missionaries", 36, Rarity.COMMON, mage.cards.t.TirelessMissionaries.class));
        cards.add(new SetCardInfo("Tome Scour", 76, Rarity.COMMON, mage.cards.t.TomeScour.class));
        cards.add(new SetCardInfo("Traumatize", 77, Rarity.RARE, mage.cards.t.Traumatize.class));
        cards.add(new SetCardInfo("Triskelion", 218, Rarity.RARE, mage.cards.t.Triskelion.class));
        cards.add(new SetCardInfo("Unholy Strength", 119, Rarity.COMMON, mage.cards.u.UnholyStrength.class));
        cards.add(new SetCardInfo("Unsummon", 78, Rarity.COMMON, mage.cards.u.Unsummon.class));
        cards.add(new SetCardInfo("Vengeful Archon", 37, Rarity.RARE, mage.cards.v.VengefulArchon.class));
        cards.add(new SetCardInfo("Viscera Seer", 120, Rarity.COMMON, mage.cards.v.VisceraSeer.class));
        cards.add(new SetCardInfo("Volcanic Strength", 158, Rarity.COMMON, mage.cards.v.VolcanicStrength.class));
        cards.add(new SetCardInfo("Voltaic Key", 219, Rarity.UNCOMMON, mage.cards.v.VoltaicKey.class));
        cards.add(new SetCardInfo("Vulshok Berserker", 159, Rarity.COMMON, mage.cards.v.VulshokBerserker.class));
        cards.add(new SetCardInfo("Wall of Frost", 79, Rarity.UNCOMMON, mage.cards.w.WallOfFrost.class));
        cards.add(new SetCardInfo("Wall of Vines", 199, Rarity.COMMON, mage.cards.w.WallOfVines.class));
        cards.add(new SetCardInfo("Warlord's Axe", 220, Rarity.UNCOMMON, mage.cards.w.WarlordsAxe.class));
        cards.add(new SetCardInfo("War Priest of Thune", 38, Rarity.UNCOMMON, mage.cards.w.WarPriestOfThune.class));
        cards.add(new SetCardInfo("Water Servant", 80, Rarity.UNCOMMON, mage.cards.w.WaterServant.class));
        cards.add(new SetCardInfo("Whispersilk Cloak", 221, Rarity.UNCOMMON, mage.cards.w.WhispersilkCloak.class));
        cards.add(new SetCardInfo("White Knight", 39, Rarity.UNCOMMON, mage.cards.w.WhiteKnight.class));
        cards.add(new SetCardInfo("Wild Evocation", 160, Rarity.RARE, mage.cards.w.WildEvocation.class));
        cards.add(new SetCardInfo("Wild Griffin", 40, Rarity.COMMON, mage.cards.w.WildGriffin.class));
        cards.add(new SetCardInfo("Wurm's Tooth", 222, Rarity.UNCOMMON, mage.cards.w.WurmsTooth.class));
        cards.add(new SetCardInfo("Yavimaya Wurm", 200, Rarity.COMMON, mage.cards.y.YavimayaWurm.class));
    }

}
