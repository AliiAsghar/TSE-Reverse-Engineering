package defpackage;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alyc extends alxu {
    private static final boolean a = a.a();
    private static final boolean b;
    private static final alxt c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public final class a {
        a() {
        }

        static boolean a() {
            return alyc.t();
        }
    }

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new alxt() { // from class: alyc.1
            @Override // defpackage.alxt
            public alvr a(Class<?> cls, int i) {
                return alvr.a;
            }

            @Override // defpackage.alxt
            public String b(Class<? extends aluw<?>> cls) {
                StackTraceElement a2;
                if (alyc.a) {
                    try {
                        if (cls.equals(alyc.p())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (alyc.b && (a2 = alzv.a(cls, 1)) != null) {
                    return a2.getClassName();
                }
                return null;
            }
        };
    }

    static Class<?> p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return a.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.alxu
    protected alww e(String str) {
        if (alyf.d.get() != null) {
            return ((alya) alyf.d.get()).a(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char charAt = str.charAt(length);
                if (charAt == '$') {
                    str = str.replace('$', '.');
                    break;
                }
                if (charAt == '.') {
                    break;
                }
            } else {
                break;
            }
        }
        alyf alyfVar = new alyf(str);
        alye.a.offer(alyfVar);
        if (alyf.d.get() == null) {
            return alyfVar;
        }
        alyf.e();
        return alyfVar;
    }

    @Override // defpackage.alxu
    protected alxt h() {
        return c;
    }

    @Override // defpackage.alxu
    protected alyt j() {
        return alyg.a;
    }

    @Override // defpackage.alxu
    protected String m() {
        return "platform: Android";
    }
}
