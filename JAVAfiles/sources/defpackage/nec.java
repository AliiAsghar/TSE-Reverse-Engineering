package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nec {
    public static final nec a;
    public static final nec b;
    public static final nec c;
    private static final /* synthetic */ nec[] d;

    static {
        nec necVar = new nec("UNKNOWN", 0);
        a = necVar;
        nec necVar2 = new nec("NOT_APPROVED", 1);
        b = necVar2;
        nec necVar3 = new nec("APPROVED", 2);
        c = necVar3;
        nec[] necVarArr = {necVar, necVar2, necVar3};
        d = necVarArr;
        arhi.f(necVarArr);
    }

    private nec(String str, int i) {
    }

    public static nec[] values() {
        return (nec[]) d.clone();
    }
}
