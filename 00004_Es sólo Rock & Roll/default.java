class Banda {
  List<Musico> musicos;
  
  Banda(List<Musico> musicos){
    this.musicos = musicos;
  }
}

interface Musico {
  void tocar();
}

class Guitarrista implements Musico {
  int cuerdas;
  
  Guitarrista(int cuerdas) { 
    this.cuerdas = cuerdas;
  }
  
  int getCuerdas() {
    return this.cuerdas;
  }
}

class Baterista implements Musico {
  int indiceDeCoordinacion;
  
  Baterista(int indiceDeCoordinacion) { 
    this.indiceDeCoordinacion = indiceDeCoordinacion;
  }
  
  int getIndiceDeCoordinacion() {
    return this.indiceDeCoordinacion;
  }
}

class Triangulista implements Musico {
  
}
