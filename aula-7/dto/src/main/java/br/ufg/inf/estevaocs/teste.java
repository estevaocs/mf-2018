package br.ufg.inf.estevaocs;

import br.ufg.inf.estevaocs.dto.EnderecoDto;

public class teste {
    public static void main(String[] args) {
        System.out.println(EnderecoDto.class.getName().replace(EnderecoDto.class.getPackageName()+".", ""));
        System.out.println(EnderecoDto.class.getName());
        System.out.println(EnderecoDto.class.getPackageName());
    }
}
