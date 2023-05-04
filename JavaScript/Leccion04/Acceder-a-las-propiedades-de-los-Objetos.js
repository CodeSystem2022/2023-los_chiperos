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

console.log(persona.nombre); Carlos
console.log(persona.apellido); Gil
console.log(persona.email); 'egil@gmail.com'
console.log(persona.edad); 30
console.log(nombreCompleto()); Carlos_Gil

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