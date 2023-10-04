public class Calculadora {

    private int n1;
    private int n2;

    public Calculadora() {
        // TODO - implement Calculadora.Calculadora
        this.n1 = 0;
        this.n2 = 0;
    }

    /**
     *
     * @param num1
     * @param num2
     */
    public Calculadora(int num1, int num2) {
        // TODO - implement Calculadora.Calculadora
        this.n1 = num1;
        this.n2 = num2;
    }

    public int sumar() {
        // TODO - implement Calculadora.sumar
        return this.n1+this.n2;
    }

    public int multiplicar() {
        // TODO - implement Calculadora.multiplicar
        return this.n1*this.n2;
    }

    /**
     *
     * @param num1
     */
    public void setN1(int num1) {
        this.n1 = num1;
    }

    /**
     *
     * @param num2
     */
    public void setN2(int num2) {
        this.n2 = num2;
    }

}