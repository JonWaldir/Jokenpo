package util;

public class jogo {
	public  int voce = 0;
	public int maquina = 0 ;
	public void Resultado (int jogada) {
		int jogadaMaquina = (int) (Math.random() * 3) + 1;
		System.out.println("Sua jogada: " + traduzirJogada(jogada));
        System.out.println("Jogada da Máquina: " + traduzirJogada(jogadaMaquina));
		
		
	
	if (jogada == jogadaMaquina) {
        System.out.println("-> EMPATE!\n");
    } 
    // Vitória do jogador (1 ganha de 3, 2 ganha de 1, 3 ganha de 2)
    else if ((jogada == 1 && jogadaMaquina == 3) || 
             (jogada == 2 && jogadaMaquina == 1) || 
             (jogada == 3 && jogadaMaquina == 2)) {
        System.out.println("-> VOCÊ VENCEU!\n");
        this.voce++;
        
    }else {
        System.out.println("-> MÁQUINA VENCEU!\n");
        this.maquina++;
    }}
	public String traduzirJogada(int jogada ) {
		switch (jogada) {
        case 1: return "Pedra";
        case 2: return "Papel";
        case 3: return "Tesoura";
        default: return "Invalida";
		}
	}

}
