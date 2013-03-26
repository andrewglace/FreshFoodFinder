package com.example.freshfoodfinder;

import java.util.ArrayList;
import java.util.Calendar;

import com.google.android.gms.maps.model.LatLng;

public class MarketManager {

	private ArrayList<Food> superMarketFoods;
	private ArrayList<Food> wawaFoods;
	private ArrayList<Food> cornerStoreFoods;
	private ArrayList<Food> farmerMarketFoods;
	private ArrayList<Food> aldiFoods;
	
	private ArrayList<Market> superMarkets;
	private ArrayList<Market> wawas;
	private ArrayList<Market> cornerStores;
	private ArrayList<Market> farmerMarkets;
	
	//We'll still instiate Aldi as a list so we dont have to treat it specially
	private ArrayList<Market> aldi;
	
	public MarketManager() {
		superMarketFoods = new ArrayList<Food>();
		wawaFoods = new ArrayList<Food>();
		cornerStoreFoods = new ArrayList<Food>();
		farmerMarketFoods = new ArrayList<Food>();
		aldiFoods = new ArrayList<Food>();
		
		superMarkets = new ArrayList<Market>();
		wawas = new ArrayList<Market>();
		cornerStores = new ArrayList<Market>();
		farmerMarkets = new ArrayList<Market>();
		aldi = new ArrayList<Market>();
		
		
		instantiatesuperMarketFoods();
		instantiateWawaFoods();
		instantiateCornerStoreFoods();
		instantiateFarmerMarketFoods();
		instantiateAldiFoods();
		
		instantiateSuperMarkets();
		instantiateWawas();
		instantiateCornerStores();
		instantiateFarmerMarkets();
		instantiateAldi();

	}
	
	//This method will be called by UserMap
	public ArrayList<Market> getAllMarkets() {
		ArrayList<Market> allMarkets = new ArrayList<Market>();
		allMarkets.addAll(superMarkets);
		allMarkets.addAll(wawas);
		allMarkets.addAll(cornerStores);
		allMarkets.addAll(farmerMarkets);
		
		return allMarkets;
	}
	private void instantiatesuperMarketFoods() {

		Food apple = new Food("Apple",1, Calendar.JANUARY, Calendar.DECEMBER);
		superMarketFoods.addAll(apple.getAllFoods());
	}
	
	private void instantiateWawaFoods() {
		Food banana = new Food("Banana",1, Calendar.JANUARY, Calendar.DECEMBER);
		wawaFoods.add(banana);
	}

	private void instantiateCornerStoreFoods() {
		
	}
	
	private void instantiateFarmerMarketFoods() {
		
	}
	
	private void instantiateAldiFoods() {
		
	}
	
	private void instantiateSuperMarkets() {
		
		//19104 -no shoprite, bottom dollar
		LatLng freshGrocerLocation40thWalnut = new LatLng(39.954499,-75.202864);
		LatLng supreme43rdWalnutLocation = new LatLng(39.954792,-75.208733);
		
		Market freshGrocer40thWalnut = new Market("FreshGrocer40thWalnut",superMarketFoods,freshGrocerLocation40thWalnut);
		Market supreme43rdWalnut = new Market("Supreme43rdWalnut",superMarketFoods,supreme43rdWalnutLocation);
		
		superMarkets.add(freshGrocer40thWalnut);
		superMarkets.add(supreme43rdWalnut);
			
		//19143 -no shoprite, bottomdollar		
		//19142 - no shoprite, bottomdollar
		//19153
		LatLng shoprite2946IslandAvenueLocation = new LatLng(39.902948,-75.239991); 
		LatLng bottomdollar7627LindberghBlvdLocation = new LatLng(40.034204,-75.210819); 
		
		Market shoprite2946IslandAvenue = new Market("shoprite2946IslandAvenue",superMarketFoods,shoprite2946IslandAvenueLocation);
		Market bottomdollar7627LindberghBlvd = new Market("bottomdollar7627LindberghBlvd",superMarketFoods,bottomdollar7627LindberghBlvdLocation);

		superMarkets.add(shoprite2946IslandAvenue);
		superMarkets.add(bottomdollar7627LindberghBlvd);
		
		//19145
		LatLng shoprite24thOregonAveLocation = new LatLng(39.919672,-75.188367);
		
		Market shoprite24thOregonAve = new Market("shoprite24thOregonAve",superMarketFoods,shoprite24thOregonAveLocation);
		
		superMarkets.add(shoprite24thOregonAve);
		
		//19112 		
		//19146 
		//19130 - no shoprite
		LatLng bottomdollarNorth31thGirardAveLocation = new LatLng(39.97495,-75.186679);
		
		Market bottomdollarNorth31thGirardAve = new Market("bottomdollarNorth31thGirardAve",superMarketFoods,bottomdollarNorth31thGirardAveLocation);
		
		superMarkets.add(bottomdollarNorth31thGirardAve);
		
		//19121 - 
		
		//19131 - no bottomdollar
		LatLng shoprite575North52ndLocation = new LatLng(39.96906,-75.225295);
		
		Market shoprite575North52nd = new Market("shoprite575North52nd",superMarketFoods,shoprite575North52ndLocation);
		
		superMarkets.add(shoprite575North52nd);
		
		//19139 - 
	}
	
