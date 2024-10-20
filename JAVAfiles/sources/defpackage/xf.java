package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class xf extends arrp implements arqr<dri, dri> {
    final /* synthetic */ arqr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(arqr arqrVar) {
        super(1);
        this.a = arqrVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        long j = ((dri) obj).a >> 32;
        return new dri((((Number) this.a.a(Integer.valueOf((int) (r0 & 4294967295L)))).intValue() & 4294967295L) | (((int) j) << 32));
    }
}
