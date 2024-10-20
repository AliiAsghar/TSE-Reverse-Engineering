package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alip extends alll {
    final /* synthetic */ aliq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alip(aliq aliqVar, alke alkeVar) {
        super(alkeVar);
        this.a = aliqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alll
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aliq aliqVar = this.a;
        alke f = obj.f();
        if (f == aliqVar.a) {
            return null;
        }
        return f;
    }
}
