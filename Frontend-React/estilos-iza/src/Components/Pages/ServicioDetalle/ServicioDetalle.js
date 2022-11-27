import React from 'react';
import { Card, Imagen, Container } from './Servicio.Style';
import cabello from '../../../img/cabello.jpg';
import cabello2 from '../../../img/cabello2.jpeg';
import  imagen1 from '../../../img/imagen1.jpg';
import  facial from '../../../img/facial.jpeg';
import  barba from '../../../img/barba.jpeg';


const ServicioDetalle = () => {
  return (
    <div>
        <Container>
        <Card> 
            <Imagen src={cabello} alt="Cabello" />
        </Card>
        <Card> 
            <Imagen src={cabello2} alt="Cabello" />
        </Card>
        <Card> 
            <Imagen src={imagen1} alt="Cabello" />
        </Card>
        <Card> 
            <Imagen src={facial} alt="Cabello" />
        </Card>
        <Card> 
            <Imagen src={barba} alt="Cabello" />
        </Card>
        </Container>
        
    </div>
  )
}

export default ServicioDetalle