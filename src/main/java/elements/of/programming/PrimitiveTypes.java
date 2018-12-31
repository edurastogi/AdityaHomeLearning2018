package elements.of.programming;

public class PrimitiveTypes {

    static final int NUM_UNSIGN_BITS = 63;

    public static void main(String[] args) {
        System.out.println(countBits(50));
        System.out.println(12 & 7);

        //will not compile
        //Character[] c = new char[]{'a','b'};

        System.out.println("Parity is : " + parity(50));
        System.out.println("Parity optimized is : " + parityOptimized(50));
    }

    /*The following program tests bits one at- a-time starting with the
        least-significant bit. It illustrates shifting and masking;*/

    public static int countBits(int x) {
        int numBits = 0;
        while (x != 0) {
            numBits = numBits + (x & 1);
            x >>>= 1;
        }
        return numBits;
    }

    public static short parity(long x) {
        long result = 0;
        while (x != 0) {
            result = result ^ (x & 1);
            x >>>= 1;
        }
        return (short) result;
    }

    public static short parityOptimized(long x) {
        long result = 0;
        while (x != 0) {
            result = result ^ 1;
            x = x & (x - 1); // drops the lowest set of bit of x
        }
        return (short) result;
    }

    public static long swapBits(long x, int i, int j) {
        // Extract the i-th and j-th bits, and see if they differ.
        if (((x >>> i) & 1) != ((x >>> j) & 1)) {
            // i-th and j-th bits differ. We will swap them by flipping their values.
            // Select the bits to flip with bitMask. Since xAl = <9 when x = 1 and 1
            // when x = (9, we can perform the flip XOR .
            long bitMask = (1L << i) | (1L << j);
            x ^= bitMask;
        }
        return x;
    }

    public static long closestlntSameBitCount(long x) {
        // x is assumed to be non-negative so we know the leading bit is ©. We
        // restrict to our attention to 63 LSBs.
        for (int i = 0; i < NUM_UNSIGN_BITS - 1; ++i) {
            if ((((x >>> i) & 1) != ((x >>> (i + 1)) & 1))) {
                x ^= (1L << i) | (1L << (i + 1)); // Swaps bit-i and bit-(i + 1).
                return x;
            }
        }
        // Throw error if all bits of x are <9 or 1.
        throw new IllegalArgumentException("All bits are ® or 1");
    }
}
