package curso.colecciones.map.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSkills_v1 {

    private static Map<String, List<String>> peopleSkillsMap;

    public static void main(String[] args) {

        //declaro objeto de caracts de Lucia
        List<String> luciaSkills = new ArrayList<>();

        luciaSkills.add("Java");
        luciaSkills.add("Php");
        luciaSkills.add("Python");

        //declaro objeto de caracts de Fernando
        List<String> fernandoSkills = new ArrayList<>();
        fernandoSkills.add("C#");
        fernandoSkills.add("JavaScript");
        fernandoSkills.add("Kotlin");
        fernandoSkills.add("Scala");
        fernandoSkills.add("Java");

        peopleSkillsMap = new HashMap<>();

        //Añado a la lista los objetos
        peopleSkillsMap.put("Lucia", luciaSkills);
        peopleSkillsMap.put("Fernando", fernandoSkills);

        System.out.println(peopleSkillsMap);

        var people = filterCandidates("Kotlin");

        System.out.println(people);


    }

    public static List<String> filterCandidates(String skill) {
        /*
        0-crear una lista auxiliar para guardar las personas
        1-tenemos que recorrer el map de personas y skills y
        2-para cada persona consultar sus skills
        3-Si los skills de la persona contiene el skill pasado com parametro
        4-incluye a la persona en la lista que se devuelve
        5-devuelve en el return la lista generada en el bucle
        */

        // Paso 0
        List<String> successfulCandidates = new ArrayList<>();

        // Paso 1
        for (var currentPerson : peopleSkillsMap.keySet()) {
            //System.out.println(currentPerson);
            //Paso 2
            List<String> personSkills = peopleSkillsMap.get(currentPerson);
            //System.out.println(personSkills);
            //Paso 3
            if (personSkills.contains(skill))
                //Paso 4
                successfulCandidates.add(currentPerson);
        }
        //Paso 5
        return successfulCandidates;
    }

}
