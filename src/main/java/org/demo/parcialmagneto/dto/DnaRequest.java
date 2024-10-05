package org.demo.parcialmagneto.dto;

import lombok.Getter;
import lombok.Setter;
import org.demo.parcialmagneto.validators.ValidDna;

@Getter
@Setter
public class DnaRequest {
    @ValidDna
    private String[] dna;
}
