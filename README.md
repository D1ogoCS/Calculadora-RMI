# Calculadora
## Desenvolver uma calculadora com interface gráfica e com os cálculos as serem executados num servidor remoto

No âmbito da disciplina de Sistemas Distribuídos, foi proposto a realização de um trabalho em linguagem de programação java de uma calculadora RMI com interface gráfica. O RMI (Invocação de Método Remoto) é uma interface de programação que permite a execução de chamadas remotas desenvolvidas em Java. Segue o modelo Cliente-Servidor, no qual o servidor é um “host” que pode executar um ou mais serviços partilhados com os clientes. O cliente apenas solicita funções do servidor. 
O servidor cria objetos remotos e disponibiliza referências a esses objetos. O cliente obtém referências a esses objetos remotos do servidor e invoca métodos nesses objetos.

### Objetivos:
- Criar uma calculadora em que os cálculos da mesma sejam realizados num servidor remoto
- Deve-se utilizar para a comunicação entre Cliente-Servidor pelo menos uma das tecnologias abordadas (RMI / TCP / UDP)

### Ferramentas utilizadas:
- Apache NetBeans 19
- Visual Studio Code

### Tecnologias utilizadas:
- Linguagem Java
- Java RMI

### Resultados:
#### 1. Inicio
Ao iniciar a aplicação da Calculadora, é exibida uma janela onde é necessario introduzir um IP de um servidor RMI existente.

![Janela inicial](https://github.com/D1ogoCS/Calculadora/blob/main/imagens/janelaInicial.png)

*Janela inicial*

A caixa de texto já estará preenchida com “localhost”. Se o servidor RMI que estiver a utilizar esteja no próprio computador, não será necessário fazer qualquer alteração. No entanto, se o servidor estiver em outro computador, será necessário introduzir o IP correspondente a esse computador e clicar no botão “Confirmar”.

Se o IP do servidor RMI introduzido não existir ou estiver errado, vai obter um erro de ligação ao servidor.

![Mensagem de erro](https://github.com/D1ogoCS/Calculadora/blob/main/imagens/erroServidor.png)

*Mensagem de erro*

Para resolver este erro existem tem duas opções: 

1. Verificar se o servidor RMI está a ser executado
2. Corrigir o IP do servidor RMI introduzido.

Após conseguir estabelecer conexão entre a calculadora e o servidor, vai conseguir utilizar a calculadora sem qualquer restrição. 

![]()

**

![]()

**

![]()

**

![]()

**

