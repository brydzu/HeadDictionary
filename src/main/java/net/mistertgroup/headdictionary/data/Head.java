package net.mistertgroup.headdictionary.data;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author misterT2525
 */
@Data
@AllArgsConstructor
public class Head {

    private String name;
    private String url;
    private String uuid;

    public Head() {
    }
}
