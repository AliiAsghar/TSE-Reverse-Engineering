package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pue {
    public static final pue a;
    public static final pue b;
    private static final /* synthetic */ pue[] c;

    static {
        pue pueVar = new pue("LATCHED", 0);
        a = pueVar;
        pue pueVar2 = new pue("UNLATCHED", 1);
        b = pueVar2;
        pue[] pueVarArr = {pueVar, pueVar2};
        c = pueVarArr;
        arhi.f(pueVarArr);
    }

    private pue(String str, int i) {
    }

    public static pue[] values() {
        return (pue[]) c.clone();
    }
}
