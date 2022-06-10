const yo = {nombre: "Gerardo", apellido: "Gimenez Ponce", edad: 36, altura: 1.83, eresDesarrollador: true}
const edad = yo.edad;
const amigos = [
    {...yo},
    {nombre: "Juan", apellido: "Perez", edad: 40, altura: 1.85, eresDesarrollador: false},
    {nombre: "Pedro", apellido: "Ramirez", edad: 29, altura: 1.76, eresDesarrollador: true}
]

const porEdad = amigos.sort((a, b) => b.edad - a.edad)