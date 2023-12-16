# Correção

## Nota obtida 11

## Comentários

  - melhor que implementar uma interface relatório seria as classes *usarem* uma classe relatório, se a intenção era separar responsabilidades.
  - **GRAVE** uso de instanceof matando OCP, LSP e DIP. Veja que o Veículo já deveria estar associado ao enum e o case é dispensável (além de errado)
  - menos grave porque não tem instanceof, mas multa também podia usar o enum pelo valor/string sem precisar de case na carteira
  - **GRAVE** enum são constantes. Uma multa paga não pode ser representada no enum. Precisa ter uma classe que use o enum. Desta forma, uma multa paga todas
  - veículo usando vetor em lugar de coleções
  - adicionar/percorrer rota ou deveria ser automático ou deveria estar organizado em um menu e percorrer rotas na ordem. muito complicado o processo de adicionar rota, selecionar para percorrer etc
  - assim como o abastecimento: o fato de toda hora ter que voltar no menu e não fazer nada automaticamente ou não jogar diretamente para a opção mata muito da vantagem de usar um sistema automatizado para o problema
  - informação da data para o usuário

