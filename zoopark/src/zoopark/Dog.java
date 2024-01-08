
package zoopark;

public class Dog extends fullpack implements Domestic{
    private String address;
    private String personName;
    private String name;
    
    public Dog(String personName, String address, String name) {
        super("dog", 4, "Gav");
        this.address = address;
        this.personName = personName;
        this.name = name;
    }

    @Override
    public String getPerson() {
        return personName;
   }

    @Override
    public void setPerson(String personName) {
        this.personName = personName;
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
        return name + " {" + "Vid = " + this.getVid() +  ", person Name = " + personName + ", address = " + address + ", pronauns = " + this.getPronauns() + '}';
    }




    
    
    
}
