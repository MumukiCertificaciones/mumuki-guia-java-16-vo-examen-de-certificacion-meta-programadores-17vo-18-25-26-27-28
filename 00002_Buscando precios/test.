Producto productoBarato;
Producto otroProductoBarato;
Producto productoCaro;
Tienda tienda;

@Before
public void before() {
  productoBarato = new Producto($precioBarato - 5);
  otroProductoBarato = new Producto($precioBarato - 10);
  productoCaro = new Producto($precioBarato + 10);
  ArrayList<Producto> productos = new ArrayList<Producto>();
  productos.add(productoBarato);
  productos.add(otroProductoBarato);
  productos.add(productoCaro);
  tienda = new Tienda(productos);
}

@Test
public void un_producto_barato_responde_true_a_esBarato() {
  Assert.assertTrue(productoBarato.esBarato());
}

@Test
public void un_producto_caro_responde_false_a_esBarato() {
  Assert.assertFalse(productoCaro.esBarato());
}

@Test
public void la_tienda_sabe_decirme_la_cantidad_de_productos_baratos() {
  Assert.assertEquals(2, tienda.cantidadDeProductosBaratos());
}