@Fav
Feature: Favori Page

  Scenario: Favorilerime urun ekleme
    Given Uygulama acilir
    When Arama cubuguna "kadin" yazilir
    When Ara butonuna tiklanir
    Then Search Page in geldigi kontrol edilir
    When 1. siradaki urune tiklanir
    Then Product Page in acildigi kontrol edilir
    When Favoriye tiklanir
    When Favorilerime gidilir
    Then Urunun favorilerime eklendigi kontrol edilir

