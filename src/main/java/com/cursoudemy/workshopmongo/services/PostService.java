package com.cursoudemy.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoudemy.workshopmongo.domain.Post;
import com.cursoudemy.workshopmongo.domain.User;
import com.cursoudemy.workshopmongo.dto.UserDTO;
import com.cursoudemy.workshopmongo.repository.PostRepository;
import com.cursoudemy.workshopmongo.repository.UserRepository;
import com.cursoudemy.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
