package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mus implements mje, mjm {
    private final mix a;
    private final mjp b;
    private final long c;
    private final ncq d;

    public mus(mix mixVar, mjp mjpVar, long j) {
        mixVar.getClass();
        this.a = mixVar;
        this.b = mjpVar;
        this.c = j;
        this.d = null;
    }

    @Override // defpackage.mjm
    public final mix a() {
        return this.a;
    }

    @Override // defpackage.mjm
    public final mjp b() {
        return this.b;
    }

    @Override // defpackage.mje
    public final int d() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mus)) {
            return false;
        }
        mus musVar = (mus) obj;
        if (this.a != musVar.a || !d.F(this.b, musVar.b) || this.c != musVar.c) {
            return false;
        }
        ncq ncqVar = musVar.d;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.A(this.c)) * 31;
    }

    public final String toString() {
        return "DefaultUnknownOutgoingMessageProvenance(deliveryStatus=" + this.a + ", readReport=" + this.b + ", timestamp=" + this.c + ", messageDetails=null)";
    }
}
