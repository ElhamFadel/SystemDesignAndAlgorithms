.model small

.data
 
str1 db "aaaa",0Ah,0Dh,"$"
str2 db  "aaa",0Ah,0Dh,"$"
str3 db  "aa",0Ah,0Dh,"$"
str4 db  "a",0Ah,0Dh,"$"

.code

mov ax, @data
mov ds,ax

mov ah , 9
mov dx , offset str1
int 21h

mov dx , offset str2
int 21h

mov dx , offset str3
int 21h

mov dx , offset str4
int 21h

mov ah,4ch
int 21h

