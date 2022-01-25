import Estrelas from "components/Estrelas";
import './styles.css'

function Score() {
    const score = 10;
    const count = 15;

    return (
        <div className="dsmovie-score-container">
            <p className="dsmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <Estrelas />
            <p className="dsmovie-score-count">{count} avaliações</p>
        </div>
    )
}; export default Score;