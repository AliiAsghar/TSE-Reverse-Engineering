package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qnf {
    public static final qnf a;
    public static final qnf b;
    public static final qnf c;
    public static final qnf d;
    private static final /* synthetic */ qnf[] e;

    static {
        qnf qnfVar = new qnf("UNSPECIFIED", 0);
        a = qnfVar;
        qnf qnfVar2 = new qnf("OBSERVER", 1);
        b = qnfVar2;
        qnf qnfVar3 = new qnf("WORKER", 2);
        c = qnfVar3;
        qnf qnfVar4 = new qnf("FORCED", 3);
        d = qnfVar4;
        qnf[] qnfVarArr = {qnfVar, qnfVar2, qnfVar3, qnfVar4};
        e = qnfVarArr;
        arhi.f(qnfVarArr);
    }

    private qnf(String str, int i) {
    }

    public static qnf[] values() {
        return (qnf[]) e.clone();
    }
}
