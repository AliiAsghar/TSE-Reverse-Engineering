package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aonr {
    public static final aonr a = new aonr("", "", false);
    public final String b;
    public final String c;
    public final boolean d;

    static {
        new aonr("\n", "  ", true);
    }

    private aonr(String str, String str2, boolean z) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.b = str;
                this.c = str2;
                this.d = z;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
