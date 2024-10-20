package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agaq {
    public static final agaq a;
    public static final agaq b;
    public static final agaq c;
    public static final agaq d;
    private static final /* synthetic */ agaq[] f;
    public final boolean e;

    static {
        agaq agaqVar = new agaq("OPEN", 0, false);
        a = agaqVar;
        agaq agaqVar2 = new agaq("OPENING", 1, true);
        b = agaqVar2;
        agaq agaqVar3 = new agaq("CLOSING", 2, true);
        c = agaqVar3;
        agaq agaqVar4 = new agaq("CLOSED", 3, false);
        d = agaqVar4;
        agaq[] agaqVarArr = {agaqVar, agaqVar2, agaqVar3, agaqVar4};
        f = agaqVarArr;
        arhi.f(agaqVarArr);
    }

    private agaq(String str, int i, boolean z) {
        this.e = !z;
    }

    public static agaq[] values() {
        return (agaq[]) f.clone();
    }
}
