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
