import React from 'react';
import { Routes, Route } from 'react-router-dom';

// Importe todas as suas páginas
import Home from '../pages/Home';
import Login from '../pages/Login';
import Cadastro from '../pages/Cadastro';
// import CadastroRemedio from '../pages/CadastroRemedio';
// import Estoque from '../pages/Estoque';

export default function AppRoutes() {
  return (
    <Routes>
      {/* Rota para a página inicial */}
      <Route path="/" element={<Home />} />

      {/* Rota para a página de cadastro */}
      <Route path="/cadastro" element={<Cadastro />} />

      {/* Rota para a página de login */}
      <Route path="/login" element={<Login />} />

      {/* Rota para o cadastro de remédios 
      <Route path="/cadastro-remedio" element={<CadastroRemedio />} />
      <Route path="/estoque" element={<Estoque />} />
       Rota para a página de estoque */}


      {/* Você pode adicionar uma rota "catch-all" para páginas não encontradas */}
      {/* <Route path="*" element={<PaginaNaoEncontrada />} /> */}
    </Routes>
  );
}
