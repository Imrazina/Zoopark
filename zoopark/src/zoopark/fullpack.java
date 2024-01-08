
package zoopark;

public abstract class fullpack {
    private String vid;
    private int pocetnoh;

    private String pronauns;

    public fullpack(String vid, int pocetnoh, String pronauns) {
        this.vid = vid;
        this.pocetnoh = pocetnoh;
        this.pronauns = pronauns;
    }

    public String getVid() {
        return vid;
    }

    public int getPocetnoh() {
        return pocetnoh;
    }

  
    public String getPronauns() {
        return pronauns;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public void setPocetnoh(int pocetnoh) {
        this.pocetnoh = pocetnoh;
    }

   

    public void setPronauns(String pronauns) {
        this.pronauns = pronauns;
    }
    

    @Override
    public String toString() {
        return "charakteristicks { " + "vid = " + vid + ", lapky = " + pocetnoh  + ", pronauns = " + pronauns + '}';
    }
    
    
    
    
    
}
