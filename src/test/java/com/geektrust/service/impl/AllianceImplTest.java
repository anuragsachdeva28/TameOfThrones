package com.geektrust.service.impl;

import com.geektrust.service.KingdomManager;
import com.geektrust.service.impl.AllianceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void addAlliance() {
        assertThrows(NullPointerException.class, () -> {
            mockAlliance.addAlliance(null, null);
        });
    }
}