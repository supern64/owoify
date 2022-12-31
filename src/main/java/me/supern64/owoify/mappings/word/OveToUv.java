package me.supern64.owoify.mappings.word;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class OveToUv implements Mapping {
    public static Pattern OVE_TO_UV_UPPER = Pattern.compile("OVE");
    public static Pattern OVE_TO_UV_LOWER = Pattern.compile("ove");
    public Word map(Word input) {
        return input.replace(OVE_TO_UV_LOWER, "uv")
                    .replace(OVE_TO_UV_UPPER, "UV");
    }
}
