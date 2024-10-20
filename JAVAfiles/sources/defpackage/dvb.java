package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvb extends Exception {
    private final String a;
    private final String b;

    public dvb(String str, duw duwVar) {
        super(str);
        this.a = str;
        this.b = duwVar.w();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.a + " (" + this.b + " at line 0)");
        return sb.toString();
    }
}
