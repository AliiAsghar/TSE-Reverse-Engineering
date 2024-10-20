package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eil implements ehl {
    public final File a;
    public final fvq b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public eil(File file, fvq fvqVar) {
        this.a = file;
        this.b = fvqVar;
    }

    @Override // defpackage.ehl
    public final void a() {
        this.c.set(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        if (!this.c.get()) {
        } else {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }
}
