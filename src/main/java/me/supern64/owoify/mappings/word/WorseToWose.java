package me.supern64.owoify.mappings.word;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class WorseToWose implements Mapping {
    public static Pattern WORSE_TO_WOSE = Pattern.compile("([Ww])orse");
    public Word map(Word input) {
        return input.replace(WORSE_TO_WOSE, "$1ose");
    }
}
