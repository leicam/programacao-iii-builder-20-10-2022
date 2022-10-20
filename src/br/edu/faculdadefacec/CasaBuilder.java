package br.edu.faculdadefacec;

public class CasaBuilder {
    private Casa casa = new Casa();

    /*private Casa casa;

    public CasaBuilder() {
        this.casa = new Casa();
    }*/

    public CasaBuilder comChurrasqueira(){
        this.casa.setIsComChurrasqueira(true);
        return this;
    }

    public CasaBuilder comJardim(){
        this.casa.setIsComJardim(true);
        return this;
    }

    public CasaBuilder comPiscina(){
        this.casa.setIsComPiscina(true);
        return this;
    }

    public Casa build() {
        return this.casa;
    }
}
