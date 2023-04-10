let numero;
let cuadrado;


numero = parseInt(prompt("Digite el valor del numero: "));
console.log("El número ingresado es: " + numero);

while (numero >= 0) {
    cuadrado = Math.pow(numero, 2);

    alert("El número: " + numero + " elevado al cuadrado es igual a : " + cuadrado);
    console.log("El número: " + numero + " elevado al cuadrado es igual a : " + cuadrado);

    numero = prompt("Digite otro valor para seguir las operaciones: ");
    console.log("El número ingresado es: " + numero);

}

alert("Finalizó el programa!");
console.log("Finalizó el programa!");
