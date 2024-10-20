package defpackage;

import com.google.communication.synapse.security.scytale.DbWrapperFactory;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ttb {
    public static final xze a = xze.g("BugleEtouffee", "CryptoV2Provider");
    public final DbWrapperFactory b;
    public final ConcurrentMap c = new ConcurrentHashMap();
    public final uac d;
    public final wyp e;
    public final iji f;
    public final iew g;
    private final vcs h;
    private final apwt i;
    private final anen j;
    private final anen k;
    private final armf l;

    public ttb(vcs vcsVar, iji ijiVar, apwt apwtVar, uac uacVar, twi twiVar, anen anenVar, anen anenVar2, armf armfVar, iew iewVar, wyp wypVar) {
        this.h = vcsVar;
        this.f = ijiVar;
        this.i = apwtVar;
        this.d = uacVar;
        this.b = new tta(twiVar);
        this.j = anenVar;
        this.k = anenVar2;
        this.l = armfVar;
        this.g = iewVar;
        this.e = wypVar;
    }

    private final akul d(String str) {
        return this.h.b(str).h(new rgh(11), andi.a);
    }

    public final akul a(String str) {
        synchronized (this.c) {
            akul akulVar = (akul) this.c.get(str);
            if (akulVar != null) {
                return akulVar;
            }
            this.i.b();
            byte[] bArr = null;
            akul f = d(str).i(new tsm(this, str, 2, bArr), this.k).f(Throwable.class, new tsm(this, str, 4, bArr), andi.a);
            synchronized (this.c) {
                this.c.putIfAbsent(str, f);
            }
            return f;
        }
    }

    public final akul b(String str) {
        akul h = ((ttj) this.l.b()).b(str).h(new rgh(13), andi.a);
        byte[] bArr = null;
        akul i = h.i(new tsm(this, str, 6, bArr), andi.a);
        akul i2 = h.i(new tsm(this, str, 3, bArr), this.j);
        return aktp.ap(i, i2).h(new imh((Object) this, (Object) i, (Object) i2, (Object) str, 4), this.j);
    }

    public final akul c(String str) {
        a.o("Resetting crypto data store");
        return d(str).h(new raw(this, str, 9), this.j).h(new rgh(12), andi.a);
    }
}
