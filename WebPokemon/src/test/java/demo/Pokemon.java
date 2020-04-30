package demo;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.sql.SQLOutput;


public class Pokemon {

    @Test
    public void getPokemon(){

        public static String getPikachu(){

        }
        Response responsePikachu = RestAssured
                .given()
                .baseUri("http://pokeapi.co")
                .basePath("/api")
                .get("v2/pokemon/pikachu");

        String pokemonPikachuName = responsePikachu.path("name");
        String pokemonPikachuNumber = responsePikachu.path("id").toString();
        System.out.println(pokemonPikachuName);
        System.out.println(pokemonPikachuNumber);

        Response responseBulbasaur = RestAssured
                .given()
                .baseUri("http://pokeapi.co")
                .basePath("/api")
                .get("v2/pokemon/bulbasaur");

        String pokemonBulbasaurName = responseBulbasaur.path("name");
        String pokemonBulbasaurNumber = responseBulbasaur.path("id").toString();
        System.out.println(pokemonBulbasaurName);
        System.out.println(pokemonBulbasaurNumber);

        Response responseCharizard = RestAssured
                .given()
                .baseUri("http://pokeapi.co")
                .basePath("/api")
                .get("v2/pokemon/charizard");

        String pokemonCharizardName = responseCharizard.path("name");
        String pokemonCharizardNumber = responseCharizard.path("id").toString();
        System.out.println(pokemonCharizardName);
        System.out.println(pokemonCharizardNumber);

        Response responseMewtwo = RestAssured
                .given()
                .baseUri("http://pokeapi.co")
                .basePath("/api")
                .get("v2/pokemon/mewtwo");

        String pokemonMewtwoName = responseMewtwo.path("name");
        String pokemonMewtwoNumber = responseMewtwo.path("id").toString();
        System.out.println(pokemonMewtwoName);
        System.out.println(pokemonMewtwoNumber);
    }
}
