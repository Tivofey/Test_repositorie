
public class Main {
    public static void main(String[] args) {

        Library NekrasovLibrary = new Library("Библиотека имени Некрасова","ул.Бауманская,58/25");
        NekrasovLibrary.setCreationDate(1854);
        NekrasovLibrary.setNameCreator("Добронравов");
        NekrasovLibrary.setCulturalMonument(true);
        NekrasovLibrary.setClientAmountAmount(1746);
        NekrasovLibrary.setBooksAmount(12841);
        System.out.println(NekrasovLibrary);
        System.out.println(NekrasovLibrary.corruption(2));

        House House = new House();
        House.setName("ЖК Золотая Звезда");
        House.setAddress("Москва, просп. Будённого, вл51-53с1");
        House.setColour("Синий");
        House.setResidentAmount(250);
        House.setCreationDate(2018);
        House.setCulturalMonument(false);
        System.out.println();
        System.out.println(House);
        House.parking(38);
        House.objectDelivery(2020);

        University MGU = new University("МГУ им. М.В. Ломоносова", " г. Москва, ул. Ленинские горы, 1");
        MGU.setStudents(15000);
        MGU.setRectorName("Иванов Иван Иванович");
        MGU.setCreationDate(1755);
        MGU.setNameCreator("Соболев Т.Г.");
        System.out.println();
        MGU.display();
        System.out.println();
        System.out.println(MGU);
        System.out.println();
        MGU.makeReconstruction();

        PoliceDepartment Police = new PoliceDepartment("ФБР", "New York");
        Police.setCreationDate(2004);
        Police.setNameCreator("Mr. Brown");
        Police.setCulturalMonument(false);
        Police.setCars(24);
        Police.setPoliceman(74);
        System.out.println();
        System.out.println(Police);
        System.out.println(Police.corruption(2));
        Police.makeReconstruction();

    }
}