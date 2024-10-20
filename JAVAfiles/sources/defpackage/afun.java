package defpackage;

import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afun implements afuq, afvj {
    private afsk a;
    private String b;
    private Map c;
    private String d;
    private int e;
    private int f;
    private long g;
    private Instant h;
    private afcp i;
    private short j;

    @Override // defpackage.afee
    public final afcp a() {
        throw null;
    }

    @Override // defpackage.afek
    public final /* bridge */ /* synthetic */ afcq b() {
        int i = ~this.j;
        if ((i & 499) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" format");
            }
            if ((this.j & 2) == 0) {
                sb.append(" url");
            }
            if ((this.j & 16) == 0) {
                sb.append(" widthPx");
            }
            if ((this.j & 32) == 0) {
                sb.append(" heightPx");
            }
            if ((this.j & 64) == 0) {
                sb.append(" sizeBytes");
            }
            if ((this.j & 128) == 0) {
                sb.append(" dateModified");
            }
            if ((this.j & 256) == 0) {
                sb.append(" source");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new afto(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, i & 12);
    }

    @Override // defpackage.afdb
    public final /* bridge */ /* synthetic */ void c(Instant instant) {
        this.h = instant;
        this.j = (short) (this.j | 128);
    }

    @Override // defpackage.afdb
    public final /* bridge */ /* synthetic */ void d(String str) {
        this.d = str;
        this.j = (short) (this.j | 8);
    }

    @Override // defpackage.afdb
    public final /* bridge */ /* synthetic */ void e(afsx afsxVar) {
        v(afsxVar);
    }

    @Override // defpackage.afee
    public final /* bridge */ /* synthetic */ void g(afcp afcpVar) {
        this.i = afcpVar;
        this.j = (short) (this.j | 256);
    }

    @Override // defpackage.afvh
    public final /* bridge */ /* synthetic */ void i(afru afruVar) {
        this.a = (afsk) afruVar;
        this.j = (short) (this.j | 1);
    }

    @Override // defpackage.afvh
    public final /* bridge */ /* synthetic */ void j(Map map) {
        this.c = map;
        this.j = (short) (this.j | 4);
    }

    @Override // defpackage.afvj
    public final /* bridge */ /* synthetic */ void k(int i) {
        this.f = i;
        this.j = (short) (this.j | 32);
    }

    @Override // defpackage.afvh
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void q(long j) {
        this.g = j;
        this.j = (short) (this.j | 64);
    }

    @Override // defpackage.afvh
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void t(String str) {
        this.b = str;
        this.j = (short) (this.j | 2);
    }

    @Override // defpackage.afvh
    public final /* bridge */ /* synthetic */ void n(afsz afszVar) {
        w(afszVar);
    }

    @Override // defpackage.afvj
    public final /* bridge */ /* synthetic */ void u(int i) {
        this.e = i;
        this.j = (short) (this.j | 16);
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
