package br.com.computacao.topicos;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}")
	public String sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

		try {
			isNumeric(numberOne); isNumeric(numberTwo);
			Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
			
			return sum.toString();
			
		}catch(Exception e){
			return "Insira um número";
		}

	}	

	private boolean isNumeric(String strNumber) {

		if (strNumber == null)
			return false;
		String number = strNumber.replace(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");

	}

	private Double convertToDouble(String number) {

		/*if (strNumber == null)
			return 0D;
		String number = strNumber.replaceAll(",", ".");*/
		//if (isNumeric(number))
			return Double.parseDouble(number);
	}

}
