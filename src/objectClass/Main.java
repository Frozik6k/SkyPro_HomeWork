package objectClass;

public class Main {
    public static void main(String[] args) {

        Author maxPonomarev = new Author("Макс", "Пономарёв");

        Author olgaChupina = new Author("Ольга", "Чупина");

        Book chiefMain = new Book("Главный босс", maxPonomarev, 2022);

        Book rollRecipes = new Book("Рецепты роллов", olgaChupina, 2020);

        System.out.println("chiefMain = " + chiefMain);

        System.out.println("rollRecipes = " + rollRecipes);

        chiefMain.setYearPublic(2024);

        System.out.println("chiefMain = " + chiefMain);
    }
}