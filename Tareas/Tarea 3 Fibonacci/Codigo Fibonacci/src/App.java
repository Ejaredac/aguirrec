public class App {
    public static void main(String[] args){
        //Esta es la tarea de Eduardo Jared Aguirre Cardenas 19100140
        int _intValor1 = 0;
        int _intValor2 = 1;
        int _intValor3 = 0;
        int i=0;
        int _intNumControl = 19100140;
        while (_intValor3 < 89) {
            _intValor3 = _intValor1 + _intValor2;
            i++;
            System.out.println("Vez " + i +"\nSuma de :\n Valor 1: " + _intValor1 + "\n Valor 2: " + _intValor2 + "\n Igual a: "  + _intValor3);

            _intValor1 = _intValor2;
            _intValor2 = _intValor3;
        }
        System.out.println("Se termino el programa\nMuchas Gracias por Eduardo Jared Aguirre c[ardenas 19100140");
    }
}
