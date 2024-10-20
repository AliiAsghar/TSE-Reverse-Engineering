package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vhe {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver");
    public final Context b;
    public final alhr c;
    public final alhr d;
    public final alhr e;
    public volatile boolean f = false;
    private final anen g;

    public vhe(Context context, final armf armfVar, xgj xgjVar, final vti vtiVar, final wpp wppVar, anen anenVar, final vba vbaVar, final int i, final Optional optional, final int i2, final int i3, final int i4, final boolean z, final boolean z2, final boolean z3) {
        this.b = context;
        this.g = anenVar;
        this.c = albo.D(new tdw(xgjVar, armfVar, vbaVar, 11, (short[]) null));
        this.e = albo.D(new alhr() { // from class: vhc
            /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
            @Override // defpackage.alhr
            public final Object get() {
                vgt vgtVar = (vgt) vhe.this.c.get();
                vcy vcyVar = (vcy) armfVar.b();
                wpp wppVar2 = wppVar;
                wpp wppVar3 = (wpp) wppVar2.a.b();
                wppVar3.getClass();
                anen anenVar2 = (anen) wppVar2.b.b();
                anenVar2.getClass();
                vgtVar.getClass();
                vcyVar.getClass();
                vba vbaVar2 = vbaVar;
                vbaVar2.getClass();
                return new vgk(wppVar3, anenVar2, wppVar2.c, vgtVar, vcyVar, vbaVar2, z, akec.aD(i));
            }
        });
        this.d = albo.D(new alhr() { // from class: vhd
            /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v11, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v14, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v17, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v5, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v8, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
            @Override // defpackage.alhr
            public final Object get() {
                Optional empty;
                vhe vheVar = vhe.this;
                vgt vgtVar = (vgt) vheVar.c.get();
                vcy vcyVar = (vcy) armfVar.b();
                if (z3) {
                    empty = Optional.of(vheVar.e);
                } else {
                    empty = Optional.empty();
                }
                Optional optional2 = empty;
                int i5 = i;
                vba vbaVar2 = vbaVar;
                vti vtiVar2 = vtiVar;
                wpp wppVar2 = (wpp) vtiVar2.i.b();
                wppVar2.getClass();
                mbl mblVar = (mbl) vtiVar2.e.b();
                mblVar.getClass();
                aneo aneoVar = (aneo) vtiVar2.f.b();
                aneoVar.getClass();
                anen anenVar2 = (anen) vtiVar2.a.b();
                anenVar2.getClass();
                xnv xnvVar = (xnv) vtiVar2.g.b();
                xnvVar.getClass();
                aksr aksrVar = (aksr) vtiVar2.k.b();
                aksrVar.getClass();
                vgtVar.getClass();
                vcyVar.getClass();
                vbaVar2.getClass();
                boolean z4 = z2;
                boolean z5 = z;
                int i6 = i4;
                int i7 = i3;
                int i8 = i2;
                return new vfv(wppVar2, vtiVar2.c, vtiVar2.j, mblVar, vtiVar2.d, aneoVar, anenVar2, vtiVar2.b, xnvVar, aksrVar, vtiVar2.h, vgtVar, vcyVar, vbaVar2, i5, optional, optional2, i8, i7, i6, z5, z4);
            }
        });
    }

    public final akul a(aqfn aqfnVar, akul akulVar) {
        return akulVar.e(Throwable.class, new uvz(this, aqfnVar, 14), this.g);
    }

    public final akul b() {
        return ((vfp) this.d.get()).a();
    }

    public final void c() {
        ((vfp) this.d.get()).c();
    }
}
