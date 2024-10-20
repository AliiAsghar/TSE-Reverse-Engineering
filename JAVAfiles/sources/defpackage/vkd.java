package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vkd {
    public Optional a;
    public Optional b;
    public Optional c;
    public Optional d;
    public Optional e;
    public Optional f;
    private vkf g;
    private Bundle h;
    private boolean i;
    private CharSequence j;
    private boolean k;
    private boolean l;
    private byte m;

    public vkd() {
        throw null;
    }

    public final vke a() {
        vkf vkfVar;
        Bundle bundle;
        CharSequence charSequence;
        if (this.m == 7 && (vkfVar = this.g) != null && (bundle = this.h) != null && (charSequence = this.j) != null) {
            return new vke(vkfVar, bundle, this.i, charSequence, this.k, this.l, this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" actionType");
        }
        if (this.h == null) {
            sb.append(" callbackBundle");
        }
        if ((this.m & 1) == 0) {
            sb.append(" shouldAddParentStack");
        }
        if (this.j == null) {
            sb.append(" title");
        }
        if ((this.m & 2) == 0) {
            sb.append(" openActivityOnWear");
        }
        if ((this.m & 4) == 0) {
            sb.append(" isMainActivityWearAction");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(vkf vkfVar) {
        if (vkfVar != null) {
            this.g = vkfVar;
            return;
        }
        throw new NullPointerException("Null actionType");
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            this.h = bundle;
            return;
        }
        throw new NullPointerException("Null callbackBundle");
    }

    public final void d(boolean z) {
        this.l = z;
        this.m = (byte) (this.m | 4);
    }

    public final void e(boolean z) {
        this.k = z;
        this.m = (byte) (this.m | 2);
    }

    public final void f(boolean z) {
        this.i = z;
        this.m = (byte) (this.m | 1);
    }

    public final void g(CharSequence charSequence) {
        if (charSequence != null) {
            this.j = charSequence;
            return;
        }
        throw new NullPointerException("Null title");
    }

    public vkd(byte[] bArr) {
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
    }
}
