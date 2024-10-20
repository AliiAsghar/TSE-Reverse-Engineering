package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anje {
    public static final anje a;
    public static final anje b;
    public static final anje c;
    public static final anje d;
    private static final /* synthetic */ anje[] e;

    static {
        anje anjeVar = new anje("UNKNOWN_REMOVAL_POLICY", 0);
        a = anjeVar;
        anje anjeVar2 = new anje("NO_USER_REMOVAL_ALLOWED", 1);
        b = anjeVar2;
        anje anjeVar3 = new anje("REMOVAL_ALLOWED_FOR_ALL", 2);
        c = anjeVar3;
        anje anjeVar4 = new anje("REMOVAL_ALLOWED_FOR_ADMINS", 3);
        d = anjeVar4;
        anje[] anjeVarArr = {anjeVar, anjeVar2, anjeVar3, anjeVar4};
        e = anjeVarArr;
        arhi.f(anjeVarArr);
    }

    private anje(String str, int i) {
    }

    public static anje[] values() {
        return (anje[]) e.clone();
    }
}
