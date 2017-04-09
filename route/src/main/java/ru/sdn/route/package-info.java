/**
 * Данная программа составляет маршрут для заполнения путевого листа водителя.
 * Пользователю надо будет заполнить используемые им в работе адреса, расстояние между ними и расстояние до места дислокации.
 * При запуске программы выходит главное меню.
 * Вначале надо сделать настройки, заполнить адреса, для этого выбираем 0.
 * <p>
 * To set the Settings, enter  0.
 * To Calculate the Route, enter 1.
 * :___0
 * <p>
 * Далее попадаем в меню настройки.
 * <p>
 * [0]. Add new Address.
 * [1]. Show Addresses.
 * [2]. Delete Address.
 * [3]. Update an address.
 * [4]. Go to address.
 * Select:__0
 * <p>
 * Здесь мы добавляем новые адреса. У каждого адреса будет список своих адресов,
 * куда о него можно поехать. При каждом добавлении нового адреса, в список адресов каждого существующего адреса автоматически добавляется новый адрес (происходит синхронизация со всеми существующими адресами).
 * <p>
 * Enter new Address: nov,9
 * enter distance to address of dislocation: 10
 * Continue? Any key. Enter "exit" to exit:
 * [0]. Add new Address.
 * [1]. Show Addresses.
 * [2]. Delete Address.
 * [3]. Update an address.
 * [4]. Go to address.
 * Select:__0
 * <p>
 * Enter new Address: kirova,91
 * enter distance to address of dislocation: 9
 * Continue? Any key. Enter "exit" to exit:
 * [0]. Add new Address.
 * [1]. Show Addresses.
 * [2]. Delete Address.
 * [3]. Update an address.
 * [4]. Go to address.
 * Select:__0
 * Enter new Address: safieva,9
 * enter distance to address of dislocation: 8
 * Continue? Any key. Enter "exit" to exit:
 * [0]. Add new Address.
 * [1]. Show Addresses.
 * [2]. Delete Address.
 * [3]. Update an address.
 * [4]. Go to address.
 * Select:__0
 * Enter new Address: zucova,18
 * enter distance to address of dislocation: 11
 * Continue? Any key. Enter "exit" to exit:
 * <p>
 * Далее проверяем добавленное:
 * <p>
 * [0]. Add new Address.
 * [1]. Show Addresses.
 * [2]. Delete Address.
 * [3]. Update an address.
 * [4]. Go to address.
 * Select:__1
 * [nov,9] [10] [0]
 * [kirova,91] [9] [0]
 * [safieva,9] [8] [0]
 * [zucova,18] [11] [0]
 * Continue? Any key. Enter "exit" to exit:
 * <p>
 * Далее переходим к адресу чтобы связать  маршруты и указываем расстояние между ними.
 * При каждом добавлении адреса, новый адрес автоматически добавился в список адресов каждого адреса.
 * <p>
 * [0]. Add new Address.
 * [1]. Show Addresses.
 * [2]. Delete Address.
 * [3]. Update an address.
 * [4]. Go to address.
 * Select:__4
 * Pleas, enter name:  nov,9
 * nov,9  distance to dislocation [10]
 * 1. nov,9 - nov,9  -  [0] distance to dislocation - [10]
 * 2. nov,9 - kirova,91  -  [0] distance to dislocation - [9]
 * 3. nov,9 - safieva,9  -  [0] distance to dislocation - [8]
 * 4. nov,9 - zucova,18  -  [0] distance to dislocation - [11]
 * <p>
 * Выбираем адрес, чтобы указать расстояние между ними.
 * Указанное расстояние автоматически установится и в соответствующем маршруте выбранного адреса. Например установив расснояние нов,9 — кирова, 91 = 9, в маршрутной книге у адреса кирова,91, в строке кирова,91 — нов,9 автоматически установится расстояние = 9.
 * <p>
 * enter the address to change distance:__kirova,91
 * Please, enter distance: 9
 * nov,9  distance to dislocation [10]
 * 1. nov,9 - nov,9  -  [0] distance to dislocation - [10]
 * 2. nov,9 - kirova,91  -  [9] distance to dislocation - [9]
 * 3. nov,9 - safieva,9  -  [0] distance to dislocation - [8]
 * 4. nov,9 - zucova,18  -  [0] distance to dislocation - [11]
 * Enter "exit" to exit:
 * enter the address to change distance:__safieva,9
 * Please, enter distance: 13
 * nov,9  distance to dislocation [10]
 * 1. nov,9 - nov,9  -  [0] distance to dislocation - [10]
 * 2. nov,9 - kirova,91  -  [9] distance to dislocation - [9]
 * 3. nov,9 - safieva,9  -  [13] distance to dislocation - [8]
 * 4. nov,9 - zucova,18  -  [0] distance to dislocation - [11]
 * Enter "exit" to exit:
 * enter the address to change distance:__zucova,18
 * Please, enter distance: 15
 * nov,9  distance to dislocation [10]
 * 1. nov,9 - nov,9  -  [0] distance to dislocation - [10]
 * 2. nov,9 - kirova,91  -  [9] distance to dislocation - [9]
 * 3. nov,9 - safieva,9  -  [13] distance to dislocation - [8]
 * 4. nov,9 - zucova,18  -  [15] distance to dislocation - [11]
 * Enter "exit" to exit: exit
 * Continue? Any key. Enter "exit" to exit:
 * <p>
 * То же самое проделываем и с другими адресами:
 * <p>
 * [0]. Add new Address.
 * [1]. Show Addresses.
 * [2]. Delete Address.
 * [3]. Update an address.
 * [4]. Go to address.
 * Select:__4
 * Pleas, enter name:  kirova,91
 * kirova,91  distance to dislocation [9]
 * <p>
 * Тут как видим, кирвоа,91 — нов,9 уже заполнена = 9.
 * <p>
 * 1. kirova,91 - nov,9  -  [9] distance to dislocation - [10]
 * 2. kirova,91 - kirova,91  -  [0] distance to dislocation - [9]
 * 3. kirova,91 - safieva,9  -  [0] distance to dislocation - [8]
 * 4. kirova,91 - zucova,18  -  [0] distance to dislocation - [11]
 * enter the address to change distance:__safieva,9
 * Please, enter distance: 10
 * kirova,91  distance to dislocation [9]
 * 1. kirova,91 - nov,9  -  [9] distance to dislocation - [10]
 * 2. kirova,91 - kirova,91  -  [0] distance to dislocation - [9]
 * 3. kirova,91 - safieva,9  -  [10] distance to dislocation - [8]
 * 4. kirova,91 - zucova,18  -  [0] distance to dislocation - [11]
 * Enter "exit" to exit:
 * enter the address to change distance:__zucova,18
 * Please, enter distance: 12
 * kirova,91  distance to dislocation [9]
 * 1. kirova,91 - nov,9  -  [9] distance to dislocation - [10]
 * 2. kirova,91 - kirova,91  -  [0] distance to dislocation - [9]
 * 3. kirova,91 - safieva,9  -  [10] distance to dislocation - [8]
 * 4. kirova,91 - zucova,18  -  [12] distance to dislocation - [11]
 * Enter "exit" to exit:
 * enter the address to change distance:__
 * Please, enter distance:
 * Please, enter validate date.
 * Enter "exit" to exit: exit
 * Continue? Any key. Enter "exit" to exit:
 * [0]. Add new Address.
 * [1]. Show Addresses.
 * [2]. Delete Address.
 * [3]. Update an address.
 * [4]. Go to address.
 * Select:__4
 * Pleas, enter name:  safieva,9
 * safieva,9  distance to dislocation [8]
 * 1. safieva,9 - nov,9  -  [13] distance to dislocation - [10]
 * 2. safieva,9 - kirova,91  -  [10] distance to dislocation - [9]
 * 3. safieva,9 - safieva,9  -  [0] distance to dislocation - [8]
 * 4. safieva,9 - zucova,18  -  [0] distance to dislocation - [11]
 * enter the address to change distance:__zucova,18
 * Please, enter distance: 13
 * safieva,9  distance to dislocation [8]
 * 1. safieva,9 - nov,9  -  [13] distance to dislocation - [10]
 * 2. safieva,9 - kirova,91  -  [10] distance to dislocation - [9]
 * 3. safieva,9 - safieva,9  -  [0] distance to dislocation - [8]
 * 4. safieva,9 - zucova,18  -  [13] distance to dislocation - [11]
 * Enter "exit" to exit: exit
 * Continue? Any key. Enter "exit" to exit:
 * [0]. Add new Address.
 * [1]. Show Addresses.
 * [2]. Delete Address.
 * [3]. Update an address.
 * [4]. Go to address.
 * Select:__4
 * Pleas, enter name:  zucova,18
 * zucova,18  distance to dislocation [11]
 * 1. zucova,18 - nov,9  -  [15] distance to dislocation - [10]
 * 2. zucova,18 - kirova,91  -  [12] distance to dislocation - [9]
 * 3. zucova,18 - safieva,9  -  [13] distance to dislocation - [8]
 * 4. zucova,18 - zucova,18  -  [0] distance to dislocation - [11]
 * enter the address to change distance:__
 * Please, enter distance:
 * Please, enter validate date.
 * <p>
 * Далее выходим в главное меню:
 * <p>
 * Enter "exit" to exit: exit
 * Continue? Any key. Enter "exit" to exit: exit
 * Continue? Any key. Enter "exit" to exit:
 * To set the Settings, enter  0.
 * To Calculate the Route, enter 1.
 * <p>
 * Выбираем «Рассчитать маршрут»
 * <p>
 * :___1
 * <p>
 * Воодим количество литров бензина, которые нам надо списать.
 * <p>
 * Программа рассчитывает нам маршрут который мы должны проехать,
 * чтобы чтобы израсходовать данное количество топлива.
 * <p>
 * Please, enter numbers of liters: 30
 * {222}
 * Zavodskay,15 - safieva,9 - nov,9 - Zavodskay,15 - [31]
 * Zavodskay,15 - nov,9 - Zavodskay,15 - [20]
 * Zavodskay,15 - nov,9 - Zavodskay,15 - [20]
 * Zavodskay,15 - kirova,91 - Zavodskay,15 - [18]
 * Zavodskay,15 - safieva,9 - Zavodskay,15 - [16]
 * Zavodskay,15 - safieva,9 - kirova,91 - Zavodskay,15 - [27]
 * Zavodskay,15 - kirova,91 - kirova,91 - Zavodskay,15 - [18]
 * Zavodskay,15 - kirova,91 - safieva,9 - Zavodskay,15 - [27]
 * Zavodskay,15 - zucova,18 - Zavodskay,15 - [22]
 * Zavodskay,15 - nov,9 - Zavodskay,15 - [20]
 * {219}
 * Continue? Any key. Enter "exit" to exit:
 */
package ru.sdn.route;