package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asdl extends asdk {
    public asdl(asai asaiVar, arpi arpiVar, int i, int i2) {
        super(asaiVar, arpiVar, i, i2);
    }

    @Override // defpackage.asdj
    protected final asdj c(arpi arpiVar, int i, int i2) {
        return new asdl(this.d, arpiVar, i, i2);
    }

    @Override // defpackage.asdj
    public final asai f() {
        return this.d;
    }

    @Override // defpackage.asdk
    public final Object g(asaj asajVar, arpe arpeVar) {
        Object a = this.d.a(asajVar, arpeVar);
        if (a == arpl.a) {
            return a;
        }
        return arnb.a;
    }

    public /* synthetic */ asdl(asai asaiVar, arpi arpiVar, int i, int i2, int i3) {
        super(asaiVar, (i3 & 2) != 0 ? arpj.a : arpiVar, (i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2);
    }
}
