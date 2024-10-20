package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rey {
    public Optional a;
    public String b;
    public String c;
    public String d;
    private boolean e;
    private int f;
    private int g;
    private long h;
    private String i;
    private byte j;

    public rey() {
        throw null;
    }

    public final rez a() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.j == 15 && (str = this.b) != null && (str2 = this.c) != null && (str3 = this.d) != null && (str4 = this.i) != null) {
            return new rez(this.e, this.a, str, this.f, this.g, str2, str3, this.h, str4);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" eligible");
        }
        if (this.b == null) {
            sb.append(" messageBody");
        }
        if ((this.j & 2) == 0) {
            sb.append(" mcc");
        }
        if ((this.j & 4) == 0) {
            sb.append(" mnc");
        }
        if (this.c == null) {
            sb.append(" existingBrandId");
        }
        if (this.d == null) {
            sb.append(" existingBrandVersionToken");
        }
        if ((this.j & 8) == 0) {
            sb.append(" startTimeMs");
        }
        if (this.i == null) {
            sb.append(" imsi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.j = (byte) (this.j | 1);
    }

    public final void c(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null imsi");
    }

    public final void d(int i) {
        this.f = i;
        this.j = (byte) (this.j | 2);
    }

    public final void e(int i) {
        this.g = i;
        this.j = (byte) (this.j | 4);
    }

    public final void f(long j) {
        this.h = j;
        this.j = (byte) (this.j | 8);
    }

    public rey(byte[] bArr) {
        this.a = Optional.empty();
    }
}
