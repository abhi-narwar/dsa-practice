class zigzag_conversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int curr = 0;
        int direction = 1; // 1 = down, -1 = up

        for (char c : s.toCharArray()) {
            rows[curr].append(c);

            if (curr == 0) direction = 1;
            else if (curr == numRows - 1) direction = -1;

            curr += direction;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);
        
        return result.toString();
    }
}
