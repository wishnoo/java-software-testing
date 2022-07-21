package com.amigoscode.testing.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.amigocode.testing.utils.PhoneNumberValidator;

public class PhoneNumberValidatorTest {
	
	private PhoneNumberValidator underTest;
	
	@BeforeEach
	void setUp() {
		underTest = new PhoneNumberValidator();
	}
	
	@Test
	@DisplayName("Should fail when length is bigger than 13")
	void itShouldValidatePhoneNumberWhenIncorrectAndHasLengthBigggerThan13() {
		// Given
		String phoneNumber = "+44700000000008";
		
		// When
		boolean isValid = underTest.test(phoneNumber);
		
		// Then
		assertThat(isValid).isFalse();
		
	}
	
	@Test
	@DisplayName("Should fail when does not start with +")
	void itShouldValidatePhoneNumberWhenDoesNotStartWithPlusSign() {
		// Given
		String phoneNumber = "4470000000008";
		
		// When
		boolean isValid = underTest.test(phoneNumber);
		
		// Then
		assertThat(isValid).isFalse();
		
	}
}
