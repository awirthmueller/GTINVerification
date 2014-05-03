package de.wirthmue.gtinverification;

/**
Copyright [03/05/2014] [Andreas Wirthmüller]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*
*/

public class GTINCountryCode {
	
	 public static String USA = "U.S.A. & Canada";
	 public static String INTERNAL = "internal number range";
	 public static String FRANCE = "France";
	 public static String BULGARIA = "Bulgaria";
	 public static String GERMANY = "Deutschland";
	 public static String JAPAN = "Japan";
	 public static String RUSSIA = "Russia";
	 public static String UK = "United Kingdom";
	 public static String BELUX = "Belgium & Luxemburg";
	 public static String DENMARK = "Denmark";
	 public static String SOUTHAFRICA = "South Africa";
	 public static String FINNLAND = "Finnland";
	 public static String CHINA = "China";
	 public static String NORWAY = "Norway";
	 public static String SWEDEN = "Sweden";
	 public static String SUILI = "Suisse & Lichtenstein";
	 public static String ITALY = "Italy";
	 public static String SPAIN = "Spain";
	 public static String SWERBIA = "Serbia";
	 public static String NETHERLANDS = "Netherlands";
	 public static String AUSTRIA = "Austria";
	 public static String AUSTRALIA = "Australia";
	 public static String NEWZEALAND = "New Zealand";
	 public static String COMMON = "Common Currency Coupons";
	 public static String COUPONS = "CCoupons";
	 public static String SLOWENIA = "Slowenia";
	 public static String CROATIA = "Croatia";
	 public static String BOSIANHERZ = "Bosnia-Herzegowina";
	 public static String MONTENEGRO = "Montenegro"; 

	 public static String TAIWAN = "Taiwan";
	 public static String ESTLAND = "Estland";
	 public static String LETTLAND = "Lettland";
	 public static String ASERBAIDSCHAN = "Aserbaidschan";
	 public static String LITAUEN = "Litauen";
	 public static String USBEKISTAN = "Usbekistan";
	 public static String SRILANKA = "Sri Lanka";
	 public static String PHILIPPINES = "Philippinen";
	 public static String BELARUS = "Belarus";
	 public static String UKRAIN = "Ukraine";
	 public static String MOLDWIEN = "Moldawien";
	 public static String ARMENIEN = "Armenien";
	 public static String GEORGIEN = "Georgien";
	 public static String KASACHSTAN = "Kasachstan";
	 public static String HONKONG = "Hongkong";
	 
	 public static String GREECE = "GREECE";
	 public static String LIBANON = "Libanon";
	 public static String CYPRUS = "CYPRUS";
	 public static String MACEDONIA = "Macedonia";
	 public static String MALTE = "Malte";
	 public static String IRELAND = "Ireland";
	 public static String PORTUGAL = "Portugal";
	 public static String ICELAND = "Iceland";
	 public static String POLAND = "Poland";
	 public static String RUMANIA = "Rumania";
	 public static String HUNGARIA = "Hungaria";
	 public static String BAHREIN = "Bahrein";
	 public static String MAURITIUS = "Mauritius";
	 public static String MAROCCA = "Marocco";
	 public static String ALGERIA = "Algeria";
	 public static String KENIA = "Kenia";
	 public static String TUNESIA = "Tunesia";
	 public static String SYRIA = "Syria";
	 public static String EGYPT = "Egypt";
	 public static String LYBIA = "Lybia";
	 public static String JORANIA = "Jordania";
	 public static String IRAN = "Iran";
	 public static String KUWAIT = "Kuwait";
	 public static String SAUDIARABIA = "Saudi Arabia";
	 public static String VAE = "VAE";
	 
	 
	 
	 public static String COLUMBIA= "COLUMBIA";
	 public static String URUGUAY = "Uruguay";
	 public static String PERU = "Peru";
	 public static String BOLIVIA = "Bolivia";
	 public static String ARGENTINA = "Argentina";
	 public static String CHILE = "Chile";
	 public static String PARAGUAY = "Paraguay";
	 public static String ECUADOR = "Ecuador";
	 public static String BRASIL = "Brasil";
	 public static String CUBA = "Cuba";
	 public static String SLOVAKIA = "Slovakia";
	 public static String CZECH = "Czech";
	 public static String SERBIA = "Serbia";
	 public static String NORTHCOREA = "North Corea";
	 public static String TURKEY = "Turkey";
	 public static String SOUTHCOREA = "South Corea";
	 public static String THAILAND = "Thailand";
	 public static String SINGAPUR = "Singapur";
	 public static String INDIA = "India";
	 public static String ISRAEL = "Israel";

