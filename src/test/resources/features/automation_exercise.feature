# ===============================
# register_user.feature
# ===============================

Feature: Automation Exercise

Scenario: Cadastrar e excluir usuario
  
  Given que acesso o site
  When acesso a tela de login e cadastro
  And preencho os dados do novo usuário
  And confirmo a criação da conta
  Then a conta é criada com sucesso
  And acesso a tela de exclusão
  Then a conta é excluída com sucesso

  Scenario: Login e logout
  
  Given que acesso o site
  When acesso a tela de login e cadastro
  And realizo login
  Then o usuário é autenticado
  When realizo logout
  Then o usuário é desconectado
  
  