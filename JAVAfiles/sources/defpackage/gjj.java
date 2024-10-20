package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gjj implements gkb {
    public final gkd f;
    public final String g;
    public boolean h;

    public gjj(gkd gkdVar, String str) {
        this.f = gkdVar;
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        if (!this.h) {
            return;
        }
        gvf.bk(21, "statement is closed");
        throw new armj();
    }

    @Override // defpackage.gkb
    public final /* synthetic */ boolean j() {
        if (b(0) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k() {
        this.h = true;
    }
}
