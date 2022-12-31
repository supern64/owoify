package com.github.supern64.owoify.mappings.uvu;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class OToOwo implements Mapping {
    public static Pattern O_TO_OWO = Pattern.compile("o");
    public Word map(Word input) {
        String replacement = Math.random() > 0.33 ? "owo" : "o";
        return input.replace(O_TO_OWO, replacement);
    }
}
