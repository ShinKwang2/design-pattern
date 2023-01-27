package com.lightshoes.designpattern;

@Entity
public class FileEntity {

    @Id
            ("file_id")
    Long id;

    String originName;

    String name;
}
