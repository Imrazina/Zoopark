
package zoopark;

public class Crocodile extends fullpack implements Reptile, Domestic{
   private String personName;
    private String address;
    private String name;
    
    public Crocodile(String name, String address) {
        super("Crocodile", 4, "RRRRRRRR");
        this.address = address;
        this.personName = personName;
        this.name = name;
    }

    @Override
    public int SkinCost() {
    return 2000;
    
    }

   
    @Override
    public String getPerson() {
    return personName;
    }

    @Override
    public void setPerson(String personName) {
    }

    @Override
    public String getAdress() {
    return address;
    }

    @Override
    public void setAdress(String address) {
    this.address = address;
    }


    @Override
    public String getName() {
    return name;
    
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }

   
    
     @Override
    public String toString() {
        return name + " {" + "Vid: " + this.getVid() + ", name = "+ name + ", pronauns = " + this.getPronauns() + ", address = " + address + ", scin cost = " + this.SkinCost() +  '}';
    }

}
