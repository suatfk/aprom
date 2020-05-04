package chapter2.conversationUnit;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ConversationRatio {

    private BigDecimal ratio;

    private Unit from;

    private Unit to;

    public BigDecimal apply(BigDecimal amount) {
        return amount.multiply(ratio);
    }
}
