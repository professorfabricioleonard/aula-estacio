package br.com.developeracademy.lista;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/exercicio")
public class ExercicioResource {

    @POST
    public Response calcularMedia(List<Double> numeros){

        double soma = 0;
        for(Double n: numeros){
            soma = soma + n;
        }
        double media = soma / numeros.size();

        String mensagem = "Média: " + media;

        return Response.ok().entity(mensagem).build();
    }
}
