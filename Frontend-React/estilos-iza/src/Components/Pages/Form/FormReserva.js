import React from "react";
import Select from 'react-select'
import { ContainerForm, ContainerAll, Input, Button } from "./Form.Style";
import Swal from "sweetalert2"



const FormReserva = () => {

    const options = [
        { value: 'Barba', label: 'Barba' },
        { value: 'Cabello', label: 'Cabello' },
        { value: 'Uñas', label: 'Uñas' },
        { value: 'Facial', label: 'Facial' }
      ]

      const onSubmit= () => {
        Swal.fire({
            title: 'Reserva realizada con éxito',
            text:'¡Te esperamos!',
            icon:'success'
        })
      }

  return (
    <ContainerAll>
      <ContainerForm>
        <label>
          Nombre:
          <Input type="text" name="name" />
        </label>

        <label>
          Apellido:
          <Input type="text" name="apellido" />
        </label>

        <label>
          celular:
          <Input type="number" name="celular" />
        </label>

        <label>
          correo:
          <Input type="email" name="correo" />
        </label>

        <label>
          Fecha:
          <Input type="date" name="Fecha" />
        </label>

        
        <label>
          Hora:
          <Input type="time" name="hora" />
        </label>
        
        <label>
         Servicio: 
         <Select options={options} />
        </label>
        
        <Button type="submit" onClick={onSubmit}>
            Enviar
        </Button>
      </ContainerForm>
    </ContainerAll>
  );
};

export default FormReserva;
