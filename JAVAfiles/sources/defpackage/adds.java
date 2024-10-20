package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adds {
    public Optional a;
    private Optional b;
    private int c;
    private String d;
    private Optional e;
    private byte f;

    public adds() {
        throw null;
    }

    public final addt a() {
        String str;
        if (this.f == 1 && (str = this.d) != null) {
            return new addt(this.b, this.c, str, this.a, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == 0) {
            sb.append(" responseCode");
        }
        if (this.d == null) {
            sb.append(" reason");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(adqv adqvVar) {
        this.e = Optional.of(adqvVar);
    }

    public final void c(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null reason");
    }

    public final void d(int i) {
        this.c = i;
        this.f = (byte) 1;
    }

    public final void e(adrc adrcVar) {
        this.b = Optional.of(adrcVar);
    }

    public adds(byte[] bArr) {
        this.b = Optional.empty();
        this.a = Optional.empty();
        this.e = Optional.empty();
    }
}
