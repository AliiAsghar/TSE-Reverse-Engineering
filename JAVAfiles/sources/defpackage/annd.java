package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class annd {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static annc a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            annc anncVar = (annc) it.next();
            if (anncVar.b(str)) {
                return anncVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
