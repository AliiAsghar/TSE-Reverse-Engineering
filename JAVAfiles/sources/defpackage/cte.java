package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cte {
    public static final cte a;
    public static final cte b;
    private static final /* synthetic */ cte[] c;

    static {
        cte cteVar = new cte("Min", 0);
        a = cteVar;
        cte cteVar2 = new cte("Max", 1);
        b = cteVar2;
        cte[] cteVarArr = {cteVar, cteVar2};
        c = cteVarArr;
        arhi.f(cteVarArr);
    }

    private cte(String str, int i) {
    }

    public static cte[] values() {
        return (cte[]) c.clone();
    }
}
