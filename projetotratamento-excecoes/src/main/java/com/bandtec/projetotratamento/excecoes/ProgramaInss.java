package com.bandtec.projetotratamento.excecoes;

public class ProgramaInss {
        public static void main(String[] args) {
             CalculadoraInss calculadoraInss = new CalculadoraInss();
             
             Double inss1 = calculadoraInss.calcularInss(3500.0);
             System.out.println("INSS 1: "+inss1);
             
             /* 
             O código abaixo dá erro de excecução
             O if com o NullPointerExeception exibe a mensagem de erro
             Tratamento da execeção de quando o salario foi nulo
             */
             Double inssLoko = calculadoraInss.calcularInss(null);
             System.out.println("INSS Loko: "+inssLoko);
             
                     
             /* 
             Caiu no último else
             Fazer tratamento de execeção    
             */
             Double inssLoko2 = calculadoraInss.calcularInss(-500.0);
             System.out.println("INSS Loko: "+inssLoko2);
    
             // Sendo PROATIVO no tratamento das execeções
             
            try { // bloco try = codigo que pode lançar execeção
               Double inssLoko3 = calculadoraInss.calcularInss(-700.0);
               System.out.println("INSS Loko: "+inssLoko3);
               
            } catch (NullPointerException npe){
               // bloco que será executado em caso de NullPointerExepction
               System.out.println("Você informou o salário? "+npe.getMessage());
               
            } catch (IllegalArgumentException iae) {
               // bloco que será executado em caso de IllegalArgumentExepction
               System.out.println("O salário informado está certo? "+iae.getMessage());
            }
            
            
            try { // bloco try = codigo que pode lançar execeção
               Double inssLoko3 = calculadoraInss.calcularInss(-700.0);
               System.out.println("INSS Loko: "+inssLoko3);
               
            } catch (Exception ex){
                System.out.println("Deu ruim!" +ex.getMessage());
            }
           
            try {
            calculadoraInss.cadastrarCalculo("Zé", 4000.0);
            } catch (Exception ex){
                System.out.println("Erro ao cadastrar o cálculo "+ex.getMessage());
            }
        }
}
