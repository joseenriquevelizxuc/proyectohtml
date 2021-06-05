package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]
WEB=[a-zA-Z_/\/&\.]+
D=[0-9]+
espacio=[ |\t|\r|\n]+
CORREO1=[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+
PAGINAWEB=([www]+"\."{WEB}+)




%{
   public String lexeme;
%}
%%

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}

"INI_HTML" {lexeme=yytext(); return htmlinicio;}
"FIN_HTML" {lexeme=yytext(); return htmlfin;}
"ENCABEZADO_INI" {lexeme=yytext(); return encabezadoinicio;}
"ENCABEZADO_FIN" {lexeme=yytext(); return encabezadofin;}
"TIT" {lexeme=yytext(); return titulo;}
"CUERPO_INI" {lexeme=yytext(); return cuerpoinicio;}
"CUERPO_FIN" {lexeme=yytext(); return cuerpofin ;} 
"TABLA_IN BORDE" {lexeme=yytext(); return tablainicio;}
"TABLA_FIN" {lexeme=yytext(); return tablafin;}
"LISTA_IN" {lexeme=yytext(); return listainicio;}
"LISTA_FIN" {lexeme=yytext(); return listafin;}
"IMAGEN_IN" {lexeme=yytext(); return imageninicio;}
"IMAGEN_FIN" {lexeme=yytext(); return imagenfin;}
"FILA" {lexeme=yytext(); return filainicio;}
"FILA_FIN" {lexeme=yytext(); return filafin;}
"ENLACE" {lexeme=yytext(); return enlace;}
"ANCHO" {lexeme=yytext(); return ancho;}
"ALTURA" {lexeme=yytext(); return altura;}
"NEGRITA" {lexeme=yytext(); return negrita;}
"PAGINA UMG" {lexeme=yytext(); return pagina;}
"IMPRIMIR" {lexeme=yytext(); return imprimir;}
"," {lexeme=yytext(); return coma;}
";" {lexeme=yytext(); return punto_coma;}
":" {lexeme=yytext(); return dos_puntos;}
"=" {lexeme=yytext(); return igual;}
"+" {lexeme=yytext(); return suma;}
"-" {lexeme=yytext(); return resta;}
"*" {lexeme=yytext(); return multiplicacion;}
"/" {lexeme=yytext(); return division;}
["\""] {lexeme=yytext(); return comillas;}
["("] {lexeme=yytext(); return parentesis_a;}
[")"] {lexeme=yytext(); return parentesis_c;}
({L}+ | ({L}{5}" "{L}{5})) {lexeme=yytext(); return identificador;}
(({L}{4})|({L}{7}|{L}{4}{L}{7})) {lexeme=yytext(); return lista;}
(({L})|({L}" "{L})) {lexeme=yytext(); return nombre;}
({L}{7}) {lexeme=yytext(); return apellido;}
{CORREO1} {lexeme=yytext(); return correo;}
{PAGINAWEB} {lexeme=yytext(); return web;}
{D} {lexeme=yytext(); return numero;}
{D}+"."{D}+ {lexeme=yytext(); return numero_real;}
  . {return ERROR;}
