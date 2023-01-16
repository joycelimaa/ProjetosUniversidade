package Projeto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.Level;
import javax.crypto.Mac;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Mjson {
    public static void criarArquivo(Semana semana, String nome) { // cria o arquivo, passando um Json no primeiro
                                                                       // parametro, e no segundo parametro Ã© passado o
                                                                       // titulo do arquivo "nome ou id"

        FileWriter writeFile = null;
        String tituloArquivo = nome + ".json";
        JSONObject treinos = new JSONObject();

        treinos.put("segunda", semana.getSegunda());
        treinos.put("terca", semana.getTerca());
        treinos.put("quarta", semana.getQuarta());
        treinos.put("quinta", semana.getQuinta());
        treinos.put("sexta", semana.getSexta());
        treinos.put("sabado", semana.getSabado());
        treinos.put("domingo", semana.getDomingo());

        try {
            writeFile = new FileWriter(tituloArquivo);
            writeFile.write(treinos.toJSONString());
            writeFile.close();
        } catch (IOException ex) {
            Logger.getLogger(Mac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void lerArquivo(String nome) { // atualmente le o arquivo e imprime a tabela, a partir do "nome id do
                                                 // arquivo"
        String tituloArquivo = nome + ".json";
        JSONObject Json;
        JSONParser parser = new JSONParser();

        Semana semanas = new Semana();

        try {
            Json = (JSONObject) parser.parse(new FileReader(tituloArquivo));

            semanas.setSegunda((String) Json.get("segunda"));
            semanas.setTerca((String)   Json.get("terca"));
            semanas.setQuarta((String)  Json.get("quarta"));
            semanas.setQuinta((String)  Json.get("quinta"));
            semanas.setSexta((String)   Json.get("sexta"));
            semanas.setSabado((String)  Json.get("sabado"));
            semanas.setDomingo((String) Json.get("domingo"));

            System.out.println("Segunda");
            System.out.println(semanas.getSegunda());
            System.out.println("");
            System.out.println("Terça");
            System.out.println(semanas.getTerca());
            System.out.println("");
            System.out.println("Quarta");
            System.out.println(semanas.getQuarta());
            System.out.println("");
            System.out.println("Quinta");
            System.out.println(semanas.getQuinta());
            System.out.println("");
            System.out.println("Sexta");
            System.out.println(semanas.getSexta());
            System.out.println("");
            System.out.println("Sábado");
            System.out.println(semanas.getSabado());
            System.out.println("");
            System.out.println("Domingo");
            System.out.println(semanas.getDomingo());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
