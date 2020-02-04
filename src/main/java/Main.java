public class Main{
    private static long intialIteration = 100;
    private static long incremental = 100;
    private static long switchWins = 0;
    private static long ifWins = 0;
    private static long nanoSecondsSavedByIf = 0;
    private static long nanoSecondsSavedBySwitch = 0;

    public static void main(String[] args) {
        int timesToTest = 100;

        switchWins = 0;
        ifWins = 0;
        SwitchVsIfChallenger switchVsIfChallenger = new SwitchVsIfChallenger();

        for(int i = 0; i < timesToTest; i++) {
            winTest3(switchVsIfChallenger, intialIteration += incremental);
        }

        System.out.println("SWITCH WON: "+ switchWins + " times");
        System.out.println("IF WON: "+ ifWins + " times");
        System.out.println("Milliseconds Saved By using IF: " + nanoSecondsSavedByIf / 1000000.0);
        System.out.println("Milliseconds Saved By using SWITCH: " + nanoSecondsSavedBySwitch / 1000000.0);

        switchWins = 0;
        ifWins = 0;
        for(int i = 0; i < timesToTest; i++) {
            winTest6(switchVsIfChallenger, intialIteration += incremental);
        }

        System.out.println("SWITCH WON: "+ switchWins + " times");
        System.out.println("IF WON: "+ ifWins + " times");
        System.out.println("Milliseconds Saved By using IF: " + nanoSecondsSavedByIf / 1000000.0);
        System.out.println("Milliseconds Saved By using SWITCH: " + nanoSecondsSavedBySwitch / 1000000.0);

        switchWins = 0;
        ifWins = 0;
        for(int i = 0; i < timesToTest; i++) {
            winTest15(switchVsIfChallenger, intialIteration += incremental);
        }

        System.out.println("SWITCH WON: "+ switchWins + " times");
        System.out.println("IF WON: "+ ifWins + " times");
        System.out.println("Milliseconds Saved By using IF: " + nanoSecondsSavedByIf / 1000000.0);
        System.out.println("Milliseconds Saved By using SWITCH: " + nanoSecondsSavedBySwitch / 1000000.0);

        nanoSecondsSavedByIf = 0;
        nanoSecondsSavedBySwitch = 0;
        switchWins = 0;
        ifWins = 0;
        for(int i = 0; i < timesToTest; i++) {
            winTest3(switchVsIfChallenger, timesToTest);
            winTest6(switchVsIfChallenger, timesToTest);
            winTest15(switchVsIfChallenger, timesToTest);
        }

        System.out.println("SWITCH WON: "+ switchWins + " times");
        System.out.println("IF WON: "+ ifWins + " times");
        System.out.println("Seconds Saved By using IF: " + nanoSecondsSavedByIf / 1000000000.0);
        System.out.println("Seconds Saved By using SWITCH: " + nanoSecondsSavedBySwitch / 1000000000.0);
    }

    public static void winTest3(SwitchVsIfChallenger switchVsIfChallenger, long iterations){
        switchVsIfChallenger.run3LoopTest(iterations);
        if(switchVsIfChallenger.getTimeElapsedIfTimer2() > switchVsIfChallenger.getTimeElapsedSwitchTimer2()){
            switchWins++;
        } else {
            ifWins++;
        }
        nanoSecondsSavedBySwitch += switchVsIfChallenger.getTimeElapsedIfTimer2() - switchVsIfChallenger.getTimeElapsedSwitchTimer2();
        nanoSecondsSavedByIf += switchVsIfChallenger.getTimeElapsedSwitchTimer2() - switchVsIfChallenger.getTimeElapsedIfTimer2();
    }

    public static void winTest6(SwitchVsIfChallenger switchVsIfChallenger, long iterations){
        switchVsIfChallenger.run6LoopTest(iterations);
        if(switchVsIfChallenger.getTimeElapsedIfTimer2() > switchVsIfChallenger.getTimeElapsedSwitchTimer2()){
            switchWins++;
        } else {
            ifWins++;
        }
        nanoSecondsSavedBySwitch += switchVsIfChallenger.getTimeElapsedIfTimer2() - switchVsIfChallenger.getTimeElapsedSwitchTimer2();
        nanoSecondsSavedByIf += switchVsIfChallenger.getTimeElapsedSwitchTimer2() - switchVsIfChallenger.getTimeElapsedIfTimer2();
    }

    public static void winTest15(SwitchVsIfChallenger switchVsIfChallenger, long iterations){
        switchVsIfChallenger.run15LoopTest(iterations);
        if(switchVsIfChallenger.getTimeElapsedIfTimer2() > switchVsIfChallenger.getTimeElapsedSwitchTimer2()){
            switchWins++;
        } else {
            ifWins++;
        }
        nanoSecondsSavedBySwitch += switchVsIfChallenger.getTimeElapsedIfTimer2() - switchVsIfChallenger.getTimeElapsedSwitchTimer2();
        nanoSecondsSavedByIf += switchVsIfChallenger.getTimeElapsedSwitchTimer2() - switchVsIfChallenger.getTimeElapsedIfTimer2();
    }
}