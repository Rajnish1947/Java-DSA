public class RemovevalOfdublication {
    public static void RemoveDublicationOfString(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(idx);
        // Only handle lowercase a-z characters
        if (currentChar >= 'a' && currentChar <= 'z') {
            if (map[currentChar - 'a']) {
                RemoveDublicationOfString(str, idx + 1, newStr, map);
            } else {
                map[currentChar - 'a'] = true;
                newStr.append(currentChar);
                RemoveDublicationOfString(str, idx + 1, newStr, map);
            }
        } else {
            // Keep non-letter characters unchanged (like spaces)
            newStr.append(currentChar);
            RemoveDublicationOfString(str, idx + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        String str = "rajjniiishh kummaarr";
        RemoveDublicationOfString(str, 0, new StringBuilder(), new boolean[26]);
    }
}
