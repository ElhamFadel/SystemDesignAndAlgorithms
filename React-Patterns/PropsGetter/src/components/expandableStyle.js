import styled from "styled-components";

export const ImageContainer = styled.div`
 width:200px;
 
 img{
    width:100%
 }
`;

export const Body = styled.div`
 padding: 0 5px;
 position:relative;
 margin-top:-140px;
 padding:10px 15px;
 visibility:hidden;
 opacity:0;
 transition: 0.3s ease-in-out;
 
`;

export const Content = styled.div`
 position:relative;
 display:flex;
 justify-content:center;
 align-items:center;
 flex-wrap:wrap;
 padding:30px;
 width: 203px;
 background: #9e9e9e;
 transition:0.5s ease-in-out;
 height: 150px;
 &:hover{
    height:320px;
 }
 &:hover ${Body}{
    visibility:visible;
    opacity:1;
    margin-top:-10px;
    transition-delay:0.3s ;
 }
`;

export const Icon = styled.span``;