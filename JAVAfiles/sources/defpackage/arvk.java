package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arvk extends arvg {
    public final arwx b;
    private final Thread e;

    public arvk(arpi arpiVar, Thread thread, arwx arwxVar) {
        super(arpiVar, true);
        this.e = thread;
        this.b = arwxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxw
    public final void hl(Object obj) {
        if (!d.F(Thread.currentThread(), this.e)) {
            LockSupport.unpark(this.e);
        }
    }

    @Override // defpackage.arxw
    protected final boolean hn() {
        return true;
    }
}
