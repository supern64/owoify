package me.supern64.owoify;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static me.supern64.owoify.mappings.Presets.*;

public class Owoify {
    public static Pattern WORD_REGEX = Pattern.compile("\\S+");
    public static Pattern SPACE_REGEX = Pattern.compile("\\s+");

    enum OwoLevel {
        OWO,
        UWU,
        UVU
    }

    public static String owoify(String string) {
        return owoify(string, OwoLevel.OWO);
    }
    public static String owoify(String string, OwoLevel level) {
        List<String> words = Utils.getAllMatches(WORD_REGEX.matcher(string));
        List<String> spaces = Utils.getAllMatches(SPACE_REGEX.matcher(string));
        words = words.stream().map(word -> {
            Word wordObject = new Word(word);
            SPECIFIC_WORD_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
            switch (level) {
                case UVU:
                    UVU_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
                case UWU:
                    UWU_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
                case OWO:
                    OWO_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
                default:
                    break;
            }
            return wordObject.toString();
        }).collect(Collectors.toList());
        return String.join("", Utils.interleaveList(words, spaces));

    }

}
