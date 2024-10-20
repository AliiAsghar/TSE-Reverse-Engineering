package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class urh {
    public static final urh a;
    public static final urh b;
    private static final /* synthetic */ urh[] c;

    static {
        urh urhVar = new urh("QUICK_CHECK", 0);
        a = urhVar;
        urh urhVar2 = new urh("IN_DEPTH", 1);
        b = urhVar2;
        urh[] urhVarArr = {urhVar, urhVar2};
        c = urhVarArr;
        arhi.f(urhVarArr);
    }

    private urh(String str, int i) {
    }

    public static urh[] values() {
        return (urh[]) c.clone();
    }
}
