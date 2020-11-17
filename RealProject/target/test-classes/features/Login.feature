Feature: log into application
Scenario: positive login application
Given initialize the driver
And access "http://www.qaclickacademy.com/"
And click on login link
When enter username "tttt" and pwd "hhhh"
