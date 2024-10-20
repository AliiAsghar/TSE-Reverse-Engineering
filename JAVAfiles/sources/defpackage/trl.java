package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class trl {
    private aqfn a;
    private String b;
    private long c;
    private tqe d;
    private boolean e;
    private tro f;
    private byte g;

    public final trm a() {
        aqfn aqfnVar;
        String str;
        tqe tqeVar;
        tro troVar;
        if (this.g == 3 && (aqfnVar = this.a) != null && (str = this.b) != null && (tqeVar = this.d) != null && (troVar = this.f) != null) {
            return new trm(aqfnVar, str, this.c, tqeVar, this.e, troVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" desktopId");
        }
        if (this.b == null) {
            sb.append(" requestId");
        }
        if ((this.g & 1) == 0) {
            sb.append(" lastConnectionTimeMillis");
        }
        if (this.d == null) {
            sb.append(" desktopType");
        }
        if ((this.g & 2) == 0) {
            sb.append(" isPersistent");
        }
        if (this.f == null) {
            sb.append(" dittoIdContainer");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(aqfn aqfnVar) {
        if (aqfnVar != null) {
            this.a = aqfnVar;
            return;
        }
        throw new NullPointerException("Null desktopId");
    }

    public final void c(tqe tqeVar) {
        if (tqeVar != null) {
            this.d = tqeVar;
            return;
        }
        throw new NullPointerException("Null desktopType");
    }

    public final void d(tro troVar) {
        if (troVar != null) {
            this.f = troVar;
            return;
        }
        throw new NullPointerException("Null dittoIdContainer");
    }

    public final void e(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 2);
    }

    public final void f(long j) {
        this.c = j;
        this.g = (byte) (this.g | 1);
    }

    public final void g(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null requestId");
    }
}
