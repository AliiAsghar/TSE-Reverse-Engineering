package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qtz {
    public static final qtz a;
    public static final qtz b;
    private static final /* synthetic */ qtz[] c;

    static {
        qtz qtzVar = new qtz("RCS", 0);
        a = qtzVar;
        qtz qtzVar2 = new qtz("MMS", 1);
        b = qtzVar2;
        qtz[] qtzVarArr = {qtzVar, qtzVar2};
        c = qtzVarArr;
        arhi.f(qtzVarArr);
    }

    private qtz(String str, int i) {
    }

    public static qtz[] values() {
        return (qtz[]) c.clone();
    }
}
