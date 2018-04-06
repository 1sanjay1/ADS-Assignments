grammar sqlParser;

//To ignore white spaces, tabs and end of line
WS : (' ' | '\t' | '\r' | '\n')+ { skip(); } ;

/* Begin Reserved Key words */

SELECT              : [s|S][e|E][l|L][e|E][c|C][t|T]  ;
FROM                : [f|F][r|R][o|O][m|M]  ;
WHERE               : [w|W][h|H][e|E][r|R][e|E] ;
DISTINCT            : [d|D][i|I][s|S][t|T][i|I][n|N][c|C][t|T]  ;
ALL                 : [a|A][l|L][l|L] ;
ASC                 : [a|A][s|S][c|C] ;
DESC                : [d|D][e|E][s|S][c|C]  ;
LIMIT               : [l|L][i|I][m|M][i|I][t|T] ;
HAVING              : [h|H][a|A][v|V][i|I][n|N][g|G] ;
GROUP_BY            : [g|G][r|R][o|O][u|U][p|P][ ]+[b|B][y|Y] ;
ORDER_BY            : [o|O][r|R][d|D][e|E][r|R][ ]+[b|B][y|Y] ;
AS                  : [a|A][s|S]  ;
BETWEEN             : [b|B][e|E][t|T][w|W][e|E][e|E][n|N] ;
OR                  : ([O|o][R|r])  ;
AND                 : ([a|A][n|N][d|D])|([&][&])  ;
XOR                 : [x|X][o|O][r|R] ;
CURRENT_DATE        : [c|C][u|U][r|R][r|R][e|E][n|N][t|T][_][d|D][a|A][t|T][e|E]  ;

UPDATE              : [u|U][p|P][d|D][a|A][t|T][e|E]  ;
DELETE              : [d|D][e|E][l|L][e|E][t|T][e|E]  ;
SET                 : [s|S][e|E][t|T] ;
LOW_PRIORITY        : [l|L][o|O][w|W][_][p|P][r|R][i|I][o|O][r|R][i|I][t|T][y|Y]  ;
QUICK               : [q|Q][u|U][i|I][c|C][k|K] ;
IGNORE              : [i|I][g|G][n|N][o|O][r|R][e|E]  ;

INSERT              : [i|I][n|N][s|S][e|E][r|R][t|T]  ;
INTO                : [i|I][n|N][t|T][o|O]  ;
DELAYED             : [d|D][e|E][l|L][a|A][y|Y][e|E][d|D] ;
HIGH_PRIORITY       : [h|H][i|I][g|G][h|H][_][p|P][r|R][i|I][o|O][r|R][i|I][t|T][y|Y] ;
VALUES              : [v][a][l][u][e][s]  ;
VALUE               : [v][a][l][u][e] ;

INNER               : [i|I][n|N][n|N][e|E][r|R] ;
CROSS               : [c|C][r|R][o|O][s|S][s|S] ;
STRAIGHT_JOIN       : [s|S][t|T][r|R][a|A][i|I][g|G][h|H][t|T][_][j|J][o|O][i|I][n|N] ;
ON                  : [o|O][n|N]  ;
JOIN                : [j|J][o|O][i|I][n|N]  ;
NATURAL             : [n|N][a|A][t|T][u|U][r|R][a|A][l|L] ;
LEFT                : [l|L][e|E][f|F][t|T]  ;
RIGHT               : [r|R][i|I][g|G][h|H][t|T] ;
OUTER               : [o|O][u|U][t|T][e|E][r|R] ;
USING               : [u|U][s|S][i|I][n|N][g|G] ;
NOT                 : [n|N][o|O][t|T];

NULL                : [n|][u|U][l|L][l|L] ;

/* End Reserved Key words */

DIV                 : ([D|d][I|i][V|v])|([/])   ;
MOD                 : ([m|M][o|O][d|D])|([%])   ;

