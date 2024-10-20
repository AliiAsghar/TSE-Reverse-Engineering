package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzf {
    public static final tzf a;
    public static final tzf b;
    public static final tzf c;
    public static final tzf d;
    private static final /* synthetic */ tzf[] e;

    static {
        tzf tzfVar = new tzf("UNKNOWN", 0);
        a = tzfVar;
        tzf tzfVar2 = new tzf("MMS", 1);
        b = tzfVar2;
        tzf tzfVar3 = new tzf("RCS", 2);
        c = tzfVar3;
        tzf tzfVar4 = new tzf("ENCRYPTED_RCS", 3);
        d = tzfVar4;
        tzf[] tzfVarArr = {tzfVar, tzfVar2, tzfVar3, tzfVar4};
        e = tzfVarArr;
        arhi.f(tzfVarArr);
    }

    private tzf(String str, int i) {
    }

    public static tzf[] values() {
        return (tzf[]) e.clone();
    }
}
