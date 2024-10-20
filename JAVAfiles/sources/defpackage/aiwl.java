package defpackage;

import android.net.Uri;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwl {
    public boolean a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public aiwl() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, apbt] */
    public final aiwm a() {
        Object obj;
        ?? r3;
        Object obj2;
        if (this.f == null) {
            int i = alog.d;
            this.f = alsx.a;
        }
        if (this.b == 3 && (obj = this.c) != null && (r3 = this.d) != 0 && (obj2 = this.g) != null) {
            return new aiwm((Uri) obj, r3, (algw) this.e, (alog) this.f, (ahmc) obj2, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" uri");
        }
        if (this.d == null) {
            sb.append(" schema");
        }
        if (this.g == null) {
            sb.append(" variantConfig");
        }
        if ((this.b & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.b & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.b = (byte) (this.b | 2);
    }

    public final void c(aiwj aiwjVar) {
        this.e = algw.i(aiwjVar);
    }

    public final void d(apbt apbtVar) {
        if (apbtVar != null) {
            this.d = apbtVar;
            return;
        }
        throw new NullPointerException("Null schema");
    }

    public final void e(Uri uri) {
        if (uri != null) {
            this.c = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, apbt] */
    public final wus f() {
        Object obj;
        ?? r4;
        if (this.b == 1 && (obj = this.f) != null && (r4 = this.d) != 0) {
            Object obj2 = this.e;
            return new wus((wuk) obj, (Optional) obj2, r4, (Optional) this.g, (Optional) this.c, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" key");
        }
        if (this.d == null) {
            sb.append(" schema");
        }
        if (this.b == 0) {
            sb.append(" enableCache");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void h(Supplier supplier) {
        this.c = Optional.of(supplier);
    }

    public final void i(wuk wukVar) {
        if (wukVar != null) {
            this.f = wukVar;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final void j(wvd wvdVar) {
        this.g = Optional.of(wvdVar);
    }

    public final void k(apbt apbtVar) {
        if (apbtVar != null) {
            this.d = apbtVar;
            return;
        }
        throw new NullPointerException("Null schema");
    }

    public final void l(String str) {
        this.e = Optional.of(str);
    }

    public final vjv m() {
        Object obj;
        Object obj2;
        if (this.b == 1 && (obj = this.d) != null && (obj2 = this.f) != null) {
            Object obj3 = this.g;
            return new vjv((Optional) obj3, (vli) obj, (vlb) obj2, (Optional) this.e, (Optional) this.c, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" notificationStyleInfo");
        }
        if (this.f == null) {
            sb.append(" clickInteractionInfo");
        }
        if (this.b == 0) {
            sb.append(" shouldAlert");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void n(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public aiwl(byte[] bArr) {
        this.e = alfd.a;
    }

    public aiwl(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.g = Optional.empty();
        this.e = Optional.empty();
        this.c = Optional.empty();
    }

    public aiwl(byte[] bArr, byte[] bArr2) {
        this.e = Optional.empty();
        this.g = Optional.empty();
        this.c = Optional.empty();
    }

    public aiwl(wus wusVar) {
        this.e = Optional.empty();
        this.g = Optional.empty();
        this.c = Optional.empty();
        this.f = wusVar.a;
        this.e = wusVar.b;
        this.d = wusVar.c;
        this.g = wusVar.d;
        this.c = wusVar.e;
        this.a = wusVar.f;
        this.b = (byte) 1;
    }
}
