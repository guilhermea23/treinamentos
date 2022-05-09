# Exemplo Prático
> Professor Gustavo Guanabara

# Especificação
Sistema bancário para abertura de contas.

## Atributos
```uml
+ numConta
# tipo
- titular
- saldo
- status
```

### numConta (String)
O número da conta

### tipo (String)
- Conta Corrente ("cc")
	- Já vem com R$50 na conta
- Conta Poupança ("cp")
	- Já vem com R$150 na conta

### titular (String)
- O ideal seria ter uma super-classe p/ o titular mas este é um exemplo p/ tratar apenas conceitos básicos de POO.

### saldo (float)
- Quantia disponivel na conta.

### status (boolean)
- Se a conta está aberta (true) ou fechada (false)

## Métodos
### Constructor
- Define o padrão de conta quando a classe for instanciada
### Getters e Setters
- Todos os atributos devem ter.

### ```+abrirConta()```
- Mudamos o status para aberta (true)
- Especificar o tipo de conta
### ```+fecharConta()```
- Mudamos o status para fechada (false)
- Não pode fechar a conta e ainda ter saldo na conta.
- Não pode fechar a conta tendo débito na conta/ estando devedor.
### ```+depositar()```
- Conta aberta -> Status = true
### ```+sacar()```
- Conta aberta -> Status = true
- Saldo maior que 0 e menor que saldo
### ```+pagarMensalidade()```
- O cliente da "cc" paga R$12,00
- O cliente da "cp" paga R$20,00

