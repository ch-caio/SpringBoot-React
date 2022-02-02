import { ReactComponent as GitHubIcon } from 'assets/img/github.svg';
import './styles.css'

function NavBar() {

    return (
        <header>
            <nav className='container'>
                <div className='navbar-content'>
                    <h3>Movies Catalog</h3>
             
                    <div className='contact-content'>
                        <GitHubIcon className='icon' />
                        <p className='contact-link'>/ch-caio</p>
                    </div>
                </div>
            </nav>
        </header>

    );
}

export default NavBar;

// <a href="https://github.com/ch-caio"></a>