package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abe {
    public static final abe a;
    public static final abe b;
    public static final abe c;
    private static final /* synthetic */ abe[] d;

    static {
        abe abeVar = new abe("Default", 0);
        a = abeVar;
        abe abeVar2 = new abe("UserInput", 1);
        b = abeVar2;
        abe abeVar3 = new abe("PreventUserInput", 2);
        c = abeVar3;
        abe[] abeVarArr = {abeVar, abeVar2, abeVar3};
        d = abeVarArr;
        arhi.f(abeVarArr);
    }

    private abe(String str, int i) {
    }

    public static abe[] values() {
        return (abe[]) d.clone();
    }
}
