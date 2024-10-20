package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_FileInformation;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqc {
    public String a;
    public Optional b;
    public Optional c;
    private int d;
    private byte e;
    private Object f;
    private Object g;
    private Object h;
    private Object i;

    public ajqc() {
        throw null;
    }

    public final FileInformation a() {
        if (((AutoValue_FileInformation) b()).f.isPresent() && ajqd.THUMBNAIL.equals(((AutoValue_FileInformation) b()).f.get())) {
            f(null);
        }
        return b();
    }

    public final FileInformation b() {
        Object obj;
        String str;
        Object obj2;
        if (this.e == 1 && (obj = this.g) != null && (str = this.a) != null && (obj2 = this.h) != null) {
            return new AutoValue_FileInformation((Optional) this.f, this.d, (ContentType) obj, str, (Instant) obj2, this.b, (Optional) this.i, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" sizeBytes");
        }
        if (this.g == null) {
            sb.append(" contentType");
        }
        if (this.a == null) {
            sb.append(" url");
        }
        if (this.h == null) {
            sb.append(" validUntil");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(Duration duration) {
        this.i = Optional.of(duration);
    }

    public final void d(ContentType contentType) {
        if (contentType != null) {
            this.g = contentType;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public final void e(ajqd ajqdVar) {
        this.b = Optional.of(ajqdVar);
    }

    public final void f(String str) {
        this.f = Optional.ofNullable(str);
    }

    public final void g(int i) {
        this.d = i;
        this.e = (byte) 1;
    }

    public final void h(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null url");
    }

    public final void i(Instant instant) {
        if (instant != null) {
            this.h = instant;
            return;
        }
        throw new NullPointerException("Null validUntil");
    }

    public final adfp j() {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        if (this.e == 1 && (str = this.a) != null && (obj = this.i) != null && (obj2 = this.g) != null && (obj3 = this.f) != null && (obj4 = this.h) != null) {
            return new adfp(this.b, str, (apfs) obj, (ailh) obj2, this.d, (String) obj3, this.c, (alpt) obj4);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" username");
        }
        if (this.i == null) {
            sb.append(" localIpAddress");
        }
        if (this.g == null) {
            sb.append(" proxyProtocol");
        }
        if (this.e == 0) {
            sb.append(" listeningPort");
        }
        if (this.f == null) {
            sb.append(" instance");
        }
        if (this.h == null) {
            sb.append(" registeredFeatureTags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void k(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null instance");
    }

    public final void l(int i) {
        this.d = i;
        this.e = (byte) 1;
    }

    public final void m(String str) {
        aozy createBuilder = apfs.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfs apfsVar = (apfs) createBuilder.b;
        apfsVar.b |= 1;
        apfsVar.c = str;
        apfs apfsVar2 = (apfs) createBuilder.s();
        if (apfsVar2 != null) {
            this.i = apfsVar2;
            return;
        }
        throw new NullPointerException("Null localIpAddress");
    }

    public final void n(ailh ailhVar) {
        if (ailhVar != null) {
            this.g = ailhVar;
            return;
        }
        throw new NullPointerException("Null proxyProtocol");
    }

    public final void o(alpt alptVar) {
        if (alptVar != null) {
            this.h = alptVar;
            return;
        }
        throw new NullPointerException("Null registeredFeatureTags");
    }

    public ajqc(byte[] bArr, byte[] bArr2) {
        this.b = Optional.empty();
        this.c = Optional.empty();
    }

    public ajqc(byte[] bArr) {
        this.f = Optional.empty();
        this.b = Optional.empty();
        this.i = Optional.empty();
        this.c = Optional.empty();
    }

    public ajqc(FileInformation fileInformation) {
        this.f = Optional.empty();
        this.b = Optional.empty();
        this.i = Optional.empty();
        this.c = Optional.empty();
        AutoValue_FileInformation autoValue_FileInformation = (AutoValue_FileInformation) fileInformation;
        this.f = autoValue_FileInformation.a;
        this.d = autoValue_FileInformation.b;
        this.g = autoValue_FileInformation.c;
        this.a = autoValue_FileInformation.d;
        this.h = autoValue_FileInformation.e;
        this.b = autoValue_FileInformation.f;
        this.i = autoValue_FileInformation.g;
        this.c = autoValue_FileInformation.h;
        this.e = (byte) 1;
    }
}
