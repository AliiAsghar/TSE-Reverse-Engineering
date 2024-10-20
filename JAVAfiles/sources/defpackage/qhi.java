package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qhi {
    public static final qhi a;
    public static final qhi b;
    public static final qhi c;
    public static final qhi d;
    private static final /* synthetic */ qhi[] e;

    static {
        qhi qhiVar = new qhi("RECOVERY_SUCCESSFUL", 0);
        a = qhiVar;
        qhi qhiVar2 = new qhi("RECOVERY_SUCCESSFUL_NO_RETRY", 1);
        b = qhiVar2;
        qhi qhiVar3 = new qhi("RECOVERY_FAILED_TRANSIENTLY", 2);
        c = qhiVar3;
        qhi qhiVar4 = new qhi("RECOVERY_FAILED_PERMANENTLY", 3);
        d = qhiVar4;
        qhi[] qhiVarArr = {qhiVar, qhiVar2, qhiVar3, qhiVar4};
        e = qhiVarArr;
        arhi.f(qhiVarArr);
    }

    private qhi(String str, int i) {
    }

    public static qhi[] values() {
        return (qhi[]) e.clone();
    }
}
