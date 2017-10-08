package scala

import json2csv.JsonToCsvImpl
import org.scalatest.{FlatSpec, Matchers}
import scala.util.parsing.json.JSON
class TestJsonToCsvImpl extends FlatSpec with Matchers {

  "Json to csv parser" should "parse correctly this json from kmcityapi" in {
      val data = "{\n\"BusStops\": {\n\"fullCount\": 0,\n\"type\": \"FeatureCollection\",\n\"features\":[\n]}\n,\"SensorSites\": {\n\"fullCount\": 2,\n\"type\": \"FeatureCollection\",\n\"features\": [\n{\n\"geometry\":{\"type\": \"Point\",\"coordinates\":[11.2498,43.7751]},\n\"type\": \"Feature\",\n\"properties\": {\n\"name\": \"FI055ZTL00101\",\n\"tipo\": \"sensore\",\n\"typeLabel\": \"Sensore\",\n\"serviceType\": \"TransferServiceAndRenting_SensorSite\",\n\"serviceUri\": \"http://www.disit.org/km4city/resource/FI055ZTL00101\",\n\"distance\": \"0.08973365877281284\",\n\"photoThumbs\": []\n},\n\"id\": 1\n},\n{\n\"geometry\":{\"type\": \"Point\",\"coordinates\":[11.25,43.7747]},\n\"type\": \"Feature\",\n\"properties\": {\n\"name\": \"FI055ZTL01601\",\n\"tipo\": \"sensore\",\n\"typeLabel\": \"Sensore\",\n\"serviceType\": \"TransferServiceAndRenting_SensorSite\",\n\"serviceUri\": \"http://www.disit.org/km4city/resource/FI055ZTL01601\",\n\"distance\": \"0.1296995067534453\",\n\"photoThumbs\": []\n},\n\"id\": 2\n}]}\n, \"Services\":{\n\"fullCount\": 125,\n\"type\": \"FeatureCollection\",\n\"features\": [\n{\n\"geometry\": {\"type\": \"Point\",\"coordinates\":[11.24890041351318,43.77590179443359]},\n\"type\": \"Feature\",\n\"properties\": {\n\"name\": \"Punto noleggio biciclette\",\n\"tipo\": \"Punto_noleggio_bici\",\n\"typeLabel\": \"Punto noleggio bici\",\n\"serviceType\": \"TransferServiceAndRenting_Bike_rental\",\n\"distance\": \"0.0343\",\n\"serviceUri\": \"http://www.disit.org/km4city/resource/bike_rental_1\",\n   \"photoThumbs\": [],\n\"multimedia\": \"\"\n},\n\"id\": 1\n},\n{\n\"geometry\": {\"type\": \"Point\",\"coordinates\":[11.24860000610352,43.77539825439453]},\n\"type\": \"Feature\",\n\"properties\": {\n\"name\": \"tram_tracciato.Linea 1 - Linea 1\",\n\"tipo\": \"Linea_del_Tram\",\n\"typeLabel\": \"Linea del Tram\",\n\"serviceType\": \"TransferServiceAndRenting_Tramline\",\n\"distance\": \"0.0389\",\n\"serviceUri\": \"http://www.disit.org/km4city/resource/c9bf2b4e060a8a40d21fac25b282f41c\",\n   \"photoThumbs\": [],\n\"multimedia\": \"\"\n},\n\"id\": 2\n},\n{\n\"geometry\": {\"type\": \"Point\",\"coordinates\":[11.24849987030029,43.77569961547852]},\n\"type\": \"Feature\",\n\"properties\": {\n\"name\": \"Giardino di piazza della Stazione\",\n\"tipo\": \"Aree_verdi\",\n\"typeLabel\": \"Aree verdi\",\n\"serviceType\": \"Entertainment_Green_areas\",\n\"distance\": \"0.0398\",\n\"serviceUri\": \"http://www.disit.org/km4city/resource/e62bc5f14bd412db00fcdcd6f9506857\",\n   \"photoThumbs\": [],\n\"multimedia\": \"\"\n},\n\"id\": 3\n},\n{\n\"geometry\": {\"type\": \"Point\",\"coordinates\":[11.24899959564209,43.77519989013672]},\n\"type\": \"Feature\",\n\"properties\": {\n\"name\": \"Piazza Stazione\",\n\"tipo\": \"Ufficio_Informazioni_Turistiche\",\n\"typeLabel\": \"Ufficio Informazioni Turistiche\",\n\"serviceType\": \"TourismService_Tourist_information_office\",\n\"distance\": \"0.0435\",\n\"serviceUri\": \"http://www.disit.org/km4city/resource/3fd3f6eb74771ea2d7d9e0ad855c8879\",\n   \"photoThumbs\": [],\n\"multimedia\": \"\"\n},\n\"id\": 4\n},\n{\n\"geometry\": {\"type\": \"Point\",\"coordinates\":[11.24899959564209,43.77519989013672]},\n\"type\": \"Feature\",\n\"properties\": {\n\"name\": \"COMPLESSO_MONUMENTALE_DI_SANTA_MARIA_NOVELLA\",\n\"tipo\": \"Luogo_monumento\",\n\"typeLabel\": \"Luogo monumento\",\n\"serviceType\": \"CulturalActivity_Monument_location\",\n\"distance\": \"0.0453\",\n\"serviceUri\": \"http://www.disit.org/km4city/resource/a421aa403641c0f1f4571047fbb6ab09\",\n   \"photoThumbs\": [],\n\"multimedia\": \"\"\n},\n\"id\": 5\n},\n{\n\"geometry\": {\"type\": \"Point\",\"coordinates\":[11.2495002746582,43.77590179443359]},\n\"type\": \"Feature\",\n\"properties\": {\n\"name\": \"Garage La Stazione Spa\",\n\"tipo\": \"Parcheggio_auto\",\n\"typeLabel\": \"Parcheggio auto\",\n\"serviceType\": \"TransferServiceAndRenting_Car_park\",\n\"distance\": \"0.0482\",\n\"serviceUri\": \"http://www.disit.org/km4city/resource/RT04801702315PO\",\n   \"photoThumbs\": [],\n\"multimedia\": \"\"\n},\n\"id\": 6\n},\n{\n\"geometry\": {\"type\": \"Point\",\"coordinates\":[11.24870014190674,43.77519989013672]},\n\"type\": \"Feature\",\n\"properties\": {\n\"name\": \"Biblioteca Domenicana\",\n\"tipo\": \"Biblioteca\",\n\"typeLabel\": \"Biblioteca\",\n\"serviceType\": \"CulturalActivity_Library\",\n\"distance\": \"0.0507\",\n\"serviceUri\": \"http://www.disit.org/km4city/resource/1f765950114b7d2a25d451d3b73f29e8\",\n   \"photoThumbs\": [],\n\"multimedia\": \"\"\n},\n\"id\": 7\n},\n{\n\"geometry\": {\"type\": \"Point\",\"coordinates\":[11.24890041351318,43.77610015869141]},\n\"type\": \"Feature\",\n\"properties\": {\n\"name\": \"Rastrelliera per biciclette\",\n\"tipo\": \"Rastrelliera_per_biciclette\",\n\"typeLabel\": \"Rastrelliera per biciclette\",\n\"serviceType\": \"TransferServiceAndRenting_Bike_rack\",\n\"distance\": \"0.0526\",\n\"serviceUri\": \"http://www.disit.org/km4city/resource/bike_rack_2798\",\n   \"photoThumbs\": [],\n\"multimedia\": \"\"\n},\n\"id\": 8\n}]}\n}"
      val parser = new JsonToCsvImpl()
      val trasformer = JSON.parseFull(data).get.asInstanceOf[Map[String, _]]
      val result = parser.trasform(trasformer).split("\n")
      val resultsExceptTimestamp = result.takeRight(result.length - 1).reduce((a,b) => a + "\n" + b)
      val expectedResult = "geometry_type ; geometry_coordinates ; name ; tipo ; typeLabel ; serviceType ; serviceUri ; distance\nPoint ; List(11.2498, 43.7751) ; FI055ZTL00101 ; sensore ; Sensore ; TransferServiceAndRenting_SensorSite ; http://www.disit.org/km4city/resource/FI055ZTL00101 ; 0.08973365877281284\nPoint ; List(11.25, 43.7747) ; FI055ZTL01601 ; sensore ; Sensore ; TransferServiceAndRenting_SensorSite ; http://www.disit.org/km4city/resource/FI055ZTL01601 ; 0.1296995067534453\nPoint ; List(11.24890041351318, 43.77590179443359) ; Punto noleggio biciclette ; Punto_noleggio_bici ; Punto noleggio bici ; TransferServiceAndRenting_Bike_rental ; http://www.disit.org/km4city/resource/bike_rental_1 ; 0.0343\nPoint ; List(11.24860000610352, 43.77539825439453) ; tram_tracciato.Linea 1 - Linea 1 ; Linea_del_Tram ; Linea del Tram ; TransferServiceAndRenting_Tramline ; http://www.disit.org/km4city/resource/c9bf2b4e060a8a40d21fac25b282f41c ; 0.0389\nPoint ; List(11.24849987030029, 43.77569961547852) ; Giardino di piazza della Stazione ; Aree_verdi ; Aree verdi ; Entertainment_Green_areas ; http://www.disit.org/km4city/resource/e62bc5f14bd412db00fcdcd6f9506857 ; 0.0398\nPoint ; List(11.24899959564209, 43.77519989013672) ; Piazza Stazione ; Ufficio_Informazioni_Turistiche ; Ufficio Informazioni Turistiche ; TourismService_Tourist_information_office ; http://www.disit.org/km4city/resource/3fd3f6eb74771ea2d7d9e0ad855c8879 ; 0.0435\nPoint ; List(11.24899959564209, 43.77519989013672) ; COMPLESSO_MONUMENTALE_DI_SANTA_MARIA_NOVELLA ; Luogo_monumento ; Luogo monumento ; CulturalActivity_Monument_location ; http://www.disit.org/km4city/resource/a421aa403641c0f1f4571047fbb6ab09 ; 0.0453\nPoint ; List(11.2495002746582, 43.77590179443359) ; Garage La Stazione Spa ; Parcheggio_auto ; Parcheggio auto ; TransferServiceAndRenting_Car_park ; http://www.disit.org/km4city/resource/RT04801702315PO ; 0.0482\nPoint ; List(11.24870014190674, 43.77519989013672) ; Biblioteca Domenicana ; Biblioteca ; Biblioteca ; CulturalActivity_Library ; http://www.disit.org/km4city/resource/1f765950114b7d2a25d451d3b73f29e8 ; 0.0507\nPoint ; List(11.24890041351318, 43.77610015869141) ; Rastrelliera per biciclette ; Rastrelliera_per_biciclette ; Rastrelliera per biciclette ; TransferServiceAndRenting_Bike_rack ; http://www.disit.org/km4city/resource/bike_rack_2798 ; 0.0526"
      resultsExceptTimestamp shouldEqual expectedResult
  }



}