package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdn extends hb {
    final /* synthetic */ gdm a;
    final /* synthetic */ gdm b;
    final /* synthetic */ hd c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    public gdn(gdm gdmVar, gdm gdmVar2, hd hdVar, int i, int i2) {
        this.a = gdmVar;
        this.b = gdmVar2;
        this.c = hdVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.hb
    public final int a() {
        return this.e;
    }

    @Override // defpackage.hb
    public final int b() {
        return this.d;
    }

    @Override // defpackage.hb
    public final Object c(int i, int i2) {
        gdm gdmVar = this.b;
        Object h = this.a.h(i);
        Object h2 = gdmVar.h(i2);
        if (h == h2) {
            return true;
        }
        return this.c.a(h, h2);
    }

    @Override // defpackage.hb
    public final boolean d(int i, int i2) {
        gdm gdmVar = this.b;
        Object h = this.a.h(i);
        Object h2 = gdmVar.h(i2);
        if (h == h2) {
            return true;
        }
        return this.c.b(h, h2);
    }

    @Override // defpackage.hb
    public final boolean e(int i, int i2) {
        gdm gdmVar = this.b;
        Object h = this.a.h(i);
        Object h2 = gdmVar.h(i2);
        if (h == h2) {
            return true;
        }
        return this.c.c(h, h2);
    }
}
