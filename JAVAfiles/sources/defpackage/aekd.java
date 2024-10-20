package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekd extends arrp implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aekd(long j, long j2, int i, int i2) {
        super(2);
        this.d = i2;
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            bwj bwjVar = (bwj) obj;
            ((Number) obj2).intValue();
            int i = this.c;
            aeke.d(this.a, this.b, bwjVar, bzh.a(i | 1));
            return arnb.a;
        }
        bwj bwjVar2 = (bwj) obj;
        ((Number) obj2).intValue();
        int i2 = this.c;
        aeke.j(this.a, this.b, bwjVar2, bzh.a(i2 | 1));
        return arnb.a;
    }
}
