package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"MARCIA", "JULIA", "LUIZ", "PAULO", "NATI"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }
    
    
    static void imprimirSelecionados(){
        String [] candidatos = {"MARCIA", "JULIA"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice< candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice +1) + " é " + candidatos [indice]);
        }

    }
    
    static void entrandoEmContato(String candidato){
        int tentativaRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativaRealizada++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }while(continuarTentando && tentativaRealizada <3);
        if(atendeu){
            System.out.println(" Conseguimos contato com " + candidato + " na " + tentativaRealizada + " tentativa ");
        }else{
            System.out.println(" Não conseguimos contato com " + candidato + " o número máximo de tentativas " + tentativaRealizada + " realizada ");

        }


    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"MARCIA", "JULIA", "LUIZ", "PAULO", "NATI"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados< 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos [candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println(" O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase>=salarioPretendido){
                System.out.println(" O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;

            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}