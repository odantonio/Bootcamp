# ![books](https://img.icons8.com/emoji/96/books-emoji.png)	Resumo | O que é o Git? 
O Git é sistema de controle de versão distribuída projetado para gerenciar qualquer coisa, desde de pequenos até grandes projetos com eficiência e velocidade.


## ![bookmakrs](https://img.icons8.com/emoji/48/bookmark-tabs.png) Principais Comandos 

- **git init**
> O comando `git init` é utilizado para iniciar o repositório local em um diretório de trabalho,
Um diretório oculto é criado. (Para remover o diretório do repositório, basta apagar este o diretório *.git*).

- **git config**
> Este comando serve para configurar tanto o git quanto nosso repositório.
>
> |Principais opções:| |
|---|---|
> | `--system`:	|Configurações do sistema ao invés do repositório. |
> | `--global`:	|Configurações globais do __git__ .| 
> | `--local`:		|Configurações do repositório. |
> | `--worktree`:	|Se `config.worktree` estiver habilitado, este arquivo será lido e escrito ao invés do `.config`. Caso contrário, será idêntico ao local.|
> | `user.name`:	|*Setar* o nome da conta. |
> | `user.email`:	|*Setar* o email da conta.| 
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

#### ![bookmakrs](https://img.icons8.com/emoji/48/bookmark-tabs.png) Mais Informações

> Documentação Oficial
 >> - [1] [Git Docs](<https://git-scm.com/doc>)
 >> - [2] [GitHub Docs](<https://docs.github.com/pt>)
>

