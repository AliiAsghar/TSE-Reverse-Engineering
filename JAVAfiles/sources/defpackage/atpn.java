package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpn extends asmp {
    private final aslz a;
    private final long b;

    public atpn(aslz aslzVar, long j) {
        this.a = aslzVar;
        this.b = j;
    }

    @Override // defpackage.asmp
    public final long a() {
        return this.b;
    }

    @Override // defpackage.asmp
    public final aslz b() {
        return this.a;
    }

    @Override // defpackage.asmp
    public final asqw c() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
