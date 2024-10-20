package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbf implements apxw {
    public static mbl a(armf armfVar, armf armfVar2, armf armfVar3) {
        int i = mbe.a;
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        return new mbk(armfVar, armfVar2);
    }

    public static hin c(Context context) {
        if (context != null) {
            return new hin(context);
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }

    public static ahma d(Optional optional) {
        boolean booleanValue = ((Boolean) mgx.q.e()).booleanValue();
        akia c = ahma.c();
        c.h(booleanValue);
        optional.ifPresent(new met(c, 0));
        return c.f();
    }

    public static ahni e(Optional optional) {
        ahnh c = ahni.c();
        c.b(true);
        optional.ifPresent(new met(c, 2));
        return c.a();
    }

    public static ahol f() {
        boolean booleanValue = ((Boolean) mgx.a.e()).booleanValue();
        ahok c = ahol.c();
        c.b(booleanValue);
        return c.a();
    }

    public static ahoz g(mgx mgxVar) {
        int i;
        boolean z = true;
        if (true != mgxVar.a()) {
            i = 2;
        } else {
            i = 3;
        }
        ahoy c = ahoz.c();
        c.e = i;
        if (!xyp.d() && !xyp.j()) {
            z = false;
        }
        c.c(z);
        c.b(xyp.j());
        return c.a();
    }

    public static ahqj h() {
        int i;
        if (true != ((Boolean) mgx.p.e()).booleanValue()) {
            i = 2;
        } else {
            i = 3;
        }
        akia c = ahqj.c();
        c.b = i;
        return c.e();
    }

    public static ahpv i(apwt apwtVar) {
        int i;
        alog alogVar;
        int i2;
        ahpu ahpuVar = new ahpu();
        ahpuVar.g = 1;
        ahpuVar.b(250);
        ahpuVar.a(250);
        ahpuVar.c(250);
        ahpuVar.d(10000);
        ahpuVar.e(alog.t(1000, 2500, 5000));
        if (true != ((Boolean) mgx.c.e()).booleanValue()) {
            i = 2;
        } else {
            i = 3;
        }
        ahpuVar.g = i;
        ahpuVar.b(((Integer) mgx.d.e()).intValue());
        ahpuVar.a(((Integer) mgx.e.e()).intValue());
        ahpuVar.c(((Integer) mgx.f.e()).intValue());
        ahpuVar.e(((aplf) mgx.g.e()).b);
        ahpuVar.d(((Integer) mgx.h.e()).intValue());
        if (ahpuVar.f == 15 && (alogVar = ahpuVar.e) != null && (i2 = ahpuVar.g) != 0) {
            return new ahpv(ahpuVar.a, ahpuVar.b, ahpuVar.c, ahpuVar.d, alogVar, i2);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & ahpuVar.f) == 0) {
            sb.append(" initialMonitoringDelayMs");
        }
        if ((ahpuVar.f & 2) == 0) {
            sb.append(" checkForResponseIntervalMs");
        }
        if ((ahpuVar.f & 4) == 0) {
            sb.append(" midStallCheckForResponseIntervalMs");
        }
        if ((ahpuVar.f & 8) == 0) {
            sb.append(" postToMainIntervalMs");
        }
        if (ahpuVar.e == null) {
            sb.append(" stallThresholdsMs");
        }
        if (ahpuVar.g == 0) {
            sb.append(" enablement");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static mre j(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, msd msdVar) {
        mre mreVar;
        if (msdVar.a()) {
            mreVar = (mre) armfVar3.b();
        } else if (aczf.S()) {
            mreVar = (mre) armfVar2.b();
        } else if (aczf.Q()) {
            mreVar = (mre) armfVar4.b();
        } else {
            mreVar = (mre) armfVar.b();
        }
        mreVar.getClass();
        return mreVar;
    }

    public static msb k(Context context, apwt apwtVar, apwt apwtVar2, apwt apwtVar3, apwt apwtVar4, apwt apwtVar5, apwt apwtVar6, apwt apwtVar7, apwt apwtVar8) {
        return lgc.E(context, apwtVar, apwtVar2, apwtVar3, apwtVar4, apwtVar5, apwtVar6, apwtVar7, apwtVar8);
    }

    public static msd l(Set set) {
        if (set.isEmpty()) {
            return new msc();
        }
        if (set.size() <= 1) {
            return (msd) Collection.EL.stream(set).findFirst().get();
        }
        throw new IllegalStateException("@Override CsMessagingIdentityFlags bound multiple times");
    }

    public static msk m(armf armfVar, armf armfVar2, armf armfVar3) {
        msk mskVar;
        if (aczf.S()) {
            mskVar = (msk) armfVar2.b();
        } else if (aczf.Q()) {
            mskVar = (msk) armfVar3.b();
        } else {
            mskVar = (msk) armfVar.b();
        }
        mskVar.getClass();
        return mskVar;
    }

    public static lrf n(mbn mbnVar, Object obj) {
        int i = mbe.a;
        mbnVar.getClass();
        return new lrf(mbnVar, ((kor) obj).r());
    }

    public static lrf o(mbn mbnVar, Object obj) {
        int i = mbe.a;
        mbnVar.getClass();
        return new lrf(mbnVar, ((kor) obj).s());
    }

    public static mbs p(armf armfVar, lgg lggVar) {
        armfVar.getClass();
        return lggVar.b(armfVar);
    }

    public static mbs q(armf armfVar, lgg lggVar) {
        armfVar.getClass();
        return lggVar.b(armfVar);
    }

    public static ndk r(mbn mbnVar, aneo aneoVar, aneo aneoVar2) {
        int i = mbe.a;
        mbnVar.getClass();
        aneoVar.getClass();
        aneoVar2.getClass();
        return new ndk(aneoVar2, mbnVar, (byte[]) null);
    }

    public static aboj s(Object obj, ndk ndkVar) {
        int i = mbe.a;
        ndkVar.getClass();
        return ndkVar.k(((kor) obj).r());
    }

    public static aboj t(Object obj, ndk ndkVar) {
        int i = mbe.a;
        ndkVar.getClass();
        return ndkVar.k(((kor) obj).s());
    }

    public static kor u(aboj abojVar, mbn mbnVar, lrf lrfVar) {
        int i = mbe.a;
        abojVar.getClass();
        mbnVar.getClass();
        lrfVar.getClass();
        return new kor(abojVar, lrfVar, (byte[]) null);
    }

    public static kor v(aboj abojVar, mbn mbnVar, lrf lrfVar) {
        int i = mbe.a;
        abojVar.getClass();
        mbnVar.getClass();
        lrfVar.getClass();
        return new kor(abojVar, lrfVar, (byte[]) null);
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
