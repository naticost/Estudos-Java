import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class Exercicio {
    public static void main (String[] args){
        System.out.println("Crie um conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
         coresArcoIris.add("violeta");
         coresArcoIris.add("anil");
         coresArcoIris.add("azul");
         coresArcoIris.add("verde");
         coresArcoIris.add("amarelo");
         coresArcoIris.add("laranja");
         coresArcoIris.add("vermelho");
         System.out.println(coresArcoIris);

         System.out.println("EXIBA TODAS AS CORES DO ARCO-ÍRIS");
         for(String cor : coresArcoIris){
             System.out.println(cor);
         }
         System.out.println("A QUANTIDADE DE CORES QUE O ARCO-ÍRIS TEM: " + coresArcoIris.size());

         System.out.println("EXIBA AS CORES EM ORDEM ALFABÉTICA: ");
         Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
         System.out.println(coresArcoIris2);

         System.out.println("EXIBA AS CORES NA ORDEM INVERSA QUE FOI INFORMADA");
         Set<String> coresArcoIris3 = new LinkedHashSet<>(
                 Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
         System.out.println(coresArcoIris3);
         List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
         Collections.reverse(coresArcoIrisList);
         System.out.println(coresArcoIrisList);

         System.out.println("EXIBA TODAS AS CORES QUE COMEÇAM COM A LETRA V: ");
         for(String cor : coresArcoIris){
             if (cor.startsWith("v" )) System.out.println(cor);
         }

         System.out.println("REMOVA TODAS AS CORES QUE NÃO COMEÇAM COM A LETRA V: ");
         Iterator<String> iterator2 = coresArcoIris.iterator();
         while(iterator2.hasNext()){
/* O método hasNext() verifica se ainda há elementos na coleção para serem percorridos.
         Se houver, o loop continua.*/
             if(!iterator2.next().startsWith("v")) iterator2.remove();
         }
         System.out.println("Limpe conjunto: ");
         coresArcoIris.clear();

         System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());

    }
}