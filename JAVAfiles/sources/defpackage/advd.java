package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advd {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    private volatile Optional b = Optional.empty();

    public static final void c(advc advcVar, Object obj) {
        Object apply;
        Function function = advcVar.e;
        if (function != null) {
            apply = function.apply(obj);
            if (!((Boolean) apply).booleanValue()) {
                return;
            }
        }
        advcVar.b.execute(akto.j(new adhc(advcVar, obj, 5, null)));
    }

    public final void a(advc advcVar) {
        if (!this.a.containsKey(advcVar.d)) {
            this.a.put(advcVar.d, advcVar);
            if (advcVar.c) {
                this.b.ifPresent(new adoj(advcVar, 9));
            }
        }
    }

    public final void b(Object obj) {
        this.b = Optional.ofNullable(obj);
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            c((advc) it.next(), obj);
        }
    }

    public final void d(Object obj) {
        this.a.remove(obj);
    }
}
