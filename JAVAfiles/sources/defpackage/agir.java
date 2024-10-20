package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agir {
    public static final agir a;
    public static final agir b;
    public static final agir c;
    private static final /* synthetic */ agir[] d;

    static {
        agir agirVar = new agir("PRE_RECORDING", 0);
        a = agirVar;
        agir agirVar2 = new agir("RECORDING", 1);
        b = agirVar2;
        agir agirVar3 = new agir("PLAYBACK", 2);
        c = agirVar3;
        agir[] agirVarArr = {agirVar, agirVar2, agirVar3};
        d = agirVarArr;
        arhi.f(agirVarArr);
    }

    private agir(String str, int i) {
    }

    public static agir[] values() {
        return (agir[]) d.clone();
    }
}
