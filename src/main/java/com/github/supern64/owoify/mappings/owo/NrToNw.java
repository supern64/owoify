package com.github.supern64.owoify.mappings.owo;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class NrToNw implements Mapping {
    public static Pattern NR_TO_NW_UPPER = Pattern.compile("NR");
    public static Pattern NR_TO_NW_LOWER = Pattern.compile("nr");
    public Word map(Word input) {
        return input.replace(NR_TO_NW_LOWER, "nw")
                    .replace(NR_TO_NW_UPPER, "NW");
    }
}
