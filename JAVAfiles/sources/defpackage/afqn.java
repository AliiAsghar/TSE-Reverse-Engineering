package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqn implements afqv {
    private String a;
    private String b;
    private String c;
    private Iterable d;
    private afqq e;
    private byte f;

    @Override // defpackage.afee
    public final /* bridge */ /* synthetic */ afcp a() {
        if ((this.f & 16) != 0) {
            return this.e;
        }
        throw new IllegalStateException("Property \"source\" has not been set");
    }

    @Override // defpackage.afek
    public final /* bridge */ /* synthetic */ afcq b() {
        int i = ~this.f;
        if ((i & 15) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" id");
            }
            if ((this.f & 2) == 0) {
                sb.append(" description");
            }
            if ((this.f & 4) == 0) {
                sb.append(" webUrl");
            }
            if ((this.f & 8) == 0) {
                sb.append(" variations");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new afql(this.a, this.b, this.c, this.d, this.e, i & 16);
    }

    @Override // defpackage.afqv
    public final /* bridge */ /* synthetic */ void c(String str) {
        this.b = str;
        this.f = (byte) (this.f | 2);
    }

    @Override // defpackage.afqv
    public final /* bridge */ /* synthetic */ void d(String str) {
        this.a = str;
        this.f = (byte) (this.f | 1);
    }

    @Override // defpackage.afvi
    public final /* bridge */ /* synthetic */ void e(Iterable iterable) {
        this.d = iterable;
        this.f = (byte) (this.f | 8);
    }

    @Override // defpackage.afqv
    public final /* bridge */ /* synthetic */ void f(String str) {
        this.c = str;
        this.f = (byte) (this.f | 4);
    }

    @Override // defpackage.afee
    public final /* bridge */ /* synthetic */ void g(afcp afcpVar) {
        this.e = (afqq) afcpVar;
        this.f = (byte) (this.f | 16);
    }
}
