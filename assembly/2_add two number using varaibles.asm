title add2num
.stack
.data
num1 dw 125
num2 dw 45
num3 dw ?

.code
main proc
    mov ax,@data
    mov ds,ax
    mov ax,num1
    add ax,num2
    mov num3,ax
    mov ax,4c00h
    int 21h
    
main endp
end main