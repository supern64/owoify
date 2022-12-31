package me.supern64.owoify.mappings.word;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class NVowelToNy implements Mapping {
    public static Pattern N_VOWEL_TO_NY_FIRST = Pattern.compile("n([aeiou])");
    public static Pattern N_VOWEL_TO_NY_SECOND = Pattern.compile("N([aeiou])");
    public static Pattern N_VOWEL_TO_NY_THIRD = Pattern.compile("N([AEIOU])");
    @Override
    public Word map(Word input) {
        return input.replace(N_VOWEL_TO_NY_FIRST, "ny$1")
                    .replace(N_VOWEL_TO_NY_SECOND, "Ny$1")
                    .replace(N_VOWEL_TO_NY_THIRD, "NY$1");
    }
}
