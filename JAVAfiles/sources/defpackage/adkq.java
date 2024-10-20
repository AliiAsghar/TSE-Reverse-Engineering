package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adkq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ adkq(adks adksVar, Context context, adlw adlwVar, String str, int i, Optional optional, adiv adivVar, int i2) {
        this.h = i2;
        this.b = adksVar;
        this.c = context;
        this.d = adlwVar;
        this.e = str;
        this.a = i;
        this.f = optional;
        this.g = adivVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r8v1, types: [arth, arqv] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.h != 0) {
            fzd fzdVar = (fzd) this.c;
            if (fzdVar.f == this.a) {
                int h = ((gcj) this.d).h();
                gcj gcjVar = fzdVar.e;
                if (gcjVar != null && fzdVar.d == null) {
                    Object obj = this.e;
                    Object obj2 = this.f;
                    Object obj3 = this.b;
                    gcj gcjVar2 = (gcj) this.g;
                    fzdVar.d = gcjVar2;
                    gcjVar2.k(fzdVar.h);
                    fzdVar.e = null;
                    gcj gcjVar3 = (gcj) obj3;
                    atkn atknVar = (atkn) obj2;
                    nq.V(gcjVar.h, fzdVar.b(), gcjVar3.h, atknVar);
                    gcg gcgVar = fzdVar.j;
                    gcgVar.getClass();
                    gdo gdoVar = (gdo) obj;
                    arta A = arrn.A(arrn.B(0, gdoVar.a.size()), 3);
                    int i = A.a;
                    int i2 = A.b;
                    int i3 = A.c;
                    if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                        while (true) {
                            int intValue = ((Number) gdoVar.a.get(i)).intValue();
                            if (intValue != 0) {
                                if (intValue != 1) {
                                    if (intValue == 2) {
                                        ((fzc) gcgVar).a.b().d(((Number) gdoVar.a.get(i + 1)).intValue(), ((Number) gdoVar.a.get(i + 2)).intValue());
                                    } else {
                                        throw new IllegalStateException("Unexpected recording value");
                                    }
                                } else {
                                    gcgVar.b(((Number) gdoVar.a.get(i + 1)).intValue(), ((Number) gdoVar.a.get(i + 2)).intValue());
                                }
                            } else {
                                gcgVar.a(((Number) gdoVar.a.get(i + 1)).intValue(), ((Number) gdoVar.a.get(i + 2)).intValue());
                            }
                            if (i == i2) {
                                break;
                            } else {
                                i += i3;
                            }
                        }
                    }
                    gdoVar.a.clear();
                    gcjVar2.j(fzdVar.j);
                    if (!gcjVar2.isEmpty()) {
                        gcjVar2.l(arrn.u(nq.T(gcjVar.h, atknVar, gcjVar3.h, h), 0, gcjVar2.g() - 1));
                    }
                    fzdVar.d(gcjVar, fzdVar.d);
                    return;
                }
                throw new IllegalStateException("must be in snapshot state to apply diff");
            }
            return;
        }
        admx admxVar = (admx) ((Optional) this.f).orElse(null);
        ?? r8 = this.g;
        int i4 = this.a;
        Object obj4 = this.e;
        ((adks) this.b).d((Context) this.c, (adlw) this.d, null, (String) obj4, i4, admxVar, r8);
    }

    public /* synthetic */ adkq(fzd fzdVar, int i, gcj gcjVar, gcj gcjVar2, atkn atknVar, gdo gdoVar, gcj gcjVar3, int i2) {
        this.h = i2;
        this.c = fzdVar;
        this.a = i;
        this.g = gcjVar;
        this.b = gcjVar2;
        this.f = atknVar;
        this.e = gdoVar;
        this.d = gcjVar3;
    }
}
