package me.supern64.owoify.mappings.uvu;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class NVowelTToND implements Mapping {
    public static Pattern N_VOWEL_T_TO_ND = Pattern.compile("n[aeiou]*t");
    public Word map(Word input) {
        return input.replace(N_VOWEL_T_TO_ND, "nd");
    }
}
