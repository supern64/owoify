package com.github.supern64.owoify.mappings.owo;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class ConsonantRToConsonantW implements Mapping {
    public static Pattern CONSONANT_R_TO_CONSONANT_W = Pattern.compile("([BbCcDdFfGgKkPpQqSsTtWwXxZz])r");
    public Word map(Word input) {
        return input.replace(CONSONANT_R_TO_CONSONANT_W, "$1w");
    }
}
