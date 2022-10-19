
public class Carro {
  String cor;
  String modelo;
  /**
   * Valor em litros
   */
  double tanque;

  Carro() {
    
  }
  
  Carro(String cor, String modelo, double tanque) {
    this.cor = cor;
    this.modelo = modelo;
    this.tanque = tanque;
  };
  
  void setCor(String cor) {
    this.cor = cor;
  };

  String getColor() {
    return cor;
  };

  void setModelo(String modelo) {
    this.modelo = modelo;
  };

  String getModelo() {
    return modelo;
  };

  void setCapacidadeTanque(double capacidadeTanque) {
    this.tanque = capacidadeTanque;
  }

  double getCapacidadeTanque() {
    return tanque;
  };

  double totalValorTanque(double valorCombustivel) {
    return tanque * valorCombustivel;
  };
}
