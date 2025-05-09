package labels_em_loops;

public class LoopsB {
    public static void main(String[] args) {

        // Em Java, labels (rótulos) são identificadores que você pode usar para controlar melhor o fluxo
        // de execução em loops (for, while, do-while) e blocos aninhados, especialmente quando você quer
        // usar break ou continue em níveis mais profundos do loop


        // Ao nomear um loop(laço de repetição) com um label, você está dizendo ao break ou continue:

        // Quando eu rodar você(rodar o break), quero que atue neste loop específico — 
        // não apenas no mais próximo. Com isso ele vai pegar o nome do laço(pela label) e parar aquele laço


        // Vamos trabalhar com dois FOR()
        // Um interno e outro externo - e vamos nomear(colocar a label) no FOR() externo

        externo:
        for(int i = 0; i < 3; i++) {
            
            for(int j = 0; j < 3; j++) {
                
                // Vamos verificar aqui quando o 'i' for igual a 1 e o 'j' for igual a 1
                // Vamos querer parar o loop externo com break - para isso vamos chamar o loop externo pelo
                // nome(pela label)
                if(i == 1 && j == 1) {
                    break externo;
                }

                System.out.println("i " + i + ", j " + j);
            }
        }
    }
}
