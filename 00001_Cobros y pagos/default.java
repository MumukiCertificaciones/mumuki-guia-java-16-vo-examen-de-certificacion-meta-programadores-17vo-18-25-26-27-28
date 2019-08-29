class Comprador {
  double dinero;
  
  Comprador(double dinero) {
    this.dinero = dinero;
  }
  
  double getDinero() {
    return this.dinero;
  }
  
  void setDinero(double dinero) {
    this.dinero = dinero;
  }
  
  void comprar(Producto producto, Vendedor vendedor) {
    //Completa este método
  }
}

class Vendedor {
  double ganancias;
  
  Vendedor(double ganancias) {
    this.ganancias = ganancias;
  }
  
  double getGanancias() {
    return this.ganancias;
  }
  
  void setGanancias(double ganancias) {
    this.ganancias = ganancias;
  }
  
  void cobrar(double monto) {
    //Completa este método
  } 
}

class Producto {
  double precio;
  
  Producto(double precio) {
    this.precio = precio;
  }
  
  double getPrecio() {
    return precio;
  }
}