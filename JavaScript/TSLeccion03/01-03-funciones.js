//1.1 Introducción a Funciones

miFuncion(6,8); //Hoisting

function miFuncion(a,b){
    console.log("Sumamos: " + (a + b));
}

miFuncion(6,8);

//1.2 Palabra return

function miFuncion2(a,b){
    //console.log("Sumamos: " + (a + b));
    return a + b;
}