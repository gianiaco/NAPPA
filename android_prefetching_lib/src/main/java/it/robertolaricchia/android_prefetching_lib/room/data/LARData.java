package it.robertolaricchia.android_prefetching_lib.room.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.support.annotation.NonNull;

@Entity(tableName = "pf_LAR", primaryKeys = "activity_name", indices = @Index(value = {"activity_name"}, unique = true))
public class LARData {
    @NonNull @ColumnInfo(name = "activity_name") public String activity_name;
    @NonNull @ColumnInfo(name = "PR") public float PR;
    @NonNull @ColumnInfo(name = "authority") public float authority;
    @NonNull @ColumnInfo(name = "hub") public float hub;

    public LARData(@NonNull String activity_name, @NonNull float PR, @NonNull float authority, @NonNull float hub) {
        this.activity_name = activity_name;
        this.PR = PR;
        this.authority = authority;
        this.hub = hub;
    }
}