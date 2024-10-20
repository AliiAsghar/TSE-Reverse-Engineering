package defpackage;

import android.content.Context;
import android.telephony.ims.ImsManager;
import android.telephony.ims.ImsRcsManager;
import android.telephony.ims.RcsUceAdapter;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvd implements puu, pvk {
    public final Context a;
    public final vqu b;
    public final puc c;
    public final anen d;
    public final xnv e;
    public final acnc f;
    private final Random g = new Random();
    private final lgg h;

    public pvd(Context context, anen anenVar, vqu vquVar, puc pucVar, xnv xnvVar, acnc acncVar, lgg lggVar) {
        this.a = context;
        this.b = vquVar;
        this.c = pucVar;
        this.d = anenVar;
        this.e = xnvVar;
        this.f = acncVar;
        this.h = lggVar;
    }

    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        return aktp.af(new IllegalStateException("getBatchCapabilities not supported for SingleReg."));
    }

    @Override // defpackage.puu
    public final akul b(final qei qeiVar) {
        final long nextLong = this.g.nextLong();
        int i = 4;
        return akul.g(d.m(new dts() { // from class: pvb
            @Override // defpackage.dts
            public final Object a(dtq dtqVar) {
                ImsRcsManager imsRcsManager;
                RcsUceAdapter uceAdapter;
                pvd pvdVar = pvd.this;
                acnc acncVar = pvdVar.f;
                long j = nextLong;
                acncVar.b(j, 3);
                int e = pvdVar.b.g().e();
                if (yhx.e) {
                    ImsManager m69m = anf$$ExternalSyntheticApiModelOutline0.m69m(pvdVar.a.getSystemService(anf$$ExternalSyntheticApiModelOutline0.m77m()));
                    if (m69m != null) {
                        qei qeiVar2 = qeiVar;
                        imsRcsManager = m69m.getImsRcsManager(e);
                        uceAdapter = imsRcsManager.getUceAdapter();
                        uceAdapter.requestAvailability(lqn.j(qeiVar2), pvdVar.d, new pvc(pvdVar, dtqVar, j));
                        return "SingleRegistrationNetworkCapabilitiesProvider.getCapabilities";
                    }
                    throw new psx("[Single Registration] Unable to get UCE adapter from the platform.");
                }
                throw new psx("[Single Registration] Version S or higher is only supported");
            }
        })).i(new prf(this, i), this.d).f(IllegalArgumentException.class, new mfj(this, nextLong, 3), this.d).f(anf$$ExternalSyntheticApiModelOutline0.m87m$2(), new mfj(this, nextLong, i), this.d).f(SecurityException.class, new mfj(this, nextLong, 5), this.d);
    }

    @Override // defpackage.pvk
    public final akul c(qei qeiVar) {
        return b(qeiVar).i(new pri(this, qeiVar, 14), this.d).h(new psf(13), andi.a).f(psx.class, new pri(this, qeiVar, 15), this.d);
    }

    public final akul d(qei qeiVar, pto ptoVar) {
        return this.h.d(new mut(qeiVar, ptoVar, 10));
    }

    public final void e(long j) {
        this.f.a(j, 3, -1, -1L);
    }
}
