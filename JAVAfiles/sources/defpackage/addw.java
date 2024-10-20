package defpackage;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addw extends HashMap {
    private final adae a;

    public addw(adae adaeVar) {
        this.a = adaeVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adrc put(String str, adrc adrcVar) {
        if (aczf.I()) {
            int i = 2;
            Optional filter = ((adnk) this.a.a).j().map(new addg(i)).map(new addg(3)).filter(new addf(i));
            while (filter.isPresent() && size() >= ((Integer) filter.get()).intValue()) {
                Map.Entry entry = (Map.Entry) Collection.EL.stream(entrySet()).min(Comparator.CC.comparing(new addg(4))).get();
                adrc adrcVar2 = (adrc) entry.getValue();
                adrcVar2.n(9, 68);
                remove(entry.getKey());
                advr.q("The max session limit is exceeded. Stopping least recently active session id: %s", advq.GENERIC.c(adrcVar2.k));
            }
        }
        return (adrc) super.put(str, adrcVar);
    }
}
