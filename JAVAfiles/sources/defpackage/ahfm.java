package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahfm extends arrp implements arqg {
    final /* synthetic */ float a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahfm(float f, int i) {
        super(0);
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return Float.valueOf(this.a);
            }
            return Float.valueOf(this.a);
        }
        return new bsd(-3.4028235E38f, brg.a, this.a);
    }
}
