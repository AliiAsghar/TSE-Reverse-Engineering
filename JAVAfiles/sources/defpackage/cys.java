package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cys {
    public static final cys a;
    public static final cys b;
    private static final /* synthetic */ cys[] c;

    static {
        cys cysVar = new cys("Min", 0);
        a = cysVar;
        cys cysVar2 = new cys("Max", 1);
        b = cysVar2;
        cys[] cysVarArr = {cysVar, cysVar2};
        c = cysVarArr;
        arhi.f(cysVarArr);
    }

    private cys(String str, int i) {
    }

    public static cys[] values() {
        return (cys[]) c.clone();
    }
}
