public class TaskLast {

//        /**
//         * Flips one bit of the given <code>value</code>.
//         *
//         * @param value     any number
//         * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
//         * @return new value with one bit flipped
//         */
        static boolean bit1( int x) {
            boolean result = false;
            int t = (1 << 30);
            while ((t >>= 1) != 0) {
                if ( x == t) {
                    result = true;
                }
            }
            return result;
        }
        public static void main(String[] args) {
            System.out.println(bit1(Integer.MAX_VALUE));
        }

}
