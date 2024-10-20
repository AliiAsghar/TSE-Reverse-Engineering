package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asdn extends asdk {
    public final arqw e;

    public asdn(arqw arqwVar, asai asaiVar, arpi arpiVar, int i, int i2) {
        super(asaiVar, arpiVar, i, i2);
        this.e = arqwVar;
    }

    @Override // defpackage.asdj
    protected final asdj c(arpi arpiVar, int i, int i2) {
        return new asdn(this.e, this.d, arpiVar, i, i2);
    }

    @Override // defpackage.asdk
    public final Object g(asaj asajVar, arpe arpeVar) {
        boolean z = arwh.a;
        Object d = arwi.d(new albu(this, asajVar, (arpe) null, 3), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    public /* synthetic */ asdn(arqw arqwVar, asai asaiVar) {
        this(arqwVar, asaiVar, arpj.a, -2, 1);
    }
}
