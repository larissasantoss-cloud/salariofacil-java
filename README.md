# 💼 SalarioFácil

Sistema de cadastro de colaboradores e cálculo automático de salários, desenvolvido em Java.

---

## 📋 Sobre o projeto

O **SalarioFácil** é um sistema interativo executado no terminal que permite cadastrar colaboradores e calcular o salário final de acordo com o tipo de vínculo empregatício.

Projeto desenvolvido como atividade prática da disciplina de **Ciência da Computação**, aplicando conceitos fundamentais de programação em Java.

---

## ⚙️ Funcionalidades

- ✅ Cadastro de colaboradores com número de registro e nome
- ✅ Três tipos de colaboradores suportados
- ✅ Cálculo automático do salário final
- ✅ Listagem de todos os colaboradores cadastrados

---

## 👥 Tipos de colaboradores

| Tipo | Cálculo |
|---|---|
| Funcionário Padrão | Salário base (R$ 2.000,00) |
| Funcionário Comissionado | Salário base + (vendas × percentual / 100) |
| Funcionário de Produção | Salário base + (valorPorPeça × quantidade) |

---

## 🧠 Conceitos aplicados

- Tipos de dados primitivos e compostos
- Constantes e variáveis
- Entrada e saída de dados (Scanner / System.out)
- Estruturas condicionais (if-else, switch)
- Estruturas de repetição (do-while)
- Manipulação de listas dinâmicas (ArrayList)
- Organização em métodos reutilizáveis

---

## ▶️ Como executar

### Pré-requisitos
- Java JDK 8 ou superior instalado

### Passos
```bash
# Clone o repositório
git clone https://github.com/seu-usuario/salariofacil-java.git

# Acesse a pasta
cd salariofacil-java

# Compile
javac SistemaColaboradores.java

# Execute
java SistemaColaboradores
```

---

## 📸 Exemplo de uso

```
===== SISTEMA DE COLABORADORES =====
1 - Cadastrar colaborador
2 - Listar colaboradores
0 - Sair
Escolha uma opção: 1

Número de registro: 001
Nome completo: João Silva
Tipo de colaborador:
1 - Funcionário Padrão
2 - Funcionário Comissionado
3 - Funcionário de Produção
Escolha: 2

Total de vendas no mês (R$): 5000
Percentual de comissão (%): 10
Comissão calculada: R$ 500,00

Colaborador cadastrado com sucesso!
Salário final: R$ 2500,00
```

---

## 👨‍💻 Desenvolvido por

Projeto acadêmico — Ciência da Computação
