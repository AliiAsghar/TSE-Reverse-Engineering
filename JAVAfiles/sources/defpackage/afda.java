package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afda implements afdb {
    private afsx a;
    private String b;
    private long c;
    private String d;
    private Instant e;
    private afcp f;
    private byte g;

    @Override // defpackage.afee
    public final afcp a() {
        throw null;
    }

    @Override // defpackage.afek
    public final /* bridge */ /* synthetic */ afcq b() {
        afsx afsxVar;
        String str;
        Instant instant;
        afcp afcpVar;
        if (this.g == 1 && (afsxVar = this.a) != null && (str = this.b) != null && (instant = this.e) != null && (afcpVar = this.f) != null) {
            return new afcw(afsxVar, str, this.c, this.d, instant, afcpVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mediaType");
        }
        if (this.b == null) {
            sb.append(" url");
        }
        if (this.g == 0) {
            sb.append(" sizeBytes");
        }
        if (this.e == null) {
            sb.append(" dateModified");
        }
        if (this.f == null) {
            sb.append(" source");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.afdb
    public final /* synthetic */ void c(Instant instant) {
        this.e = instant;
    }

    @Override // defpackage.afdb
    public final /* synthetic */ void d(String str) {
        this.d = str;
    }

    @Override // defpackage.afdb
    public final /* synthetic */ void e(afsx afsxVar) {
        this.a = afsxVar;
    }

    @Override // defpackage.afdb
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void q(long j) {
        this.c = j;
        this.g = (byte) 1;
    }

    @Override // defpackage.afee
    public final /* bridge */ /* synthetic */ void g(afcp afcpVar) {
        this.f = afcpVar;
    }

    @Override // defpackage.afdb
    /* renamed from: h */
    public final /* synthetic */ void t(String str) {
        this.b = str;
    }
}
