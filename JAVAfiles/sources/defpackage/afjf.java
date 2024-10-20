package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjf implements hh {
    final /* synthetic */ List a;

    public afjf(List list) {
        this.a = list;
    }

    @Override // defpackage.hh
    public final void a(int i, int i2, Object obj) {
        this.a.add(new afja(i, i2, obj));
    }

    @Override // defpackage.hh
    public final void b(int i, int i2) {
        this.a.add(new afjb(i, i2));
    }

    @Override // defpackage.hh
    public final void c(int i, int i2) {
        this.a.add(new afjc(i, i2));
    }

    @Override // defpackage.hh
    public final void d(int i, int i2) {
        this.a.add(new afjd(i, i2));
    }
}
