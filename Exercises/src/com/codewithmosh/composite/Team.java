package com.codewithmosh.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements TeamUnit{
  private List<TeamUnit> resources = new ArrayList<>();

  public void add(TeamUnit resource) {
    resources.add(resource);
  }

  @Override
  public void deploy() {
    for (var resource : resources) {
      resource.deploy();
    }
  }
}
