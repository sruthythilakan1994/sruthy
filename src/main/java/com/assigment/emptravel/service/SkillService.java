package com.assigment.emptravel.service;

import java.util.List;


import com.assigment.emptravel.model.Skill;
import com.assigment.emptravel.model.SkillSet;
import com.assigment.emptravel.model.User;



public interface SkillService {
public void saveSkill(Skill skill);
public List<Skill> findAll();
public Skill findSkillById(int id);
public void skillSetCreate(SkillSet skillentry, User user,Skill skill);
}
