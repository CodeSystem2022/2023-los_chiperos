//1.1 Arreglos en JavaScript

//Sintaxis vieja
//let autos = new Array('Fiat','Ford','Reanult');

const autos =['Fiat','Ford','Reanult'];
console.log(autos);


//1.2 Recorremos los elementos de un arreglo
//Recorrer arreglos
console.log(autos[0]);

for( let i; i < autos.length; i++){
    console.log(autos[i]);
}

//1.3 Modificamos los elementos
autos[1] = 'SIAM'
console.log(autos[1]);

autos.push('Reanult');//se agrega elemento al final
console.log(autos);

//Otra forma de agregar elementos al arreglo
autos[autos.length] = "BMW";
console.log(autos);

//Tercera forma de agregar elementos al arreglo '''Danger'''
autos[6]='Volvo'; // no saltear indices


//1.4 Preguntar si es un Array
//Consultar si es Array
console.log(Array.isArray(autos)); // devuelve booleano

console.log(autos instanceof Array); // consultamos si la variable es instancia de la clase Array