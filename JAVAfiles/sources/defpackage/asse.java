package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asse {
    private final String a;
    private final assf b;
    private final assn c;

    public asse(String str, assn assnVar) {
        if (str != null) {
            if (assnVar != null) {
                this.a = str;
                this.c = assnVar;
                this.b = new assf();
                e(assnVar);
                f(assnVar);
                g(assnVar);
                return;
            }
            throw new IllegalArgumentException("Body may not be null");
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    public String a() {
        return this.a;
    }

    public assf b() {
        return this.b;
    }

    public assn c() {
        return this.c;
    }

    public void d(String str, String str2) {
        if (str != null) {
            this.b.e(new assj(str, str2));
            return;
        }
        throw new IllegalArgumentException("Field name may not be null");
    }

    protected void e(assn assnVar) {
        StringBuilder sb = new StringBuilder("form-data; name=\"");
        sb.append(a());
        sb.append("\"");
        if (assnVar.f() != null) {
            sb.append("; filename=\"");
            sb.append(assnVar.f());
            sb.append("\"");
        }
        d(assi.c, sb.toString());
    }

    protected void f(assn assnVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(assnVar.c());
        if (assnVar.e() != null) {
            sb.append("; charset=");
            sb.append(assnVar.e());
        }
        d(assi.a, sb.toString());
    }

    protected void g(assn assnVar) {
        d(assi.b, assnVar.g());
    }
}
