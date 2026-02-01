# Conversão entre Binário e Número Real (Decimal)

Este documento explica como converter números entre **binário** e **decimal real**, usando exatamente os mesmos princípios adotados por CPUs, compiladores e pelo padrão **IEEE-754**.

---

## 1. Sistema Posicional

Todo número em qualquer base é representado por:

$$
N = \sum d_i \cdot base^i
$$

No sistema binário (base 2), cada bit representa uma potência de 2.

---

## 2. Binário → Real (Decimal)

Um número binário real tem o formato:

101.101

Separando:

- Parte inteira: 101
- Parte fracionária: .101

### Parte inteira

101 = 1×2² + 0×2¹ + 1×2⁰  
101 = 4 + 0 + 1 = 5

### Parte fracionária

.101 = 1×2⁻¹ + 0×2⁻² + 1×2⁻³  
.101 = 0.5 + 0 + 0.125 = 0.625

### Resultado

101.101₂ = 5.625

---

## 3. Real → Binário

Um número real é separado em:

13.625

Parte inteira → divisões por 2  
Parte fracionária → multiplicações por 2

---

### Parte inteira: 13

| Divisão | Quociente | Resto |
|-------|----------|------|
13 ÷ 2 | 6 | 1  
6 ÷ 2  | 3 | 0  
3 ÷ 2  | 1 | 1  
1 ÷ 2  | 0 | 1  

Lendo os restos de baixo para cima:

1101

---

### Parte fracionária: 0.625

| Operação | Resultado | Bit |
|--------|-----------|-----|
0.625 × 2 | 1.25 | 1  
0.25 × 2  | 0.5  | 0  
0.5 × 2   | 1.0  | 1  

Resultado:

.101

---

### Resultado final

13.625 = 1101.101


---

## 4. Representação na CPU (IEEE-754)

Todo número real em computador é armazenado como:

(-1)ˢ × 1.mantissa × 2^(expoente)

| Campo | Função |
|------|------|
Sinal | positivo ou negativo  
Expoente | deslocamento de potência  
Mantissa | valor binário  


---

## Referências

- IEEE Standard 754
- Numerical Methods – Burden & Faires
