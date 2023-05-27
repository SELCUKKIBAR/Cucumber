
  Feature: US999 Test Case 01
    Scenario: TC9999 Kullanici demo.guru99 u test eder
      @a

      Given Kullanici "demoUrl" anasayfaya gider
      Then Sayfadaki iframe sayısını bulur
      And Youtube videosu iceren ilk iframe butonuna tiklar
      And ilk iframeden cıkar ve anasayfaya geri döner
      Then JMeter Made Easy yazisinin bulundugu iframe tiklar
      And Kullanici "guruSeleniumUrl" anasayfaya gider
      And Sayfayı kapatir




