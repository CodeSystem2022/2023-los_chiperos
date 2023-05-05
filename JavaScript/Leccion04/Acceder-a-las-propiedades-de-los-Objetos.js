let x = 10
console.log(x.length);

//objeto
let persona = {
    nombre: 'Carlos', 
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function(){
        return this.nombre+' '+this.apellido;
    }
}

console.log(persona.nombre); 
console.log(persona.apellido);
console.log(persona.email); 
console.log(persona.edad); 
console.log(persona.nombreCompleto());

let persona2 = new Object();
persona2.nombre = 'Juan';
persona2.direccion = 'Larrea 405';
persona2.telefono = '3755768798';
console.log(persona2.direccion) 

//for in
for(propiedad in persona){
    console.log(propiedad) 
    console.log(persona[propiedad])
}
