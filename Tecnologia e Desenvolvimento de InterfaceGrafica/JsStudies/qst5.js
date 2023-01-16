const colocarTodasLetrasEmMaiusculoEm500ms = async (palavra) => {
    return new Promise((resolve, reject) => {
      if (typeof palavra == 'string') {
            setTimeout(() => {
            resolve(palavra.toUpperCase())
          }, 500)
       
      } else {
        reject("Não é uma String")
      }
    })
  }
  
    const letrasMaiusculas = async (palavra) => {
    const resultadoMaiusculo = await colocarTodasLetrasEmMaiusculoEm500ms(palavra);
    return resultadoMaiusculo
   
  }

  const inverteTodasLetras = async(palavra2) => {
   return new Promise((resolve) => {
    if(typeof palavra2 == "string"){
        let novaPalavra = ""
        for(let i = palavra2?.length-1; i>=0; i--){
            novaPalavra = novaPalavra + palavra2[i]
        }
        
        resolve(console.log(novaPalavra))
    }
          
   })
}

   const letrasInvertidas = async (palavra) => {
   const resultadoInvertido = await inverteTodasLetras(palavra);
   return resultadoInvertido
    
}


  let palavra = "joy"
  colocarTodasLetrasEmMaiusculoEm500ms(palavra)
  .then((result) => letrasMaiusculas(result))
  .then((result) => console.log(result))
  .catch((error) => console.log(error));

  inverteTodasLetras(palavra)
  .then((result)=> letrasInvertidas(result))
  .then((result) => console.log(result))
  .catch((error) => console.log(error));