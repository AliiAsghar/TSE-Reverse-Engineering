package defpackage;

import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqg implements afuq, afvj {
    private String a;
    private String b;
    private String c;
    private boolean d;
    private afsk e;
    private Map f;
    private String g;
    private int h;
    private int i;
    private long j;
    private Instant k;
    private afcp l;
    private short m;

    @Override // defpackage.afee
    public final afcp a() {
        throw null;
    }

    @Override // defpackage.afek
    public final /* bridge */ /* synthetic */ afcq b() {
        int i = ~this.m;
        if ((i & 3) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.m & 1) == 0) {
                sb.append(" id");
            }
            if ((this.m & 2) == 0) {
                sb.append(" url");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new afqc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, i & 4092);
    }

    @Override // defpackage.afdb
    public final /* bridge */ /* synthetic */ void c(Instant instant) {
        this.k = instant;
        this.m = (short) (this.m | 1024);
    }

    @Override // defpackage.afdb
    public final /* bridge */ /* synthetic */ void d(String str) {
        this.g = str;
        this.m = (short) (this.m | 64);
    }

    @Override // defpackage.afdb
    public final /* bridge */ /* synthetic */ void e(afsx afsxVar) {
        v(afsxVar);
    }

    @Override // defpackage.afee
    public final /* bridge */ /* synthetic */ void g(afcp afcpVar) {
        this.l = afcpVar;
        this.m = (short) (this.m | 2048);
    }

    @Override // defpackage.afvh
    public final /* bridge */ /* synthetic */ void i(afru afruVar) {
        this.e = (afsk) afruVar;
        this.m = (short) (this.m | 16);
    }

    @Override // defpackage.afvh
    public final /* bridge */ /* synthetic */ void j(Map map) {
        this.f = map;
        this.m = (short) (this.m | 32);
    }

    @Override // defpackage.afvj
    public final /* bridge */ /* synthetic */ void k(int i) {
        this.i = i;
        this.m = (short) (this.m | 256);
    }

    public final void l(String str) {
        this.a = str;
        this.m = (short) (this.m | 1);
    }

    public final void m(String str) {
        this.c = str;
        this.m = (short) (this.m | 4);
    }

    @Override // defpackage.afvh
    public final /* bridge */ /* synthetic */ void n(afsz afszVar) {
        w(afszVar);
    }

    public final void o(boolean z) {
        this.d = z;
        this.m = (short) (this.m | 8);
    }

    @Override // defpackage.afvh
    /* renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void q(long j) {
        this.j = j;
        this.m = (short) (this.m | 512);
    }

    @Override // defpackage.afvh
    /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void t(String str) {
        this.b = str;
        this.m = (short) (this.m | 2);
    }

    @Override // defpackage.afvj
    public final /* bridge */ /* synthetic */ void u(int i) {
        this.h = i;
        this.m = (short) (this.m | 128);
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
