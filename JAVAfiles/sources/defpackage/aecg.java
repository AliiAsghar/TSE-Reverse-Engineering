package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aecg {
    public static final aecg a;
    public static final aecg b;
    public static final aecg c;
    public static final aecg d;
    public static final aecg e;
    public static final aecg f;
    private static final /* synthetic */ aecg[] g;

    static {
        aecg aecgVar = new aecg("NONE", 0);
        a = aecgVar;
        aecg aecgVar2 = new aecg("WARN", 1);
        b = aecgVar2;
        aecg aecgVar3 = new aecg("HIDE", 2);
        c = aecgVar3;
        aecg aecgVar4 = new aecg("UNKNOWN", 3);
        d = aecgVar4;
        aecg aecgVar5 = new aecg("NOT_AVAILABLE", 4);
        e = aecgVar5;
        aecg aecgVar6 = new aecg("DELETE", 5);
        f = aecgVar6;
        aecg[] aecgVarArr = {aecgVar, aecgVar2, aecgVar3, aecgVar4, aecgVar5, aecgVar6};
        g = aecgVarArr;
        arhi.f(aecgVarArr);
    }

    private aecg(String str, int i) {
    }

    public static aecg[] values() {
        return (aecg[]) g.clone();
    }
}
