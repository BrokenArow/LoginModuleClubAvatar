package com.clubavatar.auth.login.model;

import lombok.*;
import org.springframework.stereotype.Controller;

@Data
@Getter
@Setter
@Controller
@NoArgsConstructor
@AllArgsConstructor
public class Products {

    private int productId;
    private String productName;
    private String productDescription;
    private int productPrice;
    private String productCategory;
    private String productBrand;

}
