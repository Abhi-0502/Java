package com.xworkz.details;

import com.xworkz.details.Street.Street;
import com.xworkz.details.area.Area;

public class PatientRunner {
import com.xworkz.details.address.Address;
import Area;
import com.xworkz.details.city.City;
import com.xworkz.details.country.Country;
import com.xworkz.details.pateint.Patient;
import com.xworkz.details.state.State;
import com.xworkz.details.street.Street;



        public static void main(String[] args) {

            Street street=new Street();
            street.streetNo=12;
            street.streetName="abc";

            Area area=new Area(street);
            area.pAreaName="Vidyanagar";

            City city=new City(area);
            city.pCity="Dvg";

            State state=new State(city);
            state.pState="Karnataka";

            Country country=new Country(state);
            country.pCountry="India";

            Address address=new Address(country);
            address.pId=1;
            address.pName="ram";

            Patient patient=new Patient(address);

            patient.getDetails();





}
    }