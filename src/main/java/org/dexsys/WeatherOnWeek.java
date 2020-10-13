package org.dexsys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Calendar;
import java.util.List;

public class WeatherOnWeek {
    int dayNow = Calendar.getInstance().get(Calendar.DATE);

    public void weatherOnFirstDay() {
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://yandex.ru/pogoda/izhevsk");

        try{
            /** Парсим описание даты/месяца на каждый день **/
            List<WebElement> dayNameFirst = webdriver
                    .findElements(By.xpath("//dt[@data-anchor = '" + dayNow  + "']"));

            List<WebElement> dayNameSecond = webdriver
                    .findElements(By.xpath("//dt[@data-anchor = '" + (dayNow + 1) + "']"));

            List<WebElement> dayNameThird = webdriver
                    .findElements(By.xpath("//dt[@data-anchor = '" + (dayNow + 2) + "']"));

            List<WebElement> dayNameFourth = webdriver
                    .findElements(By.xpath("//dt[@data-anchor = '" + (dayNow + 3) + "']"));

            List<WebElement> dayNameFifth = webdriver
                    .findElements(By.xpath("//dt[@data-anchor = '" + (dayNow + 4) + "']"));

            List<WebElement> dayNameSixth = webdriver
                    .findElements(By.xpath("//dt[@data-anchor = '" + (dayNow + 5) + "']"));

            List<WebElement> dayNameSeventh = webdriver
                    .findElements(By.xpath("//dt[@data-anchor = '" + (dayNow + 6) + "']"));
        /** Отдельные листы созданы потому что температура на определнное время суток может содержат разное кол-во значений **/
            /** Парсим значения температур утром на каждый день и кладем их в коллекцию List **/
            List<WebElement> morningFirst = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][1]" +
                            "//tr[@class = 'weather-table__row'][1]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> morningSecond = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][2]" +
                            "//tr[@class = 'weather-table__row'][1]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> morningThird = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][3]" +
                            "//tr[@class = 'weather-table__row'][1]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> morningFourth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][4]" +
                            "//tr[@class = 'weather-table__row'][1]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> morningFifth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][5]" +
                            "//tr[@class = 'weather-table__row'][1]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> morningSixth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][6]" +
                            "//tr[@class = 'weather-table__row'][1]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> morningSeventh = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][7]" +
                            "//tr[@class = 'weather-table__row'][1]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            /** Парсим значения температур днем на каждый день и кладем их в коллекцию List **/
            List<WebElement> dayFirst = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][1]" +
                            "//tr[@class = 'weather-table__row'][2]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> daySecond = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][2]" +
                            "//tr[@class = 'weather-table__row'][2]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> dayThird = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][3]" +
                            "//tr[@class = 'weather-table__row'][2]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> dayFourth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][4]" +
                            "//tr[@class = 'weather-table__row'][2]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> dayFifth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][5]" +
                            "//tr[@class = 'weather-table__row'][2]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> daySixth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][6]" +
                            "//tr[@class = 'weather-table__row'][2]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> daySeventh = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][7]" +
                            "//tr[@class = 'weather-table__row'][2]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            /** Парсим значения температур вечером на каждый день и кладем их в коллекцию List **/
            List<WebElement> eveningFirst = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][1]" +
                            "//tr[@class = 'weather-table__row'][3]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> eveningSecond = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][2]" +
                            "//tr[@class = 'weather-table__row'][3]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> eveningThird = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][3]" +
                            "//tr[@class = 'weather-table__row'][3]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> eveningFourth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][4]" +
                            "//tr[@class = 'weather-table__row'][3]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> eveningFifth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][5]" +
                            "//tr[@class = 'weather-table__row'][3]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> eveningSixth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][6]" +
                            "//tr[@class = 'weather-table__row'][3]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> eveningSeventh = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][7]" +
                            "//tr[@class = 'weather-table__row'][3]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            /** Парсим значения температур ночью на каждый день и кладем их в коллекцию List **/
            List<WebElement> nightFirst = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][1]" +
                            "//tr[@class = 'weather-table__row'][4]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> nightSecond = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][2]" +
                            "//tr[@class = 'weather-table__row'][4]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> nightThird = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][3]" +
                            "//tr[@class = 'weather-table__row'][4]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> nightFourth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][4]" +
                            "//tr[@class = 'weather-table__row'][4]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> nightFifth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][5]" +
                            "//tr[@class = 'weather-table__row'][4]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> nightSixth = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][6]" +
                            "//tr[@class = 'weather-table__row'][4]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            List<WebElement> nightSeventh = webdriver
                    .findElements(By.xpath("//div[@class = 'card'][7]" +
                            "//tr[@class = 'weather-table__row'][4]" +
                            "//div[@class = 'weather-table__wrapper']" +
                            "//span[@class = 'temp__value']"));

            /** Выводим данные о дне и температуру перебором всех созданных листов **/
            System.out.print("Дата: ");
            for (WebElement webElement : dayNameFirst) {
                System.out.print(webElement.getText().replace("\n", " "));
            }
            System.out.println();

            System.out.print("Утром: ");
            for (WebElement element : morningFirst) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Днем: ");
            for (WebElement element : dayFirst) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Вечером: ");
            for (WebElement element : eveningFirst) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Ночью: ");
            for (WebElement element : nightFirst) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();
            System.out.print("---------------------------");
            System.out.println();
            /** **/

            System.out.print("Дата: ");
            for (WebElement webElement : dayNameSecond) {
                System.out.print(webElement.getText().replace("\n", " "));
            }
            System.out.println();

            System.out.print("Утром: ");
            for (WebElement element : morningSecond) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Днем: ");
            for (WebElement element : daySecond) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Вечером: ");
            for (WebElement element : eveningSecond) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Ночью: ");
            for (WebElement element : nightSecond) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();
            System.out.print("---------------------------");
            System.out.println();

            /** **/

            System.out.print("Дата: ");
            for (WebElement webElement : dayNameThird) {
                System.out.print(webElement.getText().replace("\n", " "));
            }
            System.out.println();

            System.out.print("Утром: ");
            for (WebElement element : morningThird) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Днем: ");
            for (WebElement element : dayThird) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Вечером: ");
            for (WebElement element : eveningThird) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Ночью: ");
            for (WebElement element : nightThird) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();
            System.out.print("---------------------------");
            System.out.println();

            /** **/

            System.out.print("Дата: ");
            for (WebElement webElement : dayNameFourth) {
                System.out.print(webElement.getText().replace("\n", " "));
            }
            System.out.println();

            System.out.print("Утром: ");
            for (WebElement element : morningFourth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Днем: ");
            for (WebElement element : dayFourth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Вечером: ");
            for (WebElement element : eveningFourth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Ночью: ");
            for (WebElement element : nightFourth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();
            System.out.print("---------------------------");
            System.out.println();

            /** **/

            System.out.print("Дата: ");
            for (WebElement webElement : dayNameFifth) {
                System.out.print(webElement.getText().replace("\n", " "));
            }
            System.out.println();

            System.out.print("Утром: ");
            for (WebElement element : morningFifth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Днем: ");
            for (WebElement element : dayFifth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Вечером: ");
            for (WebElement element : eveningFifth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Ночью: ");
            for (WebElement element : nightFifth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();
            System.out.print("---------------------------");
            System.out.println();

            /** **/

            System.out.print("Дата: ");
            for (WebElement webElement : dayNameSixth) {
                System.out.print(webElement.getText().replace("\n", " "));
            }
            System.out.println();

            System.out.print("Утром: ");
            for (WebElement element : morningSixth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Днем: ");
            for (WebElement element : daySixth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Вечером: ");
            for (WebElement element : eveningSixth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Ночью: ");
            for (WebElement element : nightSixth) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();
            System.out.print("---------------------------");
            System.out.println();

            /** **/

            System.out.print("Дата: ");
            for (WebElement webElement : dayNameSeventh) {
                System.out.print(webElement.getText().replace("\n", " "));
            }
            System.out.println();

            System.out.print("Утром: ");
            for (WebElement element : morningSeventh) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Днем: ");
            for (WebElement element : daySeventh) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Вечером: ");
            for (WebElement element : eveningSeventh) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();

            System.out.print("Ночью: ");
            for (WebElement element : nightSeventh) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();
            System.out.print("---------------------------");
            System.out.println();

        } finally {
            webdriver.close();
        }
    }
}
