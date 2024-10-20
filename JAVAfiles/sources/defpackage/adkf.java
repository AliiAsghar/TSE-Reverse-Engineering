package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkf {
    public String a;
    public String b;
    public String c;
    public String d;
    public Optional e;
    private String f;
    private String g;
    private String h;

    public adkf() {
        throw null;
    }

    public final adkg a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = this.f;
        if (str7 != null && (str = this.g) != null && (str2 = this.a) != null && (str3 = this.b) != null && (str4 = this.h) != null && (str5 = this.c) != null && (str6 = this.d) != null) {
            return new adkg(str7, str, str2, str3, str4, str5, str6, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" imsi");
        }
        if (this.g == null) {
            sb.append(" msisdn");
        }
        if (this.a == null) {
            sb.append(" msisdnToken");
        }
        if (this.b == null) {
            sb.append(" gmsCoreIidToken");
        }
        if (this.h == null) {
            sb.append(" cookie");
        }
        if (this.c == null) {
            sb.append(" salt");
        }
        if (this.d == null) {
            sb.append(" imei");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null cookie");
    }

    public final void c(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null imsi");
    }

    public final void d(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null msisdn");
    }

    public adkf(byte[] bArr) {
        this.e = Optional.empty();
    }
}
