package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afcj {
    public static final afcj a;
    public static final afcj b;
    public static final afcj c;
    public static final afcj d;
    private static final /* synthetic */ afcj[] e;

    static {
        afcj afcjVar = new afcj("BACK", 0);
        a = afcjVar;
        afcj afcjVar2 = new afcj("FORWARD", 1);
        b = afcjVar2;
        afcj afcjVar3 = new afcj("RELOAD", 2);
        c = afcjVar3;
        afcj afcjVar4 = new afcj("STOP_LOADING", 3);
        d = afcjVar4;
        afcj[] afcjVarArr = {afcjVar, afcjVar2, afcjVar3, afcjVar4};
        e = afcjVarArr;
        arhi.f(afcjVarArr);
    }

    private afcj(String str, int i) {
    }

    public static afcj[] values() {
        return (afcj[]) e.clone();
    }
}
