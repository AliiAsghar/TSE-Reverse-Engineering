package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ciz implements ciy {
    public static final ciz a;
    public static final ciz b;
    public static final ciz c;
    public static final ciz d;
    private static final /* synthetic */ ciz[] e;

    static {
        ciz cizVar = new ciz("Active", 0);
        a = cizVar;
        ciz cizVar2 = new ciz("ActiveParent", 1);
        b = cizVar2;
        ciz cizVar3 = new ciz("Captured", 2);
        c = cizVar3;
        ciz cizVar4 = new ciz("Inactive", 3);
        d = cizVar4;
        ciz[] cizVarArr = {cizVar, cizVar2, cizVar3, cizVar4};
        e = cizVarArr;
        arhi.f(cizVarArr);
    }

    private ciz(String str, int i) {
    }

    public static ciz[] values() {
        return (ciz[]) e.clone();
    }

    @Override // defpackage.ciy
    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        throw new armm();
    }

    @Override // defpackage.ciy
    public final boolean b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new armm();
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
