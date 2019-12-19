public interface lotCereales{
        
    int idProduit = -1;
    String provenance ="";
    String destination = "";
    double volume = 0; 
    
    public int getIdProduit();
    public String getProvenance();
    public String getDestination();
    public int getVolume();
    
    public void setIdProduit(int id);
    public void setProvenance(String p);
    public void setDestination(String d);
    public void setVolume(int v);
    
}
