
class Solution {
    public String generateTag(String caption) {
        StringBuilder sb = new StringBuilder("#");
        boolean newWord = false;

        for (int i = 0; i < caption.length(); i++) {
            char ch = caption.charAt(i);

            if (ch == ' ') {
                if (sb.length() > 1) {
                    newWord = true;
                }
                continue;
            }

            if (sb.length() == 100) {
                break;
            }

            if (sb.length() == 1) {
                sb.append(Character.toLowerCase(ch));
                newWord = false;
            } else if (newWord) {
                sb.append(Character.toUpperCase(ch));
                newWord = false;
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }

        return sb.toString();
    }
}
