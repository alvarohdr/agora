package es.iespuertodelacruz.ar.socialai.infrastructure.adapter.primary.jpa.dto;

public class UserDTO {

    private Integer id;
    private String name;

    public UserDTO() {
    }

    public UserDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
