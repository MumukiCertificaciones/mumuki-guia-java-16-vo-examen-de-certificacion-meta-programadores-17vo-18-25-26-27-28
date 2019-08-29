Guitarrista guitarrista;
Baterista baterista;
Triangulista triangulista;
Banda banda;

@Before
public void before() {
  guitarrista = new Guitarrista(6);
  baterista = new Baterista(100);
  triangulista = new Triangulista();
  
  List<Musico> musicos = new ArrayList<Musico>();
  musicos.add(guitarrista);
  musicos.add(baterista);
  musicos.add(triangulista);
  banda = new Banda(musicos);
}

@Test
public void si_la_banda_toca_se_modifican_sus_musicos() {
  banda.tocar();
  Assert.assertEquals(5, guitarrista.getCuerdas());
  Assert.assertEquals(100 + $indiceDeBateristas, baterista.getIndiceDeCoordinacion());
}

@Test
public void el_guitarrista_pierde_una_cuerda_al_tocar() {
  guitarrista.tocar();
  Assert.assertEquals(5, guitarrista.getCuerdas());
}

@Test
public void el_baterista_aumenta_su_indice_de_coordinacion() {
  baterista.tocar();
  Assert.assertEquals(100 + $indiceDeBateristas, baterista.getIndiceDeCoordinacion());
}
