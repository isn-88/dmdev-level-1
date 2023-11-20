package core.two.lesson15.repository;

import java.util.List;
import java.util.Random;

public final class MessageRepo {

  private static final Random random = new Random();
  private static final List<String> messages = initMessages();

  private MessageRepo() {
  }

  public static String getRandomMessage() {
    return getRandomElement(messages);
  }

  private static String getRandomElement(List<String> elements) {
    return elements.get(random.nextInt(elements.size()));
  }

  private static List<String> initMessages() {
    return List.of(
        "Не включается свет",
        "Почему опять не работает интернет?",
        "Кто-то оборвал мне телефонный кабель",
        "Под моим окном орут коты",
        "Мой компьютер не включается",
        "Мой сосед подключается к моему wi-fi",
        "По телевизору каждый день идут одни и те же программы",
        "Мой сосед постоянно что-то сверлит",
        "Меня затопил сосед!!!!!",
        "Сосед напротив громко хлопает дверью",
        "Снова не работает интернет",
        "До вашей службы поддержки не дозвониться!",
        "Опять отключили горячую воду",
        "Мне продали будильник, который утром не сработал",
        "Соседи постоянно громко включают музыку",
        "Телевизор перестал ловить каналы",
        "Возле моего подъезда всё время валяется мусор",
        "Соседка постоянно выключает свет в подъезде",
        "Мой ноутбук перестал включаться",
        "В моей раковине засор!",
        "Мне нужно повесить картину.",
        "Моя батарея холодная.",
        "У меня не работает холодильник",
        "Мне продали вчерашний хлеб",
        "В моей квартире холодно!",
        "Ветер оборвал провода",
        "С крыши свисают сосульки",
        "Медленно работает интернет",
        "У меня не работает отопление",
        "Не почистили снег у подъезда",
        "У меня завис компьютер",
        "Мой тостер сжёг тосты",
        "Из радиоприёмника слышен только шум",
        "Ваша служба поддержки не реагирует на мою претензию!"
    );
  }
}