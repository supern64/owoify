package me.supern64.owoify.mappings.uwu;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class ROrLToW implements Mapping {
    public static Pattern RORL_TO_W_UPPER = Pattern.compile("(?:R|L)");
    public static Pattern RORL_TO_W_LOWER = Pattern.compile("(?:r|l)");
    public Word map(Word input) {
        return input.replace(RORL_TO_W_LOWER, "w")
                    .replace(RORL_TO_W_UPPER, "W");
    }
}
