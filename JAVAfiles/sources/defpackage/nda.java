package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nda {
    public static final nda a;
    public static final nda b;
    public static final nda c;
    public static final nda d;
    public static final nda e;
    private static final /* synthetic */ nda[] f;

    static {
        nda ndaVar = new nda("UNKNOWN", 0);
        a = ndaVar;
        nda ndaVar2 = new nda("DO_NOT_SEND", 1);
        b = ndaVar2;
        nda ndaVar3 = new nda("NOT_SENT", 2);
        c = ndaVar3;
        nda ndaVar4 = new nda("SENT", 3);
        d = ndaVar4;
        nda ndaVar5 = new nda("SHOULD_SEND_NEW", 4);
        e = ndaVar5;
        nda[] ndaVarArr = {ndaVar, ndaVar2, ndaVar3, ndaVar4, ndaVar5};
        f = ndaVarArr;
        arhi.f(ndaVarArr);
    }

    private nda(String str, int i) {
    }

    public static nda[] values() {
        return (nda[]) f.clone();
    }
}
