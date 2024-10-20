package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alvz<T> {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    private final Class e;

    /* JADX INFO: Access modifiers changed from: protected */
    public alvz(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public void a(Object obj, alvy alvyVar) {
        alvyVar.a(this.a, obj);
    }

    public void b(Iterator it, alvy alvyVar) {
        while (it.hasNext()) {
            a(it.next(), alvyVar);
        }
    }

    public final Object c(Object obj) {
        return this.e.cast(obj);
    }

    public final String toString() {
        Class cls = this.e;
        return getClass().getName() + "/" + this.a + "[" + cls.getName() + "]";
    }

    public alvz(String str, Class cls, boolean z, boolean z2) {
        alzz.e(str);
        this.a = str;
        this.e = cls;
        this.b = z;
        this.c = z2;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i = 0; i < 5; i++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.d = j;
    }
}
