public class Hora {
  private int horas;
  private int minutos;
  private int segundos;

  public Hora() {
      this.horas = 0;
      this.minutos = 0;
      this.segundos = 0;
  }

  public Hora(int horas, int minutos, int segundos) {
      this.horas = horas;
      this.minutos = minutos;
      this.segundos = segundos;
  }

  public int aSegundos() {
      return this.horas * 3600 + this.minutos * 60 + this.segundos;
  }

  public int aMinutos() {
      return this.horas * 60 + this.minutos;
  }

  public int aHoras() {
      return this.horas;
  }

  public void siguiente() {
      this.segundos++;
      if (this.segundos >= 60) {
          this.segundos = 0;
          this.minutos++;
          if (this.minutos >= 60) {
              this.minutos = 0;
              this.horas++;
              if (this.horas >= 24) {
                  this.horas = 0;
              }
          }
      }
  }

  public void anterior() {
      this.segundos--;
      if (this.segundos < 0) {
          this.segundos = 59;
          this.minutos--;
          if (this.minutos < 0) {
              this.minutos = 59;
              this.horas--;
              if (this.horas < 0) {
                  this.horas = 23;
              }
          }
      }
  }

  @Override
  public String toString() {
      return String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
  }
}
