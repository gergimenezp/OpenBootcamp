const logger = require ('./logger')

const factorial = i => {
    if (typeof i === "number") {
        let j = 1;
        while (i > 0) {
            j *= i;
            i--;
        }
        return j
    }
    throw new Error("El valor debe ser numérico")
}

let numero = "diez";

try{

    console.log(factorial(numero));

} catch(e) {

    logger.error(`ERROR: ${e}`)

} finally {
    console.log("La ejecución ha finalizado")
}