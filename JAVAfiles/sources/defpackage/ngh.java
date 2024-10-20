package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngh {
    public static final ngh a;
    public static final ngh b;
    public static final ngh c;
    private static final /* synthetic */ ngh[] d;

    static {
        ngh nghVar = new ngh("AVAILABLE", 0);
        a = nghVar;
        ngh nghVar2 = new ngh("NOT_AVAILABLE", 1);
        b = nghVar2;
        ngh nghVar3 = new ngh("UNSUPPORTED_BY_CARRIER", 2);
        c = nghVar3;
        ngh[] nghVarArr = {nghVar, nghVar2, nghVar3};
        d = nghVarArr;
        arhi.f(nghVarArr);
    }

    private ngh(String str, int i) {
    }

    public static ngh[] values() {
        return (ngh[]) d.clone();
    }

    public final boolean a() {
        if (this == a) {
            return true;
        }
        return false;
    }
}
