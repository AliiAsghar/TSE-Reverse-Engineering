package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpu {
    public int a;
    public int b;
    public int c;
    public int d;
    public alog e;
    public byte f;
    public int g;

    public final void a(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }

    public final void b(int i) {
        this.a = i;
        this.f = (byte) (this.f | 1);
    }

    public final void c(int i) {
        this.c = i;
        this.f = (byte) (this.f | 4);
    }

    public final void d(int i) {
        this.d = i;
        this.f = (byte) (this.f | 8);
    }

    public final void e(List list) {
        this.e = alog.n(list);
    }
}
