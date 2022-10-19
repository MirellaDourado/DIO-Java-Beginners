class RodarAplicacao {
  public static void main(String[] args) {
    Carro carro = new Carro();

    carro.setCor("vermelho");
    carro.setModelo("BMW Série 3");
    carro.setCapacidadeTanque(40d);

    System.out.println(carro.getModelo());
    System.out.println(carro.getColor());
    System.out.println(carro.getCapacidadeTanque());
    System.out.println(carro.totalValorTanque(7.92));

    Carro carro1 = new Carro("black", "HB20", 50d);

    System.out.println(carro1.getModelo());
    System.out.println(carro1.getColor());  
    System.out.println(carro1.getCapacidadeTanque());
    System.out.println(carro1.totalValorTanque( 7.92));

  }
}
