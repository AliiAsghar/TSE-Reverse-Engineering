package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bps {
    public static final bps a;
    public static final bps b;
    public static final bps c;
    private static final /* synthetic */ bps[] d;

    static {
        bps bpsVar = new bps("Hidden", 0);
        a = bpsVar;
        bps bpsVar2 = new bps("Expanded", 1);
        b = bpsVar2;
        bps bpsVar3 = new bps("PartiallyExpanded", 2);
        c = bpsVar3;
        bps[] bpsVarArr = {bpsVar, bpsVar2, bpsVar3};
        d = bpsVarArr;
        arhi.f(bpsVarArr);
    }

    private bps(String str, int i) {
    }

    public static bps[] values() {
        return (bps[]) d.clone();
    }
}
