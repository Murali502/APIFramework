/*package basicFrame;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;
public class Basics1 {
	
	@Test
	public void googleMaps()
	{
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		given().
		param("location","-38.383494,33.427362").
		param("radius","500").
		param("Key","qaclick123").
        when().
        get("+add/json").
        then().assertThat().statusCode(200);
      //  then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
        //.and().body("results[0].geometry.location.lat",equalTo("-38.383494"));
	}

}




import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.equalTo;



public class basics2 {



@Test

public void createPlaceAPI()

{

RestAssured.baseURI="http://216.10.245.166";

given().

queryParam("key","qaclick123").

body("{"+

  "\"location\": {"+

    "\"lat\": -33.8669710,"+

    "\"lng\": 151.1958750"+

  "},"+

  "\"accuracy\": 50,"+

  "\"name\": \"Google Shoes!\","+

  "\"phone_number\": \"(02) 9374 4000\","+

  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+

  "\"types\": [\"shoe_store\"],"+

  "\"website\": \"http://www.google.com.au/\","+

  "\"language\": \"en-AU\""+

"}").

when().

post("/maps/api/place/add/json").

then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().

body("status",equalTo("OK"));

// Create a place =response (place id)

// delete Place = (Request - Place id)

}

}

*/

package basicFrame;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Basics1 {

	@Test
public void getPlaceAPI()
{
		// TODO Auto-generated method stub

		//BaseURL or Host
		RestAssured.baseURI="https://maps.googleapis.com";
		
		given().
		       param("location","-33.8670522,151.1957362").
		       param("radius","500").
		       param("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
		       when().
		       get("/maps/api/place/nearbysearch/json").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		       body("results[0].name",equalTo("Sydney")).and().
		       body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
		       header("Server","pablo");
		       
		       
		       /*header("dfd","fsdfds").
		       cookie("dsfs","csder").
		       body()*/
		//Status code of the response
		//Content type 
		//Body
		//Header responses
	
}

}

