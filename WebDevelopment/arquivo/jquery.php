<!doctype html>

<!Desenvolvido por Olavo B. D'Antonio para a aula de Introdução ao Desenvolvimento WEB>
<!Professor da DIO = Bruno Prado>


<html lang="pt-BR">
<head>
	<meta charset="utf-8">
	<meta name="author" content="Olavo Borges D'Antonio">
	<meta name="description" content="Site desenvolvido para a aula de 'Primeiros Passos ao Desenvolvimento WEB'">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!css contendo estilo e formatação para o 'accordion'. Aprender como escrevê-lo ainda é preciso>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">

	<title>Site - Exercício Final</title>	
	
	<style type="text/css">
		table {
		  border-spacing: 30px;
		}
		th, td {
		  padding-left: 90px;
		}
	</style>
	
	<!chamada jquery core form CDN repository>
	<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
	<!chamada jquery ui form CDN repository>
	<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js" integrity="sha256-xLD7nhI62fcsEZK2/v8LsBcb4lG7dgULkuXoXB/j91c=" crossorigin="anonymous"></script>
	
	<!colocar scripts sempre no fim do head, facilita a compreensão e é uma boa prática>
	<script type="text/javascript">
	$(function(){
		$("#accordion").accordion({
		collapsible:true
		});
	});
	</script>
</head>

<body>
	<table style="width:70%">
		<td>
			<div>
				<p><!dfsddsf></p>
			</div>
		</td>
		<td style="width:70%">
			<div id="accordion">
				<h3>sessão 1</h3>
					<div>
					<p>sdfsdf</p>
					</div>
				<h3>sessão 2</h3>
					<div>
					<p>sdfsdf</p>
					</div>
				<h3>sessão 3</h3>
					<div>
					<p>sdfsd</p>
					</div>
			</div>
		</td>
		<td>
			<div>
				<p><!dfsddsf></p>
			</div>
		</td>
	</table>
</body>

</html>