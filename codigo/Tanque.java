public class Tanque {
    // Atributos da classe
    // Capacidade máxima do tanque em litros.
    private double capacidadeMaxima;

    // Quantidade atual de combustível no tanque em litros.
    private double capacidadeAtual;

    private final TipoCombustivel tipoCombustivel;



    /**
     * Construtor da classe Tanque.
     *
     * @param capacidadeAtual Quantidade inicial de combustível no tanque.
     * @param capacidadeMaxima Capacidade máxima do tanque.
     */
    Tanque(double capacidadeAtual, double capacidadeMaxima, String tipo){
        this.capacidadeAtual = capacidadeAtual;
        this.capacidadeMaxima = capacidadeMaxima;
        switch (tipo.toUpperCase()) {
            case "ALCOOL":
                tipoCombustivel = TipoCombustivel.ALCOOL;
                break;
            case "GASOLINA":
                tipoCombustivel = TipoCombustivel.GASOLINA;
                break;
            case "DIESEL":
                tipoCombustivel = TipoCombustivel.DIESEL;
                break;
            default:
                throw new IllegalArgumentException("Tipo de combustível desconhecido: " + tipo);
        }
}


    /**
     * Abastece o tanque com uma certa quantidade de litros.
     * Se o abastecimento exceder a capacidade máxima, o tanque é preenchido até sua capacidade máxima.
     *
     * @param litros Quantidade de litros para abastecer.
     * @return Retorna a capacidade atual do tanque após o abastecimento.
     */
    public double abastecer(double litros){
        capacidadeAtual += litros;
        if(capacidadeAtual > capacidadeMaxima){
            capacidadeAtual = capacidadeMaxima;
        }
        return capacidadeAtual;
    }

    /**
     * Calcula a autonomia máxima do veículo com base na capacidade máxima do tanque e no consumo médio.
     *
     * @return Retorna a autonomia máxima em quilômetros.
     */
    public double autonomiaMaxima(){
        return capacidadeMaxima * tipoCombustivel.getConsumoMedio();
    }

    /**
     * Calcula a autonomia atual do veículo com base na capacidade atual do tanque e no consumo médio.
     *
     * @return Retorna a autonomia atual em quilômetros.
     */
    public double autonomiaAtual(){
        return capacidadeAtual * tipoCombustivel.getConsumoMedio();
    }

    public double getCONSUMO(){
        return tipoCombustivel.getConsumoMedio();
    }

    /***
     * @return Retorna o preço do combustível.
     */
    public double getPreco(){
        return tipoCombustivel.getPreco();
    }

    public double getCapacidadeMaxima(){
    return capacidadeMaxima;
    }
}
