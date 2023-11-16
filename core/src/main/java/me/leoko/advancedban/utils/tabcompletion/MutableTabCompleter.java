package me.leoko.advancedban.utils.tabcompletion;

import java.util.ArrayList;
import java.util.Arrays;

public interface MutableTabCompleter extends TabCompleter {
    static <T> ArrayList<T> list(T... elements) {
        return new ArrayList<T>(Arrays.asList(elements));
    }

    @Override
    ArrayList<String> onTabComplete(Object user, String[] args);
}
