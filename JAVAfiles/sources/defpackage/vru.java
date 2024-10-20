package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vru {
    public static final akfc a = new akgc("rcs_availability_data_source_key");
    public final Map b = new ConcurrentHashMap();
    private final armf c;
    private final armf d;

    public vru(armf armfVar, armf armfVar2) {
        this.c = armfVar;
        this.d = armfVar2;
    }

    @Deprecated
    public final amwt a() {
        return b(((adtn) this.c.b()).l());
    }

    public final amwt b(String str) {
        amwt amwtVar = (amwt) this.b.get(str);
        if (amwtVar != null) {
            return amwtVar;
        }
        return amwt.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
    }

    public final void c(String str, amwt amwtVar) {
        ansy ansyVar = (ansy) this.d.b();
        arbj arbjVar = new arbj();
        arbjVar.n(aktp.ag((amwt) this.b.put(str, amwtVar)));
        arbjVar.o(a);
        arbjVar.c = new vgd(amwtVar, 10);
        ansyVar.i(arbjVar.m());
    }
}
