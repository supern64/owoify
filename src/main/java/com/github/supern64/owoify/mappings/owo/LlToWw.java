package com.github.supern64.owoify.mappings.owo;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class LlToWw implements Mapping {
    public static Pattern LL_TO_WW = Pattern.compile("ll");
    public Word map(Word input) {
        return input.replace(LL_TO_WW, "ww");
    }
}
