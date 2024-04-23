package lvt;

import java.util.List;

public class pica {
    private String pasutijumaNosaukums;
    private String picasVeids;
    private List<String> toppingsList;
    
    
    @Override
    public String toString() {
        return "Pica: " + pasutijumaNosaukums + ", Veids: " + picasVeids +", Toppings: " + toppingsList;
    }


    public pica(String pasutijumaNosaukums, String picasVeids, List<String> toppingsList) {
        this.pasutijumaNosaukums = pasutijumaNosaukums;
        this.picasVeids = picasVeids;
        this.toppingsList = toppingsList;
        
    }

  

	// Getters and setters
    public String getpasutijumaNosaukums() {
        return pasutijumaNosaukums;
    }

    public void setOrderName(String pasutijumaNosaukums) {
        this.pasutijumaNosaukums = pasutijumaNosaukums;
    }

    public String getpicasVeids() {
        return picasVeids;
    }

    public void setpicasVeids(String picasVeids) {
        this.picasVeids = picasVeids;
    }
    
    public List<String> gettoppingsList() {
    	return toppingsList;
    }
    
    public void settoppingsList(List<String> toppingsList) {
    	this.toppingsList = toppingsList;
    }

    

    
}
