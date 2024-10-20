package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arhm implements arep {
    private final /* synthetic */ int a;
    private final Object b;

    public arhm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [arhk, java.lang.Object] */
    @Override // defpackage.arep
    public final Object a() {
        if (this.a != 0) {
            return this.b;
        }
        return arhl.a(this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [arhk, java.lang.Object] */
    @Override // defpackage.arep
    public final void b(Object obj) {
        if (this.a != 0) {
            return;
        }
        arhl.d(this.b, obj);
    }
}
