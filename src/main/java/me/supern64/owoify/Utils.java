package me.supern64.owoify;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Utils {
    public static List<String> getAllMatches(Matcher matcher) {
        matcher.reset();
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group());
        }
        return matches;
    }

    public static <T> List<T> interleaveList(List<T> firstList, List<T> secondList) {
        List<T> list = new ArrayList<>();
        List<T> observed = firstList;
        List<T> other = secondList;
        List<T> temp;

        while (observed.size() > 0) {
            list.add(observed.remove(0));
            temp = observed;
            observed = other;
            other = temp;
        }

        if (other.size() > 0) {
            list.addAll(other);
        }
        return list;
    }
}
