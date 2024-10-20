package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zep {
    public static final zep a;
    public static final zep b;
    public static final zep c;
    public static final zep d;
    public static final zep e;
    public static final zep f;
    private static final /* synthetic */ zep[] g;

    static {
        zep zepVar = new zep("ONE_TO_ONE", 0);
        a = zepVar;
        zep zepVar2 = new zep("CREATE_GROUP", 1);
        b = zepVar2;
        zep zepVar3 = new zep("MULTI_SELECT", 2);
        c = zepVar3;
        zep zepVar4 = new zep("ADD_TO_RCS_GROUP", 3);
        d = zepVar4;
        zep zepVar5 = new zep("ADD_TO_EMPTY_RCS_GROUP", 4);
        e = zepVar5;
        zep zepVar6 = new zep("ADD_TO_E2EE_GROUP", 5);
        f = zepVar6;
        zep[] zepVarArr = {zepVar, zepVar2, zepVar3, zepVar4, zepVar5, zepVar6};
        g = zepVarArr;
        arhi.f(zepVarArr);
    }

    private zep(String str, int i) {
    }

    public static zep[] values() {
        return (zep[]) g.clone();
    }

    public final boolean a() {
        if (this != b && this != d && this != e && this != f) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this == f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this != d && this != e && this != f) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        if (this == a) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this != b && this != c && this != d && this != e && this != f) {
            return false;
        }
        return true;
    }
}
