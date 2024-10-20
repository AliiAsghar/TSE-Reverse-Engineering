package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekf {
    public static final aekf a;
    public static final aekf b;
    public static final aekf c;
    private static final /* synthetic */ aekf[] d;

    static {
        aekf aekfVar = new aekf("PDF", 0);
        a = aekfVar;
        aekf aekfVar2 = new aekf("CALENDAR", 1);
        b = aekfVar2;
        aekf aekfVar3 = new aekf("GENERIC_FILE", 2);
        c = aekfVar3;
        aekf[] aekfVarArr = {aekfVar, aekfVar2, aekfVar3};
        d = aekfVarArr;
        arhi.f(aekfVarArr);
    }

    private aekf(String str, int i) {
    }

    public static aekf[] values() {
        return (aekf[]) d.clone();
    }
}
