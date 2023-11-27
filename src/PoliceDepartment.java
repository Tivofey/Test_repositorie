public class PoliceDepartment extends Building implements SocialHouse{

    private int policeman;
    private int cars;

    public PoliceDepartment(String name, String address){
        this.name = name;
        this.address = address;
    }

    public PoliceDepartment(){

    }

    public void setPoliceman(int policeman){
        this.policeman = policeman;
    }

    public void setCars(int cars){
        this.cars = cars;
    }

    public int getPoliceman(){
        return policeman;
    }

    public int getCars(){
        return cars;
    }

    @Override
    public String toString(){
        System.out.println("-------------------------Начало------------------------");
        super.display();
        System.out.println("Количество полицейских: "+policeman);
        System.out.println("Количество машин в участке: "+cars);
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