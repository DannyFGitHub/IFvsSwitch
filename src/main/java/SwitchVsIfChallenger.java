public class SwitchVsIfChallenger {

    private long x = 0;
    private long timeElapsedSwitchTimer1;
    private long timeElapsedSwitchTimer2;
    private long timeElapsedIfTimer1;
    private long timeElapsedIfTimer2;

    public void run6LoopTest(long interations){
        resetTimers();

        long startSwitchTimer1 = System.currentTimeMillis();
        long startSwitchTimer2 = System.nanoTime();
        runSwitchLoop6(interations);
        long finishSwitchTimer1 = System.currentTimeMillis();
        long finishSwitchTimer2 = System.nanoTime();
        timeElapsedSwitchTimer1 = finishSwitchTimer1 - startSwitchTimer1;
        timeElapsedSwitchTimer2 = finishSwitchTimer2 - startSwitchTimer2;
//        System.out.println("SWITCH Bleep Test runtime milliseconds: " + timeElapsedSwitchTimer1);
//        System.out.println("SWITCH Bleep Test runtime nanoseconds: " + timeElapsedSwitchTimer2);
//        System.out.println(x);

        x = 0;
        long startIfTimer1 = System.currentTimeMillis();
        long startIfTimer2 = System.nanoTime();
        runIfLoop6(interations);
        long finishIfTimer1 = System.currentTimeMillis();
        long finishIfTimer2 = System.nanoTime();
        timeElapsedIfTimer1 = finishIfTimer1 - startIfTimer1;
        timeElapsedIfTimer2 = finishIfTimer2 - startIfTimer2;
//        System.out.println("IF Bleep Test runtime milliseconds: " + timeElapsedIfTimer1);
//        System.out.println("IF Bleep Test runtime nanoseconds: " + timeElapsedIfTimer2);
//        System.out.println(x);

        //X should be the same at the end of both tests.
    }

    public void run3LoopTest(long interations){
        resetTimers();

        long startSwitchTimer1 = System.currentTimeMillis();
        long startSwitchTimer2 = System.nanoTime();
        runSwitchLoop3(interations);
        long finishSwitchTimer1 = System.currentTimeMillis();
        long finishSwitchTimer2 = System.nanoTime();
        timeElapsedSwitchTimer1 = finishSwitchTimer1 - startSwitchTimer1;
        timeElapsedSwitchTimer2 = finishSwitchTimer2 - startSwitchTimer2;
//        System.out.println("SWITCH Bleep Test runtime milliseconds: " + timeElapsedSwitchTimer1);
//        System.out.println("SWITCH Bleep Test runtime nanoseconds: " + timeElapsedSwitchTimer2);
//        System.out.println(x);

        x = 0;
        long startIfTimer1 = System.currentTimeMillis();
        long startIfTimer2 = System.nanoTime();
        runIfLoop3(interations);
        long finishIfTimer1 = System.currentTimeMillis();
        long finishIfTimer2 = System.nanoTime();
        timeElapsedIfTimer1 = finishIfTimer1 - startIfTimer1;
        timeElapsedIfTimer2 = finishIfTimer2 - startIfTimer2;
//        System.out.println("IF Bleep Test runtime milliseconds: " + timeElapsedIfTimer1);
//        System.out.println("IF Bleep Test runtime nanoseconds: " + timeElapsedIfTimer2);
//        System.out.println(x);

        //X should be the same at the end of both tests.
    }

    public void run15LoopTest(long interations){
        resetTimers();

        long startSwitchTimer1 = System.currentTimeMillis();
        long startSwitchTimer2 = System.nanoTime();
        runSwitchLoop15(interations);
        long finishSwitchTimer1 = System.currentTimeMillis();
        long finishSwitchTimer2 = System.nanoTime();
        timeElapsedSwitchTimer1 = finishSwitchTimer1 - startSwitchTimer1;
        timeElapsedSwitchTimer2 = finishSwitchTimer2 - startSwitchTimer2;
//        System.out.println("SWITCH Bleep Test runtime milliseconds: " + timeElapsedSwitchTimer1);
//        System.out.println("SWITCH Bleep Test runtime nanoseconds: " + timeElapsedSwitchTimer2);
//        System.out.println(x);

        x = 0;
        long startIfTimer1 = System.currentTimeMillis();
        long startIfTimer2 = System.nanoTime();
        runIfLoop15(interations);
        long finishIfTimer1 = System.currentTimeMillis();
        long finishIfTimer2 = System.nanoTime();
        timeElapsedIfTimer1 = finishIfTimer1 - startIfTimer1;
        timeElapsedIfTimer2 = finishIfTimer2 - startIfTimer2;
//        System.out.println("IF Bleep Test runtime milliseconds: " + timeElapsedIfTimer1);
//        System.out.println("IF Bleep Test runtime nanoseconds: " + timeElapsedIfTimer2);
//        System.out.println(x);

        //X should be the same at the end of both tests.
    }

    //TASKS
    private void bleep(long times){
//        System.out.println("Bleep");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep1(long times){
//        System.out.println("Bleep1");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep2(long times){
//        System.out.println("Bleep2");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep3(long times){
//        System.out.println("Bleep3");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep4(long times){
//        System.out.println("Bleep4");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep5(long times){
//        System.out.println("Bleep5");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep6(long times){
//        System.out.println("Bleep6");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep7(long times){
//        System.out.println("Bleep7");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep8(long times){
//        System.out.println("Bleep8");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep9(long times){
//        System.out.println("Bleep9");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep10(long times){
//        System.out.println("Bleep10");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep11(long times){
//        System.out.println("Bleep11");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep12(long times){
//        System.out.println("Bleep12");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep13(long times){
//        System.out.println("Bleep13");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep14(long times){
//        System.out.println("Bleep14");
        for (int i = 0; i < times; i++){
            x++;
        }
    }
    private void bleep15(long times){
//        System.out.println("Bleep15");
        for (int i = 0; i < times; i++){
            x++;
        }
    }

    //6
    private void runSwitchLoop6(long times){
        for(;times > 0; times--){
            switch((int) (times % 7)){
                case 0:
                    bleep(times);
                    break;
                case 1:
                    bleep1(times);
                    break;
                case 2:
                    bleep2(times);
                    break;
                case 3:
                    bleep3(times);
                    break;
                case 4:
                    bleep4(times);
                    break;
                case 5:
                    bleep5(times);
                    break;
                case 6:
                    bleep6(times);
                    break;
                default:
            }

        }
    }

    private void runIfLoop6(long times){
        for(;times > 0; times--){

            int number = (int) (times % 7);

            if(number == 0) {
                bleep(times);
            }
            else if(number == 1){
                bleep1(times);
            }
            else if(number == 2) {
                bleep2(times);
            }
            else if(number == 3) {
                bleep3(times);
            }
            else if(number == 4) {
                bleep4(times);
            }
            else if(number == 5) {
                bleep5(times);
            }
            else if(number == 6) {
                bleep6(times);
            }
        }
    }

    //3
    private void runSwitchLoop3(long times){
        for(;times > 0; times--){
            switch((int) (times % 4)){
                case 0:
                    bleep(times);
                    break;
                case 1:
                    bleep1(times);
                    break;
                case 2:
                    bleep2(times);
                    break;
                case 3:
                    bleep3(times);
                    break;
                default:
            }

        }
    }

    private void runIfLoop3(long times){
        for(;times > 0; times--){

            int number = (int) (times % 4);

            if(number == 0) {
                bleep(times);
            }
            else if(number == 1){
                bleep1(times);
            }
            else if(number == 2) {
                bleep2(times);
            }
            else if(number == 3) {
                bleep3(times);
            }
        }
    }

    //15
    private void runSwitchLoop15(long times){
        for(;times > 0; times--){
            switch((int) (times % 16)){
                case 0:
                    bleep(times);
                    break;
                case 1:
                    bleep1(times);
                    break;
                case 2:
                    bleep2(times);
                    break;
                case 3:
                    bleep3(times);
                    break;
                case 4:
                    bleep4(times);
                    break;
                case 5:
                    bleep5(times);
                    break;
                case 6:
                    bleep6(times);
                    break;
                case 7:
                    bleep7(times);
                    break;
                case 8:
                    bleep8(times);
                    break;
                case 9:
                    bleep9(times);
                    break;
                case 10:
                    bleep10(times);
                    break;
                case 11:
                    bleep11(times);
                    break;
                case 12:
                    bleep12(times);
                    break;
                case 13:
                    bleep13(times);
                    break;
                case 14:
                    bleep14(times);
                    break;
                case 15:
                    bleep15(times);
                    break;
                default:
            }

        }
    }

    private void runIfLoop15(long times){
        for(;times > 0; times--){

            int number = (int) (times % 16);

            if(number == 0) {
                bleep(times);
            }
            else if(number == 1){
                bleep1(times);
            }
            else if(number == 2) {
                bleep2(times);
            }
            else if(number == 3) {
                bleep3(times);
            }
            else if(number == 4) {
                bleep4(times);
            }
            else if(number == 5) {
                bleep5(times);
            }
            else if(number == 6) {
                bleep6(times);
            }
            else if(number == 7) {
                bleep7(times);
            }
            else if(number == 8) {
                bleep8(times);
            }
            else if(number == 9) {
                bleep9(times);
            }
            else if(number == 10) {
                bleep10(times);
            }
            else if(number == 11) {
                bleep11(times);
            }
            else if(number == 12) {
                bleep12(times);
            }
            else if(number == 13) {
                bleep13(times);
            }
            else if(number == 14) {
                bleep14(times);
            }
            else if(number == 15) {
                bleep15(times);
            }
        }
    }

    public long getX() {
        return x;
    }

    public long getTimeElapsedSwitchTimer1() {
        return timeElapsedSwitchTimer1;
    }

    public long getTimeElapsedSwitchTimer2() {
        return timeElapsedSwitchTimer2;
    }

    public long getTimeElapsedIfTimer1() {
        return timeElapsedIfTimer1;
    }

    public long getTimeElapsedIfTimer2() {
        return timeElapsedIfTimer2;
    }

    public void resetTimers(){
        timeElapsedSwitchTimer1 = 0;
        timeElapsedSwitchTimer2 = 0;
        timeElapsedIfTimer1 = 0;
        timeElapsedIfTimer2 = 0;
        x = 0;
    }

}

