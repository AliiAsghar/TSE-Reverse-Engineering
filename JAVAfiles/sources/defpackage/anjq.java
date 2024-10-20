package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjq {
    public static final anjq a;
    public static final anjq b;
    public static final anjq c;
    private static final /* synthetic */ anjq[] d;

    static {
        anjq anjqVar = new anjq("UNKNOWN", 0);
        a = anjqVar;
        anjq anjqVar2 = new anjq("DEFAULT", 1);
        b = anjqVar2;
        anjq anjqVar3 = new anjq("ADMINISTRATED", 2);
        c = anjqVar3;
        anjq[] anjqVarArr = {anjqVar, anjqVar2, anjqVar3};
        d = anjqVarArr;
        arhi.f(anjqVarArr);
    }

    private anjq(String str, int i) {
    }

    public static anjq[] values() {
        return (anjq[]) d.clone();
    }

    public final boolean a(anjf anjfVar) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw null;
                }
            } else {
                if (anje.d != anjfVar.a) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
