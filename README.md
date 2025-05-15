Projeto acadêmico para demonstrar os conceitos de **Herança** em Java, através da simulação de um cardápio digital com **Pratos Quentes** e **Bebidas**. Apliquei os princípios da **POO** na prática, modelando um sistema com classes que compartilham atributos e métodos em comum, mas com comportamentos específicos.

---
                         
## 🧠 Conceitos Aplicados

- ✅ Herança
- ✅ Classe abstrata
- ✅ Sobrescrita de métodos
- ✅ Encapsulamento (getters e setters)

---

## 🧩 Estrutura das Classes

### 🧪 `Produto` (classe abstrata)

Classe base com os atributos e métodos comuns a qualquer produto do restaurante:

```java
private String nome;
private String ingredientes;
private Double preco;

public abstract String getResumo();
```

### 🔥 PratoQuente (herda de Produto)
Atributo individual: serve (quantas pessoas o prato serve).

```java
PratoQuente prato = new PratoQuente("Omelete", "ovo, tomate e queijo", 15.5, 1);
System.out.println(prato.getResumo());
```

### 🥤 Bebida (herda de Produto)
Atributo individual: quantidade (em ml).

```java
Bebida bebida = new Bebida("Suco de laranja", "água, laranja, açúcar e gelo", 10.0, 250);
System.out.println(bebida.getResumo());
```
