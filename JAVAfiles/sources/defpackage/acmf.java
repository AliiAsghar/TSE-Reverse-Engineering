package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmf {
    private static acmk a;

    public static synchronized acmk a() {
        acmk acmkVar;
        synchronized (acmf.class) {
            if (a == null) {
                b(new acmk());
            }
            acmkVar = a;
        }
        return acmkVar;
    }

    public static synchronized void b(acmk acmkVar) {
        synchronized (acmf.class) {
            if (a == null) {
                a = acmkVar;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
