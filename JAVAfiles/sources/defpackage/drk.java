package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class drk {
    public static final drk a;
    public static final drk b;
    private static final /* synthetic */ drk[] c;

    static {
        drk drkVar = new drk("Ltr", 0);
        a = drkVar;
        drk drkVar2 = new drk("Rtl", 1);
        b = drkVar2;
        drk[] drkVarArr = {drkVar, drkVar2};
        c = drkVarArr;
        arhi.f(drkVarArr);
    }

    private drk(String str, int i) {
    }

    public static drk[] values() {
        return (drk[]) c.clone();
    }
}
