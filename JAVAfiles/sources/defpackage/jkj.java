package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jkj implements jow, arrk {
    private final /* synthetic */ arqg a;

    public jkj(arqg arqgVar) {
        this.a = arqgVar;
    }

    @Override // defpackage.jow
    public final /* synthetic */ void a() {
        this.a.a();
    }

    @Override // defpackage.arrk
    public final armh b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jow) && (obj instanceof arrk)) {
            return d.F(this.a, ((arrk) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
