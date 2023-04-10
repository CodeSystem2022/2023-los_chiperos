/*
Ejercicio 03: Leer números hasta que se introduzca un cero
Indicar para cada uno indicar si es par o impar.
 */


let numero;

do {

    numero = parseInt(prompt("Digite un número: "));
    console.log(`El numero ingresado es: ${numero}`);

    if (numero % 2 == 0) {
        alert("El número es par.");
        console.log("El número es par");
    } else {
        alert("El número es impar.");
        console.log("El número es impar");
    }

} while (numero != 0);

alert("Fin del programa!");
console.log("Fin del programa!");
