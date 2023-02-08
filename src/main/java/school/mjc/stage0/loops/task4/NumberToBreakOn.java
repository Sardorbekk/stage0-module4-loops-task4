package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {


        if (toBreakWith<numberToGoUntil){
        for (int i=1;i<=numberToGoUntil;i++) {
            System.out.println(i);
            if (toBreakWith == i) {
                break;
            }}
        }
        else {
            for (int i = 0; i <= numberToGoUntil; i++) {
                if (i!=0) System.out.println(i);
                else System.out.println("iterating till the end");
                if (toBreakWith == i) {
                    break;
                }
            }


        }}}