	private void instantiateWawas() {
		LatLng f46thandChestnutWawaLocation = new LatLng(39.954687,-75.194799);
		Market f46thandChestnutWawa = new Market("f46thandChestnutWawa",wawaFoods,f46thandChestnutWawaLocation );
	}
	
	private void instantiateCornerStores() {
		//19145
		LatLng 	MiPalsDeliCornerStoreLocation = new LatLng(39.911401,-75.174959);
		Market 	MiPalsDeliCornerStore = new Market("MiPalsDeliCornerStore",cornerStoreFoods,MiPalsDeliCornerStoreLocation );
		cornerStores.add(MiPalsDeliCornerStore);
		LatLng pastificioCornerStoreLocation = new LatLng(39.92225,-75.173702);
		Market pastificioCornerStore = new Market("pastificioCornerStore",cornerStoreFoods,pastificioCornerStoreLocation );
		cornerStores.add(pastificioCornerStore);
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		LatLng NutsAboutYouCornerStoreLocation = new LatLng(39.924072,-75.170111);
		Market NutsAboutYouCornerStore = new Market("NutsAboutYouCornerStore",cornerStoreFoods,NutsAboutYouCornerStoreLocation );
		cornerStores.add(NutsAboutYouCornerStore);
		LatLng 16thStreetFoodMarketCornerStoreLocation = new LatLng(39.926087,-75.172585);
		Market 16thStreetFoodMarketCornerStore = new Market("16thStreetFoodMarketCornerStore",cornerStoreFoods,16thStreetFoodMarketCornerStoreLocation );
		cornerStores.add(16thStreetFoodMarketCornerStore);
		LatLng SnyderSupermarketCornerStoreLocation = new LatLng(39.927104,-75.191017);
		Market SnyderSupermarketCornerStore = new Market("SnyderSupermarketCornerStore",cornerStoreFoods,SnyderSupermarketCornerStoreLocation );
		cornerStores.add(SnyderSupermarketCornerStore);
		LatLng 28&SnyderSupermarketCornerStoreLocation = new LatLng(39.92714,-75.192751);
		Market 28&Snyder SupermarketCornerStore = new Market("28&SnyderSupermarketCornerStore",cornerStoreFoods,28&SnyderSupermarketCornerStoreLocation );
		cornerStores.add(28&SnyderSupermarketCornerStore);
		LatLng 16thStreetFoodMarketCornerStoreLocation = new LatLng(39.926087,-75.172585);
		Market 16thStreetFoodMarketCornerStore = new Market("16thStreetFoodMarketCornerStore",cornerStoreFoods,16thStreetFoodMarketCornerStoreLocation );
		cornerStores.add(16thStreetFoodMarketCornerStore);
		LatLng TcGroceryLlc#1CornerStoreLocation = new LatLng(39.926688,-75.177303);
		Market TcGroceryLlc#1CornerStore = new Market("TcGroceryLlc#1CornerStore",cornerStoreFoods,TcGroceryLlc#1CornerStoreLocation );
		cornerStores.add(TcGroceryLlc#1CornerStore);		
		LatLng CruzBrotherMiniMarketCornerStoreLocation = new LatLng(39.926891,-75.178874);
		Market CruzBrotherMiniMarketCornerStore = new Market("CruzBrotherMiniMarket",cornerStoreFoods,CruzBrotherMiniMarketCornerStoreLocation );
		cornerStores.add(CruzBrotherMiniMarketCornerStore);	
		LatLng MartinezGroceryCornerStoreLocation = new LatLng(39.927138,-75.18208);
		Market MartinezGroceryCornerStore = new Market("MartinezGroceryCornerStore",cornerStoreFoods,MartinezGroceryCornerStoreLocation );
		cornerStores.add(MartinezGroceryCornerStore);		
		LatLng CruzsGroceryCornerStoreLocation = new LatLng(39.927572,-75.175518);
		Market CruzsGroceryCornerStore = new Market("CruzsGroceryCornerStore",cornerStoreFoods,CruzsGroceryCornerStoreLocation );
		cornerStores.add(CruzsGroceryCornerStore);		
		LatLng RamosFoodMarketCornerStoreLocation = new LatLng(39.928183,-75.176867);
		Market RamosFoodMarketCornerStore = new Market("RamosFoodMarketCornerStore",cornerStoreFoods,RamosFoodMarketCornerStoreLocation );
		cornerStores.add(RamosFoodMarketCornerStore);	
		LatLng FernandezMiniMarketCornerStoreLocation = new LatLng(39.928801,-75.180638);
		Market FernandezMiniMarketCornerStore = new Market("FernandezMiniMarketCornerStore",cornerStoreFoods,FernandezMiniMarketCornerStoreLocation );
		cornerStores.add(FernandezMiniMarketCornerStore);		
		LatLng Cruz&FGroceryCornerStoreLocation = new LatLng(39.928633,-75.182403);
		Market Cruz&FGroceryCornerStore = new Market("Cruz&FGroceryCornerStore",cornerStoreFoods,Cruz&FGroceryCornerStoreLocation );
		cornerStores.add(Cruz&FGroceryCornerStore);	
		LatLng RanacaroGroceryStoreCornerStoreLocation = new LatLng(39.928684,-75.184317);
		Market RanacaroGroceryStoreCornerStore = new Market("RanacaroGroceryStoreCornerStore",cornerStoreFoods,RanacaroGroceryStoreCornerStoreLocation );
		cornerStores.add(RanacaroGroceryStoreCornerStore);		
		LatLng MohamedMarketCornerStoreLocation = new LatLng(39.928715,-75.173332);
		Market MohamedMarketCornerStore = new Market("MohamedMarketCornerStore",cornerStoreFoods,MohamedMarketCornerStoreLocation );
		cornerStores.add(MohamedMarketCornerStore);		
		LatLng NuMiniMarketCornerStoreLocation = new LatLng(39.929497,-75.171801);
		Market NuMiniMarketCornerStore = new Market("NuMiniMarketCornerStore",cornerStoreFoods,NuMiniMarketCornerStoreLocation );
		cornerStores.add(NuMiniMarketCornerStore);	
		LatLng DuranMiniMarketCornerStoreLocation = new LatLng(39.930391,-75.178109);
		Market DuranMiniMarketCornerStore = new Market("DuranMiniMarketCornerStore",cornerStoreFoods,DuranMiniMarketCornerStoreLocation );
		cornerStores.add(DuranMiniMarketCornerStore);	
		LatLng SantosGroceryCornerStoreLocation = new LatLng(39.930848,-75.169896);
		Market SantosGroceryCornerStore = new Market("SantosGroceryCornerStore",cornerStoreFoods,SantosGroceryCornerStoreLocation );
		cornerStores.add(SantosGroceryCornerStore);	
		LatLng SanLucaGroceryIncCornerStoreLocation = new LatLng(39.930735,-75.171004);
		Market SanLucaGroceryIncCornerStore = new Market("SanLucaGroceryIncCornerStore",cornerStoreFoods,SanLucaGroceryIncCornerStoreLocation );
		cornerStores.add(SanLucaGroceryIncCornerStore);
		
		//19146
		LatLng CastroGroceryCornerStoreLocation = new LatLng(39.932059,-75.171474);
		Market CastroGroceryCornerStore = new Market("CastroGroceryCornerStore",cornerStoreFoods,CastroGroceryCornerStoreLocation );
		cornerStores.add(CastroGroceryCornerStore);
		
		LatLng GilGrocery#2CornerStoreLocation = new LatLng(39.933248,-75.176178);
		Market GilGrocery#2CornerStore = new Market("GilGrocery#2CornerStore",cornerStoreFoods,GilGrocery#2CornerStoreLocation );
		cornerStores.add(GilGrocery#2CornerStore);	
		LatLng 21stFoodMarket&DeliCornerStoreLocation = new LatLng(39.933009,-75.179489);
		Market 21stFoodMarket&DeliCornerStore = new Market("21stFoodMarket&DeliCornerStore",cornerStoreFoods,21stFoodMarket&DeliCornerStoreLocation );
		cornerStores.add(21stFoodMarket&DeliCornerStore);
		LatLng G&NGroceryDeliCornerStoreLocation = new LatLng(39.933714,-75.182992);
		Market G&NGroceryDeliCornerStore = new Market("G&NGroceryDeliCornerStore",cornerStoreFoods,G&NGroceryDeliCornerStoreLocation );
		cornerStores.add(G&NGroceryDeliCornerStore);
		LatLng TaskerFoodMarketCornerStoreLocation = new LatLng(39.933976,-75.194927);
		Market TaskerFoodMarketCornerStore = new Market("TaskerFoodMarketCornerStore",cornerStoreFoods,TaskerFoodMarketCornerStoreLocation );
		cornerStores.add(TaskerFoodMarketCornerStore);
		LatLng BlackAngelFoodMarketCornerStoreLocation = new LatLng(39.935156,-75.195718);
		Market BlackAngelFoodMarketCornerStore = new Market("BlackAngelFoodMarketCornerStore",cornerStoreFoods,BlackAngelFoodMarketCornerStoreLocation );
		cornerStores.add(BlackAngelFoodMarketCornerStore);
		LatLng PhongGroceryCornerStoreLocation = new LatLng(39.933336,-75.170263);
		Market PhongGroceryCornerStore = new Market("PhongGroceryCornerStore",cornerStoreFoods,PhongGroceryCornerStoreLocation );
		cornerStores.add(PhongGroceryCornerStore);
		LatLng JuanCarlosGomezGroceryCornerStoreLocation = new LatLng(39.933868,-75.174417);
		Market JuanCarlosGomezGroceryCornerStore = new Market("JuanCarlosGomezGroceryCornerStore",cornerStoreFoods,JuanCarlosGomezGroceryCornerStoreLocation );
		cornerStores.add(JuanCarlosGomezGroceryCornerStore);
		LatLng YoungsHarvestMarketCornerStoreLocation = new LatLng(39.93385,-75.180254);
		Market YoungsHarvestMarketCornerStore = new Market("YoungsHarvestMarketCornerStore",cornerStoreFoods,YoungsHarvestMarketCornerStoreLocation );
		cornerStores.add(YoungsHarvestMarketCornerStore);
		LatLng ReedMiniMarketCornerStoreLocation = new LatLng(39.934657,-75.180662);
		Market ReedMiniMarketCornerStore = new Market("ReedMiniMarketCornerStore",cornerStoreFoods,ReedMiniMarketCornerStoreLocation );
		cornerStores.add(ReedMiniMarketCornerStore);
		LatLng LaMecaFoodMarketCornerStoreLocation = new LatLng(39.93444,-75.169163);
		Market LaMecaFoodMarketCornerStore = new Market("LaMecaFoodMarketCornerStore",cornerStoreFoods,LaMecaFoodMarketCornerStoreLocation );
		cornerStores.add(LaMecaFoodMarketCornerStore);
		LatLng LaFuerzaCornerStoreLocation = new LatLng(39.934405,-75.170753);
		Market LaFuerzaCornerStore = new Market("LaFuerzaCornerStore",cornerStoreFoods,LaFuerzaCornerStoreLocation );
		cornerStores.add(LaFuerzaCornerStore);
		LatLng OlivaresGroceryCornerStoreLocation = new LatLng(39.934809,-75.173126);
		Market OlivaresGroceryCornerStore = new Market("OlivaresGroceryCornerStore",cornerStoreFoods,OlivaresGroceryCornerStoreLocation );
		cornerStores.add(OlivaresGroceryCornerStore);
		LatLng L&MFoodMarketCornerStoreLocation = new LatLng(39.935896,-75.180363);
		Market L&MFoodMarketCornerStore = new Market("L&MFoodMarketCornerStore",cornerStoreFoods,L&MFoodMarketCornerStoreLocation );
		cornerStores.add(L&MFoodMarketCornerStore);
		LatLng BaezGroceryLlcCornerStoreLocation = new LatLng(39.936141,-75.182214);
		Market BaezGroceryLlcCornerStore = new Market("BaezGroceryLlcCornerStore",cornerStoreFoods,BaezGroceryLlcCornerStoreLocation );
		cornerStores.add(BaezGroceryLlcCornerStore);
		LatLng UrenaFoodMartCornerStoreLocation = new LatLng(39.937013,-75.190693);
		Market UrenaFoodMartCornerStore = new Market("UrenaFoodMartCornerStore",cornerStoreFoods,UrenaFoodMartCornerStoreLocation );
		cornerStores.add(UrenaFoodMartCornerStore);
		LatLng ArhenyFoodMarketCornerStoreLocation = new LatLng(39.937206,-75.182092);
		Market ArhenyFoodMarketCornerStore = new Market("ArhenyFoodMarketCornerStore",cornerStoreFoods,ArhenyFoodMarketCornerStoreLocation );
		cornerStores.add(ArhenyFoodMarketCornerStore);
		LatLng A&HFoodMarketCornerStoreLocation = new LatLng(39.937197,-75.176637);
		Market A&HFoodMarketCornerStore = new Market("A&HFoodMarketCornerStore",cornerStoreFoods,A&HFoodMarketCornerStoreLocation );
		cornerStores.add(A&HFoodMarketCornerStore);
		LatLng RightTriangleCornerStoreLocation = new LatLng(39.936924,-75.17508);
		Market RightTriangleCornerStore = new Market("RightTriangleCornerStore",cornerStoreFoods,RightTriangleCornerStoreLocation );
		cornerStores.add(RightTriangleCornerStore);
		LatLng ArianaGroceryIICornerStoreLocation = new LatLng(39.935904,-75.169133);
		Market ArianaGroceryIICornerStore = new Market("ArianaGroceryIICornerStore",cornerStoreFoods,ArianaGroceryIICornerStoreLocation );
		cornerStores.add(ArianaGroceryIICornerStore);
		
		LatLng NunezGroceryCornerStoreLocation = new LatLng(39.940318,-75.169519);
		Market NunezGroceryCornerStore = new Market("NunezGroceryCornerStore",cornerStoreFoods,NunezGroceryCornerStoreLocation );
		cornerStores.add(NunezGroceryCornerStore);
		
		LatLng HarrysHouseCornerStoreLocation = new LatLng(39.941114,-75.174162);
		Market HarrysHouseCornerStore = new Market("HarrysHouseCornerStore",cornerStoreFoods,HarrysHouseCornerStoreLocation );
		cornerStores.add(HarrysHouseCornerStore);
		
		LatLng NameKimVansCafCornerStoreLocation = new LatLng(39.94145,-75.179268);
		Market NameKimVansCafCornerStore = new Market("NameKimVansCafCornerStore",cornerStoreFoods,NameKimVansCafCornerStoreLocation );
		cornerStores.add(NameKimVansCafCornerStore);
		
		LatLng ChristianFoodMarketCornerStoreLocation = new LatLng(39.941997,-75.180783);
		Market ChristianFoodMarketCornerStore = new Market("ChristianFoodMarketCornerStore",cornerStoreFoods,ChristianFoodMarketCornerStoreLocation );
		cornerStores.add(ChristianFoodMarketCornerStore);
		
		LatLng KennedyGroceryCornerStoreLocation = new LatLng(39.942895,-75.178879);
		Market KennedyGroceryCornerStore = new Market("KennedyGroceryCornerStore",cornerStoreFoods,KennedyGroceryCornerStoreLocation );
		cornerStores.add(KennedyGroceryCornerStore);
		
		LatLng AdabelDeliIncCornerStoreLocation = new LatLng(39.944477,-75.171559);
		Market AdabelDeliIncCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,AdabelDeliIncCornerStoreLocation );
		cornerStores.add(AdabelDeliIncCornerStore);
		
		//19112
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		LatLng BarbaroCornerStoreLocation = new LatLng(39.922046,-75.180535);
		Market BarbaroCornerStore = new Market("BarbaroCornerStore",cornerStoreFoods,BarbaroCornerStoreLocation );
		cornerStores.add(BarbaroCornerStore);
		
		
		
		
		
	}
	
	private void instantiateFarmerMarkets() {
		
	}
	
	private void instantiateAldi() {
		
	}
}
