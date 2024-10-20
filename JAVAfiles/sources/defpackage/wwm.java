package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wwm {
    public static final wwm a;
    public static final wwm b;
    public static final wwm c;
    private static final /* synthetic */ wwm[] d;

    static {
        wwm wwmVar = new wwm("DEFAULT_CALL_SIM", 0);
        a = wwmVar;
        wwm wwmVar2 = new wwm("DEFAULT_SMS_SIM", 1);
        b = wwmVar2;
        wwm wwmVar3 = new wwm("DEFAULT_DATA_SIM", 2);
        c = wwmVar3;
        wwm[] wwmVarArr = {wwmVar, wwmVar2, wwmVar3};
        d = wwmVarArr;
        arhi.f(wwmVarArr);
    }

    private wwm(String str, int i) {
    }

    public static wwm[] values() {
        return (wwm[]) d.clone();
    }
}
