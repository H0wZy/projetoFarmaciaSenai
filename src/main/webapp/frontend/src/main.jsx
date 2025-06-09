import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter } from 'react-router-dom';
import App from './App.jsx';

// 1. Importe os estilos globais aqui. A ordem importa!
import './styles/index.css'; // A base primeiro
import './styles/theme.css'; // O tema com as variáveis depois

// O App.css pode ser importado aqui ou dentro do App.jsx
// Vamos importar dentro do App.jsx para manter a lógica.

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </React.StrictMode>
);
