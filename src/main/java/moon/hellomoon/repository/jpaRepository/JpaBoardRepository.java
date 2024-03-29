package moon.hellomoon.repository.jpaRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import moon.hellomoon.domain.Board;
import moon.hellomoon.repository.repositoryInterface.BoardRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaBoardRepository implements BoardRepository {
    private final EntityManager em;

    public JpaBoardRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public Board save(Board board) {
        em.persist(board);
        return board;
    }

    @Override
    public Optional<Board> findById(long id) {
        Board board = em.find(Board.class,id);
        return Optional.ofNullable(board);
    }

    @Override
    public Optional<Board> findByTitle(String title) {
        List<Board> result = em.createQuery("select b from Board b where b.title = :title",Board.class)
                .setParameter("title",title)
                .getResultList();

        return result.stream().findAny();    }

    @Override
    public Optional<Board> findByContent(String content) {
        return Optional.empty();
    }

    @Override
    public List<Board> findAll() {
        return (List<Board>) em.createQuery("select b from Board b",Board.class)
                .getResultList();    }
}
