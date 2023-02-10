TITLE add two number

.MODEL small    

.STACK 100h 

.data    

.code

main PROC 
    
mov ax,10
mov dx,15 

add ax,dx    

.EXIT  

main ENDP 

END main