	 public static String GUATEMALA = "Guatemala";
	 public static String ELSALVADOR = "El Salvador";
	 public static String HODNURAS = "Honduras";
	 public static String NICARAGUA = "Nicaragua";
	 public static String COSTARICA = "Costa Rica";
	 public static String PANAMA = "Panama";
	 public static String DOMINICANREPUBLIC = "Dominican Republic";
	 public static String MEXICO = "Mexico";
	 public static String VENZUELA = "Venezuela";
	 
	 public static String VIETNAM = "Vietnam";
	 public static String INDONESIA = "Indonesia";	 
	 public static String EANHQ = "EAN Headquarters";
	 public static String MALAYSIA = "Malaysia";
	 public static String MACAO = "Macao";
	 public static String PERIODICALS = "Periodicals";
	 public static String ISBN = "ISBN";
	 public static String REFUNDRECEIPTS = "Refund Receipts";
	 
	 public static String SPECIALNONE = "None";
	 public static String DISTRICENTER = "Distribution Code Center";
	 public static String MAGAZIN19 = "Zeitschrift & Magazin 19% MwSt";
	 public static String MAGAZIN7 = "Zeitschrift & Magazin 7% MwSt";
	 public static String MAGAZIN19J = "Zeitschrift & Magazin 19% MwSt - jugendgefährdend";
	 public static String MAGAZIN7J = "Zeitschrift & Magazin 7% MwSt - jugendgefährdend";	 
	 
	 private String countryCode = "";
	 private String specialType = "";
	 
	 public GTINCountryCode(String ccode) throws GTINException
	 {
		 validateCode(ccode);
	 }
	 
	 public String getCountrCode()
	 {
		 return countryCode;
	 }
	 
	 public String getSpecialType()
	 {
		 return specialType;
	 }
	 
