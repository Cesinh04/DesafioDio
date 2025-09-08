# Desafio POO - Digital Innovation One

## 🧩 Sobre o Projeto

Este projeto é um desafio de **Programação Orientada a Objetos (POO)** realizado para a Digital Innovation One.
O objetivo é aplicar os quatro pilares da POO: **abstração, encapsulamento, herança e polimorfismo**, em um projeto prático usando Java.

O sistema simula veículos, incluindo carros comuns e elétricos, demonstrando herança e polimorfismo.

---

## 🚀 Funcionalidades

* Criar veículos genéricos (`Vehicle`)
* Criar carros (`Car`) que herdam de `Vehicle`
* Criar carros elétricos (`ElectricCar`) com capacidade de bateria
* Listar detalhes dos veículos
* Demonstrar **polimorfismo** usando o método `start()`

---

## 📂 Estrutura do Projeto

```
desafio-poo-dio/
│
├─ src/
│  └─ com/poo/desafio/
│       ├─ App.java
│       ├─ model/
│       │    ├─ Vehicle.java
│       │    ├─ Car.java
│       │    └─ ElectricCar.java
│       └─ service/
│            └─ VehicleService.java
├─ .gitignore
└─ README.md
```

---

## ⚙️ Tecnologias

* Java 11
* Git
* IDE Java (IntelliJ IDEA, Eclipse, etc.)

---

## 💻 Como Rodar

1. Clone o repositório:

```bash
git clone https://github.com/Cesinh04/DesafioDio.git
```

2. Acesse a pasta do projeto:

```bash
cd DesafioDio
```

3. Compile o projeto:

```bash
javac -d out src/com/poo/desafio/**/*.java
```

4. Execute o projeto:

```bash
java -cp out com.poo.desafio.App
```

---

## 📌 Autor

* Cesar Ferreira

---

## 📄 Licença

Este projeto está sob a licença MIT.
