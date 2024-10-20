package defpackage;

import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xab {
    public final long a;
    public final long b;
    public final long c;
    public final Object d;

    public xab(long j, long j2, long j3, UUID uuid) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = uuid;
    }

    public xab(List list, long j, long j2) {
        this.d = alog.n(list);
        this.c = j;
        this.b = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.a = j3;
    }
}
