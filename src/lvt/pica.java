package lvt;

import java.util.ArrayList;

public class pica {
	 private String pasutijumaNosaukums;
	    private String picasVeids;
	    private ArrayList<String> izveletieToppingi;
	    private String picasDiametrs;
	    private String vards;
	    private String uzvards;
	    private String telNr;
	    private String adrese;
	    private String pastaIndekss;
	    private double cena;
	 
    
    
    @Override
    public String toString() {
        return "Pica: " + pasutijumaNosaukums + ", Veids: " + picasVeids +", Toppings: " + izveletieToppingi+", Picas Diametrs: "+picasDiametrs+"\n Piegāde informācija:\nVārds: "+vards+", Uzvārds: "+uzvards+", Tel. nr.: "+telNr+
        		", Adrese: "+adrese+", Pasta Indekss: "+pastaIndekss+", Kopēja cena "+cena+"€";
    }


    public pica(String pasutijumaNosaukums, String picasVeids, ArrayList<String> izveletieToppingi, String picasDiametrs, String vards, String uzvards, String telNr, String adrese, String pastaIndekss, Double cena) {
        this.pasutijumaNosaukums = pasutijumaNosaukums;
        this.picasVeids = picasVeids;
        this.izveletieToppingi = izveletieToppingi;
        this.picasDiametrs = picasDiametrs;
        this.vards = vards;
        this.uzvards = uzvards;
        this.telNr = telNr;
        this.adrese = adrese;
        this.pastaIndekss = pastaIndekss;
        this.cena = cena;
    
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
    public String getvards() {
    	return vards;
    }
    
    public void setvards(String vards) {
    	this.vards = vards;
    }
    public String getuzvards() {
    	return uzvards;
    }
    
    public void setuzvards(String uzvards) {
    	this.uzvards = uzvards;
    }
    
    public String gettelNr() {
    	return telNr;
    }
    
    public void settelNr(String telNr) {
    	this.telNr = telNr;
    }
    
    public String getadrese() {
    	return adrese;
    }
    
    public void setadrese(String adrese) {
    	this.adrese = adrese;
    }
    public String getpastaIndekss() {
    	return pastaIndekss;
    }
    
    public void setpastaIndekss(String pastaIndekss) {
    	this.pastaIndekss = pastaIndekss;
    }
    
    public double getCena() {
    	return cena;
    }
    
    public void setCena(double cena) {
    	this.cena = cena;
    }

    

    
}
