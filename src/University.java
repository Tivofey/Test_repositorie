public class University extends Building implements SocialHouse{

    private int students;
    private String rectorName;

    public University(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public University() {

    }

    public void setStudents(int students){
        this.students = students;
    }

    public void setRectorName(String rectorName){
        this.rectorName = rectorName;
    }

    public int getStudents(){
        return students;
    }

    public String getRectorName(){
        return rectorName;
    }

    @Override
    public String toString(){
        System.out.println("-------------------------Начало------------------------");
        super.display();
        System.out.println("Количество студентов: "+students);
        System.out.println("Ректор: "+rectorName);
        return "-------------------------Конец------------------------\n";
    }

    @Override
    public void makeReconstruction() {
        System.out.println(name+" - проводится реконструкция...");
    }

    @Override
    public String corruption(double x) {
        return "Исчезло "+x+" млн.$";
    }

}