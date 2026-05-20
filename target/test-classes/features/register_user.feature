# ===============================
# register_user.feature
# ===============================

@register
Feature: Registrar Usuario

Scenario: Registrar e excluir usuario com sucesso

  Given que acesso o site
  When acesso a tela de cadastro
  And preencho os dados do novo usuário
  And confirmo a criação da conta
  Then eu excluo a conta