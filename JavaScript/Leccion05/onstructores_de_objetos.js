function persona3(nombre, apellido, email){
    this.nombre = nombre
    this.apellido = apellido
    this.email = email
}

let padre = new persona3('leo', 'lopez', 'lopez@gmail.com'); 
padre.nombre = 'luis';
console.log(padre)

let madre = new persona3('laura', 'contrera', 'contreral@gmail.com')
console.log(madre)

