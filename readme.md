Вопросов по дз нет.

Решил отойти от метода с HashMap в main, подумал что будет лучше смотреться отдельно создать интерфейс с классами для операций, а так же отдельный класс для обработки входящего символа. Таким образом код в main мы теперь можем никогда не трогать, нам просто нужно будет добавить 1 новый класс для операции и внести его в case в OperationFactory для добавления нового функционала.

Единственное в чём был не уверен - надо ли обработку символа и числа из консоли разносить в разные классы, но посчитал что это всё же можно считать одной задачей.