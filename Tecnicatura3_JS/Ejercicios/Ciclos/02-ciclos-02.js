/*
Ejercicio 02: Leer un número e indicar si es positivo
o negativo. El proceso se repetira hasta que se introduzca un 0
*/

let numero;
let indice;

numero = parseInt(prompt("Digite un número: "));
console.log("El número ingresado es: " + numero);


while (numero != 0) {

    if (numero >= 0) {
        indice = true;
    } else {
        indice = false;
    }

    if (indice) {

        alert("El número " + numero + " es positivo.");
        console.log("El número " + numero + " es positivo")

    } else {

        alert("El número " + numero + " es negativo");
        console.log("El número " + numero + " es negativo");
        
    }

    numero = prompt("Digite otro número: ");
    console.log("El número ingresado es: " + numero);
}

alert("Fin del programa!");
console.log("Fin del programa!");