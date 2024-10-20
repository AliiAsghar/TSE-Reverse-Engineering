package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class brq {
    public static final brq a;
    public static final brq b;
    public static final brq c;
    private static final /* synthetic */ brq[] d;

    static {
        brq brqVar = new brq("Tabs", 0);
        a = brqVar;
        brq brqVar2 = new brq("Divider", 1);
        b = brqVar2;
        brq brqVar3 = new brq("Indicator", 2);
        c = brqVar3;
        brq[] brqVarArr = {brqVar, brqVar2, brqVar3};
        d = brqVarArr;
        arhi.f(brqVarArr);
    }

    private brq(String str, int i) {
    }

    public static brq[] values() {
        return (brq[]) d.clone();
    }
}
