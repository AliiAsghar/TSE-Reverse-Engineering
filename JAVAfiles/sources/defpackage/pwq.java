package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pwq {
    public String a;
    private int b;
    private Optional c;
    private Optional d;
    private byte e;
    private Object f;
    private Object g;

    public pwq() {
        throw null;
    }

    public final pwr a() {
        if (this.e == 1 && this.f != null && this.g != null && this.a != null) {
            Object obj = this.f;
            return new pwr((xoc) obj, this.b, (alor) this.g, this.a, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" reason");
        }
        if (this.e == 0) {
            sb.append(" httpResponseCode");
        }
        if (this.g == null) {
            sb.append(" httpHeaders");
        }
        if (this.a == null) {
            sb.append(" transactionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(CronetException cronetException) {
        this.c = Optional.of(cronetException);
    }

    public final void c(Throwable th) {
        this.d = Optional.of(th);
    }

    public final void d(alor alorVar) {
        if (alorVar != null) {
            this.g = alorVar;
            return;
        }
        throw new NullPointerException("Null httpHeaders");
    }

    public final void e(int i) {
        this.b = i;
        this.e = (byte) 1;
    }

    public final void f(xoc xocVar) {
        if (xocVar != null) {
            this.f = xocVar;
            return;
        }
        throw new NullPointerException("Null reason");
    }

    public final void g(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null transactionId");
    }

    public final ifz h() {
        String str;
        Object obj;
        boolean z = true;
        if (this.e == 1 && (str = this.a) != null && (obj = this.f) != null) {
            ifz ifzVar = new ifz(str, (Optional) this.g, this.c, this.d, (alog) obj, this.b);
            d.s(!TextUtils.isEmpty(ifzVar.a));
            Optional optional = ifzVar.b;
            Optional optional2 = ifzVar.c;
            if (!optional.isPresent() && !optional2.isPresent()) {
                z = false;
            }
            d.s(z);
            ifzVar.e.getClass();
            return ifzVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" displayDestination");
        }
        if (this.f == null) {
            sb.append(" snackbarInteractions");
        }
        if (this.e == 0) {
            sb.append(" anchorViewId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void i(int i) {
        this.b = i;
        this.e = (byte) 1;
    }

    public final void j(alog alogVar) {
        if (alogVar != null) {
            this.f = alogVar;
            return;
        }
        throw new NullPointerException("Null snackbarInteractions");
    }

    public final void k(Runnable runnable) {
        this.d = Optional.of(runnable);
    }

    public final void l(boolean z, boolean z2) {
        if (z) {
            this.g = Optional.of(Boolean.valueOf(z2));
        }
    }

    public final void m(boolean z, boolean z2) {
        if (z) {
            this.c = Optional.of(Boolean.valueOf(z2));
        }
    }

    public pwq(byte[] bArr, byte[] bArr2) {
        this.g = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
    }

    public pwq(byte[] bArr) {
        this.c = Optional.empty();
        this.d = Optional.empty();
    }
}
