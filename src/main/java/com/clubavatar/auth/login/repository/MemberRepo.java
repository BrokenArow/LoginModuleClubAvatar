package com.clubavatar.auth.login.repository;

import com.clubavatar.auth.login.model.Member;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepo extends MongoRepository<Member, ObjectId> {
}
