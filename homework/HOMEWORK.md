# Домашнее Задание

Необходимо ответить на вопросы тестирования. За правильные ответы будут начисляться баллы. Тестирование состоит из двух частей:
* Базовые вопросы - **10 вопросов**, максимум **6 баллов**
* Продвинутые вопросы - **3 вопроса**, максимум **2 балла**

Чтобы заполнить ответы на вопросы теста, нужно отредактировать данный файл, 
заменив пустой чек-бокс `- [ ]` на выбранный чек-бокс `- [X]`.

Каждый вопрос подразумевает только один правильный ответ.

## Базовые вопросы

### Вопрос 1
Сколько клиентов женского пола в датасете `Clients`?

- [ ] `0`
- [ ] `4504`
- [X] `5503`
- [ ] `10007`

### Вопрос 2
Сколько различных возрастных групп в справочнике `DictAgeGroup`?

- [ ] `0`
- [ ] `1`
- [X] `9`
- [ ] `10`

### Вопрос 3
Сколько НЕ рабочих дней в календаре `Calendar`?

- [ ] `0`
- [ ] `242`
- [ ] `365`
- [X] `723`

### Вопрос 4
Сколько терминалов категории `"Супермаркеты и продуктовые магазины"` в датасете `Terminals`?

- [ ] `0`
- [X] `2208`
- [ ] `5107`
- [ ] `7315`

### Вопрос 5
Сколько терминалов попадают в прямоугольник с координатами диагонали `(54.0, 36.0)` и `(55.0, 37.0)` по гео-координатам `(latitude, longitude)` в датасете `Terminals`?

- [ ] `0`
- [X] `106`
- [ ] `1637`
- [ ] `7315`

### Вопрос 6
Сколько транзакций с возвратом `return = "Y"` было в ноябре 2020 года? 

- [ ] `0`
- [X] `189919`
- [ ] `6532187`
- [ ] `6722106`

### Вопрос 7
Сколько транзакций было совершено днем с `13:00` до `18:00` 31 декабря 2020 года?

- [ ] `0`
- [X] `71442`
- [ ] `92196`
- [ ] `212620`

### Вопрос 8
Сколько транзакций совершили мужчины в категории `"Личный транспорт"` в июле 2020 года?

- [ ] `0`
- [ ] `91857`
- [X] `163817`
- [ ] `2922331`

### Вопрос 9
Какова сумма транзакций в гео-квадрате с координатами `(55.60, 37.65)` за январь 2021 года?

- [ ] `0`
- [X] `11386634`
- [ ] `13902785`
- [ ] `83347750`

### Вопрос 10
Какова сумма транзакций во всех соседних гео-квадратах для гео-квадрата с координатами `(55.60, 37.65)` за январь 2021 года?

- [ ] `0`
- [ ] `213518876`
- [X] `1144986855`
- [ ] `4167818158`

## Продвинутые вопросы

### Вопрос 1
Топ 3(от большего к меньшему) ID терминалов по количеству транзакций в рабочие дни за 2020 год?

- [X] `'1005931000101', '13671810010', '1000561000109'`
- [ ] `'1005931000101', '1000561000109', '1000561000104'`
- [ ] `'1374781000211', '1374781001010', '1374781000710'`
- [ ] `'1374781000110', '1374781000210', '1000561000101'`

### Вопрос 2
Топ 3(от большего к меньшему) дня недели по сумме транзакций в январе 2021 года?

- [ ] `понедельник, вторник, среда`
- [ ] `среда, четверг, пятница`
- [ ] `суббота, воскресенье, понедельник`
- [X] `суббота, воскресенье, пятница`

### Вопрос 3
Топ 3(от большего к меньшему) категории по количеству транзакций в НЕ рабочие дни в декабре 2020 года?

- [ ] `"Супермаркеты и продуктовые магазины", "Поездки, доставка, хранение", "Общепит"`
- [X] `"Супермаркеты и продуктовые магазины", "Поездки, доставка, хранение", "Денежные переводы"`
- [ ] `"Интернет-магазины", "Медицина и косметика", "Всё остальное"`
- [ ] `"Медицина и косметика", "Всё для дома", "Всё остальное"`
