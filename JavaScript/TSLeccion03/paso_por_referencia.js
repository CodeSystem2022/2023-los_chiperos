//paso por referencia
const persona ={
    nombre: 'Juan',
    apellido: 'Perez'
}
console.log(persona) 
function cambiaValorObjeto(p1){
    p1.nombre = 'Ignacio'
    p1.apellido = 'Perez'
}

cambiaValorObjeto(persona);
console.log(persona); {nombre: 'Juan', apellido; "Perez"}
