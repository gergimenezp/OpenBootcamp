import { suma, multiplica } from './modules/controller.js';
import chalk from 'chalk';

//ilegible
console.log(chalk.strikethrough.red(multiplica(suma(1, 2), suma(4, 5))));

//más ordenado

let suma1 = suma(1, 2);

let suma2 = suma(4, 5);

let multiplicacion = multiplica(suma1, suma2);

console.log(chalk.green(multiplicacion));