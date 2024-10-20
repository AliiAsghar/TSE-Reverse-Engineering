package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoht {
    public String a;
    public String b;
    public String c;
    public String d;
    private long e;
    private long f;
    private byte g;
    private int h;

    public aoht() {
    }

    public final aohu a() {
        if (this.g == 3 && this.h != 0) {
            return new aohu(this.a, this.h, this.b, this.c, this.e, this.f, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.g & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.g & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.e = j;
        this.g = (byte) (this.g | 1);
    }

    public final void c(int i) {
        if (i != 0) {
            this.h = i;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public final void d(long j) {
        this.f = j;
        this.g = (byte) (this.g | 2);
    }

    public aoht(aohu aohuVar) {
        this.a = aohuVar.a;
        this.h = aohuVar.g;
        this.b = aohuVar.b;
        this.c = aohuVar.c;
        this.e = aohuVar.d;
        this.f = aohuVar.e;
        this.d = aohuVar.f;
        this.g = (byte) 3;
    }
}
