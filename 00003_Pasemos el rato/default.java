class Persona {
  Pasatiempo pasatiempo;
  
  Persona(Pasatiempo pasatiempo) {
    this.pasatiempo = pasatiempo;
  }
}

interface Pasatiempo {
  
}

class Libro implements Pasatiempo {
  int cantidadDePaginasPendientes;
  
  Libro(int cantidadDePaginasPendientes) {
    this.cantidadDePaginasPendientes = cantidadDePaginasPendientes;
  }
  
  int getCantidadDePaginasPendientes() {
    return this.cantidadDePaginasPendientes;
  }
}

class RedSocial implements Pasatiempo {
  int cantidadDeUsuariosActivos;
  
  RedSocial(int cantidadDeUsuariosActivos) {
    this.cantidadDeUsuariosActivos = cantidadDeUsuariosActivos;
  }
  
  int getCantidadDeUsuariosActivos() {
    return this.cantidadDeUsuariosActivos;
  }
}