package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asae extends asdj {
    private final arqv d;

    public asae(arqv arqvVar, arpi arpiVar, int i, int i2) {
        super(arpiVar, i, i2);
        this.d = arqvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object g(asae asaeVar, arzu arzuVar, arpe arpeVar) {
        Object a = asaeVar.d.a(arzuVar, arpeVar);
        if (a == arpl.a) {
            return a;
        }
        return arnb.a;
    }

    @Override // defpackage.asdj
    public Object b(arzu arzuVar, arpe arpeVar) {
        return g(this, arzuVar, arpeVar);
    }

    @Override // defpackage.asdj
    protected asdj c(arpi arpiVar, int i, int i2) {
        return new asae(this.d, arpiVar, i, i2);
    }

    @Override // defpackage.asdj
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }

    public /* synthetic */ asae(arqv arqvVar) {
        this(arqvVar, arpj.a, -2, 1);
    }
}
