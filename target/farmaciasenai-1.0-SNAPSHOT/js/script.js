// Faz um GET para /empresa e mostra o nome na página
fetch('http://localhost:8080/farmaciasenai_war/empresa')
    .then(response => response.json())
    .then(data => {
        console.log("Nome da empresa:", data.nome);

        // Adiciona o nome no <main> da página
        const main = document.querySelector('main');
        const p = document.createElement('p');
        p.textContent = `Empresa: ${data.nome}`;
        main.appendChild(p);
    })
    .catch(error => {
        console.error("Erro ao buscar empresa:", error);
    });
