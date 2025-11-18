import java.util.ArrayList;
import java.util.List;
class text_justification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int lineLength = words[i].length();
            int j = i + 1;

            while (j < words.length && lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += 1 + words[j].length();
                j++;
            }

            int gaps = j - i - 1;
            StringBuilder sb = new StringBuilder();

            
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k != j - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            }

        
            else {
                int totalSpace = maxWidth;
                for (int k = i; k < j; k++) totalSpace -= words[k].length();

                int spaceEach = totalSpace / gaps;
                int extraSpace = totalSpace % gaps;

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k != j - 1) {
                        int spaces = spaceEach + (extraSpace-- > 0 ? 1 : 0);
                        while (spaces-- > 0) sb.append(" ");
                    }
                }
            }

            res.add(sb.toString());
            i = j;
        }

        return res;
    }
}
