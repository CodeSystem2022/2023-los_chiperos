//sumar todos los argumentos 
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta); 41
function sumarTodo(){
    let , suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i];
    }
        return suma;
}

