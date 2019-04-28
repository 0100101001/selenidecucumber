# language: ru
@smoke
Функционал: Test Cart

  Структура сценария: Открытие третьей карточки товара в списке, добавление товара в корзину, проверка отображения товара в корзине

#Начало
    #Открытие сайта
    Дано открыть сайт Мвидео
    Тогда открыта Главная страница
    #Переход в список товаров
    Дано навести мышку на раздел <раздел> в навигационном меню
    То раскрыто меню <раздел>
    И нажать на элемент подраздела <элемент>
    Тогда открыта страница со списком товаров
    #Переход в карточку товара
    Пусть нажать на заголовок <порядковыйНомерТовара> товара в списке
    Тогда открыта карточка товара
    #Добавление товара в корзину
    Дано нажать на кнопку добавления товара в корзину
    Когда появится всплывающий блок
    Тогда закрыть всплывающий блок
    #Переход в корзину
    И перейти в корзину через иконку в шапке сайта
    Тогда открыта корзина
    #Проверка отображения добавленного товара в корзине
    К тому же в корзине отображаются добавленные товары


    Примеры:
      |раздел      |элемент   |порядковыйНомерТовара|
      |Фото и видео|Зеркальные|3                    |




