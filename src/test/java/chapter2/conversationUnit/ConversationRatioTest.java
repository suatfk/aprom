package chapter2.conversationUnit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversationRatioTest {

    @Test
    public void conversationRatioTest() {
        ConversationRatio cmToM_cr = new ConversationRatio();
        cmToM_cr.setFrom(Unit.CM);
        cmToM_cr.setTo(Unit.M);
        cmToM_cr.setRatio(BigDecimal.valueOf(0.01));

        ConversationRatio mToCM_cr = new ConversationRatio();
        mToCM_cr.setFrom(Unit.M);
        mToCM_cr.setTo(Unit.CM);
        mToCM_cr.setRatio(BigDecimal.valueOf(100));

        Unit.M.setConversationRatios(Arrays.asList(mToCM_cr, cmToM_cr));
        Unit.CM.setConversationRatios(Arrays.asList(mToCM_cr, cmToM_cr));

        Quantity cmQuantity = Quantity.from(BigDecimal.valueOf(800), Unit.CM);

        Quantity meterQuantity = cmQuantity.convertTo(Unit.M);

        assertEquals(BigDecimal.valueOf(8).setScale(2), meterQuantity.getAmount());
    }
}