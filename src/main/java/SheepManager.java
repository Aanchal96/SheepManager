public class SheepManager {

    public static void main(String args[]){
        run();
    }

    static void run(){
        ListOfSheep sheepList = new ListOfSheep();

        TestHarness testHarness = new TestHarness();
        testHarness.GenerateSheep();
    }
}
