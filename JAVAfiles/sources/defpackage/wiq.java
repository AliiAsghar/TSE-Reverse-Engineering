package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wiq implements akgr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wiq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.akgr
    public final akfd a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return abgg.a;
                    }
                    return abfh.a;
                }
                akfc akfcVar = aayd.b;
                akfcVar.getClass();
                return akfcVar;
            }
            akfc akfcVar2 = wiv.b;
            akfcVar2.getClass();
            return akfcVar2;
        }
        akfc akfcVar3 = wiv.c;
        akfcVar3.getClass();
        return akfcVar3;
    }

    @Override // defpackage.akgr
    public final /* synthetic */ ListenableFuture b() {
        akul c;
        akul c2;
        akul c3;
        akul c4;
        akul c5;
        akul c6;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        abgg abggVar = (abgg) this.a;
                        c6 = qjh.c(abggVar.b, arpj.a, arwf.a, new zcb(abggVar, (arpe) null, 13));
                        return c6;
                    }
                    if (((Boolean) ((utz) abgh.a.get()).e()).booleanValue() && !((Boolean) ((Optional) ((abfh) this.a).h.b()).map(new aaky(aams.r, 17)).orElse(false)).booleanValue()) {
                        abfh abfhVar = (abfh) this.a;
                        c5 = qjh.c(abfhVar.c, arpj.a, arwf.a, new zcb(abfhVar, (arpe) null, 12, (byte[]) null));
                        return c5;
                    }
                    abfh abfhVar2 = (abfh) this.a;
                    c4 = qjh.c(abfhVar2.d, arpj.a, arwf.a, new aanv(abfhVar2, (arpe) null, 11));
                    return c4;
                }
                if (aczv.x() && aczv.X()) {
                    akul ag = aktp.ag(whk.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
                    ag.getClass();
                    return ag;
                }
                if (!aczv.D()) {
                    aayd.a.m().q("Not returning RcsDefaultOnConsentData since the flag is disabled");
                    akul ag2 = aktp.ag(whk.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
                    ag2.getClass();
                    return ag2;
                }
                if (!actx.f()) {
                    aayd.a.m().q("Not returning RcsDefaultOnConsentData since ToS flag is not allowed");
                    akul ag3 = aktp.ag(whk.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
                    ag3.getClass();
                    return ag3;
                }
                aayd aaydVar = (aayd) this.a;
                c3 = qjh.c(aaydVar.c, arpj.a, arwf.a, new aanv(aaydVar, (arpe) null, 5));
                return c3;
            }
            wiv wivVar = (wiv) this.a;
            c2 = qjh.c(wivVar.e, arpj.a, arwf.a, new vck(wivVar, (arpe) null, 6, (char[]) null));
            return c2;
        }
        wiv wivVar2 = (wiv) this.a;
        c = qjh.c(wivVar2.e, arpj.a, arwf.a, new vck(wivVar2, (arpe) null, 7, (short[]) null));
        return c;
    }
}
