package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bye extends arrp implements arqr {
    final /* synthetic */ arqr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bye(arqr arqrVar) {
        super(1);
        this.a = arqrVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return this.a.a(Long.valueOf(((Number) obj).longValue() / 1000000));
    }
}
