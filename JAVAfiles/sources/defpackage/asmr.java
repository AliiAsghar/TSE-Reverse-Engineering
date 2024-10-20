package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmr {
    public static final asmr a;
    public static final asmr b;
    public static final asmr c;
    public static final asmr d;
    public static final asmr e;
    private static final /* synthetic */ asmr[] g;
    public final String f;

    static {
        asmr asmrVar = new asmr("TLS_1_3", 0, "TLSv1.3");
        a = asmrVar;
        asmr asmrVar2 = new asmr("TLS_1_2", 1, "TLSv1.2");
        b = asmrVar2;
        asmr asmrVar3 = new asmr("TLS_1_1", 2, "TLSv1.1");
        c = asmrVar3;
        asmr asmrVar4 = new asmr("TLS_1_0", 3, "TLSv1");
        d = asmrVar4;
        asmr asmrVar5 = new asmr("SSL_3_0", 4, "SSLv3");
        e = asmrVar5;
        asmr[] asmrVarArr = {asmrVar, asmrVar2, asmrVar3, asmrVar4, asmrVar5};
        g = asmrVarArr;
        arhi.f(asmrVarArr);
    }

    private asmr(String str, int i, String str2) {
        this.f = str2;
    }

    public static asmr[] values() {
        return (asmr[]) g.clone();
    }
}
