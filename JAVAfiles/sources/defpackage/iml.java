package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iml {
    public static final iml a;
    public static final iml b;
    public static final iml c;
    private static final /* synthetic */ iml[] d;

    static {
        iml imlVar = new iml("DEFAULT", 0);
        a = imlVar;
        iml imlVar2 = new iml("COMBINE", 1);
        b = imlVar2;
        iml imlVar3 = new iml("COMBINE_AND_RETAIN_REPLY", 2);
        c = imlVar3;
        iml[] imlVarArr = {imlVar, imlVar2, imlVar3};
        d = imlVarArr;
        arhi.f(imlVarArr);
    }

    private iml(String str, int i) {
    }

    public static iml[] values() {
        return (iml[]) d.clone();
    }
}
