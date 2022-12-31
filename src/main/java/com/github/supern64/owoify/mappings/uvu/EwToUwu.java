package com.github.supern64.owoify.mappings.uvu;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class EwToUwu implements Mapping {
    public static Pattern EW_TO_UWU = Pattern.compile("ew");
    public Word map(Word input) {
        return input.replace(EW_TO_UWU, "uwu");
    }
}
