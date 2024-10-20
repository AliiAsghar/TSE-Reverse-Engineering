package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class agci {
    public static final agci a;
    public static final agci b;
    public static final agci c;
    public static final agci d;
    public static final agci e;
    public static final agci f;
    private static final /* synthetic */ agci[] g;

    static {
        agci agciVar = new agci("Header", 0);
        a = agciVar;
        agci agciVar2 = new agci("Content", 1);
        b = agciVar2;
        agci agciVar3 = new agci("Footer", 2);
        c = agciVar3;
        agci agciVar4 = new agci("ContentOverlay", 3);
        d = agciVar4;
        agci agciVar5 = new agci("ScreenOverlay", 4);
        e = agciVar5;
        agci agciVar6 = new agci("Snackbar", 5);
        f = agciVar6;
        agci[] agciVarArr = {agciVar, agciVar2, agciVar3, agciVar4, agciVar5, agciVar6};
        g = agciVarArr;
        arhi.f(agciVarArr);
    }

    private agci(String str, int i) {
    }

    public static agci[] values() {
        return (agci[]) g.clone();
    }
}
