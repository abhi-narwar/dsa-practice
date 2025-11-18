import java.util.Stack;
class astroid_collision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                int top = st.peek();

                if (Math.abs(a) > top) {
                    st.pop();
                } else if (top == Math.abs(a)) {
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                st.push(a);
            }
        }

        int[] res = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            res[i] = st.get(i);
        }
        return res;
    }
}
