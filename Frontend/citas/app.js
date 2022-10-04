const $reservationBody = document.getElementById("reservationBody"),
  $confirmationForm = document.getElementById("confirmationForm"),
  $confirmationBtnAcept = document.getElementById("confirmationBtnAcept"),
  $confirmationInput = document.getElementById("confirmationInput");
let button,
  reservationId,
  $reservationElement,
  flagEdit = false;
const $services = document.getElementById("services"),
  $price = document.getElementById("price");
const $inputs = document.querySelectorAll(".input"),
  $form = document.getElementById("form");
let reservations = [];

const reservationHtml = ({ name, service, price, date, hour, id }) => {
  const htmlData = `
 <div class="box" id="box" data-id="${id}">
     <p class="text"> ${name} </p>
     <p class="text"> ${service} </p>
     <p class="text"> ${price} </p>
     <p class="text"> ${date}</p>
     <p class="text"> ${hour} </p>
     <div class="buttons">
      <button class="button button__cancel" id="cancelReservation">Cancelar cita</button>
      <button class="button" id="editReservation">Modificar cita</button>
     </div>
   </div>`;
  const $div = document.createElement("div");
  $div.innerHTML = htmlData;
  $reservationBody.appendChild($div.firstElementChild);
};

const loadHtml = () => {
  reservations.forEach((element) => {
    reservationHtml(element);
  });
};

const saveLocalStorage = () => {
  localStorage.setItem("reservations", JSON.stringify(reservations));
};

const loadLocalStorage = () => {
  reservations = localStorage.getItem("reservations")
    ? JSON.parse(localStorage.getItem("reservations"))
    : [];
};
loadLocalStorage();
loadHtml();

const reservationList = (reservation) => {
  const valueExists = reservations.find(
    (element) => element.id == reservation.id
  );
  valueExists.name = reservation.name;
  valueExists.service = reservation.service;
  valueExists.price = reservation.price;
  valueExists.pasword = reservation.pasword;
  valueExists.date = reservation.date;
  valueExists.hour = reservation.hour;
  saveLocalStorage();
};
const newReservation = (reservation) => {
  reservations.push(reservation);
  saveLocalStorage();
};
const cancelReservation = (id) => {
  reservations = reservations.filter((reservation) => reservation.id != id);
  saveLocalStorage();
};
const editReservation = (id) => {
  const currentReservation = reservations.find((element) => element.id == id);
  editForm(currentReservation);
};
const confirmation = (id, pasword) => {
  const currentReservation = reservations.find((element) => element.id == id);
  return currentReservation.pasword == pasword ? true : false;
};

const createReservation = (reservation) => {
  newReservation(reservation);
  reservationHtml(reservation);
  popUp("form");
  $form.reset();
};

const reservation = () => {
  const fecha = new Date();
  const reservation = {
    name: $inputs[0].value,
    service: $inputs[1].value,
    price: $inputs[2].value,
    pasword: $inputs[3].value,
    date: $inputs[4].value,
    hour: $inputs[5].value,
    id: fecha.getTime(),
  };

  reservation.name == "" || reservation.pasword == ""
    ? alert("Por favor diligencie todos los campos")
    : createReservation(reservation);
  // return reservation;
};

const createUpdateReservation = (reservation) => {
  reservationList(reservation);
  reservationUpdateHtml(reservation);
  popUp("form");
  $form.reset();
};

const updateReservation = () => {
  const oldReservation = setData();
  const reservation = {
    name: $inputs[0].value,
    service: $inputs[1].value,
    price: $inputs[2].value,
    pasword: $inputs[3].value,
    date: $inputs[4].value,
    hour: $inputs[5].value,
    id: oldReservation.reservationId,
  };
  reservation.name == "" || reservation.pasword == ""
    ? alert("Por favor diligencie todos los campos")
    : createUpdateReservation(reservation, oldReservation);
};

const editForm = (data) => {
  $inputs[0].value = data.name;
  $inputs[1].value = data.service;
  $inputs[2].value = data.price;
  $inputs[3].value = data.pasword;
  $inputs[4].value = data.date;
  $inputs[5].value = data.hour;
};

const formHtml = () => {
  const prices = {
    "Manicure Sencillo": "12.000",
    Pedicure: "15.000",
    Acrilicas: "70.000",
    Postizas: "30.000",
    Cepillado: "15.000",
    Tintura: "50.000",
    Corte: "12.000",
    Trenzas: "10.000",
    "Limpieza Facial": "35.000",
    "Depilacion Cejas": "7.000",
    "Depilacion CejasBozo": "10.000",
    "Pigmentación Cejas": "15.000",
    "Pigmentación Barba": "5.000",
  };
  $price.value = prices[$services.value];
};

const editOrCancel = () => {
  const result = confirmation(reservationId, $confirmationInput.value);
  if (result == false) {
    alert("contraseña incorrecta");
  } else if (result == true && button == "cancel") {
    cancelReservation(reservationId);
    $reservationBody.removeChild($reservationElement);
    popUp("confirmation");
  } else if (result == true && button == "edit") {
    flagEdit = true;
    popUp("confirmation");
    editReservation(reservationId);
    popUp("form");
  }
  $confirmationForm.reset();
};

const getReservation = (e) => {
  const $nameElement = e.target.localName;
  if ($nameElement.includes("button")) {
    $reservationElement = e.target.parentElement.parentElement;
    reservationId = $reservationElement.getAttribute("data-id");
    if (e.target.id == "cancelReservation") {
      button = "cancel";
    } else if (e.target.id == "editReservation") {
      button = "edit";
    }
    popUp("confirmation");
  }
};

const setData = () => ({ reservationId, $reservationElement });

const resetFlagEdit = () => {
  flagEdit = false;
};

const checkEdit = () => flagEdit;

const reservationUpdateHtml = ({ name, service, price, date, hour }) => {
  $reservationElement.children[0].innerHTML = name;
  $reservationElement.children[1].innerHTML = service;
  $reservationElement.children[2].innerHTML = price;
  $reservationElement.children[3].innerHTML = date;
  $reservationElement.children[4].innerHTML = hour;
};
const popUp = (element) => {
  document.getElementById("containerForm").classList.toggle("show");
  element == "form"
    ? document.getElementById(element).classList.toggle("down__form")
    : document.getElementById(element).classList.toggle("down__confirmation");
};

document.addEventListener("click", (e) => {
  const currentElement = e.target.id;
  if (
    currentElement == "formBtnCancel" ||
    currentElement == "formBtnSave" ||
    currentElement == "confirmationBtnCancel"
  ) {
    e.preventDefault();
  }
  if (currentElement == "btnShow" || currentElement == "formBtnCancel") {
    popUp("form");
    document.getElementById("form").reset();
  }
  if (currentElement == "services") {
    formHtml();
  }
  if (currentElement == "formBtnSave" && checkEdit() == false) {
    reservation();
  }
  if (currentElement == "formBtnSave" && checkEdit() == true) {
    updateReservation();
    resetFlagEdit();
  }
  if (currentElement == "confirmationBtnCancel") {
    popUp("confirmation");
  }
});

$confirmationBtnAcept.addEventListener("click", (e) => {
  e.preventDefault();
  editOrCancel();
});
$reservationBody.addEventListener("click", (e) => {
  getReservation(e);
});
