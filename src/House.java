public class House extends Building implements LivingHouse {

    private int residentAmount;
    private String colour;

    {
        residentAmount = 0;
        colour = "By default";
    }

    public House(String name, String address){
        this.name = name;
        this.address = address;
    }

    public House(){
    }

    public void setResidentAmount(int residentAmount){
        this.residentAmount = residentAmount;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public int getResidentAmount(){
        return residentAmount;
    }

    public String getColour(){
        return colour;
    }

    @Override
    public String toString(){
        System.out.println("-------------------------Начало------------------------");
        super.display();
        System.out.println("Количество жильцов: "+residentAmount);
        System.out.println("Цвет дома: "+colour);
        return "----------------------Конец---------------------------";
    }

    @Override
    public void parking(int places) {
        System.out.println("Количество парковочных мест: "+places);
    }

    @Override
    public void objectDelivery(int year) {
        System.out.println("Дом сдан в эксплуатацию в "+year+" году");
    }

}