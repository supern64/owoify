package me.supern64.owoify.mappings.word;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class FucToFwuc implements Mapping {
    public static Pattern FUC_TO_FWUC = Pattern.compile("([Ff])uc");
    public Word map(Word input) {
        return input.replace(FUC_TO_FWUC, "$1wuc");
    }
}
