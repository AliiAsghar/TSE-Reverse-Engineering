package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzv {
    public String a;
    public Object b;
    private int c;
    private byte d;

    public final abzw a() {
        if (this.d == 1 && this.b != null && this.a != null) {
            return new abzw((String) this.b, this.c, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" hostName");
        }
        if (this.d == 0) {
            sb.append(" hostPort");
        }
        if (this.a == null) {
            sb.append(" apiKey");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.c = 443;
        this.d = (byte) 1;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.function.Supplier] */
    public final lzk c() {
        String str;
        ?? r1;
        if (this.d == 1 && (str = this.a) != null && (r1 = this.b) != 0) {
            return new lzk(str, this.c, r1);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" className");
        }
        if (this.d == 0) {
            sb.append(" xmlResId");
        }
        if (this.b == null) {
            sb.append(" enabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null className");
    }

    public final void e(int i) {
        this.c = i;
        this.d = (byte) 1;
    }
}
