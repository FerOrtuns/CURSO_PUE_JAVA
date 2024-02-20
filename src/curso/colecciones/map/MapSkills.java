package curso.colecciones.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSkills {

    private static Map<String, List<String>> peopleSkillsMap = new HashMap<>();

    public static void main(String[] args) {

        List<String> luciaSkills = new ArrayList<>();
        luciaSkills.add("Java");
        luciaSkills.add("PHP");
        luciaSkills.add("Python");

        List<String> fernandoSkills = new ArrayList<>();
        fernandoSkills.add("C#");
        fernandoSkills.add("JavaScript");
        fernandoSkills.add("Kotlin");
        fernandoSkills.add("Scala");
        fernandoSkills.add("Java");

        peopleSkillsMap.put("Lucia", luciaSkills);
        peopleSkillsMap.put("Fernando", fernandoSkills);

        System.out.println(peopleSkillsMap);

        var successfulCandidates = filterCandidates("Java");

        System.out.println(successfulCandidates);

    }

    public static List<String> filterCandidates(String skill) {

        List<String> successfulCandidates = new ArrayList<>();

        for (var currentPerson : peopleSkillsMap.keySet()) {

            System.out.println(currentPerson);
            List<String> PersonSkills = peopleSkillsMap.get(currentPerson);
            System.out.println(PersonSkills);

            if (PersonSkills.contains(skill)) {
                successfulCandidates.add(currentPerson);
            }

        }

        return successfulCandidates;

    }

}

/*
0 - Crear una lista auxiliar para guardar las currentPersonas
1 - Tenemos que recorrer el map de currentPersonas y skills y
2 - Para cada currentPersona consultar sus skills
3 - Si los skills de la currentPersona contienen el skill pasado como parametro
4 - Incluye a la currentPersona en la lista que se devuelve
5 - Devuelve en el return la lista generada en el bucle
 */