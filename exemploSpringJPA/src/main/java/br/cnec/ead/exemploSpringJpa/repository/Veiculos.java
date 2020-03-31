package br.cnec.ead.exemploSpringJpa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.cnec.ead.exemploSpringJpa.model.*;
public interface Veiculos extends JpaRepository<Veiculo, Long> {
}
