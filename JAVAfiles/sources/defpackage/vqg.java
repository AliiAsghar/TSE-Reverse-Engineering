package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqg {
    public int a;
    public int b;
    public Uri c;
    public amxb d;
    public byte e;
    public int f;
    private tqu g;
    private int h;
    private Optional i;

    public vqg() {
        throw null;
    }

    public final vqh a() {
        if (this.e == 7 && this.g != null && this.f != 0) {
            return new vqh(this.a, this.b, this.g, this.c, this.h, this.d, this.f, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" status");
        }
        if ((this.e & 2) == 0) {
            sb.append(" rawStatus");
        }
        if (this.g == null) {
            sb.append(" xmsTransportType");
        }
        if ((this.e & 4) == 0) {
            sb.append(" resultCode");
        }
        if (this.f == 0) {
            sb.append(" mmsApi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.h = i;
        this.e = (byte) (this.e | 4);
    }

    public final void c(qga qgaVar) {
        this.i = Optional.of(qgaVar);
    }

    public final void d(tqu tquVar) {
        if (tquVar != null) {
            this.g = tquVar;
            return;
        }
        throw new NullPointerException("Null xmsTransportType");
    }

    public vqg(byte[] bArr) {
        this.i = Optional.empty();
    }

    public vqg(vqh vqhVar) {
        this.i = Optional.empty();
        this.a = vqhVar.b;
        this.b = vqhVar.c;
        this.g = vqhVar.d;
        this.c = vqhVar.e;
        this.h = vqhVar.f;
        this.d = vqhVar.g;
        this.f = vqhVar.i;
        this.i = vqhVar.h;
        this.e = (byte) 7;
    }
}
