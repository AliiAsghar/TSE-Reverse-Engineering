package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qnw {
    public static final qnw a;
    public static final qnw b;
    public static final qnw c;
    public static final qnw d;
    private static final /* synthetic */ qnw[] e;

    static {
        qnw qnwVar = new qnw("UNSPECIFIED", 0);
        a = qnwVar;
        qnw qnwVar2 = new qnw("OBSERVER", 1);
        b = qnwVar2;
        qnw qnwVar3 = new qnw("WORKER", 2);
        c = qnwVar3;
        qnw qnwVar4 = new qnw("FORCED", 3);
        d = qnwVar4;
        qnw[] qnwVarArr = {qnwVar, qnwVar2, qnwVar3, qnwVar4};
        e = qnwVarArr;
        arhi.f(qnwVarArr);
    }

    private qnw(String str, int i) {
    }

    public static qnw[] values() {
        return (qnw[]) e.clone();
    }
}
