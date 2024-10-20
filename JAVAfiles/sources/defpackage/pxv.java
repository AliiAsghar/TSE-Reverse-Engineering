package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pxv {
    public String a;
    public String b;
    public Optional c;
    public Optional d;
    public String e;
    public Optional f;
    public Optional g;

    public pxv() {
        throw null;
    }

    public final void a(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null nonce");
    }

    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null realm");
    }

    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null schema");
    }

    public pxv(byte[] bArr) {
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.f = Optional.empty();
        this.g = Optional.empty();
    }
}
