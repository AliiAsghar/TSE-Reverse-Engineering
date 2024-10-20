package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavj {
    public int a;
    public Object b;
    private int c;
    private byte d;
    private Object e;

    public aavj() {
    }

    public final aavk a() {
        Object obj;
        Object obj2;
        if (this.d == 7 && (obj = this.e) != null && (obj2 = this.b) != null) {
            return new aavk((Uri) obj, this.c, this.a, (String) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" uri");
        }
        if ((this.d & 1) == 0) {
            sb.append(" width");
        }
        if ((this.d & 2) == 0) {
            sb.append(" height");
        }
        if ((this.d & 4) == 0) {
            sb.append(" durationMillis");
        }
        if (this.b == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.b = "image/jpeg";
    }

    public final void c() {
        this.d = (byte) (this.d | 4);
    }

    public final void d(int i) {
        this.a = i;
        this.d = (byte) (this.d | 2);
    }

    public final void e(Uri uri) {
        if (uri != null) {
            this.e = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public final void f(int i) {
        this.c = i;
        this.d = (byte) (this.d | 1);
    }

    public final mlc g() {
        Object obj;
        int i;
        if (this.d == 1 && (obj = this.e) != null && (i = this.a) != 0) {
            return new mlc((Optional) this.b, (amlg) obj, this.c, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" reason");
        }
        if (this.d == 0) {
            sb.append(" terminalStatus");
        }
        if (this.a == 0) {
            sb.append(" canFallback");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(amlg amlgVar) {
        if (amlgVar != null) {
            this.e = amlgVar;
            return;
        }
        throw new NullPointerException("Null reason");
    }

    public final void i(int i) {
        this.c = i;
        this.d = (byte) 1;
    }

    public aavj(byte[] bArr, byte[] bArr2) {
        this.b = Optional.empty();
    }
}
