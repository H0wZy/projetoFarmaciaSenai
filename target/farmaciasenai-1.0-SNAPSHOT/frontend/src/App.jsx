import { useState, useEffect } from 'react';
import './App.css'; // mantenha seu CSS, pode adaptar se quiser
import logoFarmacia from './assets/logoFarmacia.png';

function App() {
  const apiUrl = 'http://localhost:8080/farmaciasenai_war/funcionarios';

  const [funcionarios, setFuncionarios] = useState([]);
  const [loading, setLoading] = useState(true);
  const [errorLoading, setErrorLoading] = useState(null);

  const [formData, setFormData] = useState({
    id: '',
    nome: '',
    idade: '',
    genero: '',
    cargo: '',
    salario: ''
  });

  const [message, setMessage] = useState({ text: '', type: '' });

  useEffect(() => {
    listarFuncionarios();
  }, []);

  async function listarFuncionarios() {
    setLoading(true);
    setErrorLoading(null);
    try {
      const response = await fetch(apiUrl);
      if (!response.ok) throw new Error('Erro ao carregar funcionários');
      const data = await response.json();
      setFuncionarios(data);
    } catch (err) {
      setErrorLoading('Erro ao carregar funcionários.');
      setFuncionarios([]);
      console.error(err);
    } finally {
      setLoading(false);
    }
  }

  function handleChange(e) {
    const { name, value } = e.target;
    setFormData(prev => ({
      ...prev,
      [name]: value
    }));
  }

  async function handleSubmit(e) {
    e.preventDefault();
    setMessage({ text: '', type: '' });

    // Cria o objeto para enviar
    const funcionario = {
      id: Number(formData.id),
      nome: formData.nome,
      idade: Number(formData.idade),
      genero: formData.genero,
      cargo: formData.cargo,
      salario: Number(formData.salario)
    };

    try {
      const response = await fetch(apiUrl, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(funcionario)
      });
      const result = await response.json();

      if (!response.ok) {
        setMessage({ text: result.error || 'Erro ao adicionar funcionário.', type: 'error' });
      } else {
        setMessage({ text: result.message || 'Funcionário adicionado com sucesso!', type: 'success' });
        setFormData({ id: '', nome: '', idade: '', genero: '', cargo: '', salario: '' });
        listarFuncionarios();
      }
    } catch (error) {
      setMessage({ text: 'Erro ao enviar requisição.', type: 'error' });
      console.error(error);
    }
  }

  return (
    <div className="container">
      <div className="imagem-container">
        <img src={logoFarmacia} alt="Logo da Farmácia SENAI" />
      </div>

      <div className="conteudo-direita">
        <h1>Funcionários - Farmacia SENAI</h1>

        <div id="funcionarios-list" style={{ color: 'white', textAlign: 'center', width: '100%', marginBottom: 20 }}>
          {loading ? (
            'Carregando...'
          ) : errorLoading ? (
            <span style={{ color: 'red' }}>{errorLoading}</span>
          ) : funcionarios.length === 0 ? (
            'Nenhum funcionário encontrado.'
          ) : (
            funcionarios.map(f => (
              <div key={f.id} className="funcionario-item" style={{ borderBottom: '1px solid #ccc', padding: '5px 0' }}>
                {`ID: ${f.id} | Nome: ${f.nome} | Idade: ${f.idade} | Gênero: ${f.genero} | Cargo: ${f.cargo} | Salário: R$ ${f.salario.toFixed(2)}`}
              </div>
            ))
          )}
        </div>

        <div className="form-container">
          <h2>Adicionar Funcionário</h2>
          <form id="funcionario-form" onSubmit={handleSubmit} style={{ width: '100%', maxWidth: 500, margin: '0 auto' }}>
            <label htmlFor="id">ID:</label>
            <input type="number" id="id" name="id" value={formData.id} onChange={handleChange} required />

            <label htmlFor="nome">Nome:</label>
            <input type="text" id="nome" name="nome" value={formData.nome} onChange={handleChange} required />

            <label htmlFor="idade">Idade:</label>
            <input type="number" id="idade" name="idade" min="0" value={formData.idade} onChange={handleChange} required />

            <label htmlFor="genero">Gênero:</label>
            <select id="genero" name="genero" value={formData.genero} onChange={handleChange} required>
              <option value="">Selecione</option>
              <option value="MASCULINO">Masculino</option>
              <option value="FEMININO">Feminino</option>
              <option value="OUTRO">Outro</option>
            </select>

            <label htmlFor="cargo">Cargo:</label>
            <select id="cargo" name="cargo" value={formData.cargo} onChange={handleChange} required>
              <option value="">Selecione</option>
              <option value="GERENTE">Gerente</option>
              <option value="VENDEDOR">Vendedor</option>
              <option value="CAIXA">Caixa</option>
            </select>

            <label htmlFor="salario">Salário:</label>
            <input type="number" id="salario" name="salario" min="0" step="0.01" value={formData.salario} onChange={handleChange} required />

            
          </form>
          <button type="submit">Adicionar</button>

          {message.text && (
            <div id="message" style={{ marginTop: 15, textAlign: 'center', color: message.type === 'error' ? 'red' : 'green' }}>
              {message.text}
            </div>
          )}
        </div>
      </div>
    </div>
  );
}

export default App;
