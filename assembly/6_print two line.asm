.MODEL SMALL 
.STACK 100H

.DATA
STR1 DB " your name$"
STR2 DB " MY NAME$" 

.CODE 
MAIN PROC
    MOV DX, @DATA                     
    MOV DS, DX
    
    MOV AH, 9H
    LEA DX, STR1 ; or mov dx,offset str1
    INT 21H     
    
    MOV AH, 2H   
    MOV DL, 0DH   ; CARIGE
    INT 21H 
    MOV DL, 0AH    ; NEW LINE 
    INT 21H
    
    MOV AH, 9H                    
    LEA DX, STR2
    INT 21H
    
    MOV AH, 4CH
    INT 21H
MAIN ENDP
END MAIN