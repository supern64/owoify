package com.github.supern64.owoify.mappings.word;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class MomToMwom implements Mapping {
    public static Pattern MOM_TO_MWOM = Pattern.compile("([Mm])om");
    public Word map(Word input) {
        return input.replace(MOM_TO_MWOM, "$1wom");
    }
}
