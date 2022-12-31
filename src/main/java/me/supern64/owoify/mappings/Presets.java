package me.supern64.owoify.mappings;

import me.supern64.owoify.mappings.word.*;
import me.supern64.owoify.mappings.owo.*;
import me.supern64.owoify.mappings.uwu.*;
import me.supern64.owoify.mappings.uvu.*;

import java.util.Arrays;
import java.util.List;

public class Presets {
    public static List<Mapping> SPECIFIC_WORD_MAPPINGS = Arrays.asList(
            new FucToFwuc(), new MomToMwom(), new TimeToTim(), new MeToMwe(), new NVowelToNy(), new OverToOwor(),
            new OveToUv(), new HahaToHeheXd(), new TheToTeh(), new YouToU(), new ReadToWead(), new WorseToWose(),
            new RememberToRember(), new WhenToWen());
    public static List<Mapping> OWO_MAPPINGS = Arrays.asList(
            new LlToWw(), new VowelOrRExceptOLToWL(), new OldToOwld(), new OlToOwl(), new LOrROToWo(),
            new SpecificConsonantsOToLetterAndWo(), new VOrWLeToWal(), new FiToFwi(), new VerToWer(), new PoiToPwoi(),
            new SpecificConsonantsLeToLetterAndWal(), new ConsonantRToConsonantW(), new LyToWy(), new PleToPwe(),
            new NrToNw()
    );
    public static List<Mapping> UWU_MAPPINGS = Arrays.asList(
            new BracketsToStarTrails(), new SpecificPunctuationToKaomoji(), new ThatToDat(), new ThToF(),
            new LeToWal(), new VeToWe(), new RyToWwy(), new ROrLToW()
    );
    public static List<Mapping> UVU_MAPPINGS = Arrays.asList(
            new OToOwo(), new EwToUwu(), new HeyToHay(), new DeadToDed(), new NVowelTToND()
    );
}
