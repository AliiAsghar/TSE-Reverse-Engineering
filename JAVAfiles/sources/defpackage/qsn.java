package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qsn {
    public static final qsn a;
    public static final qsn b;
    public static final qsn c;
    private static final /* synthetic */ qsn[] d;

    static {
        qsn qsnVar = new qsn("PHONE_E164", 0);
        a = qsnVar;
        qsn qsnVar2 = new qsn("BOT", 1);
        b = qsnVar2;
        qsn qsnVar3 = new qsn("GROUP", 2);
        c = qsnVar3;
        qsn[] qsnVarArr = {qsnVar, qsnVar2, qsnVar3};
        d = qsnVarArr;
        arhi.f(qsnVarArr);
    }

    private qsn(String str, int i) {
    }

    public static qsn[] values() {
        return (qsn[]) d.clone();
    }
}
