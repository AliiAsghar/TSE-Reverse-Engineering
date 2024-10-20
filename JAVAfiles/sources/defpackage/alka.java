package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alka extends alll {
    final /* synthetic */ alkb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alka(alkb alkbVar, alke alkeVar) {
        super(alkeVar);
        this.a = alkbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alll
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        alkb alkbVar = this.a;
        alke g = obj.g();
        if (g == alkbVar.a) {
            return null;
        }
        return g;
    }
}
