public class Cellule {
	private lotCereales produit;
	private float concentrationH2S, concentrationCH4, temperature, humidite;

		public Cellule(){
		produit = null;
		concentrationH2S = 0;
		concentrationCH4 = 0;
		temperature = 0;
		humidite = 0;
	}

	public Cellule(lotCereales lc, float cH, float cC, float t, float h){
		produit = lc;
		concentrationH2S = cH;
		concentrationCH4 = cC;
		temperature = t;
		humidite = h;
	}

	public float getConcentrationH2S(){ return concentrationH2S;}
	public float getConcentrationCH4(){ return concentrationCH4;}
	public float getTemperature(){ return temperature;}
	public float getHumidite(){ return humidite;}
        
        public lotCereales getProduit(){return this.produit;}


	public void nettoyer(){}
	public void ventiler(){}
	public void aspirer(){}
	public void desinsectisation(){}
	public void alarme(){}
}
