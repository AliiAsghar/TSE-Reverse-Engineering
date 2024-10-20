package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aove {
    public static volatile aqux a;
    public static volatile aqux b;

    private aove() {
    }

    public static boolean a(Object obj) {
        if (!((apbo) obj).b) {
            return true;
        }
        return false;
    }

    public static Object b(Object obj, Object obj2) {
        apbo apboVar = (apbo) obj;
        apbo apboVar2 = (apbo) obj2;
        if (!apboVar2.isEmpty()) {
            if (!apboVar.b) {
                apboVar = apboVar.a();
            }
            apboVar.b();
            if (!apboVar2.isEmpty()) {
                apboVar.putAll(apboVar2);
            }
        }
        return apboVar;
    }

    public static Object c() {
        return apbo.a.a();
    }

    public static apax d(Object obj, long j) {
        return (apax) apdb.h(obj, j);
    }

    public static List e(Object obj, long j) {
        int i;
        apax d = d(obj, j);
        if (!d.c()) {
            int size = d.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            apax e = d.e(i);
            apdb.u(obj, j, e);
            return e;
        }
        return d;
    }

    public static int f(int i) {
        if (i != 0) {
            if (i != 2) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    public static int g(int i) {
        if (i == 0) {
            return 5;
        }
        if (i != 2) {
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 3;
            }
            if (i == 5) {
                return 4;
            }
            return 0;
        }
        return 1;
    }

    public static void h(appo appoVar) {
        appoVar.a();
    }

    public static atii i(Object obj) {
        return (atii) ((aojh) obj).a;
    }
}
