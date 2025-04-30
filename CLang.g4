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
