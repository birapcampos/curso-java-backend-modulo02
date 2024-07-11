package gerarChaveUnica;

import java.time.Instant;

public class GeraChaveUnica {

    public GeraChaveUnica() {
    }

    public Long getChaveUnica(Integer codTipoSituacao){
        long timestamp = Instant.now().toEpochMilli();
        Long key = Long.valueOf(String.valueOf(codTipoSituacao) + timestamp);
        return key;
    }

}
