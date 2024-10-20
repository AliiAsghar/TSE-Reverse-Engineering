package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agni {
    public static final agni a = new agni(null);
    public static final agni b = new agni("$EXEMPT_FOR_TEST$");
    public static final agni c = new agni("$EXEMPT_INTERNAL$");
    private final String d;
    private final agni e;
    private final String f;

    public agni(agni agniVar, String str) {
        this.d = "";
        this.e = agniVar;
        this.f = str;
    }

    public final Object a(agnh agnhVar) {
        return agnhVar.a(this.d);
    }

    public final boolean b() {
        String str = this.d;
        if (str != null && str.length() != 0) {
            return false;
        }
        agni agniVar = this.e;
        if (agniVar != null && !agniVar.b()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        agni agniVar = this.e;
        if (agniVar != null) {
            str = agniVar.toString();
        } else {
            str = this.d;
        }
        return String.valueOf(str).concat(albo.ag(this.f));
    }

    public agni(String str, String str2) {
        this.d = str;
        this.e = null;
        this.f = str2;
    }

    public agni(String str) {
        this(str, (String) null);
    }
}
