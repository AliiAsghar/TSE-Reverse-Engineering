package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvt implements alhr {
    boolean a;
    Object b;
    final /* synthetic */ alhr c;

    public ahvt(alhr alhrVar) {
        this.c = alhrVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        if (this.a) {
            return this.b;
        }
        Object obj = this.c.get();
        this.b = obj;
        this.a = true;
        return obj;
    }
}
