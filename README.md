# Definições e Sintaxe da linguagem ç--

Case-sensitive: Sim

Regra de nomeação das variáveis: Letras minúsculas e números apenas mínimo 3 caracteres.

Delimitador de strings: `“ ”`

Sintaxe de declaração das variáveis: `Tipo variável = valor; Tipo variável;`

Local de declaração das variáveis: início da classe, método;

1. Comentário de linha: “//”

    ```php
    //Uma linha
    ```

2. Comentário de várias linhas:

    ```php
    /*Comentário 
    Bloco*/
    ```

3. Finalização de comando: “;”

    ```php
    Inteiro teste = 2;
    ```

4. Comando de entrada de dados via teclado:

    ```php
    Palavra teste = Entrada("Digite aqui alguma coisa");
    ```

5. Tipos de variáveis:

    ```php
    Inteiro = Integer 
    Palavra = String
    ```

6. Atribuição de variáveis:

    ```php
    Inteiro teste = 1;
    ```

7. Printar na tela:

    ```php
    Mostra("Alguma coisa");
    ```

8. Operadores lógicos e matemáticos:

    ```php
    +
    -
    *
    /
    ^ 
    >
    < 
    =>
    <=
    !=
    ==
    &
    ||
    !
    ```

9. Condicional:

    ```php
    SeNaoForIsso
    EhIsso
    FimDisso
    ```

10. Loop:

    ```php
    RodeAteQue
    Volta
    ```

11. Concatenação:

    ```php
    "uma palavra"."outra palavra"
    ```

### Exemplos

1. Primeiro programa

    ```php
    Começa
       Mostra("Hello World!");
    Termina
    ```

2. Impressão de expressão

    ```php
    Começa
       Mostra("2 + 3 * 4 = " . 2+3*4);  // deve imprimir: "2 + 3 * 4 = 14"
    Termina
    ```

3. Testes com expressões, operadores e precedência.

    ```php
    Começa
       Inteiro Valor, a, b, c, d, e, f, g;
       Inteiro x, y, z;
       Palavra s1, s2, s3;
       Valor = 6 + 5 - (3 - 2) - 2 * 4;
       a = x + 1 * 2 ^ 4;
       b = 1 + 2 * 3 ^ x;
       c = 1 ^ 2 * 3 + x;
       d = x ^ 2 * 3 + 4;
       e = -3--2;
       f = x--2;
       g = 1 + x * 2 > 3 - y  || 4 == z & 5 + 1 < ( 6 + z ) *
        	( 7 - ( 8 - 9 )) & ! ! ! (x > y) + z;
       s1 = "oi";
       s2 = "mundo";
       s3 = s1 . " " . s2 . "!";
       Mostra(Valor, a, b, c, d, e, f, g, s1, s2, s3);
    Termina
    ```

4. Calcular média

    ```php
    Começa

       Inteiro soma, valor, qtde;
       qtde = Entrada("quantos valores: ");
       soma = 0;
       cont = 1;
       RodeAteQue cont <= qtde
      	valor = Entrada("digite num: ");
      	soma = soma + valor;
       Volta 
       Mostra("Media:" . soma/qtde);
    Termina
    ```

5. Comparar duas datas

    ```php
    Começa
       Inteiro dia1, mes1, ano1, dia2, mes2, ano2;
       Palavra relacao;
       dia1 = Entrada("Entre com o dia da primeira data: ");
       mes1 = Entrada("Entre com o mes da primeira data: ");
       ano1 = Entrada("Entre com o ano da primeira data: ");
       dia2 = Entrada("Entre com o dia da segunda data: ");
       mes2 = Entrada("Entre com o mes da segunda data: ");
       ano2 = Entrada("Entre com o ano da segunda data: ");

       SeNaoForIsso ano1 > ano2
      	relacao = "maior";
       EhIsso
      	SeNaoForIsso ano1 < ano2
         	    relacao = "menor";
      	EhIsso
         	    SeNaoForIsso mes1 > mes2
            	  relacao = "maior";
         	    EhIsso
                  SeNaoForIsso mes1 < mes2
               	      relacao = "menor";
            	  EhIsso
               	      SeNaoForIsso dia1 > dia2
                  	    relacao = "maior";
               	      EhIsso
                  	    SeNaoForIsso dia1 < dia2
                     	        relacao = "menor";
                  	    EhIsso
                     	        relacao = "igual";
                  	    FimDisso
               	      FimDisso
            	  FimDisso
         	    FimDisso
      	FimDisso
       FimDisso
       Mostra("Relação entre a primeira e segunda datas: " . relacao);
    Termina
    ```

6. Calculadora

    ```php
    Começa

    Inteiro op = 1;
    Inteiro num1, num2;
    Inteiro result = 0;

    RodeAteQue op => 1 & op <=5
        op = Entrada(“Qual operação vc deseja efetuar?
                1 - Adição
                2 - Subtração
                3 - Divisão
                4 - Multiplicação
                5 - Potência
                0 - SAIR”);

        num1 = Entrada(“Digite o primeiro número”);
        num2 = Entrada(“Digite o segundo número”);
        SeNaoForIsso op == 0
            Mostra("Vc escolheu sair. tchau!!");
        EhIsso
            SeNaoForIsso op == 1
                result = num1+num2;
            EhIsso
                SeNaoForIsso op == 2
                    result = num1-num2;
                EhIsso
                    SeNaoForIsso op == 3
                        result = num1/num2;
                    EhIsso
                        SeNaoForIsso op == 4
                            result = num1*num2;
                        EhIsso
                            SeNaoForIsso op == 5
                                result = num1^num2;
                            EhIsso
                                Mostra("Entrada Inválida, vc sairá do programa!!");    
                            FimDisso
                        FimDisso
                    FimDisso
                FimDisso
            FimDisso
        FimDisso

        SeNaoForIsso result
            Mostra("Resultado da operação: ".result);
        FimDisso

    Volta 

    Termina
    ```