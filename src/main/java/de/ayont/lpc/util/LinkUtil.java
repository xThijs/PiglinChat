package de.ayont.lpc.util;

public class LinkUtil {

    public static boolean containsNonPiglinLink(String message) {
        String nonPiglinUrlRegex = "(https?://(?!([a-zA-Z0-9-]+\\.)?piglincraft\\.com)([\\w-]+(\\.[\\w-]+)+(:\\d+)?(/[\\w-./?%&=]*)?))";
        return message.matches(".*" + nonPiglinUrlRegex + ".*");
    }

}