EQ                  : '='			;
LTE                 : '<='		;
GTE                 : '>='		;
GT                  : '>'			;
LT                  : '<'			;
SEMI                : ';'     ;
COLON               : ':'     ;
DOT                 : '.'     ;
COMMA               : ','     ;
ASTERISK            : '*'     ;
RPAREN              : ')'     ;
LPAREN              : '('     ;
RBRACK              : ']'     ;
LBRACK              : '['     ;
PLUS                : '+'     ;
MINUS               : '-'     ;
NEGATION            : '~'     ;
BITOR               : '|'     ;
BITAND              : '&'     ;
POWER_OP            : '^'     ;
BIT_NOT             : '!'     ;
BIT_NOT_EQ          : '!='    ;







LETTER                : ('a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z')  ;
DIGIT                 : ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )  ;
UNDERSCORE            : '_' ;
DOLLER                : '$' ;
TICK                  : '`';

var1                  : (DIGIT)+ ( LETTER | DOLLER | UNDERSCORE ) ( DIGIT | LETTER | UNDERSCORE | DOLLER )* ;
var2                  : ( LETTER | UNDERSCORE | DOLLER ) ( DIGIT | LETTER | UNDERSCORE | DOLLER )*  ;
var3                  : TICK ~'`'+ TICK ;


identifier            : ( var1 | var2 | var3 ) ;

number_literal        : ('+' | '-')? ( REAL_NUMBER | INTEGER_NUM) ;

INTEGER_NUM		        : (DIGIT)+ ;
REAL_NUMBER           :
	                     (  INTEGER_NUM '.' INTEGER_NUM | INTEGER_NUM '.' | '.' INTEGER_NUM | INTEGER_NUM  )
	                     (  ('E'|'e') ( '+' | '-' )? INTEGER_NUM  )?
                      ;

//SQL Grammer Rules
sqlQuery              :	sql_statement SEMI
                      | sqlQuery SEMI
                      ;


sql_statement         : select_statement
                      | delete_statement
                      | update_statement
                      |	insert_statement
				              |	LPAREN sql_statement RPAREN
                      ;

select_statement      : select_expression
                      ;

select_expression     : SELECT (ALL | DISTINCT)? select_list1
                      ;

select_list1          :	select_list
				              |	select_list  ( from_clause1 | orderby_clause | limit_clause)
				              |	select_list  ( from_clause1 orderby_clause | from_clause1 limit_clause | orderby_clause limit_clause)
				              |	select_list  from_clause1 orderby_clause limit_clause
				              ;

from_clause1          :	FROM table_references
                      |	FROM table_references  ( where_clause | groupby_clause | having_clause )
                      |	FROM table_references  ( where_clause groupby_clause | where_clause having_clause | groupby_clause having_clause)
                      |	FROM table_references  where_clause groupby_clause having_clause
                      ;

//where clause
where_clause		      :	WHERE expression
				              ;

groupby_clause        : GROUP_BY groupby_item (COMMA groupby_item)*
                      ;

groupby_item          :	column_spec | INTEGER_NUM
                      ;

having_clause         : HAVING expression
                      ;

orderby_clause        : ORDER_BY orderby_item (COMMA orderby_item)*
                      ;

orderby_item          :	groupby_item (ASC | DESC)?
                      ;

limit_clause          : LIMIT (offset COMMA)? row_count
                      ;

offset                :	INTEGER_NUM ;
row_count             :	INTEGER_NUM ;

select_list           : ( ( displayed_column ( COMMA displayed_column )*) | ASTERISK )
                      ;

displayed_column      : ( table_spec DOT ASTERISK )
                      | ( column_spec (alias)? )
                      ;

table_spec            : ( identifier DOT )? identifier
                      ;

column_spec           : identifier
                      ;

alias                 : identifier
                      ;


//Expression in WHERE clause

expression            :	expr
                      |	LPAREN expression RPAREN
                      ;

expr				          :	LPAREN expr RPAREN
                      |	expr OR expr
                      |	expr XOR expr
                      | expr AND expr
                      | BIT_NOT expr
                      | boolean_primary
                      ;

boolean_primary	      :	boolean_primary comparison_operator predicate
                      |	predicate
                      ;

comparison_operator	  : EQ | GTE | GT | LTE | LT | BIT_NOT_EQ
                      ;

