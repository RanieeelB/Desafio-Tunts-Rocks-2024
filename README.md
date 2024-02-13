# Desafio-Tunts-Rocks-2024

## Media Calculator Challenge

Este repositório contém uma solução para o desafio de Engenharia de Software proposto pela Tunts-Rocks. O objetivo do desafio é calcular a média final e a situação de alunos com base nas notas e faltas registradas em uma planilha do Excel.

### Estrutura do Projeto

O projeto está organizado em três pacotes principais:

1. **br.com.mediacalculator**: Este pacote contém a classe principal `Main` responsável por ler os dados da planilha e calcular a média e situação dos alunos.

2. **br.com.mediacalculator.methods**: Neste pacote, a classe `Methods` contém métodos para calcular a situação dos alunos e atualizar a planilha com as médias finais.

3. **br.com.mediacalculator.model**: O pacote `model` contém a classe `Model`, que define a estrutura dos dados dos alunos.

### Como Executar:

1. Certifique-se de ter o Java instalado em sua máquina.
2. Clone este repositório para o seu ambiente local.
3. Abra o projeto em sua IDE preferida.
4. Execute a classe `Main` para calcular as médias e atualizar a planilha.

### Observações:

- O arquivo da planilha deve ser nomeado "Engenharia de Software – Desafio [Raniel].xlsx" e estar no mesmo diretório que o arquivo `Main.java`.
- Certifique-se de que as bibliotecas Apache POI estejam adicionadas ao seu projeto.
- Este projeto foi desenvolvido como resposta ao desafio proposto pela Tunts-Rocks e pode ser utilizado como referência para cálculos de médias em planilhas do Excel. Sinta-se à vontade para contribuir, reportar problemas ou fazer sugestões de melhorias.

### Resumo do Funcionamento:

O programa funciona lendo a planilha nas colunas e linhas específicas, realizando cálculos com as notas e faltas dos alunos. Com base nos resultados obtidos, determina a situação do aluno. Além disso, o programa é capaz de editar a planilha Excel de acordo com os resultados calculados, atualizando as colunas relevantes com as médias finais e situações dos alunos.

Desenvolvido por: Raniel Bezerra Rodrigues
