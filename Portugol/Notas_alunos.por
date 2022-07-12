programa
{
	funcao inicio()
	{
		//Declaração de um vetor de inteiros
		// de cinco posições já inicializado.
		inteiro nal
		real nota
		cadeia nome_al
		cadeia vetor[5]
		real notasPs[4]
		//estranhamente não é possivel declarar uma variável tipo inteiro como tamanho do vetor.
		//então aqui eu substitui o 'nal' que deveira ser um o tamanha do vetor (número inteiro) para um valor fixo.
		 //um vetor caracter só armazena a primeira letra!
		
		escreva("Quantos alunos frequentam a aula?\n") // RESPONDA 5. Poderia comentar estas linhas, mas preferi não.
		leia(nal)
		
		//Quantos alunos frequentam a aula?
		//5.5
		//Ocorreu um erro durante a execução do programa: A entrada de dados do programa esperava um valor do tipo 'inteiro', mas nenhum valor foi informado ou o valor informado é de outro tipo
		//Linha: 14, Coluna: 3
		//Comentário acima é para mostrar o tipo esperado do valor entrado. De novo, por que o não aceita a variável como tamanho do vetor é um mistério.
		para (inteiro i=0; i < nal; i++){
			escreva("digite o nome do aluno\n")
			leia(nome_al)
			vetor[i]=nome_al

			para (inteiro j =0; j<4; j++){
				escreva("Entre com a nota da Prova",j,"\n")
				leia(nota)
				notasPs[j] = nota
				
			}

		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */