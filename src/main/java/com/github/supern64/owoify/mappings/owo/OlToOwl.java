package com.github.supern64.owoify.mappings.owo;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class OlToOwl implements Mapping {
    public static Pattern OL_TO_OWL_UPPER = Pattern.compile("OL");
    public static Pattern OL_TO_OWL_LOWER = Pattern.compile("([Oo])l");
    public Word map(Word input) {
        return input.replace(OL_TO_OWL_LOWER, "$1wl")
                    .replace(OL_TO_OWL_UPPER, "OWL");
    }
}
