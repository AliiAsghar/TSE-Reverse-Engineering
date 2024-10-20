package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xec {
    public static final xec a;
    public static final xec b;
    public static final xec c;
    private static final /* synthetic */ xec[] d;

    static {
        xec xecVar = new xec("SUCCESS", 0);
        a = xecVar;
        xec xecVar2 = new xec("TEMPORARY_FAILURE", 1);
        b = xecVar2;
        xec xecVar3 = new xec("PERMANENT_FAILURE", 2);
        c = xecVar3;
        xec[] xecVarArr = {xecVar, xecVar2, xecVar3};
        d = xecVarArr;
        arhi.f(xecVarArr);
    }

    private xec(String str, int i) {
    }

    public static xec[] values() {
        return (xec[]) d.clone();
    }
}
