import static org.junit.jupiter.api.Assertions.*;

class TestHarnessTest {

    @org.junit.jupiter.api.Test
    void generateSheep() {

        for (int i = 1; i<1000; i++) {
            Sheep sheep1 = new Sheep("Sheep " + i, "Blue", 100, 40);
            ListOfSheep los = new ListOfSheep();
            los.AddSheep(sheep1);
        }

        assertEquals(Sheep.numberOfSheep,ListOfSheep.arrayList.size());
    }
}