package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class cul {
    public static final cul a;
    public static final cul b;
    private static final /* synthetic */ cul[] c;

    static {
        cul culVar = new cul("Min", 0);
        a = culVar;
        cul culVar2 = new cul("Max", 1);
        b = culVar2;
        cul[] culVarArr = {culVar, culVar2};
        c = culVarArr;
        arhi.f(culVarArr);
    }

    private cul(String str, int i) {
    }

    public static cul[] values() {
        return (cul[]) c.clone();
    }
}
