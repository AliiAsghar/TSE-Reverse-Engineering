package defpackage;

import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aklq {
    private static final ThreadLocal a = new aklo();

    public static void a(Object obj) {
        ((aklp) ((Stack) a.get()).pop()).a(obj);
    }

    public static void b(aklp aklpVar) {
        boolean z;
        if (((aklp) ((Stack) a.get()).pop()) == aklpVar) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
    }

    public static void c(aklp aklpVar) {
        ((Stack) a.get()).push(aklpVar);
    }
}
