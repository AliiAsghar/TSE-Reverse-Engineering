package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xh extends arrp implements arqr<dri, dre> {
    final /* synthetic */ arqr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(arqr arqrVar) {
        super(1);
        this.a = arqrVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        return new dre(((Number) this.a.a(Integer.valueOf((int) (((dri) obj).a >> 32)))).intValue() << 32);
    }
}
