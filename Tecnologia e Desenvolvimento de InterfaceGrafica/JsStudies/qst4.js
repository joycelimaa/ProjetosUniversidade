/*
Escreva duas funções arrow usando a técnica de promises (Javascript ES6).
A primeira função, colocarTodasLetrasEmMaiusculoEm500ms, receberá um 
único parâmetro e o colocará em maiúsculo depois de 500 milisegundos. 
Verifique, dentro da função, se o parâmetro se trata de um tipo String. 
Se o parâmetro não for do tipo String, a promise deve rejeitar o 
parâmetro. A segunda função, inverteTodasLetras(), realizará uma 
inversão das letras da String. Atenção: você deverá utilizar 
encadeamento de funções.
*/

const { resolve } = require("path")

let colocarTodasLetrasEmMaiusculoEm500ms = (palavra) => {

    let promise = new Promise((resolve, reject)=>{
        
        if(typeof palavra == "string"){
            setTimeout(() => {
               resolve(palavra)
            }, 500)
        }
        else{
            reject("Não é uma string")
        }
    })

promise.then((mensagem)=>{
    console.log("Palavra em upperCase: " + mensagem.toUpperCase())
}).catch((mensagem)=>{
    console.log( mensagem)
}).then((mensagem)=>{ 
    mensagem = palavra
    inverteTodasLetras(mensagem)
    
})  
}

let palavra = "joy"
colocarTodasLetrasEmMaiusculoEm500ms(palavra) 

let inverteTodasLetras = (palavra2) => {

    if(typeof palavra2 == "string"){
        let novaPalavra = ""
        for(let i = palavra2?.length-1; i>=0; i--){
            novaPalavra = novaPalavra + palavra2[i]
        }
        console.log("Palavra invertida: " + novaPalavra) 
    }
    
}
//inverteTodasLetras(palavra)

