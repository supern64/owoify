package com.github.supern64.owoify.mappings.word;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class HahaToHeheXd implements Mapping {
    public static Pattern HAHA_TO_HEHE_XD = Pattern.compile("\\b(ha|hah|heh|hehe)+\\b");
    public Word map(Word input) {
        return input.replace(HAHA_TO_HEHE_XD, "hehe xD");
    }
}
