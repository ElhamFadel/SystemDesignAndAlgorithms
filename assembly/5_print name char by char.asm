.MODEL SMALL 
.STACK 100H

.DATA

.CODE 
MAIN PROC
    

     
    MOV AH, 2H
    
	MOV DL, 'M'
    INT 21H
        
    MOV DL, 0AH     ; NEW LINE
    INT 21H 
    
    MOV DL, 'O'
    INT 21H
        
    MOV DL, 0AH     ; NEW LINE
    INT 21H 
    
    MOV DL, 'H'
    INT 21H
         
    MOV DL, 0AH     ; NEW LINE
    INT 21H 
    
    MOV DL, 'A'
    INT 21H    
         
    MOV DL, 0AH     ; NEW LINE
    INT 21H 
    
    MOV DL, 'M' 
    INT 21H
        
    MOV DL, 0AH     ; NEW LINE
    INT 21H 
    
    MOV DL, 'E' 
    INT 21H
        
    MOV DL, 0AH     ; NEW LINE
    INT 21H 
    
    MOV DL, 'D' 
    INT 21H
         	
    MOV DL, 0AH     ; NEW LINE
    INT 21H 
    
	 ;MOV DL, 0DH   ; carriage return
     ;INT 21H
    
    MOV AH, 4CH
    INT 21H
    
MAIN ENDP
END MAIN