<h1 align="center"> Calculadora</h1>
Calculadora feita com Java e JFrame, podendo fazer as contas básicas ;

Como testar e executar no final do README;

Minha ideia foi criar uma calculadora do 0, usando alguma lógica tirada da minha própia cabeça para exercitar os meus conhecimentos e aprender mais com isso;

No começo eu pensei em usar variaveis comuns para salvar os valores e operações, mas logo no começo achei que poderia ser mais fácil usar um vetor;
Mas primeiramente fiz o JFrame bem simples para poder só depois começar a parte de programação em si;

<p align="center">
<img src="https://i.imgur.com/Hjlb49r.png"/>
</p>

<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>
</p>

#

# :hammer: Vetor Tela

Eu criei um Vetor que inicialmente ia ser aonde eu ia guardar os dados para exibir na TextLabel, e após pensar bem, ele se tornou mais que so um exibidor;

- `Index[0]`: Guarda o primeiro número inserido;
- `Index[1]`: Guarda o operador da conta;
- `Index[2]`: Guarda o segundo número inserido;
- `Index[3]`: Não guarda nada(mantida por ideias de expandir a calculadora);
- `Index[4]`: Recebe o resultado da conta;


O Index[4], é muito temporario, qualquer ação que for feita pelo usuario a apaga e joga o valor para o Index[0], mas ele foi necessário pois, caso ele não existisse, dificultaria a lógica do programa e atrapalharia um possivel escalonamamento do projeto, tal como um exibidor do resultado anterior;
A minha ideia sempre foi que a calculadora fosse fluida como uma de celular, e que fosse de facil ultilização.

#

Nas primeiras Versões ele não tinha métodos ou funções, após algumas implementações repetitivas eu percebi que seria necessário (e muito mais fácil), então eu fiz;

Lembrando que esse é um dos meus primeiros projetos em Java, aonde eu tenho total autonomia de ideias e trabalho, faço no tempo livre e quando tenho vontade;
Não espere o codigo mais eficiente nem complexo e a nem prova de erros;

Minha ideia agora que ela está funcionando (menos por 1 problema que ainda não achei solução), é expandir ela para uma cientifica, podendo fazer outras operações mais complexas;

# 🛠️ Abrir e rodar o projeto

Ambiente utilizado: Apache NetBeans IDE 15 (algumas versões anteriores não executam)

Baixar a pasta do repositório;

Abri no NetBeans;

Dar RUN na classe "Calculadora_Layout";
