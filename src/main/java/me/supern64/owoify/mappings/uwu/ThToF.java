package me.supern64.owoify.mappings.uwu;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class ThToF implements Mapping {
    public static Pattern TH_TO_F_UPPER = Pattern.compile("TH(?!E)");
    public static Pattern TH_TO_F_LOWER = Pattern.compile("[Tt]h(?![Ee])");

    public Word map(Word input) {
        return input.replace(TH_TO_F_LOWER, "f")
                    .replace(TH_TO_F_UPPER, "F");
    }
}
