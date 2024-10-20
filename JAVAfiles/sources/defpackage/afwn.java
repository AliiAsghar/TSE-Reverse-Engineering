package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwn {
    public static final afwn a;
    public static final afwn b;
    private static final /* synthetic */ afwn[] c;

    static {
        afwn afwnVar = new afwn("NONE", 0);
        a = afwnVar;
        afwn afwnVar2 = new afwn("CLEAR", 1);
        b = afwnVar2;
        afwn[] afwnVarArr = {afwnVar, afwnVar2};
        c = afwnVarArr;
        arhi.f(afwnVarArr);
    }

    private afwn(String str, int i) {
    }

    public static afwn[] values() {
        return (afwn[]) c.clone();
    }
}
