package br.edu.univas.imobiliaria;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Contrato {
	@Id
    private int cod;
	@Column
    private int codCliente;
	@Column
    private int codImovel;
	@Column
    private Date dataContrato;
	@Column
    private String formaPagamento;
	@Column
    private String tipo;
	@Column
    private Date dataVenda;
	@Column
    private float valorVenda;
	@Column
    private Date dataEntrada;
	@Column
    private Date dataSaida;
	@Column
    private float valorMensalidade;

	public Contrato() {}
	
    public Contrato(int cod, int codCliente, int codImovel, Date dataContrato, String formaPagamento, 
                    String tipo, Date dataVenda, float valorVenda, Date dataEntrada, 
                    Date dataSaida, float valorMensalidade){            
            this.cod              = cod;  
            this.codCliente       = codCliente;
            this.codImovel        = codImovel;
            this.dataContrato     = dataContrato;
            this.formaPagamento   = formaPagamento;
            this.tipo             = tipo;
            this.dataVenda        = dataVenda;
            this.valorVenda       = valorVenda;
            this.dataEntrada      = dataEntrada;
            this.dataSaida        = dataSaida;
            this.valorMensalidade = valorMensalidade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCodCliente() {
        return this.codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodImovel() {
        return this.codImovel;
    }

    public void setCodImovel(int codImovel) {
        this.codImovel = codImovel;
    }

    public Date getDataContrato() {
        return this.dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public String getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataVenda() {
        return this.dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorVenda() {
        return this.valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Date getDataEntrada() {
        return this.dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return this.dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public float getValorMensalidade() {
        return this.valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
}
