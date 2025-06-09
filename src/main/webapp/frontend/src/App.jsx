import React from 'react';
// 1. Importe seu componente de rotas
import AppRoutes from './routes/AppRoutes';
import './styles/App.css'

function App() {
  // 2. Renderize o componente de rotas aqui
  return (
    <>
      {/* Você pode adicionar um Header ou Navbar aqui, que aparecerá em todas as páginas */}
      
      
      <AppRoutes />
      {/* Você pode adicionar um Footer aqui, que também aparecerá em todas as páginas */}
    </>
  );
}

export default App;
