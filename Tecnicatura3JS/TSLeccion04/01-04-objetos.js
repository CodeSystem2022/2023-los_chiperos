let x = 10; //variable de tipo primitiva
console.log(x.length);
console.log('Tipos primitivos');

//Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function(){ //método o función en javascript
        return this.nombre+ ' '+this.apellido;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona.nombreCompleto());
console.log('Ejecutamos con un objeto');

let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '34543252323';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');

console.log(persona['apellido']); //Accedemos como si fuera un arreglo

//fot in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

console.log('Cambiamos y eliminamos un error');
persona.apellidos = 'Betancud';
delete persona.apellidos; // Eliminar el error

persona.apellido = 'Betancud'; //Cambiamos dinámicamente un valor del objeto
console.log(persona);

//Distintas formas de imprimir un objeto
//Número 1: la más sencilla: concatenar cada valor de cada propiedad
console.log('Distintas formas de imprimir un objeto: forma 1');
console.log(persona.nombre+' '+persona.apellido);

//Número 2: A través deñ ciclo for in
console.log('Distintas formas de imprimir un objeto: forma 2')
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

console.log('Distintas formas de imprimir un objeto: forma 3')
let personaArray = Object.values(persona);
console.log(personaArray);

//Número 4: Utilozamos el método JSON.stringify
console.log('Distintas formas de imprimir un objeto: forma 4')
let personaString = JSON.stringify(persona);
console.log(personaString);