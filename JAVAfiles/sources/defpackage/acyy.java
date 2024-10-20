package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyy {
    public static volatile acyx b;
    public static final acyw a = acyw.OFF;
    private static final Object c = new Object();

    public static acyx a() {
        if (b == null) {
            synchronized (c) {
                if (b == null) {
                    b = ((acyv) acrk.a(acyv.class)).l();
                    b.l();
                }
            }
        }
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("CsLibAllowSwitch flags are not initialized!");
    }

    public static acyz b(String str) {
        acyx a2 = a();
        acyz acyzVar = (acyz) a2.a.get(str);
        if (acyzVar == null) {
            acyzVar = a2.i(str, a2.b);
            acyz acyzVar2 = (acyz) a2.a.putIfAbsent(str, acyzVar);
            if (acyzVar2 != null) {
                return acyzVar2;
            }
        }
        return acyzVar;
    }
}
