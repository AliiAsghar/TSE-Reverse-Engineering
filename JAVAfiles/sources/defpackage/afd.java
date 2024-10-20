package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afd {
    public static final afd a;
    public static final afd b;
    public static final afd c;
    private static final /* synthetic */ afd[] d;

    static {
        afd afdVar = new afd("Default", 0);
        a = afdVar;
        afd afdVar2 = new afd("UserInput", 1);
        b = afdVar2;
        afd afdVar3 = new afd("PreventUserInput", 2);
        c = afdVar3;
        afd[] afdVarArr = {afdVar, afdVar2, afdVar3};
        d = afdVarArr;
        arhi.f(afdVarArr);
    }

    private afd(String str, int i) {
    }

    public static afd[] values() {
        return (afd[]) d.clone();
    }
}
