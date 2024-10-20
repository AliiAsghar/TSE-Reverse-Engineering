package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydn implements akmn, utv {
    public final armf a;
    public final uub e;
    private final anen f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicInteger b = new AtomicInteger(((Integer) ((utx) ydp.b).c).intValue());
    public final AtomicInteger c = new AtomicInteger(((Integer) ((utx) ydp.c).c).intValue());
    public final AtomicInteger d = new AtomicInteger(((Integer) ((utx) ydp.d).c).intValue());

    public ydn(anen anenVar, armf armfVar, uub uubVar) {
        this.e = uubVar;
        this.a = armfVar;
        this.f = anenVar;
    }

    @Override // defpackage.utv
    public final void a() {
        g();
    }

    @Override // defpackage.akmn
    public final int c() {
        return this.b.get();
    }

    @Override // defpackage.akmn
    public final int d() {
        return this.c.get();
    }

    @Override // defpackage.akmn
    public final String e() {
        return "logs";
    }

    @Override // defpackage.akmn
    public final String f() {
        return "flogger_bugle.log";
    }

    @Override // defpackage.utv
    public final boolean fN() {
        return false;
    }

    public final void g() {
        aktp.ai(new wkf(this, 19), this.f).k(qiu.b(), andi.a);
    }

    @Override // defpackage.akmn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.akmn
    public final boolean i(Level level) {
        if (this.g.compareAndSet(false, true)) {
            g();
        }
        if (level.intValue() < this.d.get()) {
            return false;
        }
        return true;
    }
}
