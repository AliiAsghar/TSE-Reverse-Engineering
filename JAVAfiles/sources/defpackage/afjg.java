package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjg extends hb {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ arqv c;
    final /* synthetic */ arqv d;
    final /* synthetic */ arqv e;

    public afjg(List list, List list2, arqv arqvVar, arqv arqvVar2, arqv arqvVar3) {
        this.a = list;
        this.b = list2;
        this.c = arqvVar;
        this.d = arqvVar2;
        this.e = arqvVar3;
    }

    @Override // defpackage.hb
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.hb
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.hb
    public final Object c(int i, int i2) {
        List list = this.b;
        return this.e.a(this.a.get(i), list.get(i2));
    }

    @Override // defpackage.hb
    public final boolean d(int i, int i2) {
        List list = this.b;
        return ((Boolean) this.d.a(this.a.get(i), list.get(i2))).booleanValue();
    }

    @Override // defpackage.hb
    public final boolean e(int i, int i2) {
        List list = this.b;
        return ((Boolean) this.c.a(this.a.get(i), list.get(i2))).booleanValue();
    }
}
