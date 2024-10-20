package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aroh extends arnf {
    final /* synthetic */ aroi a;
    private int b;
    private int c;

    public aroh(aroi aroiVar) {
        this.a = aroiVar;
        this.b = aroiVar.d;
        this.c = aroiVar.c;
    }

    @Override // defpackage.arnf
    protected final void a() {
        if (this.b == 0) {
            b();
            return;
        }
        c(this.a.a[this.c]);
        this.c = (this.c + 1) % this.a.b;
        this.b--;
    }
}
