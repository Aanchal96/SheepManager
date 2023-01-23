public class TestHarness {

    public void GenerateSheep(){

        for (int i = 1; i<11; i++) {
            Sheep sheep1 = new Sheep("Sheep " + i, "Blue", 100, 40);
            ListOfSheep los = new ListOfSheep();
            los.AddSheep(sheep1);
        }
    }
}
