package com.amigoscode.testing.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PhoneNumberValidatorTest {
	
	private PhoneNumberValidator underTest;
	
	@BeforeEach
	void setUp() {
		underTest = new PhoneNumberValidator();
	}
	
	@ParameterizedTest
	@CsvSource({
		"+447000000000,true",
		"+44700000000008,false",
		"4470000000008,false"
	})
	void itShouldValidatePhoneNumber(String phoneNumber, boolean expected) {
		// Given
//		String phoneNumber = "+447000000000";
		
		// When
		boolean isValid = underTest.test(phoneNumber);
		
		// Then
		assertThat(isValid).isEqualTo(expected);
		
	}
}
