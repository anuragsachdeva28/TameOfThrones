package com.geektrust.service;

import com.geektrust.Util.Util;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AllianceImplTest {
    @Mock
    Util mockUtil = new Util();
    @InjectMocks
    Alliance mockAlliance = new AllianceImpl();
    @Test
    void checkAlliance() {
        Mockito.when(mockUtil.encryptEmblem("PANDA", 5)).thenReturn("UFSIF");
        Mockito.when(mockUtil.validateMessage("UFSIF", "FAIJWJSOOFAMAU")).thenReturn(true);
        boolean actual = mockAlliance.checkAlliance("LAND", "FAIJWJSOOFAMAU");

        assertTrue(actual);
    }
}