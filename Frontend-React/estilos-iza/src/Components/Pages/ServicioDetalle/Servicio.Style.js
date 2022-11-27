import styled from "styled-components";

export const Container = styled.div`
    display: flex;
    margin-top: 50px;
    height: 100%; 
    justify-content: space-around;
    flex-wrap: wrap; 


    @media (max-width: 670px) {
        margin: 0px;
        width: 100%;
    }

    @media (max-width: 900px) {
        margin: 0px;
        width: 100%;
    }

`

export const Card = styled.div`
    display: flex;
    margin: 25px; 
    flex-direction: column;
    box-shadow: 29px 22px 50px -1px rgba(0,0,0,0.38);
    border-radius: 1rem;
    background-color: #fff;
    text-align: justify;
    overflow: hidden;
    width: 20rem;
    height: 15rem; 
    color: #17293A;
    

    :hover{
        background-color:  red;
        transition: background 1.4s 0s ease;
        color: white;
        cursor: pointer;
       }

`

export const Imagen = styled.img`
    width: 100%;
    height: 100%; 

`