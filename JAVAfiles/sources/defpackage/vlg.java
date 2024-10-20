package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vlg {
    public IconCompat a;
    public Optional b;
    public Optional c;
    public Optional d;
    public Optional e;
    public Optional f;
    public Optional g;
    public Optional h;
    public Optional i;
    public Optional j;
    public Optional k;
    public Optional l;
    public Optional m;
    public Optional n;
    public Optional o;
    public Optional p;
    private vlh q;
    private CharSequence r;
    private int s;
    private byte t;

    public vlg() {
        throw null;
    }

    public final vli a() {
        vlh vlhVar;
        CharSequence charSequence;
        IconCompat iconCompat;
        if (this.t == 1 && (vlhVar = this.q) != null && (charSequence = this.r) != null && (iconCompat = this.a) != null) {
            return new vli(vlhVar, charSequence, this.s, iconCompat, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
        }
        StringBuilder sb = new StringBuilder();
        if (this.q == null) {
            sb.append(" notificationStyle");
        }
        if (this.r == null) {
            sb.append(" titleText");
        }
        if (this.t == 0) {
            sb.append(" smallIconColor");
        }
        if (this.a == null) {
            sb.append(" smallIcon");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(vlh vlhVar) {
        if (vlhVar != null) {
            this.q = vlhVar;
            return;
        }
        throw new NullPointerException("Null notificationStyle");
    }

    public final void c(int i) {
        this.s = i;
        this.t = (byte) 1;
    }

    public final void d(CharSequence charSequence) {
        if (charSequence != null) {
            this.r = charSequence;
            return;
        }
        throw new NullPointerException("Null titleText");
    }

    public vlg(byte[] bArr) {
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
    }
}
