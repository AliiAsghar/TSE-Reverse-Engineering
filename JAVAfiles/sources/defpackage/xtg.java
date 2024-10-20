package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtg {
    public static final xtg a;
    public static final xtg b;
    public static final xtg c;
    public static final xtg d;
    private static final /* synthetic */ xtg[] h;
    public final int e;
    public final amuk f;
    public final String g;

    static {
        xtg xtgVar = new xtg("UNKNOWN", 0, Integer.MAX_VALUE, amuk.TRANSPORT_UNKNOWN, "UNKNOWN");
        a = xtgVar;
        xtg xtgVar2 = new xtg("SINGLE_REGISTRATION", 1, 0, amuk.TRANSPORT_SINGLE_REGISTRATION, "Chat API w/ RCS-SG");
        b = xtgVar2;
        xtg xtgVar3 = new xtg("TACHYGRAM", 2, 1, amuk.TRANSPORT_TACHYGRAM, "Chat API w/ Tachygram");
        c = xtgVar3;
        xtg xtgVar4 = new xtg("DUAL_REGISTRATION", 3, 2, amuk.TRANSPORT_RCS, "Chat API w/ RCS");
        d = xtgVar4;
        xtg[] xtgVarArr = {xtgVar, xtgVar2, xtgVar3, xtgVar4};
        h = xtgVarArr;
        arhi.f(xtgVarArr);
    }

    private xtg(String str, int i, int i2, amuk amukVar, String str2) {
        this.e = i2;
        this.f = amukVar;
        this.g = str2;
    }

    public static xtg[] values() {
        return (xtg[]) h.clone();
    }
}
