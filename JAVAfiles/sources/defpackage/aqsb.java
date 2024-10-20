package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqsb {
    public static final aqsb a = new aqsb(new aqry(1), aqry.a);
    public final ConcurrentMap b = new ConcurrentHashMap();

    public aqsb(aqsa... aqsaVarArr) {
        for (aqsa aqsaVar : aqsaVarArr) {
            this.b.put(aqsaVar.c(), aqsaVar);
        }
    }

    public static aqsb a() {
        return new aqsb(new aqsa[0]);
    }
}
