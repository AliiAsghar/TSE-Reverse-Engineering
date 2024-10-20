package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class antk {
    private final Map c = new HashMap();
    private static final antj b = new annw(12);
    public static final antk a = c();

    private static antk c() {
        antk antkVar = new antk();
        try {
            antkVar.a(b, antg.class);
            return antkVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized void a(antj antjVar, Class cls) {
        antj antjVar2 = (antj) this.c.get(cls);
        if (antjVar2 != null && !antjVar2.equals(antjVar)) {
            throw new GeneralSecurityException(a.bX(cls, "Different key creator for parameters class ", " already inserted"));
        }
        this.c.put(cls, antjVar);
    }

    public final synchronized anme b(anme anmeVar, Integer num) {
        antj antjVar;
        antjVar = (antj) this.c.get(anmeVar.getClass());
        if (antjVar != null) {
        } else {
            throw new GeneralSecurityException(a.bX(anmeVar, "Cannot create a new key for parameters ", ": no key creator for this class was registered."));
        }
        return antjVar.a(anmeVar, num);
    }
}
