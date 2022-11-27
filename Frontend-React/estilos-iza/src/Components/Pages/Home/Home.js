import React from 'react';
import ServicioDetalle from '../ServicioDetalle/ServicioDetalle';
import CarouselFade from '../../Carrusel/CarouselFade';

const Home = () => {
  return (
    <div>
      <CarouselFade></CarouselFade>
       <ServicioDetalle/>
    </div>
  )
}

export default Home