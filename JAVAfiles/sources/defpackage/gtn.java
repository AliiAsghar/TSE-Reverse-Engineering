package defpackage;

import android.util.Log;
import j$.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gtn {
    public boolean a;
    public UUID b;
    public gys c;
    public final Set d;
    private final Class e;

    public gtn(Class cls) {
        this.e = cls;
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = this.b.toString();
        uuid.getClass();
        String name = cls.getName();
        name.getClass();
        this.c = new gys(uuid, (gtk) null, name, (String) null, (gsi) null, (gsi) null, 0L, 0L, 0L, (gsf) null, 0, (gry) null, 0L, 0L, 0L, 0L, false, (gtf) null, 0, 0L, 0, 0, (String) null, 16777210);
        String name2 = cls.getName();
        name2.getClass();
        this.d = aqjn.f(name2);
    }

    public abstract kkc a();

    public final void b(gtf gtfVar) {
        gtfVar.getClass();
        gys gysVar = this.c;
        gysVar.s = true;
        gysVar.t = gtfVar;
    }

    public final void c(String str) {
        str.getClass();
        this.d.add(str);
    }

    public final void d(TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.q = timeUnit.toMillis(14L);
    }

    public final void e(gry gryVar, long j, TimeUnit timeUnit) {
        gryVar.getClass();
        timeUnit.getClass();
        this.a = true;
        gys gysVar = this.c;
        gysVar.n = gryVar;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            gsy.a();
            Log.w(gys.a, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            gsy.a();
            Log.w(gys.a, "Backoff delay duration less than minimum value");
        }
        gysVar.o = arrn.x(millis, 10000L, 18000000L);
    }

    public final void f(gsf gsfVar) {
        gsfVar.getClass();
        this.c.l = gsfVar;
    }

    public final void g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.i = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.i) {
        } else {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void h(Duration duration) {
        duration.getClass();
        this.c.i = duration.toMillis();
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.i) {
        } else {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void i(gsi gsiVar) {
        gsiVar.getClass();
        this.c.g = gsiVar;
    }

    public final kkc j() {
        boolean z;
        String str;
        kkc a = a();
        gsf gsfVar = this.c.l;
        if (!gsfVar.b() && !gsfVar.e && !gsfVar.c && !gsfVar.d) {
            z = false;
        } else {
            z = true;
        }
        gys gysVar = this.c;
        if (gysVar.s) {
            if (!z) {
                if (gysVar.i > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            } else {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
        }
        if (gysVar.z == null) {
            List ab = arsd.ab(gysVar.e, new String[]{"."}, 0, 6);
            if (ab.size() == 1) {
                str = (String) ab.get(0);
            } else {
                str = (String) aqjn.ac(ab);
            }
            if (str.length() > 127) {
                str = arsd.ah(str, 127);
            }
            gysVar.z = str;
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        gys gysVar2 = this.c;
        gysVar2.getClass();
        this.c = new gys(uuid, gysVar2.d, gysVar2.e, gysVar2.f, new gsi(gysVar2.g), new gsi(gysVar2.h), gysVar2.i, gysVar2.j, gysVar2.k, new gsf(gysVar2.l), gysVar2.m, gysVar2.n, gysVar2.o, gysVar2.p, gysVar2.q, gysVar2.r, gysVar2.s, gysVar2.t, gysVar2.u, gysVar2.w, gysVar2.x, gysVar2.y, gysVar2.z, 524288);
        return a;
    }
}
