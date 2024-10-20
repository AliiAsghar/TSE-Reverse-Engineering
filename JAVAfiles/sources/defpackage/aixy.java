package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aixy {
    public final armf a;
    public final String c;
    public final aixw[] d;
    public boolean e = true;
    HashMap f = new HashMap(10);
    public int g = 0;
    final Object b = new Object();

    public aixy(String str, armf armfVar, aixw... aixwVarArr) {
        this.c = str;
        this.d = aixwVarArr;
        this.a = armfVar;
    }

    public final void a() {
        this.e = false;
    }

    public final void b(Object... objArr) {
        boolean z;
        if (this.d.length == objArr.length) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (this.e) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    if (!this.d[i].b.isInstance(obj)) {
                        String str = this.c;
                        String obj2 = obj.toString();
                        Class<?> cls = obj.getClass();
                        aixw[] aixwVarArr = this.d;
                        String valueOf = String.valueOf(cls);
                        aixw aixwVar = aixwVarArr[i];
                        throw new IllegalArgumentException("Streamz " + str + " has parameter {index: " + i + ", value: " + obj2 + ", type: " + valueOf + "}, but expected: {name: " + aixwVar.a + ", type: " + aixwVar.b.toString() + "}");
                    }
                } else {
                    throw new NullPointerException("Streamz " + this.c + " has null parameter: " + Arrays.toString(objArr));
                }
            }
        }
        Long l = 1L;
        aixu aixuVar = new aixu(objArr);
        synchronized (this.b) {
            aixv aixvVar = (aixv) this.f.get(aixuVar);
            if (aixvVar == null) {
                aixvVar = new aixv();
                this.f.put(aixuVar, aixvVar);
            }
            long j = aixvVar.a;
            l.getClass();
            aixvVar.a = j + 1;
            this.g++;
        }
        aixz aixzVar = ((aiya) this.a).c;
        if (aixzVar != null) {
            aiyc aiycVar = (aiyc) aixzVar;
            int i2 = 15;
            if (aiycVar.c.incrementAndGet() >= 100) {
                synchronized (aiycVar.e) {
                    if (((aiyc) aixzVar).c.get() >= 100) {
                        synchronized (((aiyc) aixzVar).e) {
                            ScheduledFuture scheduledFuture = ((aiyc) aixzVar).d;
                            if (scheduledFuture != null && !scheduledFuture.isDone() && !((aiyc) aixzVar).d.isCancelled()) {
                                if (((aiyc) aixzVar).d.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                    ((aiyc) aixzVar).a();
                                    ((aiyc) aixzVar).d = ((aiyc) aixzVar).a.schedule(new ahsa(aixzVar, i2), 1L, TimeUnit.MILLISECONDS);
                                }
                            }
                            ((aiyc) aixzVar).d = ((aiyc) aixzVar).a.schedule(new ahsa(aixzVar, i2), 1L, TimeUnit.MILLISECONDS);
                        }
                        return;
                    }
                }
            }
            synchronized (aiycVar.e) {
                ScheduledFuture scheduledFuture2 = ((aiyc) aixzVar).d;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((aiyc) aixzVar).d.isCancelled()) {
                    ((aiyc) aixzVar).d = ((aiyc) aixzVar).a.schedule(new ahsa(aixzVar, i2), ((aiyc) aixzVar).b, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
}
