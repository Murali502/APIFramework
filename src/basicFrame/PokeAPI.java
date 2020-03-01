package basicFrame;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PokeAPI {

	@Test
	public void JiraAPIUpdate()
	{
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://pokeapi.co/api/v2";
		given().
		when().
		get("/pokemon/ditto/").
		then().assertThat().statusCode(200);
	}

}
