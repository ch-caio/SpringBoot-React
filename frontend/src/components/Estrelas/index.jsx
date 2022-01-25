import { ReactComponent as EstrelaCheia } from 'assets/img/estrela-cheia.svg';
import { ReactComponent as EstrelaMetade } from 'assets/img/estrela-metade.svg'
import { ReactComponent as EstrelaVazia } from 'assets/img/estrela-vazia.svg'
import './styles.css'

function Estrelas() {
    return (
        <div className="dsmovie-stars-container">
            <EstrelaCheia />
            <EstrelaCheia />
            <EstrelaCheia />
            <EstrelaMetade />
            <EstrelaVazia />
        </div>

    )
} export default Estrelas;