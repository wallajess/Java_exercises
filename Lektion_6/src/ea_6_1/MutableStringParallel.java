package ea_6_1;

import java.util.Arrays;

public class MutableStringParallel extends Thread{

        private char[] chars;
        private int nextFreeIndex;

        public MutableStringParallel(String s) {
            chars = s.toCharArray();
            nextFreeIndex = s.length();
        }

        public MutableStringParallel append(String s) {
            for (int i = 0; i < s.length(); i++) {
                append(s.charAt(i));
            }
            return this;
        }

        private void append(char c) {
            if (chars.length == nextFreeIndex) {
                if (chars.length == 0) {
                    chars = new char[1];
                } else {
                    chars = Arrays.copyOf(chars, chars.length * 2);
                }
            }
            chars[nextFreeIndex] = c;
            nextFreeIndex++;
        }

        public int length() {
            return nextFreeIndex;
        }

        @Override
        public String toString() {
           return new String(Arrays.copyOfRange(chars, 0, nextFreeIndex));
        }
    }

