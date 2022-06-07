var numero = 1;
var i = 10;

while (true) {
    numero *= i;
    i--;
    if(i < 1) break;
}

console.log(numero);