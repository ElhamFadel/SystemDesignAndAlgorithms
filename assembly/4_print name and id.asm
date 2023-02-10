title  print name and id
.stack
.data
msg1 db 'iugaza',0ah,0dh,'$'
msg2 db '?2011????$' 
.code
main proc
mov ax,@data 
mov ds,ax

mov ah,9
mov dx,offset msg1
int 21h

mov ah,9
mov dx,offset msg2
int 21h
 
 
mov ah,4ch
int 21h    
main endp
end main