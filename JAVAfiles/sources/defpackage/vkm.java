package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vkm {
    public Optional a;
    public Optional b;
    public Optional c;
    public Optional d;
    private Optional e;
    private Optional f;
    private vli g;
    private vlb h;
    private Optional i;
    private boolean j;
    private boolean k;
    private Optional l;
    private boolean m;
    private byte n;

    public vkm() {
        throw null;
    }

    public final vkn a() {
        vli vliVar;
        vlb vlbVar;
        if (this.n == 7 && (vliVar = this.g) != null && (vlbVar = this.h) != null) {
            return new vkn(this.a, this.e, this.f, vliVar, vlbVar, this.i, this.b, this.j, this.k, this.l, this.c, this.m, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" notificationStyleInfo");
        }
        if (this.h == null) {
            sb.append(" clickInteractionInfo");
        }
        if ((this.n & 1) == 0) {
            sb.append(" shouldBridgeNotificationToOtherDevices");
        }
        if ((this.n & 2) == 0) {
            sb.append(" allowSystemGeneratedActions");
        }
        if ((this.n & 4) == 0) {
            sb.append(" shouldAlert");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.k = z;
        this.n = (byte) (this.n | 2);
    }

    public final void c(vlb vlbVar) {
        if (vlbVar != null) {
            this.h = vlbVar;
            return;
        }
        throw new NullPointerException("Null clickInteractionInfo");
    }

    public final void d(Optional optional) {
        if (optional != null) {
            this.f = optional;
            return;
        }
        throw new NullPointerException("Null conversationSpecificInfo");
    }

    public final void e(Optional optional) {
        if (optional != null) {
            this.l = optional;
            return;
        }
        throw new NullPointerException("Null notificationActions");
    }

    public final void f(Optional optional) {
        if (optional != null) {
            this.e = optional;
            return;
        }
        throw new NullPointerException("Null notificationExtras");
    }

    public final void g(vli vliVar) {
        if (vliVar != null) {
            this.g = vliVar;
            return;
        }
        throw new NullPointerException("Null notificationStyleInfo");
    }

    public final void h(boolean z) {
        this.m = z;
        this.n = (byte) (this.n | 4);
    }

    public final void i(boolean z) {
        this.j = z;
        this.n = (byte) (this.n | 1);
    }

    public final void j(Optional optional) {
        if (optional != null) {
            this.i = optional;
            return;
        }
        throw new NullPointerException("Null swipeInteractionInfo");
    }

    public vkm(byte[] bArr) {
        this.a = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.i = Optional.empty();
        this.b = Optional.empty();
        this.l = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
    }
}
