Feature: Baidu
  Scenario Outline: Open baidu
    When WebAgent set timeout 5 seconds
    And WebAgent open "https://cn.bing.com/" url


    Examples:
    ||
    ||