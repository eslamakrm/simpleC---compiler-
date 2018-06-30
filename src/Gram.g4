

grammar Gram;

program
   : statement +
   ;

statement
   : 'if' '('expr')' statement                     #IFI
   | 'if' '('expr')' statement 'else' statement    #IFELSEI
   | 'while' '('expr')' statement                  #WHILEI
   | 'do' statement 'while' '('expr')' ';'         #DOWHILEI
   | '{' statement* '}'                            #BODY
   | expr ';'                                      #EXPRII
   | ';'                                           #SEMI
   ;



expr
   : test              #TESTI
   | id '=' sum        #ASSIGN
   ;

test
   : sum                #BOOL
   | sum '<' sum        #BIGGER
   | sum '>' sum        #SMALLER
   | sum '=='sum        #EQUAL
   ;

sum
    :id                 #IDI
   | integer            #INTEGERI
   | sum op sum         #OPI

   ;

op
    :'+'
    |'-'
    |'*'
    |'/'
;
id
   : STRING
   ;

integer
   : INT
   ;


STRING
   : [a-z]+
   ;



INT
   : [0-9] +
   ;

WS
   : [ \r\n\t] -> skip
   ;