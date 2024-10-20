package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfw extends arrp implements arqg {
    final /* synthetic */ long a;
    final /* synthetic */ boolean b;
    final /* synthetic */ kkc c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfw(kkc kkcVar, long j, boolean z, int i) {
        super(0);
        this.d = i;
        this.c = kkcVar;
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        if (this.d != 0) {
            hwr.ap(this.c, this.a, this.b);
            return arnb.a;
        }
        hwr.aq(this.c, this.a, this.b);
        return arnb.a;
    }
}
