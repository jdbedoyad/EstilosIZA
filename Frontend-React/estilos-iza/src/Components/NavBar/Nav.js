import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';

function NavB() {
  return (
<>
      <Navbar bg="dark" variant="dark">
        <Container>
          <Nav className="me-auto">
            <Nav.Link href="#home">Inicio</Nav.Link>
            <Nav.Link href="#features">Servicios</Nav.Link>
            <Nav.Link href="#pricing">Reserva</Nav.Link>
          </Nav>
        </Container>
      </Navbar>
      
    </>
  );
}

export default NavB;