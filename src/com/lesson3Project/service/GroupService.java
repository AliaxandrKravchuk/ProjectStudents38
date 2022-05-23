package com.lesson3Project.service;

import com.lesson3Project.model.Group;
import com.lesson3Project.repository.GroupRepository;

import java.util.List;
import java.util.Scanner;

public class GroupService {

    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {

        this.groupRepository = groupRepository;
    }

    public void removeGroups(List<Group> removeGroups){
        removeGroups.forEach(gr -> System.out.println(gr));
        groupRepository.removeGroups(removeGroups);
    }

    public void addGroups(List<Group> newGroups){
        newGroups.forEach(gr -> System.out.println(gr));
        groupRepository.addGroups(newGroups);
    }

    public void SetName(Group group) {
        Scanner scanner = new Scanner(System.in);
        group.setName(scanner.nextLine());
    }
}