	 private void validateCode(String ccode) throws GTINException
	 {
		 int aCode = 0;
		 if (ccode.length()!=3)
		 {
			 throw new GTINException("CountryCode must have three digits");
		 }
		 try
		 {	
			 aCode = Integer.parseInt(ccode);
		 }
		 catch(NumberFormatException nfe)  
		 {  
		      // not numeric then false
			 throw new GTINException(ccode + " is not numeric - invalid country code");
		 } 

		 if (aCode<0)
		 {
			 throw new GTINException(ccode + " is negativ numeric - invalid country code");
		 }
		 
		 if (aCode>=0 && aCode <=139)
		 {
			 countryCode = GTINCountryCode.USA;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }
		 
		 if (aCode>=200 && aCode <=299)
		 {
			 countryCode = GTINCountryCode.INTERNAL;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }
		 if (aCode>=300 && aCode <=379)
		 {
			 countryCode = GTINCountryCode.FRANCE;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }	
		 
		 if ((aCode>=400 && aCode <=413) || (aCode>=415 && aCode <=418) 
		      || (aCode>=420 && aCode <=433) || (aCode>=435 && aCode <=438)
		    )
		 {
			 countryCode = GTINCountryCode.GERMANY;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }	
		 
		 if (aCode>=450 && aCode <=459)
		 {
			 countryCode = GTINCountryCode.JAPAN;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }	

		 if (aCode>=460 && aCode <=469)
		 {
			 countryCode = GTINCountryCode.RUSSIA;
			 specialType = GTINCountryCode.SPECIALNONE;
		 }		
		 
		 if (aCode>=490 && aCode <=499)
		 {
			 countryCode = GTINCountryCode.JAPAN;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }	

		 if (aCode>=500 && aCode <=509)
		 {
			 countryCode = GTINCountryCode.UK;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }			 
		 if (aCode>=540 && aCode <=549)
		 {
			 countryCode = GTINCountryCode.BELUX;
			 specialType = GTINCountryCode.SPECIALNONE;
		 }	
		 if (aCode>=570 && aCode <=579)
		 {
			 countryCode = GTINCountryCode.DENMARK;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }
		 
		 if (aCode>=600 && aCode <=601)
		 {
			 countryCode = GTINCountryCode.SOUTHAFRICA;
			 specialType = GTINCountryCode.SPECIALNONE;
		 }		 

		 if (aCode>=640 && aCode <=649)
		 {
			 countryCode = GTINCountryCode.FINNLAND;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }			 
		 if (aCode>=690 && aCode <=699)
		 {
			 countryCode = GTINCountryCode.CHINA;
			 specialType = GTINCountryCode.SPECIALNONE;
		 }			 
		 if (aCode>=700 && aCode <=709)
		 {
			 countryCode = GTINCountryCode.NORWAY;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }	
		 if (aCode>=730 && aCode <=739)
		 {
			 countryCode = GTINCountryCode.SWEDEN;
			 specialType = GTINCountryCode.SPECIALNONE;
		 }	
		 if (aCode>=760 && aCode <=769)
		 {
			 countryCode = GTINCountryCode.SUILI;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }	
		 if (aCode>=800 && aCode <=839)
		 {
			 countryCode = GTINCountryCode.ITALY;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }	 
		 if (aCode>=840 && aCode <=849)
		 {
			 countryCode = GTINCountryCode.SPAIN;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }	 	
		 if (aCode>=870 && aCode <=879)
		 {
			 countryCode = GTINCountryCode.NETHERLANDS;
			 specialType = GTINCountryCode.SPECIALNONE;
		 }	 
		 if (aCode>=900 && aCode <=919)
		 {
			 countryCode = GTINCountryCode.AUSTRIA;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }	 
		 if (aCode>=930 && aCode <=939)
		 {
			 countryCode = GTINCountryCode.AUSTRALIA;
			 specialType = GTINCountryCode.SPECIALNONE;
		 }	
		 if (aCode>=940 && aCode <=949)
		 {
			 countryCode = GTINCountryCode.NEWZEALAND;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }	
		 if (aCode>=981 && aCode <=983)
		 {
			 countryCode = GTINCountryCode.COMMON;
			 specialType = GTINCountryCode.SPECIALNONE;
		 }
		 if (aCode>=990 && aCode <=999)
		 {
			 countryCode = GTINCountryCode.COUPONS;
			 specialType = GTINCountryCode.SPECIALNONE;
			 return;
		 }

		 switch (aCode)
		 {
		 	case 380:
				countryCode = GTINCountryCode.BULGARIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;		 		
		 	case 383:
				countryCode = GTINCountryCode.SLOWENIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;		
		 	case 385:
				countryCode = GTINCountryCode.CROATIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	case 387:
				countryCode = GTINCountryCode.BOSIANHERZ;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 389:
				countryCode = GTINCountryCode.MONTENEGRO;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 414:
				countryCode = GTINCountryCode.GERMANY;
				specialType = GTINCountryCode.MAGAZIN19;
		 		break;
		 	case 419:
				countryCode = GTINCountryCode.GERMANY;
				specialType = GTINCountryCode.MAGAZIN7;
		 		break;
		 	case 434:
				countryCode = GTINCountryCode.GERMANY;
				specialType = GTINCountryCode.MAGAZIN19J;
		 		break;
		 	case 439:
				countryCode = GTINCountryCode.GERMANY;
				specialType = GTINCountryCode.MAGAZIN7J;
		 		break;
		 	case 440:
				countryCode = GTINCountryCode.GERMANY;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 471:
				countryCode = GTINCountryCode.TAIWAN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 474:
				countryCode = GTINCountryCode.ESTLAND;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 475:
				countryCode = GTINCountryCode.LETTLAND;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 476:
				countryCode = GTINCountryCode.ASERBAIDSCHAN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 477:
				countryCode = GTINCountryCode.LITAUEN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 478:
				countryCode = GTINCountryCode.USBEKISTAN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 479:
				countryCode = GTINCountryCode.SRILANKA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 480:
				countryCode = GTINCountryCode.PHILIPPINES;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 481:
				countryCode = GTINCountryCode.BELARUS;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	case 482:
				countryCode = GTINCountryCode.UKRAIN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	case 484:
				countryCode = GTINCountryCode.MOLDWIEN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	case 485:
				countryCode = GTINCountryCode.ARMENIEN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 486:
				countryCode = GTINCountryCode.GEORGIEN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 487:
				countryCode = GTINCountryCode.KASACHSTAN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 489:
				countryCode = GTINCountryCode.HONKONG;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 520:
				countryCode = GTINCountryCode.GREECE;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	case 528:
				countryCode = GTINCountryCode.LIBANON;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 529:
				countryCode = GTINCountryCode.CYPRUS;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 531:
				countryCode = GTINCountryCode.MACEDONIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 532:
				countryCode = GTINCountryCode.MALTE;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 539:
				countryCode = GTINCountryCode.IRELAND;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	case 560:
				countryCode = GTINCountryCode.PORTUGAL;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 569:
				countryCode = GTINCountryCode.ICELAND;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 590:
				countryCode = GTINCountryCode.POLAND;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 594:
				countryCode = GTINCountryCode.RUMANIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	case 599:
				countryCode = GTINCountryCode.HUNGARIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 608:
				countryCode = GTINCountryCode.BAHREIN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 611:
				countryCode = GTINCountryCode.MAROCCA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 613:
				countryCode = GTINCountryCode.ALGERIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 616:
				countryCode = GTINCountryCode.KENIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	case 619:
				countryCode = GTINCountryCode.TUNESIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 621:
				countryCode = GTINCountryCode.SYRIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 622:
				countryCode = GTINCountryCode.EGYPT;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 624:
				countryCode = GTINCountryCode.LYBIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 625:
				countryCode = GTINCountryCode.JORANIA;
				specialType = GTINCountryCode.SPECIALNONE;
				break;
		 	case 626:
				countryCode = GTINCountryCode.IRAN;
				specialType = GTINCountryCode.SPECIALNONE;
				break;
		 	case 627:
				countryCode = GTINCountryCode.KUWAIT;
				specialType = GTINCountryCode.SPECIALNONE;	
		 		break;
		 	case 628:
				countryCode = GTINCountryCode.SAUDIARABIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 629:
				countryCode = GTINCountryCode.VAE;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	case 729:
				countryCode = GTINCountryCode.ISRAEL;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;			 		
		 	case 740:
				countryCode = GTINCountryCode.GUATEMALA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	case 741:
				countryCode = GTINCountryCode.ELSALVADOR;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 742:
				countryCode = GTINCountryCode.HODNURAS;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 743:
				countryCode = GTINCountryCode.NICARAGUA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 744:
				countryCode = GTINCountryCode.COSTARICA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 745:
				countryCode = GTINCountryCode.PANAMA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;		
		 	case 746:
				countryCode = GTINCountryCode.DOMINICANREPUBLIC;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 750:
				countryCode = GTINCountryCode.MEXICO;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 759:
				countryCode = GTINCountryCode.VENZUELA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 770:
				countryCode = GTINCountryCode.COLUMBIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 773:
				countryCode = GTINCountryCode.URUGUAY;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 775:
				countryCode = GTINCountryCode.PERU;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 777:
				countryCode = GTINCountryCode.BOLIVIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 779:
				countryCode = GTINCountryCode.ARGENTINA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 780:
				countryCode = GTINCountryCode.CHILE;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 784:
				countryCode = GTINCountryCode.PARAGUAY;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 786:
				countryCode = GTINCountryCode.ECUADOR;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 789:
				countryCode = GTINCountryCode.BRASIL;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 850:
				countryCode = GTINCountryCode.CUBA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 858:
				countryCode = GTINCountryCode.SLOVAKIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;		
		 	case 859:
				countryCode = GTINCountryCode.CZECH;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 860:
				countryCode = GTINCountryCode.SERBIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 867:
				countryCode = GTINCountryCode.NORTHCOREA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 869:
				countryCode = GTINCountryCode.TURKEY;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 880:
				countryCode = GTINCountryCode.SOUTHCOREA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 885:
				countryCode = GTINCountryCode.THAILAND;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 888:
				countryCode = GTINCountryCode.SINGAPUR;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 890:
				countryCode = GTINCountryCode.INDIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 893:
				countryCode = GTINCountryCode.VIETNAM;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 899:
				countryCode = GTINCountryCode.INDONESIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 950:
				countryCode = GTINCountryCode.EANHQ;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 955:
				countryCode = GTINCountryCode.MALAYSIA;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 958:
				countryCode = GTINCountryCode.MACAO;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 977:
				countryCode = GTINCountryCode.PERIODICALS;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 978:
				countryCode = GTINCountryCode.ISBN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 979:
				countryCode = GTINCountryCode.ISBN;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;
		 	case 980:
				countryCode = GTINCountryCode.REFUNDRECEIPTS;
				specialType = GTINCountryCode.SPECIALNONE;
		 		break;	
		 	default:
		 		break;
		 }
		 return;
	 }
}
