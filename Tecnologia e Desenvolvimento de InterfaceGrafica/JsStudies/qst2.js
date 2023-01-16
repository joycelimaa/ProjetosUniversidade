//Saída:Demetrio Mestre - 581415-145 - Campina Grande (13.51, 52.54)
const usuario = {
    autor: "Demetrio Mestre",
    endereco: {
    rua:"Rua Qualquer",
    suite: "JS",
    cidade: "Campina Grande",
    CEP: "581415-145",
    geo: { lat: "13.51", lng: "52.54" }
    }
}

var{autor: nome, endereco:{CEP: cep},  endereco: { cidade: city}, endereco: { geo: {lat: lat}}, endereco: { geo: {lng:lng}} } = usuario

const resultado = `${nome} - ${cep} - ${city} (${lat}, ${lng})`
console.log(resultado)
