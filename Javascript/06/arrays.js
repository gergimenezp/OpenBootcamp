const listaCompra = ["pan", "mantequilla", "arroz", "pasta", "pollo"];
listaCompra.push("aceite de girasol");
listaCompra.pop();

const pelisPrefe = [
  { titulo: "Back to the Future", director: "Robert Zemeckis", fecha: 1985 },
  {
    titulo: "Eternal Sunshine of the Spotless Mind",
    director: "Michel Gondry",
    fecha: 2004
  },
  { titulo: "Django Unchained", director: "Quentin Tarantino", fecha:  2012},
];

const pelisPrefeNuevas = pelisPrefe.filter((peli) => peli.fecha >= 2010)
const directores = pelisPrefe.map((peli) => peli.director)
const titulos = pelisPrefe.map((peli) => peli.titulo)
const concat = directores.concat(titulos)
const prop = [...directores, ...titulos]