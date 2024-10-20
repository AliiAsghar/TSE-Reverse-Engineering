package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmf {
    public static final asmf a;
    public static final asmf b;

    @armg
    public static final asmf c;
    public static final asmf d;
    public static final asmf e;
    public static final asmf f;
    private static final /* synthetic */ asmf[] h;
    public final String g;

    static {
        asmf asmfVar = new asmf("HTTP_1_0", 0, "http/1.0");
        a = asmfVar;
        asmf asmfVar2 = new asmf("HTTP_1_1", 1, "http/1.1");
        b = asmfVar2;
        asmf asmfVar3 = new asmf("SPDY_3", 2, "spdy/3.1");
        c = asmfVar3;
        asmf asmfVar4 = new asmf("HTTP_2", 3, "h2");
        d = asmfVar4;
        asmf asmfVar5 = new asmf("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        e = asmfVar5;
        asmf asmfVar6 = new asmf("QUIC", 5, "quic");
        f = asmfVar6;
        asmf[] asmfVarArr = {asmfVar, asmfVar2, asmfVar3, asmfVar4, asmfVar5, asmfVar6};
        h = asmfVarArr;
        arhi.f(asmfVarArr);
    }

    private asmf(String str, int i, String str2) {
        this.g = str2;
    }

    public static asmf[] values() {
        return (asmf[]) h.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
