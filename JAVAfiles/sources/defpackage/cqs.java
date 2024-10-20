package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqs {
    public static final cqs a;
    public static final cqs b;
    public static final cqs c;
    private static final /* synthetic */ cqs[] d;

    static {
        cqs cqsVar = new cqs("Initial", 0);
        a = cqsVar;
        cqs cqsVar2 = new cqs("Main", 1);
        b = cqsVar2;
        cqs cqsVar3 = new cqs("Final", 2);
        c = cqsVar3;
        cqs[] cqsVarArr = {cqsVar, cqsVar2, cqsVar3};
        d = cqsVarArr;
        arhi.f(cqsVarArr);
    }

    private cqs(String str, int i) {
    }

    public static cqs[] values() {
        return (cqs[]) d.clone();
    }
}
