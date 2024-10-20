package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydm implements utv {
    public final AtomicInteger a = new AtomicInteger(((Integer) ((utx) ydp.a).c).intValue());
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final uub c;
    private final anen d;

    public ydm(anen anenVar, uub uubVar) {
        this.c = uubVar;
        this.d = anenVar;
    }

    @Override // defpackage.utv
    public final void a() {
        akrh e = aktp.e("FloggerClientLoggingOptions");
        try {
            c();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        aktp.ai(new wkf(this, 18), this.d).k(qiu.b(), andi.a);
    }

    @Override // defpackage.utv
    public final boolean fN() {
        return false;
    }
}
