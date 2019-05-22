package ch.tommyboyfinances.finances;

import lombok.Data;

@Data
public class Overview {
    private final long id;
    private final String name;

    public Overview(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
