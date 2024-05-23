public class Condicoes {

    int parametro1;
    int parametro2;
    int resultado;
    
   void validacao (int parametro1, int parametro2){
    this.parametro1 = parametro1;
    this.parametro2 = parametro2;

        if (parametro1 < parametro2){
        this.resultado = (parametro2 - parametro1) + 1;
        } else {
        this.resultado = 0;
        System.out.println("O parâmetro 1 tem que ser menor que o parâmetro 2.");
        }
    }
}



