package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agmy {
    public agmz a;
    private String b;
    private String c;
    private int d;
    private int e;
    private boolean f;
    private alog g;
    private byte h;

    public final agna a() {
        String str;
        String str2;
        alog alogVar;
        if (this.h == 7 && (str = this.b) != null && (str2 = this.c) != null && (alogVar = this.g) != null) {
            return new agna(str, str2, this.d, this.e, this.f, alogVar, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" storageFileName");
        }
        if (this.c == null) {
            sb.append(" handleName");
        }
        if ((this.h & 1) == 0) {
            sb.append(" currentSchemaVersion");
        }
        if ((this.h & 2) == 0) {
            sb.append(" transactionOrderingPosition");
        }
        if ((this.h & 4) == 0) {
            sb.append(" ignoreDowngrade");
        }
        if (this.g == null) {
            sb.append(" invalidRanges");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.h = (byte) (this.h | 1);
    }

    public final void c(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null handleName");
    }

    public final void d(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 4);
    }

    public final void e(alog alogVar) {
        if (alogVar != null) {
            this.g = alogVar;
            return;
        }
        throw new NullPointerException("Null invalidRanges");
    }

    public final void f(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null storageFileName");
    }

    public final void g(int i) {
        this.e = i;
        this.h = (byte) (this.h | 2);
    }
}
