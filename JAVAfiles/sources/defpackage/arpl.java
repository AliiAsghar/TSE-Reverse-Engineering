package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arpl {
    public static final arpl a;
    public static final arpl b;
    public static final arpl c;
    private static final /* synthetic */ arpl[] d;

    static {
        arpl arplVar = new arpl("COROUTINE_SUSPENDED", 0);
        a = arplVar;
        arpl arplVar2 = new arpl("UNDECIDED", 1);
        b = arplVar2;
        arpl arplVar3 = new arpl("RESUMED", 2);
        c = arplVar3;
        arpl[] arplVarArr = {arplVar, arplVar2, arplVar3};
        d = arplVarArr;
        arhi.f(arplVarArr);
    }

    private arpl(String str, int i) {
    }

    public static arpl[] values() {
        return (arpl[]) d.clone();
    }
}
