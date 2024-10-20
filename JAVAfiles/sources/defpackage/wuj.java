package defpackage;

import com.google.android.rcs.client.profile.RcsProfileService;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wuj implements apxw {
    public static RcsProfileService a(wui wuiVar) {
        return wuiVar.g();
    }

    public static xff c(Object obj, anen anenVar, anen anenVar2, vcj vcjVar, Set set, psw pswVar, qhg qhgVar, qco qcoVar, armf armfVar, aneo aneoVar, xnv xnvVar) {
        return new xff((xfe) obj, anenVar, anenVar2, vcjVar, set, pswVar, qhgVar, qcoVar, armfVar, aneoVar, xnvVar);
    }

    public static ankt d(armf armfVar) {
        int i = xfy.a;
        ankt anktVar = (ankt) armfVar.b();
        anktVar.getClass();
        return anktVar;
    }

    public static ConcurrentHashMap e() {
        int i = xfy.a;
        return new ConcurrentHashMap();
    }

    public static akob f(armf armfVar) {
        arbj arbjVar = new arbj();
        arbjVar.c = aknz.a("DanglingPartsSynclet");
        aknu aknuVar = new aknu();
        aknuVar.c(((Number) xhn.b.e()).intValue(), TimeUnit.DAYS);
        arbjVar.b = aknuVar.a();
        arbjVar.a = new wkb(armfVar, 9);
        return arbjVar.k();
    }

    public static wzp g(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
            Object b = armfVar2.b();
            b.getClass();
            return (wzp) b;
        }
        Object b2 = armfVar.b();
        b2.getClass();
        return (wzp) b2;
    }

    public static void h(xmh xmhVar) {
        xmhVar.getClass();
    }

    public static alhz i() {
        alhz alhzVar = alfb.a;
        alhzVar.getClass();
        return alhzVar;
    }

    public static agmh[] j() {
        return (agmh[]) xpf.d.i;
    }

    public static agns k() {
        return new agnf(xpf.c, "file_transfer", new tpd(8));
    }

    public static akcy l(armf armfVar, ahiy ahiyVar) {
        return new akdf(new wkb(armfVar, 5), ahiyVar);
    }

    public static akcy m(armf armfVar, ahiy ahiyVar) {
        return new akdf(new wkb(armfVar, 12), ahiyVar);
    }

    public static aiwu n(aknt akntVar, alhm alhmVar, agcp agcpVar) {
        return alhmVar.e(akntVar, agcpVar);
    }

    public static aiwu o(aknt akntVar, alhm alhmVar, agcp agcpVar) {
        return alhmVar.e(akntVar, agcpVar);
    }

    public static aogy p(qdq qdqVar, ankt anktVar, anil anilVar) {
        qdqVar.getClass();
        return qdqVar.m(anktVar, anilVar);
    }

    public static xex q(final qdq qdqVar, final qdq qdqVar2, final xev xevVar) {
        qdqVar.getClass();
        qdqVar2.getClass();
        xevVar.getClass();
        return new xex() { // from class: xgc
            @Override // defpackage.xex
            public final xga a(aqds aqdsVar) {
                aqdsVar.getClass();
                aqfn aqfnVar = aqdsVar.h;
                if (aqfnVar == null) {
                    aqfnVar = aqfn.a;
                }
                return qdq.this.r(new anki(new wfh(xevVar.a(aqfnVar), (byte[]) null), ((kru) qdqVar2.a).a.fA()));
            }
        };
    }

    public static xex r(final qdq qdqVar, final ankw ankwVar) {
        qdqVar.getClass();
        return new xex() { // from class: xgb
            @Override // defpackage.xex
            public final xga a(aqds aqdsVar) {
                aqdsVar.getClass();
                return qdq.this.r(ankwVar);
            }
        };
    }

    public static znj s(Object obj, anen anenVar) {
        return new znj((wpp) obj, anenVar, (byte[]) null);
    }

    public static znj t(qdq qdqVar, ankt anktVar, anil anilVar, arwe arweVar) {
        qdqVar.getClass();
        arweVar.getClass();
        return new znj(qdqVar.m(anktVar, anilVar), arweVar, (char[]) null);
    }

    public static znj u(ankt anktVar, anil anilVar, qdq qdqVar, arwe arweVar) {
        qdqVar.getClass();
        arweVar.getClass();
        return new znj((Object) qdqVar.m(anktVar, anilVar), (Object) arweVar, (byte[]) null);
    }

    public static znj v(qdq qdqVar, ankt anktVar, anil anilVar, arwe arweVar) {
        qdqVar.getClass();
        arweVar.getClass();
        return new znj(qdqVar.m(anktVar, anilVar), arweVar, (byte[]) null);
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
