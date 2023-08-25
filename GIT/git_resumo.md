# Resumo | O que é o Git?
O Git é sistema de controle de versão distribuída projetado para gerenciar qualquer coisa, desde de pequenos até grandes projetos com eficiência e velocidade.


## Principais Comandos


- **git init**
> O comando `git init` é utilizado para iniciar o repositório local em um diretório de trabalho,
Um diretório oculto é criado. (Para remover o diretório do repositório, basta apagar este o diretório *.git*).

- **git config**
> Este comando serve para configurar o nosso repositório. 
> 


- **git status**
> Este comando nos permite verificar, além do estado (se existem *commits* anteriores, quais arquivos estão em *commit* esperando o *push*) que se encontra o repositório local, a *branch* e visualizar se algum arquivo foi alterado.

- **git add**
>  Adiciona arquivos, diretórios, qualquer alteração que não for ignorada para o índice, permitindo ocorrer o *commit*.<br>


- **git commit**
> O `git commit` funciona preparando os arquivos que deverão ser entregues aos repositório local e remoto.<br> Normalmente seguido da `-m` para dizer quais alterações foram feitas e estão sendo passadas ao repositório.
 
 
- **git push**
> Este comando é responsável por enviar os arquivos *"comitados"* do repositório local para o repositório remoto. Sua sintaxe é bastante simples: `git push origin` `<branch>`*


- **git pull**
> O comando ´git pull` permite trazer do repositório arquivos ou pastas do repositório remoto.


- **git checkout**
> O comando `git checkout` nos permite mudar o *branch* de trabalho atual. As *tags* `-b` e `-B` permitem criar os *branchs*, caso não existam; a diferença entre as *tags* é que `-B` cria se não existir. 


- **git branch**
> `git branch` nos permite ver ` --list`, apagar ` --delete` os *branchs* existentes, ou criar novos no repositório.

- **git log**
> `git log` nos permite ver o histórico de alterações realizadas em nosso repositório. 
> 

#### Mais Informações ####

> Documentação Oficial
 >> - Git:  <https://git-scm.com/doc>
 >> - GitHub: <https://docs.github.com/pt>
>
