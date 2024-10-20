package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xkk {
    public static final xkk a;
    public static final xkk b;
    public static final xkk c;
    public static final xkk d;
    public static final xkk e;
    public static final xkk f;
    private static final /* synthetic */ xkk[] g;

    static {
        xkk xkkVar = new xkk("SUCCESS", 0);
        a = xkkVar;
        xkk xkkVar2 = new xkk("DIRTY", 1);
        b = xkkVar2;
        xkk xkkVar3 = new xkk("SCAN_FAILED", 2);
        c = xkkVar3;
        xkk xkkVar4 = new xkk("NOT_DEFAULT_SMS_APP", 3);
        d = xkkVar4;
        xkk xkkVar5 = new xkk("MISSING_PERMISSIONS", 4);
        e = xkkVar5;
        xkk xkkVar6 = new xkk("STALLED", 5);
        f = xkkVar6;
        xkk[] xkkVarArr = {xkkVar, xkkVar2, xkkVar3, xkkVar4, xkkVar5, xkkVar6};
        g = xkkVarArr;
        arhi.f(xkkVarArr);
    }

    private xkk(String str, int i) {
    }

    public static xkk[] values() {
        return (xkk[]) g.clone();
    }
}
