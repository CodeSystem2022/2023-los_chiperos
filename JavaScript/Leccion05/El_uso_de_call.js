let persona4 = {
    nombre: 'angelo',
    apellido: 'pertus',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
    }
}

let persona5 = {
    nombre: 'carlos',
    apellido: 'sanchez'
}

console.log(persona4.nombreCompleto2('lic.', '3755313301'));
console.log(persona4.nombreCompleto2.call(persona5, 'ing', '3755345431'));
