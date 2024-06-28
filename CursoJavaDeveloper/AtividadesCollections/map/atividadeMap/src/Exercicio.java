import java.awt.*;
import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class Exercicio {
    public static void main(String[] args){
        System.out.println("Crie um dicionario que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacaoEstado = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(populacaoEstado);

        System.out.println("SUBSTITUA A POPULAÇÃO DO ESTADO RN POR : 3.534.165");
        populacaoEstado.put("RN", 3534165);
        System.out.println(populacaoEstado);

        System.out.println("CONFIRA SE O ESTADO DE PARAÍBA (PB) ESTÁ NO DICIONÁRIO, CASO NÃO, ADICIONE " +
                "PB - 4.039.277:  ");

        populacaoEstado.put("PB", 4039277);
        System.out.println(populacaoEstado);

        System.out.println("EXIBA A POPULAÇÃO DO ESTADO PE: " + populacaoEstado.get("PE"));

        System.out.println("EXIBA TODOS OS ESTADOS E SUAS POPULAÇÕES NA ORDEM EM QUE FORAM INFORMADOS: ");
        Map<String, Integer> populacaoEstadoN2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};

        System.out.println(populacaoEstadoN2);

        System.out.println("EXIBA TODOS OS ESTADOS E SUAS POPULAÇÃO NA ORDEM ALFABÉTICA: ");
        Map<String, Integer> populacaoEstadoN3 = new TreeMap<>(populacaoEstado);
        System.out.println(populacaoEstadoN3);

        Collection<Integer> populacao = populacaoEstado.values();
        String estadoMAIOR = "";
        String estadoMENOR = "";

        for(Map.Entry<String, Integer> entry : populacaoEstado.entrySet()){
            if(entry.getValue().equals(Collections.max(populacao))) estadoMAIOR = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMENOR = entry.getKey();

        }

        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMENOR, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMAIOR, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacaoEstado.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("EXIBA A SOMA DA POPULAÇÃO DESSES ESTADOS: " + soma);

        System.out.println("EXIBA A MÉDIA DA POPULAÇÃO DESTE DICIONÁRIO DE ESTADOS: " + (soma/populacaoEstado.size()));
        System.out.println("REMOVA OS ESTADOS COM A POPULAÇÃO MENOR QUE 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstado.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next()<= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstado);

        System.out.println("APAGUE O DICIONARIO DE ESTADOS: ");
        populacaoEstado.clear();
        System.out.println(populacaoEstado);

        System.out.println("Confira se a lista está vazia: " + populacaoEstado.isEmpty());
    }

}
