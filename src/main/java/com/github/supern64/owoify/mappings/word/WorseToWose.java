package com.github.supern64.owoify.mappings.word;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class WorseToWose implements Mapping {
    public static Pattern WORSE_TO_WOSE = Pattern.compile("([Ww])orse");
    public Word map(Word input) {
        return input.replace(WORSE_TO_WOSE, "$1ose");
    }
}
