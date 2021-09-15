import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho do primeiro array: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        for(int i=0; i<vetor.length; ++i) {
            System.out.print("Entre com o " + (i+1) + "º valor array: ");
            vetor[i] = sc.nextInt(); 
        }

        System.out.print("\nEntre com o tamanho do segundo array: ");
        int tamanho2 = sc.nextInt();

        int[] vetor2 = new int[tamanho2];

        for(int i=0; i<vetor2.length; ++i) {
            System.out.print("Entre com o " + (i+1) + "º valor array: ");
            vetor2[i] = sc.nextInt(); 
        }

        System.out.print("\nEntre com o número a ser encontrado no primeiro array: ");
        int achar = sc.nextInt();
        
        int resultado[] = VetorUtil.Filtrar(vetor);
        int resultado2[] = VetorUtil.Intersecção(vetor, vetor2);

        System.out.println("\n------- número 0 do retirado do primeiro array -------");
        for(int i=0; i<resultado.length; ++i) {
            if(resultado[i] > 0) {
                System.out.println(resultado[i]); 
            }
        }
        System.out.println("------------------------------------------------------\n");

        System.out.println("------- localização do número " + achar + " no primeiro array -------");
        VetorUtil.Encontrar(vetor, achar);
        System.out.println("---------------------------------------------------------\n");

        System.out.println("------- Intersecção dos dois arrays -------");
        for(int i=0; i<resultado2.length; ++i) {
            if(resultado2[i] > 0) {
                System.out.println(resultado2[i]);
            }
        }
        System.out.println("-------------------------------------------\n");

        sc.close();
    }
}

class VetorUtil {
    public static int[] Filtrar(int auxiliar[]) {
        for(int i=0; i<auxiliar.length; ++i) {
            if(auxiliar[i] == 0) {
                auxiliar[i] = -1;
            }
        }
        return auxiliar;
    }

    public static void Encontrar(int auxiliar2[], int num) {
        for(int i=0; i<auxiliar2.length; ++i) {
            if(auxiliar2[i] == num) {
                System.out.println(i);
            }
        }
    }

    public static int[] Intersecção(int array1[], int array2[]) {
        int[] array3 = new int[array1.length];

        for(int i=0; i<array1.length; ++i) {
            for(int j=0; j<array2.length; ++j) {
                if(array1[i] == array2[j]) {
                    array3[i] = array1[i];
                }
            }
        }
        return array3;
    }
}
