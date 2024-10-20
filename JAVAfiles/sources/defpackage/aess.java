package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aess extends arrp implements arqv {
    final /* synthetic */ float a;
    final /* synthetic */ int b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aess(float f, int i, int i2) {
        super(2);
        this.c = i2;
        this.a = f;
        this.b = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            ((Number) obj2).intValue();
            int i = this.b;
            aetn.aw(this.a, (bwj) obj, bzh.a(i | 1));
            return arnb.a;
        }
        ((Number) obj2).intValue();
        aetn.L(this.a, (bwj) obj, bzh.a(this.b | 1));
        return arnb.a;
    }
}
