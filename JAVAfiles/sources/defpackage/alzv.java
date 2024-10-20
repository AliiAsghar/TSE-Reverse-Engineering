package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alzv {
    private static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final alzy b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [alzy] */
    static {
        amaa amaaVar;
        int i = 0;
        while (true) {
            if (i < 2) {
                amaaVar = null;
                try {
                    amaaVar = (alzy) Class.forName(a[i]).asSubclass(alzy.class).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                }
                if (amaaVar != null) {
                    break;
                } else {
                    i++;
                }
            } else {
                amaaVar = new amaa();
                break;
            }
        }
        b = amaaVar;
    }

    public static StackTraceElement a(Class cls, int i) {
        cls.getClass();
        if (i >= 0) {
            return b.a(cls, i + 1);
        }
        throw new IllegalArgumentException(a.bV(i, "skip count cannot be negative: "));
    }

    public static StackTraceElement[] b(Class cls, int i, int i2) {
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("invalid maximum depth: 0");
        }
        return b.b(cls, i, i2 + 1);
    }
}
