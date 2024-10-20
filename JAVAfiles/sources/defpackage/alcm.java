package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alcm implements oy {
    public final Handler b;
    public String c;
    public final aogz e;
    private final qyk g;
    public final Runnable a = new akwm(this, 3);
    public volatile aats d = null;
    private final int f = 500;

    public alcm(alcn alcnVar) {
        this.e = new aogz(alcnVar);
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = handler;
        this.g = new qyk(handler, 2);
    }

    @Override // defpackage.oy
    public final boolean a(String str) {
        this.b.removeCallbacks(this.a);
        this.c = str;
        c();
        return true;
    }

    @Override // defpackage.oy
    public final void b(String str) {
        this.c = str;
        this.b.removeCallbacks(this.a);
        this.b.postDelayed(this.a, this.f);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, alcn] */
    public final void c() {
        String str;
        String str2 = this.c;
        aozy createBuilder = aqac.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((aqac) apagVar).d = a.al(9);
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aqac) createBuilder.b).b = a.am(2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ((aqac) apagVar2).e = arwi.I(4);
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ((aqac) createBuilder.b).c = 0;
        aozy createBuilder2 = apzx.a.createBuilder();
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        } else {
            str = "hello";
        }
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        str.getClass();
        ((apzx) apagVar3).c = str;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar4 = createBuilder2.b;
        ((apzx) apagVar4).d = 20;
        if (!apagVar4.isMutable()) {
            createBuilder2.u();
        }
        aogz aogzVar = this.e;
        apzx apzxVar = (apzx) createBuilder2.b;
        aqac aqacVar = (aqac) createBuilder.s();
        aqacVar.getClass();
        apzxVar.i = aqacVar;
        apzxVar.b |= 32;
        Object obj = aogzVar.d;
        if (obj != null) {
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apzx apzxVar2 = (apzx) createBuilder2.b;
            apzxVar2.e = (aqaa) obj;
            apzxVar2.b |= 2;
        }
        if (aogzVar.a != 0) {
            aozy createBuilder3 = aqab.a.createBuilder();
            int i = aogzVar.a;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            ((aqab) createBuilder3.b).b = i;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apzx apzxVar3 = (apzx) createBuilder2.b;
            aqab aqabVar = (aqab) createBuilder3.s();
            aqabVar.getClass();
            apzxVar3.g = aqabVar;
            apzxVar3.b |= 8;
        }
        Object obj2 = aogzVar.e;
        if (obj2 != null) {
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apzx apzxVar4 = (apzx) createBuilder2.b;
            apzxVar4.f = (aqaa) obj2;
            apzxVar4.b |= 4;
        }
        if (aogzVar.b != 0) {
            aozy createBuilder4 = aqab.a.createBuilder();
            int i2 = aogzVar.b;
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            ((aqab) createBuilder4.b).b = i2;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apzx apzxVar5 = (apzx) createBuilder2.b;
            aqab aqabVar2 = (aqab) createBuilder4.s();
            aqabVar2.getClass();
            apzxVar5.h = aqabVar2;
            apzxVar5.b |= 16;
        }
        albo.bR(aogzVar.c.a((apzx) createBuilder2.s()), new vbr(this, str2, 16), this.g);
    }
}
