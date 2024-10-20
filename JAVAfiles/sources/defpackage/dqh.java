package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqh {
    public static final dqh a;
    public static final dqh b;
    private static final /* synthetic */ dqh[] c;

    static {
        dqh dqhVar = new dqh("Ltr", 0);
        a = dqhVar;
        dqh dqhVar2 = new dqh("Rtl", 1);
        b = dqhVar2;
        dqh[] dqhVarArr = {dqhVar, dqhVar2};
        c = dqhVarArr;
        arhi.f(dqhVarArr);
    }

    private dqh(String str, int i) {
    }

    public static dqh[] values() {
        return (dqh[]) c.clone();
    }
}
