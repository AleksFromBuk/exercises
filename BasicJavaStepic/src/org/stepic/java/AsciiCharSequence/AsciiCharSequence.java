package org.stepic.java.AsciiCharSequence;

import java.util.Arrays;

    class AsciiCharSequence implements  java.lang.CharSequence {
        private byte[] data;

        public AsciiCharSequence(byte[] args) {
            this.data = args.clone();
        }

        @Override
        public int length() {
            return data.length;
        }

        @Override
        public char charAt(int index) {
            return (char)data[index];
        }

        @Override
        public java.lang.CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(data, start, end));
        }

        @Override
        public String toString() {
            StringBuilder tmp = new StringBuilder(data.length);
            for (int i = 0 ; i < data.length; i++) {
                tmp.append((char)data[i]);
            }
            return new String(tmp);
        }

        public static void main(String[] args) {
            byte[] x = new byte[]{65,66,67,68,69,70,71};
//            for(int i = 0; i < x.length; i++) {
//                System.out.println((char)x[i]);
//            }
            AsciiCharSequence myX = new AsciiCharSequence(x);
            System.out.println(myX.length());
            System.out.println(myX.charAt(3));
            System.out.println(myX.subSequence(3,5));
            System.out.println(myX.toString());
        }
    }




