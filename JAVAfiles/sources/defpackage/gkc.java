package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkc implements gki {
    private final String a;
    private final Object[] b;

    public gkc(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    @Override // defpackage.gki
    public final String b() {
        return this.a;
    }

    @Override // defpackage.gki
    public final void h(gkh gkhVar) {
        gvf.bj(gkhVar, this.b);
    }

    public gkc(String str) {
        this(str, null);
    }
}
