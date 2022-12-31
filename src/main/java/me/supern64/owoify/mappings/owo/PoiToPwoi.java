package me.supern64.owoify.mappings.owo;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class PoiToPwoi implements Mapping {
    public static Pattern POI_TO_PWOI = Pattern.compile("([Pp])oi");
    public Word map(Word input) {
        return input.replace(POI_TO_PWOI, "$1woi");
    }
}
