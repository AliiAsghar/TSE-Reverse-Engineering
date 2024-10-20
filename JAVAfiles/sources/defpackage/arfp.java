package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arfp implements arfu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public arfp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [aqsa, java.lang.Object] */
    @Override // defpackage.arfu
    public final void a(arga argaVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                argaVar.a.j((aqsp) this.a);
                return;
            } else {
                argaVar.a.h(this.a);
                return;
            }
        }
        argaVar.a.i((aqsn) this.a);
    }
}
