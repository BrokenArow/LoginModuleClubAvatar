package com.clubavatar.auth.login.service;

import com.clubavatar.auth.login.model.Member;
import com.clubavatar.auth.login.repository.MemberRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    MemberRepo memberRepo;

    public List<Member> getMember() {
        return memberRepo.findAll();
    }

}
