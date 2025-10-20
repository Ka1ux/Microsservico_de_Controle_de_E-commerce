package br.com.Ka1ux;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Box(long amount, LocalDate validate, BigDecimal price) {
}
