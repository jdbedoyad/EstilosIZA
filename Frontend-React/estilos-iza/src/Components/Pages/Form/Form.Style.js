import styled from "styled-components";

const Orange = "#FCA311";
const PetrolBlue = "#14213D";

export const ContainerForm = styled.div`
  height: 500px;
  display: flex;
  flex-direction: column;
  align-items: center;

  box-shadow: 0 0 1rem 0 rgba(0, 0, 0, 0.2);
  border-radius: 5px;
  background-color: rgba(255, 255, 255, 0.15);
  padding: 30px;

  backdrop-filter: blur(3px);

  @media (min-width: 670px) {
    width: 60%;
    z-index: 0;
    width: 90%;
  }
`;

export const ContainerAll = styled.div`
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  align-items: center;
  width: 100%;
  height: 100%;
  overflow: hidden;
  background-size: 100%;
  gap: 20px;
  flex-wrap: wrap;
`;

export const Input = styled.input`
  width: 97%;
  height: 30px;
  border: none;
  border-bottom: 1px solid #17293a;
  background-color: rgba(255, 255, 255, 0);
  backdrop-filter: blur(0px);
`;

export const Button = styled.button`
    margin: 15px;
    cursor: pointer;
    padding: 0.7rem 2.3rem;
    border-radius: 0.2rem;
    background-color: #fff;
    border: 2px solid ${PetrolBlue};
    color: ${Orange};
    font-size: 1rem;
    font-weight: 600;
    width: 20%;
    user-select: none;
     background-color: rgba(255, 255, 255, .0);
    backdrop-filter: blur(0px);
    

    :hover{
        border: 2px solid ${Orange};
        color: ${PetrolBlue};
        transition: all 0s 0s ease;
    }

`
