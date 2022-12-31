package me.supern64.owoify.mappings.owo;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class FiToFwi implements Mapping {
    public static Pattern FI_TO_FWI_UPPER = Pattern.compile("FI");
    public static Pattern FI_TO_FWI_LOWER = Pattern.compile("([Ff])i");
    public Word map(Word input) {
        return input.replace(FI_TO_FWI_LOWER, "$1wi")
                    .replace(FI_TO_FWI_UPPER, "FWI");
    }
}
