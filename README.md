# 📘 Documentação Técnica – Sistema de Gestão da Empresa Farmacêutica

## 📌 Visão Geral
Este sistema foi projetado para informatizar o controle de uma empresa farmacêutica em crescimento. O sistema realiza o gerenciamento de setores, funcionários, produtos, transportadoras, caixa da empresa e negócios em andamento, com base em uma arquitetura orientada a objetos modelada em UML.

---

## 🧱 Estrutura de Classes

### 🏢 Classe `Empresa`
**Descrição:** Representa a empresa como um todo e centraliza os dados operacionais.  
**Atributos:**
- `nome: String` – Nome da empresa
- `caixaTotal: Double` – Valor atual em caixa
- `setores: List<Setor>` – Setores registrados
- `produtos: List<Produto>` – Produtos em estoque
- `transportadoras: List<Transportadora>` – Transportadoras parceiras

**Métodos:**
- `calcular(): Double` – Calcula o lucro estimado (implementa `ICalculavel`)

---

### 👨‍💼 Interface `ICalculavel`
**Descrição:** Define o contrato para objetos que podem ser "calculáveis", como salário e lucro.  
**Método:**
- `calcular(): Double`

---

### 🏬 Classe `Setor`
**Descrição:** Representa os setores internos da empresa (ex: Vendas, Almoxarifado).  
**Atributos:**
- `nome: String`
- `funcionarios: List<Funcionario>`

---

### 👤 Classe `Funcionario` (implementa `ICalculavel`)
**Descrição:** Representa um colaborador da empresa.  
**Atributos:**
- `nome: String`
- `id: Int`
- `idade: Int`
- `genero: Genero` – Enum (MASCULINO, FEMININO, OUTRO)
- `cargo: Cargo` – Enum (GERENTE, VENDEDOR, etc.)
- `salario: Double`
- `beneficios: Beneficios`

**Método:**
- `calcular(): Double` – Retorna o salário total com benefícios

---

### 💳 Classe `Beneficios`
**Descrição:** Dados fixos de benefícios para cada funcionário.  
**Atributos:**
- `valeRefeicao: Double`
- `valeAlimentacao: Double`
- `planoSaude: Double`
- `planoOdonto: Double`

---

### 📦 Classe `Produto`
**Descrição:** Catálogo de produtos da farmácia.  
**Atributos:**
- `nome: String`
- `precoCompra: Double`
- `precoVenda: Double`
- `quantidadeEstoque: Int`

---

### 🚛 Classe `Transportadora`
**Descrição:** Representa uma empresa de transporte parceira.  
**Atributos:**
- `nome: String`
- `locaisAtendimento: List<String>`

---

### 🤝 Classe `NegocioEmAndamento`
**Descrição:** Controla negócios de compra e venda em andamento.  
**Atributos:**
- `id: Int`
- `tipo: TipoNegocio` – Enum (COMPRA, VENDA)
- `envolvidos: List<Funcionario>`
- `produtos: List<Produto>`
- `status: String`

---

### 📚 Enums

#### `Genero`
