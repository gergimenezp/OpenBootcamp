//función sin parámetros que devuelva siempre "true"
function verdadera() {
    return true
}

console.log(verdadera());

//función asíncrona
const miPromesa = new Promise((resolve, reject) => {
    
    setTimeout(() => {
        resolve()
        }, 5000
    )
})

miPromesa
    .then(() => console.log("Hola soy una promesa"))


//función generadora de índices pares automáticos
function* generarId() {
    let id = 0;
    while (true) {
        yield id += 2
    }
}

const nuevoId = generarId();

console.log(nuevoId.next().value)
console.log(nuevoId.next().value)
console.log(nuevoId.next().value)
console.log(nuevoId.next().value)
console.log(nuevoId.next().value)
console.log(nuevoId.next().value)