public interface lotCereales{
        
    int idProduit = -1;
    String type ="";
    String provenance ="";
    String destination = "";
    double volume = 0; 
    double poids = 0;
    
    int getIdProduit();
    String getProvenance();
    String getDestination();
    double getVolume();
    double getPoids();
    
    /*
    void setIdProduit(int id);
    void setProvenance(String p);
    void setDestination(String d);
    void setVolume(double v);
    void setPoids(double p);
    */
    
    String getType();
    
}
