public class TestHarness {

    public void GenerateSheep(){
        Sheep sheep1 = new Sheep("Sheep 1", "Blue", 100, 40);

        ListOfSheep los = new ListOfSheep();
        los.AddSheep(sheep1);
    }
}
