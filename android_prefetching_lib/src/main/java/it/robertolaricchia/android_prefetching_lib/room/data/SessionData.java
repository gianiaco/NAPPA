package it.robertolaricchia.android_prefetching_lib.room.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;

@Entity(tableName = "pf_session_data", primaryKeys = {"id_session", "id_activity_source", "id_activity_destination"})
public class SessionData {

    @NonNull @ColumnInfo(name = "id_session") public Long idSession;
    @NonNull @ColumnInfo(name = "id_activity_source") public Long idActivitySource;
    @NonNull @ColumnInfo(name = "id_activity_destination") public Long idActivityDestination;
    @ColumnInfo(name = "count_source_destination") public Long countSourceDestination;

    public SessionData(@NonNull Long idSession, @NonNull Long idActivitySource, @NonNull Long idActivityDestination, Long countSourceDestination) {
        this.idSession = idSession;
        this.idActivitySource = idActivitySource;
        this.idActivityDestination = idActivityDestination;
        this.countSourceDestination = countSourceDestination;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SessionData:\t");
        sb.append("idSession:").append(idSession)
                .append("\nidActSource: ").append(idActivitySource)
                .append("\nidActDest: ").append(idActivityDestination)
                .append("\ntransitionCount: ").append(countSourceDestination)
                .append("\n\n");
        return sb.toString();
    }
}
