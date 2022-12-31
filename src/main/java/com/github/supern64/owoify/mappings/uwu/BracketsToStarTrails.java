package com.github.supern64.owoify.mappings.uwu;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class BracketsToStarTrails implements Mapping {
    public static Pattern BRACKETS_TO_STARTRAILS_FORE = Pattern.compile("[({<]");
    public static Pattern BRACKETS_TO_STARTRAILS_REAR = Pattern.compile("[)}>]");

    public Word map(Word input) {
        return input.replace(BRACKETS_TO_STARTRAILS_FORE, "｡･:*:･ﾟ★,｡･:*:･ﾟ☆")
                    .replace(BRACKETS_TO_STARTRAILS_REAR, "☆ﾟ･:*:･｡,★ﾟ･:*:･｡");
    }
}
