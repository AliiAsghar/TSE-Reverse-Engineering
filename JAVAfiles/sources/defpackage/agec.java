package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agec extends arsm {
    final /* synthetic */ aged a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agec(Object obj, aged agedVar) {
        super(obj);
        this.a = agedVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        this.a.i(intValue, false);
        aeke.bp(this.a.c.d, Integer.valueOf(intValue));
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
