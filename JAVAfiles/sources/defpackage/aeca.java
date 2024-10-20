package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeca implements aebz {
    private final Map a;
    private final Optional b;

    public aeca(Map map, Optional optional) {
        this.a = map;
        this.b = optional;
    }

    @Override // defpackage.aebz
    public final aecd a(String str) {
        aeck aeckVar = (aeck) this.a.get(str);
        if (aeckVar == null) {
            aeckVar = aeck.a;
        }
        Object k = arsd.k(this.b);
        if (true != aeckVar.d) {
            k = null;
        }
        return (aecd) k;
    }
}
