# Compilers. ДЗ4. Interpreter C-like lang.
Студент: ```Михайлов Павел Максимович```

Преподаватель: ```Лаздин Артур Вячеславович```

Поток: ```1.4```

Исходники: https://github.com/lubitelkvokk/compiler_interpreter

Реализация в ```EvalVisitor.java```

## Задание
### Цель работы
Целью работы является разработка интерпретатора для Тьюринг полного императивного языка
программирования.
### Параметры языка
- Переменные (хранение переменных моделируется с использованием, например, хэш-таблиц,
допустимы другие способы хранения), базовая часть задания предполагает единственный тип:
целые со знаком;
- Присваивания (необходимо учитывать появление идентификаторов в правой —
арифметической) части —, которые не были проинициализированы выше в области
видимости).
- Реализация арифметических операций и операций сравнения (булевый тип вводить не
обязательно, можно считать, что всё, что не нуль – истина, а нуль — ложь;
- Оператор ветвления с факультативной ветвью else;
- Оператор цикла (любой на ваш выбор).
### Дополнительные расширения
Строковый и вещественный типы данных, что предполагает минимальный контроль семантики
выражений. Вы можете запретить сложение строковых литералов с целыми значениями, либо
допустить, например: 4 + ‘abc’ будет преобразовано в ‘4abc’. Для операций вычитания, умножения,
деления опишите семантику, принятую вами для операндов разных типов в отчете,
продемонстрируйте корректное поведение интерпретатора на примерах.

## Грамматика
```g4
grammar CLang;

prog:   stat+ ;

stat: TYPE ID '=' expr ';'             # assignStat
    | ID '=' expr ';'                  # reassignStat
    | expr ';'                         # exprStat
    | condition                        # condStat
    | cycle                            # cycleStat
    | 'print' '(' expr ')' ';'         # printStat
    ;

expr:   expr op=('*'|'/') expr                          # MulDiv
    |   expr op=('+'|'-') expr                          # AddSub
    |   expr op=(GT | GEQ | LEQ | LT | EQ | NEQ) expr   # Compare
    |   INT                                             # intExpr
    |   ID                                              # idExpr
    |   '(' expr ')'                                    # parensExpr
    ;

// IF COND
blockOrStat
    : '{' stat* '}'
    | stat
    ;

condition:
    'if' '(' cond=expr ')' thenBlock=blockOrStat ('else' elseBlock=blockOrStat)?
    ;

cycle:
    'while' '(' cond=expr ')' thenBlock=blockOrStat
    ;
//
TYPE:   'int' ;
ID:     [a-zA-Z_][a-zA-Z_0-9]* ;
INT:    [0-9]+ ;
WS:     [ \t\r\n]+ -> skip ;

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
LT  : '<' ;
LEQ : '<=';
GT  : '>' ;
GEQ : '>=';
EQ  : '==' ;
NEQ  : '!=' ;
```

## Программа fibonacci.expr
```C
int n = 11;
int prev = 0;
int curr = 1;

if (n <= 0) print(0);
else
{
    if (n == 1) print(1);
    else
    {
        int next = 0;
        int ind = 2;
        while (ind <= n)
        {
            next = prev + curr;
            prev = curr;
            curr = next;
            ind = ind + 1;
        }
        print(curr);
    }
}
```

## Порядок запуска
```./compile.sh```
Также потребуется ввести java org.antlr.v4.Tool

Если вводить вручную, то указать необходимые env:
```
export CLASSPATH=".:/usr/local/lib/antlr-4.0-complete.jar:$CLASSPATH"
```
## Запуск
```
java Main fibonacci.expr
```

## Результат
```
89
(prog (stat int n = (expr 11) ;) (stat int prev = (expr 0) ;) (stat int curr = (expr 1) ;) (stat (condition if ( (expr (expr n) <= (expr 0)) ) (blockOrStat (stat print ( (expr 0) ) ;)) else (blockOrStat { (stat (condition if ( (expr (expr n) == (expr 1)) ) (blockOrStat (stat print ( (expr 1) ) ;)) else (blockOrStat { (stat int next = (expr 0) ;) (stat int ind = (expr 2) ;) (stat (cycle while ( (expr (expr ind) <= (expr n)) ) (blockOrStat { (stat next = (expr (expr prev) + (expr curr)) ;) (stat prev = (expr curr) ;) (stat curr = (expr next) ;) (stat ind = (expr (expr ind) + (expr 1)) ;) }))) (stat print ( (expr curr) ) ;) }))) }))))
```

