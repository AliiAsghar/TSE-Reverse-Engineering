package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwp {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    private Resources i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private byte o;

    public final xwq a() {
        Resources resources;
        if (this.o == 31 && (resources = this.i) != null) {
            return new xwq(resources, this.j, this.k, this.l, this.a, this.h, this.m, this.b, this.c, this.d, this.e, this.f, this.g, this.n);
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == null) {
            sb.append(" resources");
        }
        if ((this.o & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.o & 2) == 0) {
            sb.append(" isOutgoing");
        }
        if ((this.o & 4) == 0) {
            sb.append(" useSentToFormat");
        }
        if ((this.o & 8) == 0) {
            sb.append(" attachmentCount");
        }
        if ((this.o & 16) == 0) {
            sb.append(" unreadMessageCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.m = i;
        this.o = (byte) (this.o | 8);
    }

    public final void c(boolean z) {
        this.k = z;
        this.o = (byte) (this.o | 2);
    }

    public final void d(Resources resources) {
        if (resources != null) {
            this.i = resources;
            return;
        }
        throw new NullPointerException("Null resources");
    }

    public final void e(int i) {
        this.j = i;
        this.o = (byte) (this.o | 1);
    }

    public final void f(int i) {
        this.n = i;
        this.o = (byte) (this.o | 16);
    }

    public final void g(boolean z) {
        this.l = z;
        this.o = (byte) (this.o | 4);
    }
}
