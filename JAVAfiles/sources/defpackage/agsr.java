package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agsr {
    private Object a;
    private volatile boolean b;

    public final Object a(alhr alhrVar) {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.a = alhrVar.get();
                    this.b = true;
                }
            }
        }
        return this.a;
    }
}
