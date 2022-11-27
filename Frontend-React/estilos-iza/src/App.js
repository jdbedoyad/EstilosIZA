import Header from "./Components/Header/Header";
import Footer from "./Components/Footer/Footer";
import Home from "./Components/Pages/Home/Home";
import FormReserva from "../src/Components/Pages/Form/FormReserva"
import { Routes, Route } from "react-router-dom";


function App() {
  return (
    <div className="App">
      <Header/>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="reserva" element={<FormReserva />} />
      </Routes>

     {/* <Footer/> */} 
    </div>
  );
}

export default App;
