package com.emst.Fudocs.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.emst.Fudocs.dto.ErrorResponse;
import com.emst.Fudocs.exception.BusinessBusiness;

@ControllerAdvice
@ResponseBody
public class CustomExceptionHandling {

	private Logger log = LoggerFactory.getLogger(CustomExceptionHandling.class);

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ErrorResponse handleCommonException(final Exception exception) {

		log.info("inside handleCommonException CustomExceptionHandler=============> handleCommonException()");
		log.info(
				"inside handleCommonException CustomExceptionHandler=============> handleCommonException()===>Exception is "
						+ exception.getMessage());
		ErrorResponse error = new ErrorResponse();
		error.setErrorMessage(exception.getMessage());
		error.setErrorCode("ERRORCODE_101");
		error.setContent("");

		return error;

	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public @ResponseBody ErrorResponse handleValidationExceptions(MethodArgumentNotValidException exception) {
		log.info("inside handleCommonException CustomExceptionHandler ========> handleValidationExceptions()");
		log.info(
				"inside handleCommonException CustomExceptionHandler=============> handleValidationExceptions()===>Exception is "
						+ exception.getMessage());
		ErrorResponse error = new ErrorResponse();
		error.setErrorMessage("All inputs are mandatory");
		error.setContent("");
		error.setErrorCode("SJA_ERRORCODE_101");
		return error;
	}

	@ExceptionHandler(BusinessBusiness.class)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody ErrorResponse handleBusinessException(final BusinessBusiness exception) {
		log.info("inside handleBusinessException CustomExceptionHandler==========>handleBusinessException()");
		log.info(
				"inside handleCommonException CustomExceptionHandler=============> handleBusinessException()===>Exception is "
						+ exception.getMessage());
		ErrorResponse error = new ErrorResponse();
		error.setErrorMessage(exception.getMessage());
		error.setContent("");
		error.setErrorCode("SJA_ERRORCODE_101");
		return error;
	}

}
