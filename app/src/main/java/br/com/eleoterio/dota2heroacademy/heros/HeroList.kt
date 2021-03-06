package br.com.eleoterio.dota2heroacademy.heros

import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.eleoterio.dota2heroacademy.R
import br.com.eleoterio.dota2heroacademy.heros.agilityHeros.*
import br.com.eleoterio.dota2heroacademy.heros.atributes.PrimaryAtribute
import br.com.eleoterio.dota2heroacademy.heros.inteligenceHeros.*
import br.com.eleoterio.dota2heroacademy.heros.strengthHeros.*

class HeroList {

    val heroes = listOf(
        AntiMage(),
        ArcWarden(),
        Bloodseeker(),
        BountyHunter(),
        Broodmother(),
        Clinkz(),
        DrowRanger(),
        EmberSpirit(),
        FacelessVoid(),
        Gyrocopter(),
        Juggernaut(),
        LoneDruid(),
        Luna(),
        Medusa(),
        Meepo(),
        Mirana(),
        MonkeyKing(),
        Morphling(),
        NagaSiren(),
        NyxAssassin(),
        Pangolier(),
        PhantomAssassin(),
        PhantomLancer(),
        Razor(),
        Riki(),
        ShadowFiend(),
        Slark(),
        Sniper(),
        Spectre(),
        Techies(),
        TemplarAssassin(),
        Terrorblade(),
        TrollWarlord(),
        Ursa(),
        VengefulSpirit(),
        Venomancer(),
        Viper(),
        Weaver(),
        AncientApparition(),
        Bane(),
        Batrider(),
        Chen(),
        CrystalMaiden(),
        DarkSee(),
        DarkWillow(),
        Dazzle(),
        DeathProphet(),
        Disruptor(),
        Enchantress(),
        Enigma(),
        Grimstroke(),
        Invoker(),
        Jakiro(),
        KeeperOfTheLight(),
        Leshrk(),
        Lich(),
        Lina(),
        Lion(),
        NaturesProphet(),
        Necrophos(),
        OgreMagi(),
        Oracle(),
        OutworldDevourer(),
        Puck(),
        Pugna(),
        QueenofPain(),
        Rubick(),
        ShadowDemon(),
        ShadowShaman(),
        Silencer(),
        SkywrathMage(),
        StormSpirit(),
        Tinker(),
        Visage(),
        VoidSpirit(),
        Warlock(),
        Windranger(),
        WinterWyvern(),
        WitchDoctor(),
        Zeus(),
        Abaddon(),
        Alchemist(),
        Axe(),
        Beastmaster(),
        Brewmaster(),
        Bristleback(),
        CentaurWarrunner(),
        ChaosKnight(),
        Clockwerk(),
        Doom(),
        DragonKnight(),
        Earthshaker(),
        EarthSpirit(),
        ElderTitan(),
        Huskar(),
        Io(),
        Kunkka(),
        LegionCommander(),
        Lifestealer(),
        Lycan(),
        Magnus(),
        Marte(),
        NightStalker(),
        Omniknight(),
        Phoenix(),
        Pudge(),
        SandKing(),
        Slardar(),
        Snapfire(),
        SpiritBreaker(),
        Sven(),
        Tidehunter(),
        Timbersaw(),
        Tiny(),
        TreantProtector(),
        Tusk(),
        Underlord(),
        Undying(),
        WraithKing()






    )
    val strengthHeros = heroes.filter { it.primaryAtribute == PrimaryAtribute.Strength }
    val intelligenceHeros = heroes.filter { it.primaryAtribute == PrimaryAtribute.Inteligence }
    val agilityHeros = heroes.filter { it.primaryAtribute == PrimaryAtribute.Agility }






}