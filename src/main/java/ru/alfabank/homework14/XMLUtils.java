package ru.alfabank.homework14;

public class XMLUtils {



public static String createEmptyElement(String tagNane) {
    if (tagNane == null || tagNane.isEmpty()){
        return "<invalid/>";
    }
    return "<%s><%s>".formatted(tagNane, tagNane);

}
}
