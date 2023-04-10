/*
Ejercicio 5: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100, y
luego ir pidiendo número indicando "es mayor" o 
"es menor" según sea mayor o menos con respecto a N
El proceso termia cuando el usuario acierta y mostramos el
número de intento hechos.
 */


let buscado, numero, intentos = 0;

buscado = Math.round(Math.random() * 100);

do {

    numero = parseInt(prompt("Adivina el número: "));
    console.log(`El número ingresado es ${numero}`);

    if (numero !== buscado) {
        if (numero < buscado) {
            alert("El número ingresado es menor.");
            console.log("El número ingresado es menor.");
        } else {
            alert("El número ingresado es mayor.");
            console.log("El número ingresado es mayor");
        }      
        intentos++;

    } else {

        alert(`Felicidades ingresaste ${numero} y adivinaste, el número buscado es ${buscado}.
        Cantidad de intentos: ${intentos}
        Fin del programa`);
        console.log(`Felicidades ingresaste ${numero} y adivinaste, el número buscado es ${buscado}`);
    }

} while (numero !== buscado);