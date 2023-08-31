# Práctica Fechas
## Programación Avanzada II

Este programa almacena una fecha en dos bytes. Soporta año, mes y día.

## Ejemplo de uso

```java

Fecha fecha;

try {
    //                año   mes  dia
    fecha = new Fecha(2023,   8,  31);
} catch (Exception e) {
    System.out.println(e));
    return;
}

System.out.println(fecha.getYear());
// imprime 2023

System.out.println(fecha.getMonth());
// imprime 8

System.out.println(fecha.getDay());
// imprime 31

try {
    fecha.setDay(29);
    fecha.setMonth(2);
    fecha.setYear(2020);
    // fecha válida, no hay excepciones
} catch (Exception e) {
    System.out.println(e));
    return;
}

try {
    fecha.setYear(2021);
    // fecha inválida, arroja una excepción
} catch (Exception e) {
    System.out.println(e));
    return;
}


```
