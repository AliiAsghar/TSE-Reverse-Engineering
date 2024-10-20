package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afuo implements afuq, afvj {
    private aftm a;
    private String b;
    private Map c;
    private String d;
    private int e;
    private int f;
    private long g;
    private Instant h;
    private afcp i;
    private Duration j;
    private short k;

    @Override // defpackage.afee
    public final afcp a() {
        throw null;
    }

    @Override // defpackage.afek
    public final /* bridge */ /* synthetic */ afcq b() {
        int i = ~this.k;
        if ((i & 1011) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.k & 1) == 0) {
                sb.append(" format");
            }
            if ((this.k & 2) == 0) {
                sb.append(" url");
            }
            if ((this.k & 16) == 0) {
                sb.append(" widthPx");
            }
            if ((this.k & 32) == 0) {
                sb.append(" heightPx");
            }
            if ((this.k & 64) == 0) {
                sb.append(" sizeBytes");
            }
            if ((this.k & 128) == 0) {
                sb.append(" dateModified");
            }
            if ((this.k & 256) == 0) {
                sb.append(" source");
            }
            if ((this.k & 512) == 0) {
                sb.append(" duration");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new aftq(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, i & 12);
    }

    @Override // defpackage.afdb
    public final /* bridge */ /* synthetic */ void c(Instant instant) {
        this.h = instant;
        this.k = (short) (this.k | 128);
    }

    @Override // defpackage.afdb
    public final /* bridge */ /* synthetic */ void d(String str) {
        this.d = str;
        this.k = (short) (this.k | 8);
    }

    @Override // defpackage.afdb
    public final /* bridge */ /* synthetic */ void e(afsx afsxVar) {
        v(afsxVar);
    }

    @Override // defpackage.afee
    public final /* bridge */ /* synthetic */ void g(afcp afcpVar) {
        this.i = afcpVar;
        this.k = (short) (this.k | 256);
    }

    @Override // defpackage.afvh
    public final /* bridge */ /* synthetic */ void i(afru afruVar) {
        this.a = (aftm) afruVar;
        this.k = (short) (this.k | 1);
    }

    @Override // defpackage.afvh
    public final /* bridge */ /* synthetic */ void j(Map map) {
        this.c = map;
        this.k = (short) (this.k | 4);
    }

    @Override // defpackage.afvj
    public final /* bridge */ /* synthetic */ void k(int i) {
        this.f = i;
        this.k = (short) (this.k | 32);
    }

    public final void l(Duration duration) {
        this.j = duration;
        this.k = (short) (this.k | 512);
    }

    @Override // defpackage.afvh
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void q(long j) {
        this.g = j;
        this.k = (short) (this.k | 64);
    }

    @Override // defpackage.afvh
    public final /* bridge */ /* synthetic */ void n(afsz afszVar) {
        w(afszVar);
    }

    @Override // defpackage.afvh
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void t(String str) {
        this.b = str;
        this.k = (short) (this.k | 2);
    }

    @Override // defpackage.afvj
    public final /* bridge */ /* synthetic */ void u(int i) {
        this.e = i;
        this.k = (short) (this.k | 16);
    }

    @Override // defpackage.afuq
    public final /* synthetic */ void v(afsx afsxVar) {
        afwv.l(this, afsxVar);
    }

    @Override // defpackage.afuq
    public final /* synthetic */ void w(afsz afszVar) {
        afszVar.getClass();
    }
}
