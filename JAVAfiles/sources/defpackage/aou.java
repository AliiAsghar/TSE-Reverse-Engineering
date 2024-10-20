package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aou implements asp, ahv {
    public final /* synthetic */ aov a;
    private final /* synthetic */ ahv b;

    public aou(ahv ahvVar, aov aovVar) {
        this.a = aovVar;
        this.b = ahvVar;
    }

    @Override // defpackage.ahv
    public final float a(float f) {
        return this.b.a(f);
    }

    @Override // defpackage.asp
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.asp
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.asp
    public final int d() {
        anw anwVar = (anw) aqjn.ad(this.a.d().i());
        if (anwVar != null) {
            return anwVar.a();
        }
        return 0;
    }

    @Override // defpackage.asp
    public final int e(int i) {
        Object obj;
        aog d = this.a.d();
        if (d.i().isEmpty()) {
            return 0;
        }
        int b = b();
        if (i <= d() && b <= i) {
            List i2 = d.i();
            int size = i2.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    obj = i2.get(i3);
                    if (((anw) obj).a() == i) {
                        break;
                    }
                    i3++;
                } else {
                    obj = null;
                    break;
                }
            }
            anw anwVar = (anw) obj;
            if (anwVar == null) {
                return 0;
            }
            return anwVar.b();
        }
        List i4 = d.i();
        int size2 = i4.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            i5 += ((anw) i4.get(i6)).c();
        }
        return (((i5 / i4.size()) + d.c()) * (i - b())) - c();
    }

    @Override // defpackage.asp
    public final void f(int i) {
        this.a.m(i);
    }
}
