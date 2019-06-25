Feature: Visualizar alertas online
  Como usuário
  Eu quero poder visualizar todos os alertas online
  Para que eu veja o status de cada um deles

  Scenario: Visualizar todos
    Given acesso o sistema como admin
    When clicar na opção Alertas Online
    Then deve ser exibido todos os alertas

