package Task_13_OOP;

public class Donkey extends Pack_animal{
    public Donkey(String name, String dateOfBirth, String commands)
    {
        super(name, dateOfBirth, commands);
    }

    public void introduction() {
        System.out.print("Я - ослик. ");
    }
}
