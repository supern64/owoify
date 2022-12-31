package me.supern64.owoify.mappings.uwu;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class RyToWwy implements Mapping {
    public static Pattern RY_TO_WWY = Pattern.compile("ry");
    public Word map(Word input) {
        return input.replace(RY_TO_WWY, "wwy");
    }
}
