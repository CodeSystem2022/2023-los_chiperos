/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo
y mostrar cuantos numeros se han introducido
*/

let numero, contador = 0, finalizar;

do {

    numero = parseInt(prompt("Digite un número: "));

    if (numero > 0) {
        finalizar = false;
    } else {
        finalizar = true;
    }

    contador += 1;

    alert(`El número ingresado es: ${numero}`);
    console.log(`El número ingresado es: ${numero}`);

} while (!finalizar);

alert(`Fin del programa. Se ingresaron ${contador} números.`);
console.log(`Fin del programa. Se ingresaron ${contador} números.`);
