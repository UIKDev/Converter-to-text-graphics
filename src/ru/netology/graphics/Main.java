package ru.netology.graphics;

import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.image.TextGraphicsConverterImpl;
import ru.netology.graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverterImpl(); // Создайте тут объект вашего класса конвертера

//      https://i.ibb.co/k22CKVs3/image2.jpg эталон
        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

//         Или то же, но с выводом на экран:
//        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
//        https://i.ibb.co/6DYM05G/edu0.jpg
//        https://i.ibb.co/k22CKVs3/image2.jpg
//        https://i.ibb.co/DDPDT9JW/out.png
//        String imgTxt = converter.convert(url);
//        System.out.println(imgTxt);
    }
}
