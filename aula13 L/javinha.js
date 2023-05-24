function tojason(){
  let jasonSend = `{"nome":${document.getElementById('nome').value}, 
  "email": ${document.getElementById('email').value} ,
  "data": ${document.getElementById('data').value},
  "estado": ${document.getElementById('uf').value},
  "senha": ${document.getElementById('senha').value},
  "cep":${document.getElementById('cep').value}
  "uf":${document.getElementById('uf').value}
  "logradouro":${document.getElementById('rua').value}
  "bairro":${document.getElementById('bairro').value}
  "cidade":${document.getElementById('cidade').value}
  "ibge":${document.getElementById('ibge').value}
}`;
alert(jasonSend);
}
    
  
  let tableUser = document.querySelector('.table'); 
    var row = tableUser.insertRow();

    let cell1 = row.insertCell(0);
    let cell2 = row.insertCell(1);
    let cell3 = row.insertCell(2);
    let cell4 = row.insertCell(3);

  cell1.innerHTML = document.getElementById('nome').value;
  cell2.innerHTML = document.getElementById('email').value;
  cell3.innerHTML = document.getElementById('data').value;
  cell4.innerHTML = document.getElementById('uf').value;

