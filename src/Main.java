public class Main {

    public static void main(String args[]) {
        Lampada lampada = new Lampada();

        lampada.acenderLampada();
        System.out.println(lampada.retornaEstadoDaLampada());

        lampada.apagarLampada();
        System.out.println(lampada.retornaEstadoDaLampada());
    }
}

