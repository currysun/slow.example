Feature: Baidu
  Scenario Outline: Open baidu
    When WebAgent set timeout 5 seconds
    And WebAgent open "https://www.baidu.com/" url
    And WebAgent is on BaiDuPage
    And WebAgent type "cucumber" into searchInput
    And WebAgent click on button


    Examples:
    ||
    ||