predicate			        :	bit_expr (NOT)? BETWEEN bit_expr AND predicate
                      | bit_expr
                      ;

bit_expr			        :	bit_expr		BITOR		bit_expr
                      |	bit_expr 		BITAND		bit_expr
                      | bit_expr 		PLUS 		bit_expr
                      | bit_expr 		MINUS 		bit_expr
                      | bit_expr 		ASTERISK 		bit_expr
                      | bit_expr 		DIV	 		bit_expr
                      | bit_expr 		MOD 			bit_expr
                      | bit_expr 		POWER_OP 		bit_expr
                      | simple_expr
                      ;

simple_expr		        :	literal
                      | identifier
                      ;

literal			          :	INTEGER_NUM
                      |	REAL_NUMBER
                      //|	STRING
                      ;

/// Delete Rules

delete_statement	    :	delete_expression
				              ;

delete_expression	    :	DELETE ( LOW_PRIORITY | QUICK | IGNORE )? FROM	 delete_list1
				              ;

delete_list1		      :	table_name
				              |	table_name  ( where_clause | orderby_clause | limit_clause)
				              |	table_name  ( where_clause orderby_clause | where_clause limit_clause | orderby_clause limit_clause)
				              |	table_name  where_clause orderby_clause limit_clause
				              ;

table_name		        :	identifier
				              |	identifier DOT identifier
				              ;


/************************ Begin update Rules ******************************/

update_statement	    :	update_expression
				              ;

update_expression	    :	UPDATE (LOW_PRIORITY | IGNORE)? table_references  update_list1
				              ;

update_list1		      :	set_clause
				              |	set_clause  ( where_clause | orderby_clause | limit_clause)
				              |	set_clause  ( where_clause orderby_clause | where_clause limit_clause | orderby_clause limit_clause )
				              |	set_clause  where_clause orderby_clause limit_clause
				              ;

set_clause		        :	SET assignment_list (COMMA assignment_list)*
				              ;

assignment_list 	    :	col_name EQ expr
				              ;

col_name			        :	identifier
				              ;

/************************ End update Rules ********************************/



/************************ Begin Insert Rules *****************************/

insert_statement	    :	insert_expression
				              ;

insert_expression	    :	INSERT ( LOW_PRIORITY | DELAYED | HIGH_PRIORITY )? (INTO)? insert_list1
				              ;

insert_list1		      :	table_name  value_list
				              |	table_name LPAREN column_name_list RPAREN value_list
				              ;

column_name_list	    :	identifier ( COMMA identifier)*
				              ;

value_list		        :	(VALUES | VALUE ) value_list1
				              ;

value_list1		        :	value_list_A (COMMA value_list_A)*
				              ;

value_list_A		      :	LPAREN column_list_B (COMMA column_list_B)* RPAREN
				              ;

column_list_B		      :	INTEGER_NUM
				              |	REAL_NUMBER
				              //|	STRING
				              ;

/************************ End Insert Rules *******************************/





table_references      : table_reference (COMMA table_reference )*
                      ;

table_reference       : table_factor
                      | join_table
                      ;

table_factor		      :	table_name (identifier | alias)?
				              |	table_subquery (identifier | alias )
				              |	LPAREN table_references RPAREN
				              ;

table_subquery		    :	LPAREN select_statement RPAREN
				              ;

join_table		        :	table_factor  ( INNER | CROSS | STRAIGHT_JOIN )? join_table_factor
				              |	table_factor  STRAIGHT_JOIN table_factor ON conditional_expr
				              |	table_factor  (LEFT | RIGHT | LEFT OUTER | RIGHT OUTER) JOIN table_factor join_condition
				              |	table_factor  NATURAL JOIN table_factor
				              |	table_factor  NATURAL (LEFT | RIGHT | LEFT OUTER | RIGHT OUTER) JOIN table_factor
				              ;

join_table_factor	    :	JOIN table_factor (join_condition)?
				              ;


join_condition		    :	ON conditional_expr
				              |	USING LPAREN column_name_list RPAREN
				              ;

conditional_expr	    :	expression
				              ;
