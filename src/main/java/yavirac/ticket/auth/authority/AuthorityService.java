package yavirac.ticket.auth.authority;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yavirac.ticket.auth.authority.auth.authority.Authority;

@Service
public class AuthorityService {

    @Autowired
    AuthorityRepository authorityRepository;

    public List<Authority> findByName(String term){
        return authorityRepository. findByNameLikeIgnoreCase(term+"%");
    }
    
    public Authority findById(long id){
        return authorityRepository.findById(id).orElse(new Authority());
    }
}
