/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class temperatura {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturaSemestral = new ArrayList<>();

        double soma = 0.0;
        for( int i = 1; i<=6; i++){
            System.out.print("Qual a temperatura do mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturaSemestral.add(temp);
            soma += temp;
        }

        double mediaTemperaturaSemestral = soma/temperaturaSemestral.size();
        System.out.println("Temperatura Semestral: " + temperaturaSemestral);
        System.out.println("Média temperatura Semestral: " + mediaTemperaturaSemestral + "ºC");
        System.out.println("===============================================");

        for(Double temp : temperaturaSemestral){
            if(temp > mediaTemperaturaSemestral){
                int index = temperaturaSemestral.indexOf(temp);
                switch (index){
                    case 0:
                        System.out.println((index + 1) + " Janeiro: " + temp + "ºC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}