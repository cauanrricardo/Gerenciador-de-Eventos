# 📝 Gerenciador de Eventos

Um sistema simples para gerenciar eventos, desenvolvido em **Java**, seguindo os princípios de **POO** (Programação Orientada a Objetos).

## 🚀 Funcionalidades

### ✔️ Operações CRUD completas
- **Create**: Adicionar novos eventos  
- **Read**: Listar e buscar eventos  
- **Update**: Atualizar informações de eventos  
- **Delete**: Remover eventos  

### 🔍 Funcionalidades específicas
- **Cadastro de eventos** com:
  - ID único  
  - Nome  
  - Data e hora  
  - Local  
  - Status (ativo/inativo)  
- **Listagem de todos os eventos**  
- **Listagem filtrada de eventos ativos**  
- **Ativação/desativação de eventos**  
- **Busca de eventos por ID**  

## 📂 Classes principais

### **Evento**
- Modela um evento com todos seus atributos.

#### Métodos:
- `ativar()` / `desativar()`
- `toString()` para exibição formatada  

### **GerenciadorDeEventos**
- Gerencia a lista de eventos.

#### Métodos principais:
- `adicionarEvento()`
- `listarEventos()`
- `buscarEvento()`
- `atualizarEvento()`
- `removerEvento()`
- `listarEventosAtivos()`

### **Main**
- Classe principal com exemplos de uso.

- Demonstra todas as funcionalidades.
