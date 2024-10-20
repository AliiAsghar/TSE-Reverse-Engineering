package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class abrg {
    private static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static Set a() {
        Set set = a;
        synchronized (set) {
        }
        return set;
    }

    public void b(abry abryVar) {
        throw null;
    }

    public void c(abry abryVar) {
        throw null;
    }
}
