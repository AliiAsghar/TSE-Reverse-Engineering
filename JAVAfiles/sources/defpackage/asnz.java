package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnz {
    private final asqw a;
    private long b = 262144;

    public asnz(asqw asqwVar) {
        this.a = asqwVar;
    }

    public final String a() {
        String p = this.a.p(this.b);
        this.b -= p.length();
        return p;
    }

    public final aslv b() {
        asuo asuoVar = new asuo((char[]) null);
        while (true) {
            String a = a();
            if (a.length() != 0) {
                int S = arsd.S(a, ':', 1, 4);
                if (S != -1) {
                    String substring = a.substring(0, S);
                    substring.getClass();
                    String substring2 = a.substring(S + 1);
                    substring2.getClass();
                    asuoVar.j(substring, substring2);
                } else if (a.charAt(0) == ':') {
                    String substring3 = a.substring(1);
                    substring3.getClass();
                    asuoVar.j("", substring3);
                } else {
                    asuoVar.j("", a);
                }
            } else {
                return asuoVar.h();
            }
        }
    }
}
