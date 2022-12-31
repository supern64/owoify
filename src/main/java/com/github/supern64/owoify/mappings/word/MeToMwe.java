package com.github.supern64.owoify.mappings.word;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class MeToMwe implements Mapping {
    public static Pattern ME_TO_MWE = Pattern.compile("([Mm])e");
    public Word map(Word input) {
        return input.replace(ME_TO_MWE, "$1we");
    }
}
