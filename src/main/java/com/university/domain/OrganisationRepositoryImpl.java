package com.university.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrganisationRepositoryImpl implements OrganisationRepository {

    private final List<Organisation> organisations;
    public OrganisationRepositoryImpl() { organisations = new ArrayList<>(); }

    @Override
    public Organisation getEntity(int id) { return organisations.get(id); }

    @Override
    public Organisation getOrganisationByName(String name) {
        for (Organisation organisation : organisations) {
            if (organisation.getName().equalsIgnoreCase(name)) {
                return organisation;
            }
        }
        return null;
    }

    @Override
    public void editOrganisation(Organisation updatedEntity) {
        for (Organisation organisation : organisations) {
            if (organisation.getName().equalsIgnoreCase(updatedEntity.getName())) {
                organisation.setAddress(updatedEntity.getAddress());
                organisation.setHead(updatedEntity.getHead());
            }
        }
    }

    @Override
    public void removeOrganisation(Organisation deleteEntity) { organisations.removeIf(organisation -> organisation.getName().equalsIgnoreCase(deleteEntity.getName())); }
    @Override
    public List<Organisation> getOrganisations() { return organisations; }
    @Override
    public void addOrganisation(Organisation organisation) { organisations.add(organisation); }
}