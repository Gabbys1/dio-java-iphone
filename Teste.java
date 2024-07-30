public class Teste {
        public static void main(String[] args) {
            iphone iphone = new iphone();
            
            // Testar funcionalidades do ReprodutorMusical
            iphone.tocarMusica();
            iphone.pausarMusica();
            iphone.pararMusica();
            
            // Testar funcionalidades do AparelhoTelefonico
            iphone.fazerChamada("123-456-789");
            iphone.receberChamada();
            
            // Testar funcionalidades do NavegadorInternet
            iphone.abrirPagina("www.exemplo.com");
            iphone.fecharPagina();
        }
    }

