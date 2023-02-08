package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
          int count=0;
          int skipped=0;
          if (numberToSkip>lastInRow)  System.out.println("number to skip is bugger then the last");
          else if (lastInRow<0) System.out.println("last number in row is negative");

          else {
                 for (int i = 0; i < lastInRow; i++) {
                  if (i == numberToSkip) {
                      continue;
                  }
                  count += i;
                  if (i <= numberToSkip) {
                      skipped += i;
                  }
                  if (numberToSkip == lastInRow) {
                      count = 0;
                  }
              }
              System.out.println("skipped sum is " + "" + (skipped + numberToSkip));
              System.out.println("counted sum is " + count);

          }

    }}