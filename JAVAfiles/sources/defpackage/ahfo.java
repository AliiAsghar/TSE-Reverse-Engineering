package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahfo extends arrp implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahfo(Object obj, long j, long j2, int i, int i2) {
        super(2);
        this.e = i2;
        this.d = obj;
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, cga] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            bwj bwjVar = (bwj) obj;
            ((Number) obj2).intValue();
            int i = this.c;
            long j = this.b;
            aeke.V((aemg) this.d, this.a, j, bwjVar, bzh.a(i | 1));
            return arnb.a;
        }
        ((Number) obj2).intValue();
        ahji.ar(this.d, this.a, this.b, (bwj) obj, bzh.a(this.c | 1));
        return arnb.a;
    }
}
