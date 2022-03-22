
package br.uffs.cc.jarena;

public class AgenteSecreto extends Agente {

    public AgenteSecreto(Integer x, Integer y, Integer energia) {
		super(400, 400, energia);
		setDirecao(geraDirecaoAleatoria());
	}

    @Override
    public void pensa() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void recebeuEnergia() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void tomouDano(int energiaRestanteInimigo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ganhouCombate() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void recebeuMensagem(String msg) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getEquipe() {
        // TODO Auto-generated method stub
        return null;
    }

}