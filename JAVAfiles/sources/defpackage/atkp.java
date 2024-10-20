package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atkp {
    private static final atma a;

    static {
        atko atkoVar = new atko();
        a = atkoVar;
        atkoVar.d(1, "IN");
        atkoVar.d(3, "CH");
        atkoVar.e(3, "CHAOS");
        atkoVar.d(4, "HS");
        atkoVar.e(4, "HESIOD");
        atkoVar.d(254, "NONE");
        atkoVar.d(255, "ANY");
    }

    public static String a(int i) {
        return a.c(i);
    }

    public static void b(int i) {
        if (i >= 0 && i <= 65535) {
        } else {
            throw new atlk(i);
        }
    }
}
