package com.example.freshfoodfinder;

import java.util.ArrayList;
import java.util.Calendar;

import com.google.android.gms.maps.model.LatLng;

public class MarketManager {

	private ArrayList<Food> superMarketFoods;
	private ArrayList<Food> wawaFoods;
	private ArrayList<Food> cornerStoreFoods;
	private ArrayList<Food> farmerMarketFoods;
	private ArrayList<Food> alDiFoods;
	
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
		alDiFoods = new ArrayList<Food>();
		
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
		cornerStoreFoods.addAll(Food.getAllFoods());
	}
	
	private void instantiateFarmerMarketFoods() {
		
	}
	
	private void instantiateAldiFoods() {
	
		alDiFoods.add(new Food("Asparagus", Food.FOOD_VEG, Calendar.MAY, Calendar.JUNE));
		alDiFoods.add(new Food("Arugula", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		alDiFoods.add(new Food("Bell pepper", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Broccoli", Food.FOOD_VEG, Calendar.JUNE, Calendar.NOVEMBER));
		alDiFoods.add(new Food("Cabbage", Food.FOOD_VEG, Calendar.JUNE, Calendar.OCTOBER));
		alDiFoods.add(new Food("Carrot", Food.FOOD_VEG, Calendar.JUNE, Calendar.SEPTEMBER));
		alDiFoods.add(new Food("Cauliflower", Food.FOOD_VEG, Calendar.AUGUST, Calendar.NOVEMBER));
		alDiFoods.add(new Food("Celery", Food.FOOD_VEG, Calendar.AUGUST, Calendar.OCTOBER));
		alDiFoods.add(new Food("Cucumber", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Garlic", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));//STORED YEAR ROUND THOUGH
		alDiFoods.add(new Food("Green Beans", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Lettuce", Food.FOOD_VEG, Calendar.MAY, Calendar.OCTOBER));
		alDiFoods.add(new Food("Onion", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));
		alDiFoods.add(new Food("Pumpkin", Food.FOOD_VEG, Calendar.SEPTEMBER, Calendar.NOVEMBER));
		alDiFoods.add(new Food("Potato", Food.FOOD_VEG, Calendar.JULY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Spinach", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		alDiFoods.add(new Food("Sweet corn", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Sweet pepper", Food.FOOD_VEG, Calendar.JULY, Calendar.OCTOBER));
		alDiFoods.add(new Food("Sweet potato", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Radish", Food.FOOD_VEG, Calendar.MAY, Calendar.SEPTEMBER));
		alDiFoods.add(new Food("Tomato", Food.FOOD_VEG, Calendar.JULY, Calendar.SEPTEMBER));
		alDiFoods.add(new Food("Yam", Food.FOOD_VEG, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Zucchini", Food.FOOD_VEG, Calendar.JULY, Calendar.SEPTEMBER));
		alDiFoods.add(new Food("Apple", Food.FOOD_FRUIT, Calendar.JULY, Calendar.OCTOBER));
		alDiFoods.add(new Food("Avocado", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Banana", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Blackberry", Food.FOOD_FRUIT, Calendar.JULY, Calendar.AUGUST));
		alDiFoods.add(new Food("Blueberry", Food.FOOD_FRUIT, Calendar.JULY, Calendar.AUGUST));
		alDiFoods.add(new Food("Cantaloupe", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.SEPTEMBER));
		alDiFoods.add(new Food("Clementine", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Grape", Food.FOOD_FRUIT, Calendar.SEPTEMBER, Calendar.OCTOBER));
		alDiFoods.add(new Food("Grapefruit", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Kiwi fruit", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Lemon", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Lime", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Mango", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Nectarine", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Orange", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Peach", Food.FOOD_FRUIT, Calendar.JULY, Calendar.SEPTEMBER));
		alDiFoods.add(new Food("Pear", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.DECEMBER));
		alDiFoods.add(new Food("Plum", Food.FOOD_FRUIT, Calendar.AUGUST, Calendar.SEPTEMBER));	
		alDiFoods.add(new Food("Pineapple", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Raspberry", Food.FOOD_FRUIT, Calendar.JANUARY, Calendar.DECEMBER));
		alDiFoods.add(new Food("Strawberry", Food.FOOD_FRUIT, Calendar.JUNE, Calendar.JUNE));
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
		wawas.add(f46thandChestnutWawa);
		LatLng f37thandSpruceWawaLocation = new LatLng(39.951124,-75.198862);
		Market f37thandSpruceWawa = new Market("f37thandSpruceWawa",wawaFoods,f37thandSpruceWawaLocation );
		wawas.add(f37thandSpruceWawa);
		LatLng bartramAveWawaLocation = new LatLng(39.894628,-75.236559);
		Market bartramAveWawa = new Market("bartramAveWawa",wawaFoods,bartramAveWawaLocation );
		wawas.add(f37thandSpruceWawa);

	}
	
	private void instantiateCornerStores() {
		
		//all stores from 19139
		LatLng toresCornerStoreLocation = new LatLng(39.956242,-75.21777);
		Market toresCornerStore = new Market("toresCornerStore",cornerStoreFoods,toresCornerStoreLocation );
		cornerStores.add(toresCornerStore);
		LatLng conniesCornerStoreLocation = new LatLng(39.957013,-75.22506);
		Market conniesCornerStore = new Market("conniesCornerStore",cornerStoreFoods,conniesCornerStoreLocation );
		cornerStores.add(conniesCornerStore);
		LatLng MontesinosCornerStoreLocation = new LatLng(39.959126,-75.228789);
		Market MontesinosCornerStore = new Market("MontesinosCornerStore",cornerStoreFoods,MontesinosCornerStoreLocation );
		cornerStores.add(MontesinosCornerStore);
		LatLng RodriguezCornerStoreLocation = new LatLng(39.961881,-75.22627);
		Market RodriguezCornerStore = new Market("RodriguezCornerStore",cornerStoreFoods,RodriguezCornerStoreLocation );
		cornerStores.add(RodriguezCornerStore);
		LatLng GregoryCornerStoreLocation = new LatLng(39.961399,-75.221662);
		Market GregoryCornerStore = new Market("GregoryCornerStore",cornerStoreFoods,GregoryCornerStoreLocation );
		cornerStores.add(GregoryCornerStore);
		LatLng fiftyOneRaceCornerStoreLocation = new LatLng(39.963041,-75.222338);
		Market fiftyOneRaceCornerStore = new Market("fiftyOneRaceCornerStore",cornerStoreFoods,fiftyOneRaceCornerStoreLocation );
		cornerStores.add(fiftyOneRaceCornerStore);
		LatLng PorfiCornerStoreLocation = new LatLng(39.967172,-75.220698);
		Market PorfiOneRaceCornerStore = new Market("PorfiOneRaceCornerStore",cornerStoreFoods,PorfiCornerStoreLocation );
		cornerStores.add(PorfiOneRaceCornerStore);
		

		LatLng  genesisspruceCornerStoreLocation = new LatLng(39.955583,-75.2321);
		Market genesisspruceCornerStore = new Market("genesisspruceCornerStore",cornerStoreFoods,genesisspruceCornerStoreLocation );
		cornerStores.add(genesisspruceCornerStore);
		

		LatLng  nadiasvineCornerStoreLocation = new LatLng(39.966849,-75.243654);
		Market nadiasvineCornerStore = new Market("nadiasvineCornerStore",cornerStoreFoods,nadiasvineCornerStoreLocation );
		cornerStores.add(nadiasvineCornerStore);
		
		LatLng  yalneypineCornerStoreLocation = new LatLng(39.954732,-75.234321);
		Market yalneypineCornerStore = new Market("yalneypineCornerStore",cornerStoreFoods,yalneypineCornerStoreLocation );
		cornerStores.add(yalneypineCornerStore);
		
		LatLng westphilaproduce62ndCornerStoreLocation = new LatLng(39.961824,-75.24498);
		Market westphilaproduce62ndCornerStore = new Market("westphilaproduce62ndCornerStore",cornerStoreFoods,westphilaproduce62ndCornerStoreLocation );
		cornerStores.add(westphilaproduce62ndCornerStore);
		
		LatLng unidollarplusspruceCornerStoreLocation = new LatLng(39.953424,-75.217311);
		Market unidollarplusspruceCornerStore = new Market("unidollarplusspruceCornerStore",cornerStoreFoods,unidollarplusspruceCornerStoreLocation );
		cornerStores.add(unidollarplusspruceCornerStore);
		
		LatLng mohhallal45walnutCornerStoreLocation = new LatLng(39.955688,-75.213183);
		Market mohhallal45walnutCornerStore = new Market("mohhallal45walnutCornerStore",cornerStoreFoods,mohhallal45walnutCornerStoreLocation );
		cornerStores.add(mohhallal45walnutCornerStore);
		
		LatLng pm52ndCornerStoreLocation = new LatLng(39.961465,-75.224434);
		Market pm52ndCornerStore = new Market("pm52ndCornerStore",cornerStoreFoods,pm52ndCornerStoreLocation );
		cornerStores.add(pm52ndCornerStore);
		
		LatLng amanMarketstCornerStoreLocation = new LatLng(39.960417,-75.22857);
		Market amanMarketstCornerStore = new Market("amanMarketstCornerStore",cornerStoreFoods,amanMarketstCornerStoreLocation );
		cornerStores.add(amanMarketstCornerStore);
		
		LatLng syed52ndCornerStoreLocation = new LatLng(39.955555,-75.225955);
		Market syed52ndCornerStore = new Market("syed52ndCornerStore",cornerStoreFoods,syed52ndCornerStoreLocation );
		cornerStores.add(syed52ndCornerStore);
		
		LatLng forty9stopwalnutCornerStoreLocation = new LatLng(39.956443,-75.219391);
		Market forty9stopwalnutCornerStore = new Market("forty9stopwalnutCornerStore",cornerStoreFoods,forty9stopwalnutCornerStoreLocation );
		cornerStores.add(forty9stopwalnutCornerStore);
		
		LatLng delanceyfoodCornerStoreLocation = new LatLng(39.954271,-75.227971);
		Market delanceyfoodCornerStore = new Market("delanceyfoodCornerStore",cornerStoreFoods,delanceyfoodCornerStoreLocation );
		cornerStores.add(delanceyfoodCornerStore);
		//end stores from 19139
		//begin stores from 19131
		LatLng MaximinoCornerStoreLocation = new LatLng(39.973884,-75.231066);
		Market MaximinoCornerStore = new Market("MaximinoCornerStore",cornerStoreFoods,MaximinoCornerStoreLocation );
		cornerStores.add(MaximinoCornerStore);
		LatLng fiftyeightReyesCornerStoreLocation = new LatLng(39.973101,-75.237898);
		Market fiftyeightReyesCornerStore = new Market("fiftyeightReyesCornerStore",cornerStoreFoods,fiftyeightReyesCornerStoreLocation );
		cornerStores.add(fiftyeightReyesCornerStore);
		LatLng fiftysixMastersReyesCornerStoreLocation = new LatLng(39.973634,-75.233276);
		Market fiftysixMastersReyesCornerStore = new Market("fiftysixMastersReyesCornerStore",cornerStoreFoods,fiftysixMastersReyesCornerStoreLocation );
		cornerStores.add(fiftysixMastersReyesCornerStore);
		LatLng EconomicCornerStoreLocation = new LatLng(32.968041,-81.767068);
		Market EconomicCornerStore = new Market("EconomicCornerStore",cornerStoreFoods,EconomicCornerStoreLocation );
		cornerStores.add(EconomicCornerStore);
		LatLng papiCornerStoreLocation = new LatLng(40.819802,-96.644509);
		Market papiCornerStore = new Market("papiCornerStore",cornerStoreFoods,papiCornerStoreLocation );
		cornerStores.add(papiCornerStore);

		LatLng fifty4WyalusingCornerStoreLocation = new LatLng(39.967172,-75.220698);
		Market fifty4WyalusingCornerStore = new Market("fifty4WyalusingCornerStore",cornerStoreFoods,fifty4WyalusingCornerStoreLocation );
		cornerStores.add(fifty4WyalusingCornerStore);

		LatLng vinasCornerStoreLocation = new LatLng(39.97117,-75.228826);
		Market vinasCornerStore = new Market("vinasCornerStore",cornerStoreFoods,vinasCornerStoreLocation );
		cornerStores.add(vinasCornerStore);

		LatLng crestCornerStoreLocation = new LatLng(39.987849,-75.238558);
		Market crestCornerStore = new Market("crestCornerStore",cornerStoreFoods,crestCornerStoreLocation );
		cornerStores.add(crestCornerStore);

		LatLng AngelinasCornerStoreLocation = new LatLng(39.98592,-75.229181);
		Market AngelinasCornerStore = new Market("AngelinasCornerStore",cornerStoreFoods,AngelinasCornerStoreLocation );
		cornerStores.add(AngelinasCornerStore);

		LatLng ZabalaCornerStoreLocation = new LatLng(39.984749,-75.231301);
		Market ZabalaCornerStore = new Market("ZabalaCornerStore",cornerStoreFoods,ZabalaCornerStoreLocation );
		cornerStores.add(ZabalaCornerStore);
		

		LatLng CommunityCornerStoreLocation = new LatLng(39.984607,-75.22936);
		Market CommunityCornerStore = new Market("CommunityCornerStore",cornerStoreFoods,CommunityCornerStoreLocation );
		cornerStores.add(CommunityCornerStore);
		

		LatLng iandsCornerStoreLocation = new LatLng(39.980105,-75.227326);
		Market iandsCornerStore = new Market("iandsCornerStore",cornerStoreFoods,iandsCornerStoreLocation );
		cornerStores.add(iandsCornerStore);

		LatLng valeriosCornerStoreLocation = new LatLng(39.977099,-75.231691);
		Market valeriosCornerStore = new Market("valeriosCornerStore",cornerStoreFoods,valeriosCornerStoreLocation );
		cornerStores.add(valeriosCornerStore);

		LatLng CabreraCornerStoreLocation = new LatLng(39.978064,-75.235849);
		Market CabreraCornerStore = new Market("CabreraCornerStore",cornerStoreFoods,CabreraCornerStoreLocation );
		cornerStores.add(CabreraCornerStore);

		LatLng MartinezCornerStoreLocation = new LatLng(39.975047,-75.234747);
		Market MartinezCornerStore = new Market("MartinezCornerStore",cornerStoreFoods,MartinezCornerStoreLocation );
		cornerStores.add(PorfiOneRaceCornerStore);


		LatLng morgans54thCornerStoreLocation = new LatLng(39.986537,-75.231913);
		Market morgans54thCornerStore = new Market("morgans54thCornerStore",cornerStoreFoods,morgans54thCornerStoreLocation );
		cornerStores.add(morgans54thCornerStore);


		LatLng rodriguez60055thstCornerStoreLocation = new LatLng(39.975047,-75.234747);
		Market rodriguez60055thstCornerStore = new Market("rodriguez60055thstCornerStore",cornerStoreFoods,rodriguez60055thstCornerStoreLocation );
		cornerStores.add(rodriguez60055thstCornerStore);

		
		//end stores in 19131
		//begin stores in 19130

		LatLng trustCornerStoreLocation = new LatLng(39.970372,-75.17953);
		Market trustCornerStore = new Market("trustCornerStore",cornerStoreFoods,trustCornerStoreLocation );
		cornerStores.add(trustCornerStore);

		LatLng museumCornerStoreLocation = new LatLng(39.962571,-75.168772);
		Market museumCornerStore = new Market("museumCornerStore",cornerStoreFoods,museumCornerStoreLocation );
		cornerStores.add(museumCornerStore);

		LatLng garden22fairmountCornerStoreLocation = new LatLng(39.967145,-75.175321);
		Market garden22fairmountCornerStore = new Market("garden22fairmountCornerStore",cornerStoreFoods,garden22fairmountCornerStoreLocation );
		cornerStores.add(garden22fairmountCornerStore);

		LatLng sals676nbroadCornerStoreLocation = new LatLng(39.96656,-75.160842);
		Market sals676nbroadCornerStore = new Market("sals676nbroadCornerStore",cornerStoreFoods,sals676nbroadCornerStoreLocation );
		cornerStores.add(sals676nbroadCornerStore);

		LatLng hotspotN15thCornerStoreLocation = new LatLng(39.965856,-75.162115);
		Market hotspotN15thCornerStore = new Market("hotspotN15thCornerStore",cornerStoreFoods,hotspotN15thCornerStoreLocation );
		cornerStores.add(hotspotN15thCornerStore);

		LatLng aa1700wallaceCornerStoreLocation = new LatLng(39.965719,-75.165782);
		Market aa1700wallaceCornerStore = new Market("aa1700wallaceCornerStore",cornerStoreFoods,aa1700wallaceCornerStoreLocation );
		cornerStores.add(aa1700wallaceCornerStore);

		LatLng jk2001greenstCornerStoreLocation = new LatLng(39.975047,-75.234747);
		Market jk2001greenstCornerStore = new Market("jk2001greenstCornerStore",cornerStoreFoods,jk2001greenstCornerStoreLocation );
		cornerStores.add(jk2001greenstCornerStore);

		LatLng wallaceCornerStoreLocation = new LatLng(39.96615,-75.170542);
		Market wallaceCornerStore = new Market("wallaceCornerStore",cornerStoreFoods,wallaceCornerStoreLocation );
		cornerStores.add(wallaceCornerStore);

		LatLng alejoMtvernonCornerStoreLocation = new LatLng(39.964996,-75.165721);
		Market alejoMtvernonCornerStore = new Market("alejoMtvernonCornerStore",cornerStoreFoods,alejoMtvernonCornerStoreLocation );
		cornerStores.add(alejoMtvernonCornerStore);

		LatLng almontepoplarCornerStoreLocation = new LatLng(39.971489,-75.169156);
		Market almontepoplarCornerStore = new Market("almontepoplarCornerStore",cornerStoreFoods,almontepoplarCornerStoreLocation );
		cornerStores.add(almontepoplarCornerStore);
		//end 19130 stores
		//begin 19121 stores
		LatLng karenN30thCornerStoreLocation = new LatLng(39.977893,-75.184618);
		Market karenN30thCornerStore = new Market("karenN30thCornerStore",cornerStoreFoods,karenN30thCornerStoreLocation );
		cornerStores.add(karenN30thCornerStore);
		LatLng jm1400NetingCornerStoreLocation = new LatLng(39.977251,-75.18017);
		Market jm1400NetingCornerStore = new Market("jm1400NetingCornerStore",cornerStoreFoods,jm1400NetingCornerStoreLocation );
		cornerStores.add(jm1400NetingCornerStore);
		LatLng yasminwjeffersonCornerStoreLocation = new LatLng(39.977656,-75.172951);
		Market yasminwjeffersonCornerStore = new Market("yasminwjeffersonCornerStore",cornerStoreFoods,yasminwjeffersonCornerStoreLocation );
		cornerStores.add(yasminwjeffersonCornerStore);
		LatLng paulinoswoxfordCornerStoreLocation = new LatLng(39.979131,-75.171306);
		Market paulinoswoxfordCornerStore = new Market("paulinoswoxfordCornerStore",cornerStoreFoods,paulinoswoxfordCornerStoreLocation );
		cornerStores.add(paulinoswoxfordCornerStore);
		LatLng rodriguezturnerstCornerStoreLocation = new LatLng(39.979976,-75.175834);
		Market rodriguezturnerstCornerStore = new Market("rodriguezturnerstCornerStore",cornerStoreFoods,rodriguezturnerstCornerStoreLocation );
		cornerStores.add(rodriguezturnerstCornerStore);
		LatLng martinezn20thstCornerStoreLocation = new LatLng(39.98135,-75.167195);
		Market martinezn20thstCornerStore = new Market("martinezn20thstCornerStore",cornerStoreFoods,martinezn20thstCornerStoreLocation );
		cornerStores.add(martinezn20thstCornerStore);
		LatLng carolinaRidgeCornerStoreLocation = new LatLng(39.987697,-75.182126);
		Market carolinaRidgeCornerStore = new Market("carolinaRidgeCornerStore",cornerStoreFoods,carolinaRidgeCornerStoreLocation );
		cornerStores.add(carolinaRidgeCornerStore);
		LatLng espinaln23rdstCornerStoreLocation = new LatLng(39.985002,-75.171447);
		Market espinaln23rdstCornerStore = new Market("espinaln23rdstCornerStore",cornerStoreFoods,espinaln23rdstCornerStoreLocation );
		cornerStores.add(espinaln23rdstCornerStore);
		LatLng torresNringoldCornerStoreLocation = new LatLng(39.983987,-75.174101);
		Market torresNringoldCornerStore = new Market("torresNringoldCornerStore",cornerStoreFoods,torresNringoldCornerStoreLocation );
		cornerStores.add(torresNringoldCornerStore);
		LatLng duranN27thCornerStoreLocation = new LatLng(39.982862,-75.178763);
		Market duranN27thCornerStore = new Market("duranN27thCornerStore",cornerStoreFoods,duranN27thCornerStoreLocation );
		cornerStores.add(duranN27thCornerStore);
		LatLng cecilMooreCornerStoreLocation = new LatLng(39.98104,-75.177562);
		Market cecilMooreCornerStore = new Market("cecilMooreCornerStore",cornerStoreFoods,cecilMooreCornerStoreLocation );
		cornerStores.add(cecilMooreCornerStore);
		LatLng delvalley21stCornerStoreLocation = new LatLng(39.981497,-75.168959);
		Market delvalley21stCornerStore = new Market("delvalley21stCornerStore",cornerStoreFoods,delvalley21stCornerStoreLocation );
		cornerStores.add(delvalley21stCornerStore);
		LatLng pelteras21stCornerStoreLocation = new LatLng(39.987677,-75.167611);
		Market pelteras21stCornerStore = new Market("pelteras21stCornerStore",cornerStoreFoods,pelteras21stCornerStoreLocation );
		cornerStores.add(pelteras21stCornerStore);
		LatLng jmsesquehanaCornerStoreLocation = new LatLng(39.987366,-75.164478);
		Market jmsesquehanaCornerStore = new Market("jmsesquehanaCornerStore",cornerStoreFoods,jmsesquehanaCornerStoreLocation );
		cornerStores.add(jmsesquehanaCornerStore);
		LatLng lorasesquehanaCornerStoreLocation = new LatLng(39.987438,-75.165238);
		Market lorasesquehanaCornerStore = new Market("lorasesquehanaCornerStore",cornerStoreFoods,lorasesquehanaCornerStoreLocation );
		cornerStores.add(jmsesquehanaCornerStore);
		LatLng adandiamondCornerStoreLocation = new LatLng(39.985559,-75.16121);
		Market adandiamondCornerStore = new Market("adandiamondCornerStore",cornerStoreFoods,adandiamondCornerStoreLocation );
		cornerStores.add(adandiamondCornerStore);
		LatLng bristia16thCornerStoreLocation = new LatLng(39.984461,-75.159886);
		Market bristia16thCornerStore = new Market("bristia16thCornerStore",cornerStoreFoods,bristia16thCornerStoreLocation );
		cornerStores.add(bristia16thCornerStore);
		LatLng  estevezoxfordCornerStoreLocation = new LatLng(39.977897,-75.164493);
		Market estevezoxfordCornerStore = new Market("estevezoxfordCornerStore",cornerStoreFoods,estevezoxfordCornerStoreLocation );
		cornerStores.add(estevezoxfordCornerStore);
		LatLng city19CornerStoreLocation = new LatLng(39.976862,-75.16655);
		Market city19CornerStore = new Market("city19CornerStore",cornerStoreFoods,city19CornerStoreLocation );
		cornerStores.add(city19CornerStore);
		LatLng brothersridgeCornerStoreLocation = new LatLng(39.975585,-75.168714);
		Market brothersridgeCornerStore = new Market("brothersridgeCornerStore",cornerStoreFoods,brothersridgeCornerStoreLocation );
		cornerStores.add(brothersridgeCornerStore);
		LatLng rodriguezthompsonCornerStoreLocation = new LatLng(39.97533,-75.176787);
		Market rodriguezthompsonCornerStore = new Market("rodriguezthompsonCornerStore",cornerStoreFoods,rodriguezthompsonCornerStoreLocation );
		cornerStores.add(rodriguezthompsonCornerStore);
		LatLng threesistersMasterCornerStoreLocation = new LatLng(39.976606,-75.176676);
		Market threesistersMasterCornerStore = new Market("threesistersMasterCornerStore",cornerStoreFoods,threesistersMasterCornerStoreLocation );
		cornerStores.add(threesistersMasterCornerStore);
		LatLng communityoxfordCornerStoreLocation = new LatLng(39.980521,-75.182341);
		Market communityoxfordCornerStore = new Market("communityoxfordCornerStore",cornerStoreFoods,communityoxfordCornerStoreLocation );
		cornerStores.add(communityoxfordCornerStore);
		LatLng bravoMarketCornerStoreLocation = new LatLng(39.981712,-75.182175);
		Market bravoMarketCornerStore = new Market("bravoMarketCornerStore",cornerStoreFoods,bravoMarketCornerStoreLocation );
		cornerStores.add(brothersridgeCornerStore);
		LatLng rightchoiceberksCornerStoreLocation = new LatLng(39.983554,-75.170913);
		Market rightchoiceberksCornerStore = new Market("rightchoiceberksCornerStore",cornerStoreFoods,rightchoiceberksCornerStoreLocation );
		cornerStores.add(rightchoiceberksCornerStore);
		LatLng cfoodmorrisCornerStoreLocation = new LatLng(39.985431,-75.174609);
		Market cfoodmorrisCornerStore = new Market("cfoodmorrisCornerStore",cornerStoreFoods,cfoodmorrisCornerStoreLocation );
		cornerStores.add(cfoodmorrisCornerStore);
		LatLng popexcecilemooreornerStoreLocation = new LatLng(39.981048,-75.174726);
		Market popexcecilemooreornerStore = new Market("popexcecilemooreornerStore",cornerStoreFoods,popexcecilemooreornerStoreLocation );
		cornerStores.add(popexcecilemooreornerStore);
		LatLng twentysixthfoodCornerStoreLocation = new LatLng(39.98283,-75.177131);
		Market twentysixthfoodCornerStore = new Market("twentysixthfoodCornerStore",cornerStoreFoods,twentysixthfoodCornerStoreLocation );
		cornerStores.add(twentysixthfoodCornerStore);
		
		//end stores 19121 
		
	}
	
	private void instantiateFarmerMarkets() {
		
	}
	
	private void instantiateAldi() {
		LatLng aldi46thandMarketLocation = new LatLng(39.959169,-75.213727);
		Market aldi46thandMarket = new Market("aldi46thandMarket",alDiFoods,aldi46thandMarketLocation );
		aldi.add(aldi46thandMarket);

	}
}
