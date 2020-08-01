package com.geektrust.service;

import com.geektrust.util.StringUtil;
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
    private KingdomManager kingdomManager;

    @InjectMocks
    private AllianceImpl mockAlliance;

    @Test
    void checkAlliance() {
        Mockito.when(kingdomManager.checkAlliance("AIR", "ROZO")).thenReturn(true);
        assertTrue(mockAlliance.checkAlliance("AIR", "ROZO"));
    }
}