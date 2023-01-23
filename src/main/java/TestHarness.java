public class TestHarness {

    public void GenerateSheep(){

        for (int i = 0; i<10; i++) {
            Sheep sheep1 = new Sheep("Sheep " + i+1, "Blue", 100, 40);
            ListOfSheep los = new ListOfSheep();
            los.AddSheep(sheep1);
        }
    }
}
