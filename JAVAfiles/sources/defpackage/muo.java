package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class muo implements mjl {
    private final nfw a;
    private final mix b;
    private final mjp c;
    private final Instant d;

    public muo() {
        throw null;
    }

    public static muo e(nfw nfwVar, mix mixVar, mjp mjpVar, long j) {
        return new muo(nfwVar, mixVar, mjpVar, Instant.ofEpochMilli(j));
    }

    @Override // defpackage.mjm
    public final mix a() {
        return this.b;
    }

    @Override // defpackage.mjm
    public final mjp b() {
        return this.c;
    }

    @Override // defpackage.mjl
    public final nfw c() {
        return this.a;
    }

    @Override // defpackage.mje
    public final /* synthetic */ int d() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof muo) {
            muo muoVar = (muo) obj;
            if (this.a.equals(muoVar.a) && this.b.equals(muoVar.b) && this.c.equals(muoVar.c) && this.d.equals(muoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
    }

    public final String toString() {
        Instant instant = this.d;
        mjp mjpVar = this.c;
        mix mixVar = this.b;
        return "DefaultOutgoingMessageProvenance{sendingSelfIdentity=" + this.a.toString() + ", deliveryStatus=" + mixVar.toString() + ", readReport=" + mjpVar.toString() + ", timestamp=" + instant.toString() + ", messageDetails=null}";
    }

    public muo(nfw nfwVar, mix mixVar, mjp mjpVar, Instant instant) {
        if (nfwVar == null) {
            throw new NullPointerException("Null sendingSelfIdentity");
        }
        this.a = nfwVar;
        if (mixVar != null) {
            this.b = mixVar;
            this.c = mjpVar;
            if (instant != null) {
                this.d = instant;
                return;
            }
            throw new NullPointerException("Null timestamp");
        }
        throw new NullPointerException("Null deliveryStatus");
    }
}
