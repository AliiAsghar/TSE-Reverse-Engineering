package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aeik extends arrp implements arqg {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeik(long j, long j2, int i) {
        super(0);
        this.c = i;
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return new dip(this.b, 0L, null, null, null, dli.c, null, 0L, null, null, this.a, null, null, 63454);
            }
            return new dip(this.a, 0L, null, null, null, null, null, 0L, null, null, this.b, null, null, 63486);
        }
        return new dip(this.a, 0L, null, null, null, null, null, 0L, null, null, this.b, null, null, 63486);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeik(long j, long j2, int i, char[] cArr) {
        super(0);
        this.c = i;
        this.b = j;
        this.a = j2;
    }
}
