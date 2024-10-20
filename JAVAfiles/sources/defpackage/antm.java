package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class antm {
    public static final antm a = new antm();
    private final Map b = new HashMap();

    public final synchronized void a(antl antlVar, Class cls) {
        antl antlVar2 = (antl) this.b.get(cls);
        if (antlVar2 != null && !antlVar2.equals(antlVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.b.put(cls, antlVar);
    }
}
