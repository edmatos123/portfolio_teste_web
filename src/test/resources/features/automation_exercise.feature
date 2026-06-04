Feature: Automation Exercise

Scenario: CT01 - Cadastrar e excluir usuario
  
  Given que acesso o site
  When acesso a tela de login e cadastro
  And preencho os dados do novo usuário
  And confirmo a criação da conta
  Then a conta é criada com sucesso
  And acesso a tela de exclusão
  Then a conta é excluída com sucesso

  Scenario: CT02 -  Login e logout
  
  Given que acesso o site
  When acesso a tela de login e cadastro
  And realizo login
  Then o usuário é autenticado
  When realizo logout
  Then o usuário é desconectado
  
  
  Scenario: CT03 - Cadastro com email existente
  
  Given que acesso o site
  When acesso a tela de login e cadastro
  And preencho os dados do novo usuário com email existente
  Then é informado que o email existe
  

  Scenario: CT04 - Pesquisar produto
  
  Given que acesso o site
  When acesso a tela de produtos
  And pesquiso pelo produto
  Then o produto é apresentado
  
  

  Scenario: CT04 - Pesquisar produto
  
  Given que acesso o site
  When acesso a tela de produtos
  And coloco 1 produto no carrinho
  Then o produto é apresentado
  
  @test
  Scenario: CT05 - Adicionar produtos ao carrinho

  Given que acesso o site
  When acesso a tela de produtos
  And adiciono 2 produtos ao carrinho
  And acesso o carrinho
  Then os produtos são apresentados no carrinho
  
   
  