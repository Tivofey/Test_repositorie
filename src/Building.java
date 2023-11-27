public abstract class Building {

    protected String name;
    protected String address;
    protected int creationDate;
    protected String nameCreator;
    protected boolean isCulturalMonument;

    public Building(String name, String address){
        this.name = name;
        this.address = address;
    }

    public Building(String name, String address, boolean isCulturalMonument){
        this.name = name;
        this.address = address;
        this.isCulturalMonument = isCulturalMonument;
    }

    public Building(){

    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCreationDate(int creationDate){
        this.creationDate = creationDate;
    }

    public void setNameCreator(String nameCreator){
        this.nameCreator = nameCreator;
    }

    public void setCulturalMonument(boolean isCulturalMonument){
        this.isCulturalMonument = isCulturalMonument;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getCreationDate(){
        return creationDate;
    }

    public String getNameCreator(){
        return nameCreator;
    }

    public boolean getCulturalMonument(){
        return isCulturalMonument;
    }

    public void display(){
        System.out.println("Название: "+name);
        System.out.println("Адрес: "+address);
        System.out.println("Год постройки: "+creationDate);
        System.out.println("Имя архитектора: "+nameCreator);
        System.out.println("Является ли культурным памятником: "+isCulturalMonument);
    }

}