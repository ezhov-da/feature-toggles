# MVP Feature Toggles server

Статьи о Feature Toggle:

- [Feature Toggles: An Overview & Our Best Practices](https://www.flagship.io/feature-toggle-best-practices/).
- [Feature Toggles (aka Feature Flags)](https://martinfowler.com/articles/feature-toggles.html).

Используется [JANINO](https://janino-compiler.github.io/janino/) в качестве движка для выражений.

API Postman [feature-toggles.postman_collection.json](feature-toggles.postman_collection.json).

## TODO

- [ ] Добавить обязательное описание условия

## Функционал вошедший в MVP

- [x] Просмотр существующих feature toggle
- [x] Создание feature toggle
- [x] Удаление feature toggle
- [x] Редактирование feature toggle
- [x] API проверки feature toggle для клиентов
- [ ] Проверка условия при создании и редактировании
- [ ] Проверка feature toggle
- [ ] Добавить описание к условию

## Функционал для дальнейшего развития

- [ ] Авторизация/Аутентификация в админ-панели
- [ ] Авторизация/Аутентификация для проверки feature toggle
- [ ] Фильтрация feature toggle
- [ ] Генерация API по контракту OpenAPI
- [ ] Реализация валидации в доменных объектах
