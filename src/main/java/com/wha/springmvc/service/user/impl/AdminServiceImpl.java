package com.wha.springmvc.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.springmvc.dao.user.IAdminDao;
import com.wha.springmvc.dao.user.IAgentDao;
import com.wha.springmvc.model.compte.Compte;
import com.wha.springmvc.model.demande.newclient.DemandeCreationDeCompte;
import com.wha.springmvc.model.demande.oldclient.DemandeClient;
import com.wha.springmvc.model.operation.Operation;
import com.wha.springmvc.model.user.Admin;
import com.wha.springmvc.model.user.Agent;
import com.wha.springmvc.model.user.Client;
import com.wha.springmvc.service.user.IAdminService;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private IAdminDao daoAdmin;

	@Autowired
	private IAgentDao daoAgent;

	@Override
	public void save(Admin admin) {
		daoAdmin.save(admin);
	}

	@Override
	public Admin findOneById(long id) {
		return daoAdmin.findOneById(id);
	}

	@Override
	public List<Admin> findAll() {
		return daoAdmin.findAll();
	}

	@Override
	public void update(long id, Admin admin) {
		daoAdmin.update(id, admin);
	}

	@Override
	public void delete(long id) {
		daoAdmin.delete(id);
	}

	/**
	 * Creer un Agent
	 */
	@Override
	public long createAgent(Agent agent) {
		return daoAgent.save(agent);
	}

	/**
	 * affecte un client � un agent
	 */
	@Override
	public boolean affectationAgentToClient(Agent agent, Client client) {
		agent.addClient(client);
		daoAgent.update(agent.getId(), agent);
		return false;
	}

	@Override
	public boolean affectationOuvertureCompte(DemandeCreationDeCompte demande, Agent agent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<DemandeCreationDeCompte> listeDemandesCreationCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DemandeCreationDeCompte> listeDemandesAffectees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DemandeCreationDeCompte> listeDemandesNonAffectees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agent rechercherAgentParNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agent rechercherAgentParMatricule(String matricule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAgent(Agent agent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateClient(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCompte(Compte compte) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOperation(Operation operation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDemandeClient(DemandeClient demandeClient) {
		// TODO Auto-generated method stub
		return false;
	}

}
