package com.wilfred.customer.payloads;

import lombok.Builder;
import lombok.Data;


public record CustomerRequest(String firstName, String lastName, String email) {
}
