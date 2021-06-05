package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]
WEB=[a-zA-Z_/\/&\.]+
D=[0-9]+
espacio=[ |\t|\r|\n]+
CORREO1=[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+
PAGINAWEB=([www]+"\."{WEB}+)



%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}

"INI_HTML" {return new Symbol(sym.htmlinicio, yychar, yyline, yytext());}
"FIN_HTML" {return new Symbol(sym.htmlfin, yychar, yyline, yytext());}
"ENCABEZADO_INI" {return new Symbol(sym.encabezadoinicio, yychar, yyline, yytext());}
"ENCABEZADO_FIN" {return new Symbol(sym.encabezadofin, yychar, yyline, yytext());}
"TIT" {return new Symbol(sym.titulo, yychar, yyline, yytext());}
"CUERPO_INI" {return new Symbol(sym.cuerpoinicio, yychar, yyline, yytext());}
"CUERPO_FIN" {return new Symbol(sym.cuerpofin, yychar, yyline, yytext());}
"TABLA_IN BORDE" {return new Symbol(sym.tablainicio, yychar, yyline, yytext());}
"TABLA_FIN" {return new Symbol(sym.tablafin, yychar, yyline, yytext());}
"LISTA_IN" {return new Symbol(sym.listainicio, yychar, yyline, yytext());}
"LISTA_FIN" {return new Symbol(sym.listafin, yychar, yyline, yytext());}
"IMAGEN_IN" {return new Symbol(sym.imageninicio, yychar, yyline, yytext());}
"IMAGEN_FIN" {return new Symbol(sym.imagenfin, yychar, yyline, yytext());}
"FILA" {return new Symbol(sym.filainicio, yychar, yyline, yytext());}
"FILA_FIN" {return new Symbol(sym.filafin, yychar, yyline, yytext());}
"ENLACE" {return new Symbol(sym.enlace, yychar, yyline, yytext());}
"ANCHO" {return new Symbol(sym.ancho, yychar, yyline, yytext());}
"ALTURA" {return new Symbol(sym.altura, yychar, yyline, yytext());}
"NEGRITA" {return new Symbol(sym.negrita, yychar, yyline, yytext());}
"PAGINA UMG" {return new Symbol(sym.pagina, yychar, yyline, yytext());}
"IMPRIMIR" {return new Symbol(sym.imprimir, yychar, yyline, yytext());}
"," {return new Symbol(sym.coma, yychar, yyline, yytext());}
";" {return new Symbol(sym.punto_coma, yychar, yyline, yytext());}
":" {return new Symbol(sym.dos_puntos, yychar, yyline, yytext());}
"=" {return new Symbol(sym.igual, yychar, yyline, yytext());}
"+" {return new Symbol(sym.suma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.resta, yychar, yyline, yytext());}
"*" {return new Symbol(sym.multiplicacion, yychar, yyline, yytext());}
"/" {return new Symbol(sym.division, yychar, yyline, yytext());}
["\""] {return new Symbol(sym.comillas, yychar, yyline, yytext());}
["("] {return new Symbol(sym.parentesis_a, yychar, yyline, yytext());}
[")"] {return new Symbol(sym.parentesis_c, yychar, yyline, yytext());}
({L}+ | ({L}{5}" "{L}{5})) {return new Symbol(sym.identificador, yychar, yyline, yytext());}
(({L}{4})|({L}{7}|{L}{4}{L}{7})) {return new Symbol(sym.lista, yychar, yyline, yytext());}
(({L}{5})|({L}{5}" "{L}{5})) {return new Symbol(sym.nombre, yychar, yyline, yytext());}
({L}{7}) {return new Symbol(sym.apellido, yychar, yyline, yytext());}
{CORREO1} {return new Symbol(sym.correo, yychar, yyline, yytext());}
{PAGINAWEB} {return new Symbol(sym.web, yychar, yyline, yytext());}
{D} {return new Symbol(sym.numero, yychar, yyline, yytext());}
{D}+"."{D}+ {return new Symbol(sym.numero_real, yychar, yyline, yytext());}
  . {return new Symbol(sym.EOF, yychar, yyline, yytext());}
