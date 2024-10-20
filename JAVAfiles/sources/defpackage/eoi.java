package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoi implements Closeable, enk {
    public final eog a;
    public boolean b;
    private final String c;

    public eoi(String str, eog eogVar) {
        this.c = str;
        this.a = eogVar;
    }

    public final void b(iba ibaVar, enh enhVar) {
        if (!this.b) {
            this.b = true;
            enhVar.c(this);
            ibaVar.c(this.c, this.a.e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        if (enfVar == enf.ON_DESTROY) {
            this.b = false;
            enmVar.N().d(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
