public class Lampada {
    // Propriedades:
    private boolean estaAcessa = false;

    // Métodos:


    public void acenderLampada() {
        this.estaAcessa = true;
    }

    public void apagarLampada() {
        this.estaAcessa = false;
    }

    /**
     *
     * @return Uma string dizendo o estado da lampada dependendo da propriedade estaAcessa
     */
    public String retornaEstadoDaLampada() {
        if(estaAcessa) {
            return "A lampada está acessa";
        } else {
            return "A lampada NÃO está acessa";
        }
    }
}
