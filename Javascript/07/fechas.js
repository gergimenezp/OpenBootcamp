const fecha = new Date();
const birthDate = new Date(1985, 5, 18, 14, 25);
const comparaFecha = fecha > birthDate;
const diaNacimiento = birthDate.getDate();
const mesNacimiento = birthDate.getMonth() + 1;
const anyoNacimiento = birthDate.getFullYear();

