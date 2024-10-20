package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxu implements afqv {
    private String a;
    private String b;
    private String c;
    private Iterable d;
    private afqq e;

    @Override // defpackage.afee
    public final /* bridge */ /* synthetic */ afcp a() {
        afqq afqqVar = this.e;
        if (afqqVar != null) {
            return afqqVar;
        }
        throw new IllegalStateException("Property \"source\" has not been set");
    }

    @Override // defpackage.afek
    public final /* bridge */ /* synthetic */ afcq b() {
        String str;
        String str2;
        Iterable iterable;
        afqq afqqVar;
        String str3 = this.a;
        if (str3 != null && (str = this.b) != null && (str2 = this.c) != null && (iterable = this.d) != null && (afqqVar = this.e) != null) {
            return new afxr(str3, str, str2, iterable, afqqVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" description");
        }
        if (this.c == null) {
            sb.append(" webUrl");
        }
        if (this.d == null) {
            sb.append(" variations");
        }
        if (this.e == null) {
            sb.append(" source");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.afqv
    public final /* synthetic */ void c(String str) {
        this.b = str;
    }

    @Override // defpackage.afqv
    public final /* synthetic */ void d(String str) {
        this.a = str;
    }

    @Override // defpackage.afvi
    public final /* synthetic */ void e(Iterable iterable) {
        this.d = iterable;
    }

    @Override // defpackage.afqv
    public final /* synthetic */ void f(String str) {
        this.c = str;
    }

    @Override // defpackage.afee
    public final /* bridge */ /* synthetic */ void g(afcp afcpVar) {
        this.e = (afqq) afcpVar;
    }
}
