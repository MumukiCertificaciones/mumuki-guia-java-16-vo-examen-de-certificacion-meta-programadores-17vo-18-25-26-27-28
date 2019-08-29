class Producto {
  double precio;
  
  Producto(double precio) {
    this.precio = precio;
  }
  
  double getPrecio() {
    return precio;
  }
  
  boolean esBarato() {
    //Completar acá
  }
}

class Tienda {
  List<Producto> productos;
  
  Tienda(List<Producto> productos) {
    this.productos = productos;
  }
  
  List<Producto> getProductos() {
    return productos;
  }
  
  void setProductos(List<Producto> productos) {
    this.productos = productos;
  }
  
  long cantidadDeProductosBaratos() {
    //Completar acá
  }
}