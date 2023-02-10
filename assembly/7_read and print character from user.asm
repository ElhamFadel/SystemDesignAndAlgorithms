.MODEL SMALL
.STACK 100H 


.DATA
STR1 DB " enter initial of your first name: $"

.CODE
 MAIN PROC 
          
   mov dx,@data
   mov ds,dx
          
   mov ah,9h
   mov dx, offset str1
   int 21h
        
   mov ah,8
   int 21h
   
   mov ah,2
   mov dl,al           
   INT 21H   
    
            
   MOV AH,4CH   
   INT 21H
    
    MAIN ENDP
 END MAIN




