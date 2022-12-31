package me.supern64.owoify.mappings.owo;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class LlToWw implements Mapping {
    public static Pattern LL_TO_WW = Pattern.compile("ll");
    public Word map(Word input) {
        return input.replace(LL_TO_WW, "ww");
    }
}
