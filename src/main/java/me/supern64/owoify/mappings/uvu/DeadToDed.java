package me.supern64.owoify.mappings.uvu;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class DeadToDed implements Mapping {
    public static Pattern DEAD_TO_DED_UPPER = Pattern.compile("Dead");
    public static Pattern DEAD_TO_DED_LOWER = Pattern.compile("dead");
    public Word map(Word input) {
        return input.replace(DEAD_TO_DED_UPPER, "Ded")
                    .replace(DEAD_TO_DED_LOWER, "ded");
    }
}
