package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjk {
    public static final anjk a;
    public static final anjk b;
    public static final anjk c;
    private static final /* synthetic */ anjk[] d;

    static {
        anjk anjkVar = new anjk("UNKNOWN", 0);
        a = anjkVar;
        anjk anjkVar2 = new anjk("DEFAULT", 1);
        b = anjkVar2;
        anjk anjkVar3 = new anjk("ADMINISTRATOR", 2);
        c = anjkVar3;
        anjk[] anjkVarArr = {anjkVar, anjkVar2, anjkVar3};
        d = anjkVarArr;
        arhi.f(anjkVarArr);
    }

    private anjk(String str, int i) {
    }

    public static anjk[] values() {
        return (anjk[]) d.clone();
    }
}
