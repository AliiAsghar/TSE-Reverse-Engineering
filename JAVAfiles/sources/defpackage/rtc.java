package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rtc {
    private short A;
    public MessageIdType a;
    public String b;
    public String c;
    public Uri d;
    public Uri e;
    public Uri f;
    public String g;
    public String h;
    public LocationInformation i;
    public String j;
    public String k;
    public String l;
    public aggp m;
    public tqi n;
    private int o;
    private int p;
    private long q;
    private long r;
    private ameb s;
    private long t;
    private long u;
    private tqj v;
    private int w;
    private boolean x;
    private boolean y;
    private tqq z;

    public final rtd a() {
        Optional of;
        boolean z;
        Optional of2;
        boolean z2;
        MessageIdType messageIdType;
        ameb amebVar;
        tqj tqjVar;
        tqq tqqVar;
        ameb amebVar2 = this.s;
        if (amebVar2 != null) {
            if ((this.A & 128) == 0) {
                of = Optional.empty();
            } else {
                of = Optional.of(Boolean.valueOf(this.x));
            }
            boolean z3 = false;
            if (amebVar2 == ameb.FILE_CHOOSER) {
                z = true;
            } else {
                z = false;
            }
            h(((Boolean) of.orElse(Boolean.valueOf(z))).booleanValue());
            if ((this.A & 256) == 0) {
                of2 = Optional.empty();
            } else {
                of2 = Optional.of(Boolean.valueOf(this.y));
            }
            if (amebVar2 != ameb.CAMERA && amebVar2 != ameb.MINI_CAMERA && amebVar2 != ameb.FULLSCREEN_CAMERA) {
                z2 = false;
            } else {
                z2 = true;
            }
            Boolean bool = (Boolean) of2.orElse(Boolean.valueOf(z2));
            j(bool.booleanValue());
            String str = this.c;
            if (!bool.booleanValue() || gh.m(str) || gh.z(str)) {
                z3 = true;
            }
            albo.U(z3, "saveToExternalStorageValue but part is not image or video: ".concat(String.valueOf(str)));
            if (this.A == 511 && (messageIdType = this.a) != null && (amebVar = this.s) != null && (tqjVar = this.v) != null && (tqqVar = this.z) != null) {
                return new rtd(messageIdType, this.b, this.c, this.d, this.e, this.f, this.o, this.p, this.q, this.r, amebVar, this.g, this.h, this.t, this.i, this.j, this.k, this.l, this.m, this.u, tqjVar, this.w, this.x, this.y, this.n, tqqVar);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" messageId");
            }
            if ((this.A & 1) == 0) {
                sb.append(" width");
            }
            if ((this.A & 2) == 0) {
                sb.append(" height");
            }
            if ((this.A & 4) == 0) {
                sb.append(" duration");
            }
            if ((this.A & 8) == 0) {
                sb.append(" targetFileSize");
            }
            if (this.s == null) {
                sb.append(" source");
            }
            if ((this.A & 16) == 0) {
                sb.append(" mediaModifiedTimestamp");
            }
            if ((this.A & 32) == 0) {
                sb.append(" fileSizeBytes");
            }
            if (this.v == null) {
                sb.append(" mediaSendType");
            }
            if ((this.A & 64) == 0) {
                sb.append(" bundleIndex");
            }
            if ((this.A & 128) == 0) {
                sb.append(" preserveSize");
            }
            if ((this.A & 256) == 0) {
                sb.append(" saveToExternalStorage");
            }
            if (this.z == null) {
                sb.append(" richCardMediaDownloadFailureReason");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new IllegalStateException("Property \"source\" has not been set");
    }

    public final void b(int i) {
        this.w = i;
        this.A = (short) (this.A | 64);
    }

    public final void c(long j) {
        this.q = j;
        this.A = (short) (this.A | 4);
    }

    public final void d(long j) {
        this.u = j;
        this.A = (short) (this.A | 32);
    }

    public final void e(int i) {
        this.p = i;
        this.A = (short) (this.A | 2);
    }

    public final void f(long j) {
        this.t = j;
        this.A = (short) (this.A | 16);
    }

    public final void g(tqj tqjVar) {
        if (tqjVar != null) {
            this.v = tqjVar;
            return;
        }
        throw new NullPointerException("Null mediaSendType");
    }

    public final void h(boolean z) {
        this.x = z;
        this.A = (short) (this.A | 128);
    }

    public final void i(tqq tqqVar) {
        if (tqqVar != null) {
            this.z = tqqVar;
            return;
        }
        throw new NullPointerException("Null richCardMediaDownloadFailureReason");
    }

    public final void j(boolean z) {
        this.y = z;
        this.A = (short) (this.A | 256);
    }

    public final void k(ameb amebVar) {
        if (amebVar != null) {
            this.s = amebVar;
            return;
        }
        throw new NullPointerException("Null source");
    }

    public final void l(long j) {
        this.r = j;
        this.A = (short) (this.A | 8);
    }

    public final void m(int i) {
        this.o = i;
        this.A = (short) (this.A | 1);
    }
}
