<html>
	<head>
		<title>Meu Site em PHP</title>
		
		<!- a linha abaixo indica o local, a chave de criptografia e o usuário(?) usado para importar as bibliotecas javascript, uma vez que javascript não faz parte do browser ->
		<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script> 
		
		<!- A classe é inicializada com '.nome-dela' ->
		<style type="text/css"> 
			.linha{
				font-weight: bold;
				color: green;
				padding-left: 10px;
				line-height: 50px;
			}
		</style>
		
	</head>
	
	<body>
	<?php
		for ($i=0;$i<10;$i++){
			#A linha abaixo cria uma classe chamada linha que receberá configuração de estilo via css.
			print("<span class=\"linha\">Linha número ".$i."</span><br/>");
		}
	?>
	</body>
	
	<!- É boa prática colocar esta função javascript no fim da página, pois ela irá executar a verificação da página ->
	<script type="text/javascript">
		$(document).ready(function() {
			alert("It's alive!");
		});
	</script>
</html>