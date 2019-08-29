Persona personaLectora;
Persona personaDeRedesSociales;
Libro libro;
RedSocial redSocial;

@Before
public void before() {
  libro = new Libro(268);
  redSocial = new RedSocial(1000);
  personaLectora = new Persona(libro);
  personaDeRedesSociales = new Persona(redSocial);
}

@Test
public void si_una_persona_pasa_el_rato_leyendo_disminuye_la_cantidad_de_paginas_pendientes() {
  personaLectora.pasarElRato(60);
  Assert.assertEquals(208, libro.getCantidadDePaginasPendientes());
}

@Test
public void si_una_persona_pasa_el_rato_en_una_red_social_aumenta_en_uno_la_cantidad_de_usuarios_activos() {
  personaDeRedesSociales.pasarElRato(60);
  Assert.assertEquals(1001, redSocial.getCantidadDeUsuariosActivos());
}