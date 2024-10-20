package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikd {
    public aiki a;
    public ahji b;
    private String c;
    private String d;
    private String e;
    private ailh f;
    private advp g;
    private alog h;

    public final aike a() {
        if (this.c != null && this.d != null && this.e != null && this.f != null && this.a != null && this.g != null && this.h != null && this.b != null) {
            return new aike(this.c, this.d, this.e, this.f, this.a, this.g, this.h, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" user");
        }
        if (this.d == null) {
            sb.append(" domain");
        }
        if (this.e == null) {
            sb.append(" sipInstance");
        }
        if (this.f == null) {
            sb.append(" transportProtocol");
        }
        if (this.a == null) {
            sb.append(" sipTransactionLayer");
        }
        if (this.g == null) {
            sb.append(" logTag");
        }
        if (this.h == null) {
            sb.append(" messageFilters");
        }
        if (this.b == null) {
            sb.append(" addressFactory");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.h = alog.n(list);
    }

    public final /* bridge */ /* synthetic */ void c(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null domain");
    }

    public final /* bridge */ /* synthetic */ void d(advp advpVar) {
        if (advpVar != null) {
            this.g = advpVar;
            return;
        }
        throw new NullPointerException("Null logTag");
    }

    public final /* bridge */ /* synthetic */ void e(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null sipInstance");
    }

    public final /* bridge */ /* synthetic */ void f(ailh ailhVar) {
        if (ailhVar != null) {
            this.f = ailhVar;
            return;
        }
        throw new NullPointerException("Null transportProtocol");
    }

    public final /* bridge */ /* synthetic */ void g(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null user");
    }
}
