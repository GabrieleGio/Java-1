public class Persona {
			private String nome;
			private String cognome;
			private String cf;
			private int eta;
			public Persona(String nome, String cognome, String cf, int eta) {
				super();
				this.nome = nome;
				this.cognome = cognome;
				this.cf = cf;
				this.eta = eta;
			}
			public Persona() {
				super();
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getCognome() {
				return cognome;
			}
			public void setCognome(String cognome) {
				this.cognome = cognome;
			}
			public String getCf() {
				return cf;
			}
			public void setCf(String cf) {
				this.cf = cf;
			}
			public int getEta() {
				return eta;
			}
			public void setEta(int eta) {
				this.eta = eta;
			}
			@Override
			public String toString() {
				return "Persona [nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + ", eta=" + eta + "]";
			}
			
			
		}
