import React from 'react';

// 1. Importando os estilos do nosso módulo. Perfeito!
import styles from './Home.module.css';


export default function Home() {
  return (
    // 2. Aplicando a classe 'container' ao nosso div principal.
    <div className={styles.container}>

      {/* 3. Aplicando a classe 'title' ao nosso H1. */}
      <h1 className={styles.title}>Página Inicial</h1>

      {/* 4. Adicionando um subtítulo e aplicando a classe 'subtitle'. */}
      <p className={styles.subtitle}>
        Bem-vindo ao sistema de controle da Pharmaceutical Company.
      </p>

    </div>
  );
}
