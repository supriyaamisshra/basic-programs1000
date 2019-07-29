package recursion;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


/***
 Problem Statement :
 Write a program which prints a sequence of operations that transfers n rings from one peg to another.
 You have a third peg, which is initially empty.
 The only operation you can perform is taking a single ring from the top of one peg
 and placing it on the top of another peg. You must never place a larger ring above a smaller ring.

**/

/***
 *
 * ALGORITHM :
 *
 * TOTAL MOVES REQUIRED : For n disks, total 2n – 1 moves are required.
 * For n disks, total 2^n -1 function calls are made. for n = 4, 2^
 * To transfer four rings,
 * move the top three rings to the third peg,
 * then moving the lowest ring (which is the largest) to the second peg,
 * and then transfer the three rings on the third peg to the second peg,
 * using the first peg as an intermediary.
 * For both the three ring and four ring transfers,
 * the first and third steps are instances of the same problem, which suggests the use of recursion.
 *
 */
public class ComputeTowerHanoi {

    private static final int NUM_PEG = 3;


    public static void computeTowerHanoi(int rings ) {
        List<Deque<Integer>> pegs = new ArrayList<>();

        for (int i = 0; i < NUM_PEG ; i++) {
            pegs.add(new LinkedList<>());
        }
        for (int i = rings; i >= 1 ; --i) {
            pegs.get(0).addFirst(i);
        }
        computeSteps(rings, pegs, 0,1,2);

    }

    private static void computeSteps(int numRingsToMove, List<Deque<Integer>> pegs,
                                     int fromPeg, int toPeg, int usePeg) {

        if (numRingsToMove > 0) {

            computeSteps(numRingsToMove -1, pegs, fromPeg, usePeg, toPeg);

            pegs.get(toPeg).addFirst(pegs.get(fromPeg).removeFirst());
            System.out.println("Move from Peg " + fromPeg + " to Peg " + toPeg);
            computeSteps(numRingsToMove-1, pegs, usePeg, toPeg,fromPeg);
        }
    }

    public static void main(String[] args) {

        computeTowerHanoi(3);
        System.out.println("Tower :");


        }


}

