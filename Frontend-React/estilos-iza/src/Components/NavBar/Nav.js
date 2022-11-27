import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { Link } from 'react-router-dom';

function NavB() {
  return (
<>
      <Navbar bg="dark" variant="dark">
        <Container>
          <Nav className="me-auto">
            <Link to={'/'}> Inicio &nbsp; &nbsp; &nbsp;</Link>
            <Link to={'/reserva'}> Reserva </Link>
          </Nav>
        </Container>
      </Navbar>
      
    </>
  );
}

export default NavB;