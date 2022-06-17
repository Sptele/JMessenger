package org.sptele.JMessenger.Entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Message {
    @Setter
    private String numberToSendTo; // Something like "+11234567890"

    @Getter
    @Setter
    private String message;

    public String getNumberToSendTo() {
        // Attaches a "+" if non-existent and also removes any extra characters commonly used to format phone numbers
        return (numberToSendTo.charAt(0) != '+' ? "+" : "") + numberToSendTo
                .trim()
                .replaceAll("-", "")
                .replaceAll(" ", "")
                .replaceAll("_", "");
    }
}
