//metodo get y set
//Número 4: Utilizaremos el método JSON.stringify
console.log('Distintas formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('comenzamos a utilizar el metodo get')
console.log(persona.nombreEdad);

console.log('comenzamos con el metodo set y get para idiomas')
persona.lang = 'en';
console.log(persona.lang);