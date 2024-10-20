package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikk extends TimerTask {
    final /* synthetic */ aikl a;
    private final String b;
    private final advp c;

    public aikk(aikl aiklVar, String str, advp advpVar) {
        this.a = aiklVar;
        this.b = str;
        this.c = advpVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        synchronized (this.a.d) {
            if (this.a.d.contains(this.b)) {
                aikl aiklVar = this.a;
                String str = this.b;
                advr.r(aiklVar.a, "Transaction timed out for context id: %s", str);
                aikh f = aiklVar.f(str);
                if (f == null) {
                    advr.r(aiklVar.a, "onTransactionTimeout: No transaction context found for context id: %s", str);
                } else {
                    aikm aikmVar = f.d;
                    if (aikmVar == null) {
                        advr.r(aiklVar.a, "onTransactionTimeout: No listener found for context id: %s", str);
                    } else {
                        aikmVar.c(f);
                    }
                }
            } else {
                advr.d(this.c, "context id: %s already removed - transaction finished", this.b);
            }
            this.a.d.remove(this.b);
        }
    }
}
