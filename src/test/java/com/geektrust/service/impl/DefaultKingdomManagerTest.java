package com.geektrust.service.impl;

import com.geektrust.crypt.Decryptor;
import com.geektrust.model.Kingdom;
import com.geektrust.factory.KingdomFactory;
import com.geektrust.service.impl.DefaultKingdomManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class DefaultKingdomManagerTest {

    @Mock
    private KingdomFactory kingdomFactory;

    @Mock
    private Decryptor decryptor;

    @Mock
    private Kingdom kingdom;

    @InjectMocks
    private DefaultKingdomManager defaultKingdomManager;

    @Test
    void checkAlliance() {
        Mockito.lenient().when(kingdomFactory.getKingdom("LAND")).thenReturn(new Kingdom("LAND", "PANDA"));
        Mockito.lenient().when(kingdom.getEmblem()).thenReturn("PANDA");
        Mockito.lenient().when(kingdom.getCipherKey()).thenReturn("5");
        Mockito.when(decryptor.decrypt("5", "FAIJWJSOOFAMAU")).thenReturn("AVDERENJJAVHVP");
        assertTrue(defaultKingdomManager.checkAlliance("LAND", "FAIJWJSOOFAMAU"));
    }

    @Test
    void checkAllianceWithNullAsArgs() {
        assertThrows(NullPointerException.class, () -> {
            defaultKingdomManager.checkAlliance(null, null);
        });
    }
}