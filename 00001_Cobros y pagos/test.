Producto producto;
Comprador comprador;
Vendedor vendedor;

@Before
public void before() {
  producto = new Producto(87);
  comprador = new Comprador(90);
  vendedor = new Vendedor(100);
}


@Test
public void cuando_un_comprador_compra_baja_su_dinero_tanto_como_cueste_el_producto() {
  comprador.comprar(producto, vendedor);
  Assert.assertEquals(3, comprador.getDinero(), 0);
}

@Test
public void cuando_un_vendedor_cobra_aumentan_sus_ganancias_tanto_como_cobre() {
  vendedor.cobrar(30);
  Assert.assertEquals(130, vendedor.getGanancias(), 0);
}

@Test
public void cuando_un_comprador_compra_aumentan_las_ganancias_del_vendedor_tanto_como_cueste_el_producto() {
  comprador.comprar(producto, vendedor);
  Assert.assertEquals(187, vendedor.getGanancias(), 0);
}