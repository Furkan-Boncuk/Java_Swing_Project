
public class City {
    private int country_id; //Ülke kimliği
    private String country; //Ülke ismi
    private String last_update; //Son güncelleme tarihi

    public City(int country_id, String country, String last_update) {
        this.country_id = country_id;
        this.country = country;
        this.last_update = last_update;
    }  
    
    //getter and setters
    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }   
}
