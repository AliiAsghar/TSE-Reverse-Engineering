package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmr {
    public static final afmr a;
    public static final afmr b;
    public static final afmr c;
    private static final /* synthetic */ afmr[] d;

    static {
        afmr afmrVar = new afmr("PER_EMOJI", 0);
        a = afmrVar;
        afmr afmrVar2 = new afmr("PER_GROUP", 1);
        b = afmrVar2;
        afmr afmrVar3 = new afmr("GLOBAL", 2);
        c = afmrVar3;
        afmr[] afmrVarArr = {afmrVar, afmrVar2, afmrVar3};
        d = afmrVarArr;
        arhi.f(afmrVarArr);
    }

    private afmr(String str, int i) {
    }

    public static afmr[] values() {
        return (afmr[]) d.clone();
    }
}
