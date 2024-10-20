package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qto {
    public final xwb a;
    private final qtn b;
    private final String c;
    private final String d;
    private final aozb e;
    private final vtm f;
    private final Instant g;

    public qto() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qto)) {
            return false;
        }
        qto qtoVar = (qto) obj;
        if (!d.F(this.a, qtoVar.a) || this.b != qtoVar.b) {
            return false;
        }
        String str = qtoVar.c;
        if (!d.F(null, null)) {
            return false;
        }
        String str2 = qtoVar.d;
        if (!d.F(null, null)) {
            return false;
        }
        aozb aozbVar = qtoVar.e;
        if (d.F(null, null) && d.F(this.f, qtoVar.f) && d.F(this.g, qtoVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        xwb xwbVar = this.a;
        if (xwbVar == null) {
            hashCode = 0;
        } else {
            hashCode = xwbVar.hashCode();
        }
        return (((((hashCode * 31) + this.b.hashCode()) * 923521) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "RcsGroup(rcsConferenceUri=" + this.a + ", groupState=" + this.b + ", name=null, iconUrl=null, tachygramRoutingToken=null, groupCapabilities=" + this.f + ", lastSyncTimestamp=" + this.g + ")";
    }

    public /* synthetic */ qto(xwb xwbVar, qtn qtnVar, int i) {
        qtnVar = (i & 2) != 0 ? qtn.a : qtnVar;
        xwbVar = 1 == (i & 1) ? null : xwbVar;
        vtm b = vtm.b();
        Instant instant = Instant.EPOCH;
        qtnVar.getClass();
        instant.getClass();
        this.a = xwbVar;
        this.b = qtnVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = b;
        this.g = instant;
    }
}
