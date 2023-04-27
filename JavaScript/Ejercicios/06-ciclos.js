/*
Ejercicio 06: Pedir números hasta que se teclee un 0,
mostrar la suma de todos los números introducidos
 */

let numero = 0;
let suma = 0;

do {

    numero = parseInt(prompt("digite un número: "));
    console.log(`El número ingresado es ${numero}`);
    alert(`El número ingresado es ${numero}`);

    suma += numero;

} while (numero != 0);

alert(`La suma de todos los números introducidos es : ${suma}`);
console.log(`La suma de todos los números introducidos es : ${suma}`);