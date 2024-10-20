package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahna {
    private final alhp c;
    private volatile Process d;
    public volatile boolean b = false;
    public final algk a = new agui(this, 3);

    public ahna(alhz alhzVar) {
        this.c = new alhp(alhzVar);
    }

    public final void a(String str) {
        if (!str.isEmpty()) {
            if (this.d != null) {
                try {
                    if (this.d.exitValue() != 0) {
                        this.b = true;
                        this.d = null;
                    }
                } catch (IllegalThreadStateException unused) {
                    return;
                }
            }
            if (!this.b) {
                synchronized (this) {
                    alhp alhpVar = this.c;
                    if (alhpVar.a && alhpVar.a(TimeUnit.MILLISECONDS) < 60000) {
                        return;
                    }
                    this.c.d();
                    this.c.e();
                    this.d = (Process) this.a.apply(str);
                }
            }
        }
    }
}
