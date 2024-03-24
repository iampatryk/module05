package geometric;

public class Square04 extends Rectangle {
    public Square04(double length, double width) {
        super(length, width);

    }
    public int calculateDiameter() {

        return (int) (2 * (length + width));
    }
}


// Korzystając z klasy Rectangle z poprzedniego ćwiczenia,
// napisz klasę Square, która odziedziczy po tej klasie i
// dodaj metodę odpowiedzialną za wyliczenie obwodu:
// public int calculateDiameter();