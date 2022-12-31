package com.github.supern64.owoify.mappings.owo;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class OldToOwld implements Mapping {
    public static Pattern OLD_TO_OWLD_UPPER = Pattern.compile("OLD");
    public static Pattern OLD_TO_OWLD_LOWER = Pattern.compile("([Oo])ld");
    public Word map(Word input) {
        return input.replace(OLD_TO_OWLD_LOWER, "$1wld")
                    .replace(OLD_TO_OWLD_UPPER, "OWLD");
    }
}
