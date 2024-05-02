package lvt;

import java.util.ArrayList;

public class picaBez {
	 private String pasutijumaNosaukums;
	    private String picasVeids;
	    private ArrayList<String> izveletieToppingi;
	    private String picasDiametrs;
	    private double cena;
	    private int daudzums;
	 
    
    
    @Override
    public String toString() {
    	String formattedSumma = String.format("%.2f", cena);

        return "Nosaukums: " + pasutijumaNosaukums + ", Veids: " + picasVeids +", Toppings: " + izveletieToppingi+", Picas Diametrs: "+picasDiametrs+"cm \nPiegāde nav nepieciešama, tiks savākts uz vietas!\nDaudzums: "+daudzums+"\nKopēja cena "+formattedSumma+"€"+"\n----------------------------------------------------------------------------------";
    }


    public picaBez(String pasutijumaNosaukums, String picasVeids, ArrayList<String> izveletieToppingi, String picasDiametrs,  Double cena, int daudzums) {
        this.pasutijumaNosaukums = pasutijumaNosaukums;
        this.picasVeids = picasVeids;
        this.izveletieToppingi = izveletieToppingi;
        this.picasDiametrs = picasDiametrs;
        this.cena = cena;
        this.daudzums = daudzums;
    
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
    
  

    public String getpicasDiametrs() {
    	return picasDiametrs;
    }
    
    public void setpicasDiametrs(String picasDiametrs) {
    	this.picasDiametrs = picasDiametrs;
    }
  
    
    public double getCena() {
    	return cena;
    }
    
    public void setCena(double cena) {
    	this.cena = cena;
    }
    	
    public double getDaudzums() {
    	return daudzums;
    }
    
    public void setDaudzums(int daudzums) {
    	this.daudzums = daudzums;
    }

    
}
