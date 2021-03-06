# language: ru
@smoke
Функционал: Добавление товара в корзину, список товаров в корзине

  Предыстория:
    Дано открыть сайт Мвидео

  Сценарий: Открытие третьей карточки товара в списке, добавление товара в корзину, проверка отображения товара в корзине
    Если в разделе 'Фото и видео' выбрать категорию 'Зеркальные'
    Тогда открыта страница 'Страница списка товаров'
    Пусть нажать на заголовок 3 товара в списке
    Тогда открыта страница 'Карточка товара'
    Если в карточке товара нажать на 'Добавить в корзину'
    Тогда появится 'Всплывающий блок'
    Если в всплывающем блоке нажать на 'Перейти в корзину'
    Тогда открыта страница 'Корзина'
    И в корзине отображаются добавленные товары