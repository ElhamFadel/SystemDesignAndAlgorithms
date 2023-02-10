TITLE add two number

.MODEL small    

.STACK 100h 

.data    

.code

main PROC 
    
mov  ah ,1
int 21h    

mov ah ,2
mov dl ,al
sub dl,1
int 21h   

.EXIT  

main ENDP 

END main
