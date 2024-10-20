package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoq implements Runnable {
    private final eno a;
    private final enf b;
    private boolean c;

    public eoq(eno enoVar, enf enfVar) {
        enfVar.getClass();
        this.a = enoVar;
        this.b = enfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c) {
            this.a.e(this.b);
            this.c = true;
        }
    }
}
