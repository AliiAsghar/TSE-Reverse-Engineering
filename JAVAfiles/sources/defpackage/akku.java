package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akku extends eor {
    public final eog a;
    public final ajwt b;
    public final Object c = new Object();
    public volatile Object d;
    public final alhm e;

    public akku(eog eogVar, alhm alhmVar, ajwt ajwtVar) {
        this.a = eogVar;
        this.e = alhmVar;
        this.b = ajwtVar;
    }

    @Override // defpackage.eor
    public final void gi() {
        apxa apxaVar;
        synchronized (this.c) {
            if (this.d != null) {
                apxaVar = ((akkt) aovp.m(this.d, akkt.class)).a();
            } else {
                apxaVar = null;
            }
        }
        if (apxaVar != null) {
            apxaVar.b();
        }
    }
}
