package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmw {
    private static final atma a;
    private static final atma b;

    static {
        atma atmaVar = new atma("DNS Rcode", 2);
        a = atmaVar;
        atma atmaVar2 = new atma("TSIG rcode", 2);
        b = atmaVar2;
        atmaVar.e = 4095;
        atmaVar.f("RESERVED");
        atmaVar.d(0, "NOERROR");
        atmaVar.d(1, "FORMERR");
        atmaVar.d(2, "SERVFAIL");
        atmaVar.d(3, "NXDOMAIN");
        atmaVar.d(4, "NOTIMP");
        atmaVar.e(4, "NOTIMPL");
        atmaVar.d(5, "REFUSED");
        atmaVar.d(6, "YXDOMAIN");
        atmaVar.d(7, "YXRRSET");
        atmaVar.d(8, "NXRRSET");
        atmaVar.d(9, "NOTAUTH");
        atmaVar.d(10, "NOTZONE");
        atmaVar.d(16, "BADVERS");
        atmaVar2.e = 65535;
        atmaVar2.f("RESERVED");
        if (atmaVar2.d == atmaVar.d) {
            atmaVar2.a.putAll(atmaVar.a);
            atmaVar2.b.putAll(atmaVar.b);
            atmaVar2.d(16, "BADSIG");
            atmaVar2.d(17, "BADKEY");
            atmaVar2.d(18, "BADTIME");
            atmaVar2.d(19, "BADMODE");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(atmaVar.c);
        stringBuffer.append(": wordcases do not match");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static String a(int i) {
        return b.c(i);
    }

    public static String b(int i) {
        return a.c(i);
    }
}
