# calculadora_Interface
Calculadora feita com Java e JFrame, podendo fazer as contas básicas ;

Minha ideia foi criar uma calculadora do 0, usando alguma lógica tirada da minha própia cabeça para exercitar os meus conhecimentos e aprender mais com isso;

No começo eu pensei em usar variaveis comuns para salvar os valores e operações, mas logo no começo achei que poderia ser mais facil usar um vetor;
Mas primeiramente fiz o JFrame bem simples para poder só depois começar a parte de programação em si;

Nisso eu criei o Vetor "Tela" que inicialmente ia ser aonde eu ia guardar os dados para exibir na TextLabel, e após pensar bem, ele se tornou mais que so um exibidor;
O Vetor "Tela" guarda o primeiro número no Index[0], o operador no Index[1], o segundo número no Index[2], e o resultado no Index[4];
O Index[3] ainda não é usado, mas decidir manter por ainda ter ideias de expandir a calculadora adicionando outros tipos de operação;
O Index[4] salva o resultado, ele é muito temporario, qualquer ação que for feita pelo usuario a apaga e joga o valor para o Index[0], mas ele foi necessario:
Caso ele não existisse dificultaria a lógica do programa e atrapalharia um possivel escalonamamento do projeto, tal como um exibidor do resultado anterior;
A minha ideia sempre foi que a calculadora fosse fluida como uma de celular, e que fosse de facil ultilização.

Nas primeiras Versões ele não tinha métodos ou funções, após algumas implementações repetitivas eu percebi que seria necessário (e muito mais fácil), então eu fiz;

Lembrando que esse é um dos meus primeiros projetos em Java, aonde eu tenho total autonomia de ideias e trabalho, faço no tempo livre e quando tenho vontade;
Não espere o codigo mais eficiente nem complexo e a nem prova de erros;

Minha ideia agora que ela está funcionando (menos por 1 problema que ainda não achei solução), é expandir ela para uma cientifica, podendo fazer outras operações mais complexas;
