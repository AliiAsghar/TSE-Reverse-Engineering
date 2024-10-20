package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdp {
    public static final agdp a;
    public static final agdp b;
    public static final agdp c;
    public static final agdp d;
    private static final /* synthetic */ agdp[] e;

    static {
        agdp agdpVar = new agdp("MATCHING_KEYBOARD", 0);
        a = agdpVar;
        agdp agdpVar2 = new agdp("ABOVE_KEYBOARD", 1);
        b = agdpVar2;
        agdp agdpVar3 = new agdp("EXPANDED", 2);
        c = agdpVar3;
        agdp agdpVar4 = new agdp("CLOSED", 3);
        d = agdpVar4;
        agdp[] agdpVarArr = {agdpVar, agdpVar2, agdpVar3, agdpVar4};
        e = agdpVarArr;
        arhi.f(agdpVarArr);
    }

    private agdp(String str, int i) {
    }

    public static agdp[] values() {
        return (agdp[]) e.clone();
    }
}
