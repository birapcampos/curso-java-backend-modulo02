package gerarChaveUnica;

import java.time.Instant;
import java.util.UUID;

public class GeraChaveUnica {

    public GeraChaveUnica() {
    }

    public Long getChaveUnica(Integer codTipoSituacao){
        long timestamp = Instant.now().toEpochMilli();
        Long key = Long.valueOf(String.valueOf(codTipoSituacao) + timestamp);
        return key;
    }

    public String getUUID(Integer codTipoSituacao){
        UUID uuid = UUID.randomUUID();
        return String.valueOf(codTipoSituacao)+uuid.toString();
    }

}
