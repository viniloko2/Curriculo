function fazGet(url){
    let req = new XMLHttpRequest()
    req.open("GET", url, false)
    req.send()
    return req.responseText
}

function fazLinha(linhaBanco){
    let linha = document.createElement('tr')
     let colId =document.createElement('td')  
     let colEmail =document.createElement('td') 
     let colSenha =document.createElement('td')      
     colId.innerHTML = linhaBanco.id.login_pk
     colEmail.innerHTML = linhaBanco.colEmail
     colSenha.innerHTML = linhaBanco.linhaBanco.colSenha
     linha.appendChild(colId)     
     linha.appendChild(colEmail) 
     linha.appendChild(colSenha) 
     return linha
}


function main(){
    let dados = fazGet("http://localhost:3000/login")
    let tab = document.getElementById('tabela')
    let usuario = JSON.parse(dados)
    usuario.array.forEach(element => {
        let linha = fazLinha(element)
            tab.appendChild(linha)
    });
}

main()