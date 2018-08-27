# Linha de Comando

1. Diretório atual
```
pwd
```
2. Listar conteúdo do diretório
```
ls
```
3. Listar conteúdo do diretório detalhado
```
ls -l
```
4. Listar conteúdo do diretório ordenado por daa
```
ls -lt
```
5. Alterar diretório
```
cd <nome_diretorio>
```
6. Criar diretório
```
mkdir <nome_novo_diretorio>
```
7. Remover Arquivo
```
rm <nome_do_arquivo>
```
8. Remover diretório
```
rm -fr <nome_diretorio>
```
9. Criar cópia de um arquivo ou diretório
```
cp <nome_arquivo> <nome_copia>
```
10. Entrar um determinado arquivo no diretório corrente ou subdiretórios
```
find . -name <nome_arquivo>
```
11. Entrar todos os arquivos com o sufixo .java no diretório src
```
ind src -name *.java
```
12. Define uma variável de ambiente
```
export $<Nome_variavel>=<Valor>
```
13. Exibe o conteúdo de uma variável de ambiente
```
echo $<nome_variavel>
```
14. Exibe código de retorno do último aplicativo executado (Linux)
```
echo $?
```
15. Calculadora
```
echo <expressao> | bc
```
16. Infora o interpretador de comandos usados
```
echo $0
```
17. Exibe o caminho para o executável do interpretador de comandos
```
echo $SHELL
```
18. Exibir o ip da máquina
```
curl http://ifconfig.co
```
19. Logar em computador remoto
```
ssh <ip>
```
20. Cópia de arquivo segura entre computadores distintos
```
scp <arquivo> usr@servidor:/home/diretorio/destino

```

