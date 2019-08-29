A partir del siguiente DER

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

> Elegí las opciones correctas

> **¡Cuidado! Sólo tenés dos intentos. Cualquier respuesta adicional que envíes no será considerada.**