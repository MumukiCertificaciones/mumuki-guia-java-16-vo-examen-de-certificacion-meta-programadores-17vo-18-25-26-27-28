Dado el DER presentado

<div
  class='mu-erd'
  data-entities='{
    "bandas": {
      "id_banda": {
        "type": "Integer",
        "pk": true
      },
      "nombre": {
        "type": "Text"
      }
    },
    "discos": {
      "id_disco": {
        "type": "Integer",
        "pk": true
      },
      "titulo_disco": {
        "type": "Text"
      },
      "anio_de_salida": {
        "type": "Integer"
      },
      "id_banda": {
        "type": "Integer",
        "pk": false,
        "fk": {
          "to": { "entity": "bandas", "column": "id_banda" },
          "type": "many_to_one"
        }
      }
    },
    "canciones": {
      "id_cancion": {
        "type": "Integer",
        "pk": true
      },
      "titulo_cancion": {
        "type": "Text"
      },
      "duracion": {
        "type": "Real"
      },
      "id_disco": {
        "type": "Integer",
        "pk": false,
        "fk": {
          "to": { "entity": "discos", "column": "id_disco" },
          "type": "many_to_one"
        }
      }
    }
  }'>
</div>

> Escribí una consulta SQL que liste los **títulos** de las **canciones** de **discos** de la banda 'Seru Giran'.