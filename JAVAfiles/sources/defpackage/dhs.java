package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhs {
    public static final dhs a;
    public static final dhs b;
    public static final dhs c;
    private static final /* synthetic */ dhs[] d;

    static {
        dhs dhsVar = new dhs("On", 0);
        a = dhsVar;
        dhs dhsVar2 = new dhs("Off", 1);
        b = dhsVar2;
        dhs dhsVar3 = new dhs("Indeterminate", 2);
        c = dhsVar3;
        dhs[] dhsVarArr = {dhsVar, dhsVar2, dhsVar3};
        d = dhsVarArr;
        arhi.f(dhsVarArr);
    }

    private dhs(String str, int i) {
    }

    public static dhs[] values() {
        return (dhs[]) d.clone();
    }
}
