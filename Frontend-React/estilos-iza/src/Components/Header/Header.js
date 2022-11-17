import React from 'react'
import { ContainerAll, ContainerLogo, Logo, ContainerNav } from './Header.Styles'
import logo from '../../img/logo.jpeg'
import NavB from '../NavBar/Nav'

const Header = () => {
  return (
    <ContainerAll>
       <ContainerLogo>
          <Logo src={logo} alt='logo' /> 
       </ContainerLogo>
       <ContainerNav>
        <NavB> </NavB>
       </ContainerNav>
    </ContainerAll>
  )
}

export default Header