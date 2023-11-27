public class Library extends Building implements SocialHouse {

    private int booksAmount;
    private int clientAmount;

    {
        booksAmount = 0;
        clientAmount = 0;
    }

    public Library(String name, String address){
        this.name = name;
        this.address = address;
    }

    public Library(){

    }

    public void setBooksAmount(int booksAmount){
        this.booksAmount = booksAmount;
    }

    public void setClientAmountAmount(int clientAmount){
        this.clientAmount = clientAmount;
    }

    public int getBooksAmount(){
        return booksAmount;
    }

    public int getClientAmount(){
        return clientAmount;
    }

    @Override
    public void makeReconstruction() {
        System.out.println(name+" - проводится реконструкция...");
    }

    @Override
    public String corruption(double x) {
        return "Исчезло "+x+" млн.$";
    }

    @Override
    public String toString(){
        System.out.println("-------------------------Начало------------------------");
        super.display();
        System.out.println("Количество книг: "+getBooksAmount());
        System.out.println("Количество клиентов: "+getClientAmount());
        return "----------------------Конец---------------------------";
    }

}