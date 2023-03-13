# language: pt
Funcionalidade: Vida cooperado

  @VidaCoperada_001 @run
  Cenário: Vida Cooperado - Envie uma proposta de sucesso
    Dado Que o usuário entra na tela inicial
    Quando Você faz uma cotação para a Vida Cooperativa
    E Completar as informacoes restantes sem beneficiarios
    Então A proposta é gerada corretamente