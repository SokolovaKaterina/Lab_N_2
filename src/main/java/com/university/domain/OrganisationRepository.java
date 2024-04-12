package com.university.domain;

import java.util.List;

public interface OrganisationRepository {
    Organisation getEntity(int id);
    Organisation getOrganisationByName(String name);
    void editOrganisation(Organisation updatedEntity);
    void removeOrganisation(Organisation deleteEntity);
    List<Organisation> getOrganisations();
    void addOrganisation(Organisation organisation);
}