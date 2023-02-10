.model small

.data
 
Fname db "First Name",0Ah,"$"
Mname db  "Middle Name",0Ah,"$"
Lname db  "Last Name",0Ah,"$"


.code

mov ax, @data
mov ds,ax

mov ah , 9
mov dx , offset Fname
int 21h

mov dx , offset Mname
int 21h

mov dx , offset Lname
int 21h


mov ah,4ch
int 21h

