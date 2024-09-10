package com.clubavatar.auth.login.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Controller;

@Data
@Getter
@Setter
@Controller
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "member")
public class Member {

    @Id
    private ObjectId MemberId;
    private String MemberName;
    private String MemberEmail;
    private String MemberPhone;
    private String MemberStatus;
    private String MemberType;
    private String MemberLevel;
    private String MemberCountry;
    private String MemberCity;

}
