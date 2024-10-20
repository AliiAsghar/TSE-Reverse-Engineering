package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbg {
    public static final a a;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    final class a extends agzr {
    }

    static {
        a aVar = new a();
        a = aVar;
        agzt.c("UserUnlocked", aVar);
    }

    public static boolean a() {
        ahbf ahbfVar = ahbf.a;
        if (!ahbfVar.b && !ahbfVar.c) {
            if (!ahbh.a) {
                try {
                    Class.forName("com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner");
                } catch (ClassNotFoundException unused) {
                    throw new IllegalStateException("This method should be called after startMonitor!");
                }
            }
            ahbfVar.b = true;
            agzt.d(a);
            return true;
        }
        return ahbfVar.b;
    }
}
