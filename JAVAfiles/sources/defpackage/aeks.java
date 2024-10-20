package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeks extends arrp implements arqr {
    final /* synthetic */ aeko a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeks(aeko aekoVar, long j, long j2) {
        super(1);
        this.a = aekoVar;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        long j;
        if (((Number) obj).floatValue() <= this.a.a) {
            j = this.b;
        } else {
            j = this.c;
        }
        return new cku(j);
    }
}
