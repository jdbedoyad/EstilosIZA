import Carousel from 'react-bootstrap/Carousel';
import  barba from '../../img/barba.jpeg';
import cabello from '../../img/cabello.jpg';
import  facial from '../../img/facial.jpeg';


function UncontrolledExample() {
  return (
    <Carousel>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src={barba}
          alt="First slide"
        />
        <Carousel.Caption>
          <h3>Barba</h3>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src={cabello}
          alt="Second slide"
        />

        <Carousel.Caption>
          <h3>Corte cabello</h3>
          <p>Los mejores cortes de cabello</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src={facial}
          alt="Third slide"
        />

        <Carousel.Caption>
          <h3>Facial</h3>
          <p>
            De la mano de expertos
          </p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  );
}

export default UncontrolledExample;