package me.supern64.owoify.mappings.uvu;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class HeyToHay implements Mapping {
    public static Pattern HEY_TO_HAY = Pattern.compile("([Hh])ey");
    public Word map(Word input) {
        return input.replace(HEY_TO_HAY, "$1ay");
    }
}
