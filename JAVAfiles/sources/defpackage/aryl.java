package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aryl {
    public static final ThreadLocal a = new ThreadLocal();

    public static final arwx a() {
        ThreadLocal threadLocal = a;
        arwx arwxVar = (arwx) threadLocal.get();
        if (arwxVar == null) {
            arvl arvlVar = new arvl(Thread.currentThread());
            threadLocal.set(arvlVar);
            return arvlVar;
        }
        return arwxVar;
    }
}
