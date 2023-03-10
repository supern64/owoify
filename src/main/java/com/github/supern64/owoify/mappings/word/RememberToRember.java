package com.github.supern64.owoify.mappings.word;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class RememberToRember implements Mapping {
    public static Pattern REMEMBER_TO_REMBER = Pattern.compile("([Rr])emember");
    public Word map(Word input) {
        return input.replace(REMEMBER_TO_REMBER, "$1ember");
    }
}
