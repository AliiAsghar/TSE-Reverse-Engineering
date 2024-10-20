package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class axp {
    public static final axp a;
    public static final axp b;
    public static final axp c;
    private static final /* synthetic */ axp[] d;

    static {
        axp axpVar = new axp("Cursor", 0);
        a = axpVar;
        axp axpVar2 = new axp("SelectionStart", 1);
        b = axpVar2;
        axp axpVar3 = new axp("SelectionEnd", 2);
        c = axpVar3;
        axp[] axpVarArr = {axpVar, axpVar2, axpVar3};
        d = axpVarArr;
        arhi.f(axpVarArr);
    }

    private axp(String str, int i) {
    }

    public static axp[] values() {
        return (axp[]) d.clone();
    }
}
