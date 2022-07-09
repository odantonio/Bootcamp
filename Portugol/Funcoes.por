programa
{
	
	funcao inicio()
	{
//Declaração das variáveis
		inteiro x, y

		escreva("=======================================================================\n")
		escreva("Soma de um intervalo\n")
		escreva("Entre a seguir com os valores inicial e final do intervalo a ser somado\n")
		escreva("=======================================================================\n")
		escreva("Digite o primeiro número \n")
//leitura do valor		
		leia(x)
		escreva("Digite o segundo número \n")
//leitura do valor
		leia(y)
		
//Escrevendo o retorno da função soma na tela
		escreva("\nA soma dos valores é: ", soma(x,y))
	}
	funcao inteiro soma(inteiro x, inteiro y){
		inteiro mult, resultado_parcial, total

//Vamos realsar a somatória de todos os valores no intervalo. 
//Mas ao invés de somar termo a termo, vamos realizar a soma do primeiro com o último,
//encontrar quantas vezes a soma pode ser realizada (y/2) e multiplicar o resultado da soma pela quantidade de vezes que se repete.
		total = y/2
		resultado_parcial = x + y
		mult = total * resultado_parcial

//retorno da função		
		retorne mult
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 33; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */