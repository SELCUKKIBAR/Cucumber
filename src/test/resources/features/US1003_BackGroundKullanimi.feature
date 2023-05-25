Feature: US1003_Back_Ground_Kullanarak_Tekrarlardan_Kurtulur

  Background: Amazon anasayfaya gitme
    Given Kullanici amazon anasayfaya gider

  Scenario:TC05 Amazon Nutella Testi
    When Nutella icin arama yapar
    Then Arama sonuclarinin Nutella icerdigini test eder
    And Sayfayı kapatir


  Scenario:TC06 Amazon Java Testi
    When Java icin arama yapar
    Then Arama sonuclarinin Java icerdigini test eder
    And Sayfayı kapatir


  Scenario:TC07 Amazon Samsung Testi
    When Samsung icin arama yapar
    Then Arama sonuclarinin Samsung icerdigini test eder
    And Sayfayı kapatir
