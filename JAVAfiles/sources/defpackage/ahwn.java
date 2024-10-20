package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahwn implements ahwo {
    public final ahwm a;
    private final ConcurrentMap b = new ConcurrentHashMap();

    private ahwn(ahwm ahwmVar) {
        this.a = ahwmVar;
    }

    public static ahwn c() {
        return new ahwn(new ahwl(0));
    }

    public static ahwn d() {
        return new ahwn(new ahwl(1));
    }

    @Override // defpackage.ahwo
    public final void a(ahwc ahwcVar) {
        this.b.put(this.a.a(ahwcVar), ahwcVar);
    }

    public final ahwc b(Object obj) {
        if (obj != null) {
            return (ahwc) this.b.get(obj);
        }
        return null;
    }
}
