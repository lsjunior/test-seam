package br.net.woodstock.test.seam;

import java.io.Serializable;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

@Name("processoHome2")
@Scope(ScopeType.EVENT)
public class ProcessoHome implements Serializable {

  private static final long serialVersionUID = 609927791432037860L;
  private String numero;

  public ProcessoHome() {
    super();
  }

  @Create
  public void onCreate() {
    this.numero = Long.toString(System.currentTimeMillis());
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(final String numero) {
    this.numero = numero;
  }

}
