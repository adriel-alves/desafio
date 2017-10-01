package br.com.desafio;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesafioApplicationTests {
	
	
	@BeforeClass
	  public void setLogin () {

	  //  RestAssured.basic("joao@silva.org", "hunter2");
	  }

	@Test
	public void loginTest() {
		/* given().
	        contentType(JSON).
	        body("{\"email\" : \"joao@silva.org\"," 
	        +"\"password\": \"hunter2\"}").
	        put("/api/login").then().statusCode(201);*/
	}
	
	

}
