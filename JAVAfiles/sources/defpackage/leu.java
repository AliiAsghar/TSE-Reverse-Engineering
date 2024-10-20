package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class leu implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public leu(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((TextView) this.b).getViewTreeObserver().removeOnPreDrawListener(this);
                ajvx ajvxVar = (ajvx) this.a;
                if (((TextView) this.b).getLineCount() <= ajvxVar.e) {
                    return true;
                }
                ((TextView) this.b).setTextSize(0, ajvxVar.c);
                if (Build.VERSION.SDK_INT >= 28) {
                    Object obj = this.b;
                    ajvx ajvxVar2 = (ajvx) this.a;
                    ((TextView) obj).setLineHeight(Math.round(ajvxVar2.d + ajvxVar2.c));
                }
                ((TextView) this.b).invalidate();
                return false;
            }
            if (((kvw) this.a).aC) {
                final Bundle bundle = (Bundle) this.b;
                Runnable j = akto.j(new Runnable() { // from class: kvj
                    /* JADX WARN: Type inference failed for: r10v70, types: [armf, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v9, types: [armf, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.Set, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Set, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        View findViewById;
                        akrh e = aktp.e("HomeFragmentPeer#AppInteractive");
                        leu leuVar = leu.this;
                        try {
                            Object obj2 = leuVar.a;
                            if (((kvw) obj2).b.a.c == eng.DESTROYED) {
                                kuy.a.q("fragment is destroyed after posting on UI thread.");
                                e.close();
                                return;
                            }
                            if (((kvw) obj2).D().b()) {
                                ((kvw) obj2).s.c(3);
                                ahqe.a.b(((kvw) obj2).b.fe());
                                if (((kvw) obj2).a() == 0 && ((kvw) obj2).aT) {
                                    ((kxm) ((kvw) obj2).p.b()).D(new kvl((kvw) obj2, ((kvw) obj2).O.d()));
                                }
                                qiu.h(((qjk) ((kvw) obj2).aZ.b()).a("HomeFragmentPeer#appInteractive"));
                                kuy.a.o("Chat list recyclerView rendered");
                                qiu.h(((xcj) ((kvw) obj2).k.b()).a(((kvw) obj2).af));
                                ((ubl) ((kvw) obj2).e.b()).a();
                                xyo c = kuy.a.c();
                                c.z("CalibrationFlag(legacy):am_aa_test1", kuy.b.e());
                                c.q();
                                xyo c2 = kuy.a.c();
                                c2.A("CalibrationFlag(auto):OpenBeta10p", ((ansy) ((niw) ((kvw) obj2).bb).a.b()).e("bugle.enable_open_beta10p_a_a_test"));
                                c2.q();
                                xyo c3 = kuy.a.c();
                                c3.A("CalibrationFlag(auto):OpenBeta50p", ((ansy) ((nix) ((kvw) obj2).bc).a.b()).e("bugle.enable_open_beta50p_a_a_test"));
                                c3.q();
                                xyo c4 = kuy.a.c();
                                c4.A("CalibrationFlag(auto):Prod1p", ((ansy) ((niz) ((kvw) obj2).bd).a.b()).e("bugle.enable_prod10p_a_a_test"));
                                c4.q();
                                xyo c5 = kuy.a.c();
                                c5.A("CalibrationFlag(auto):Prod10p", ((ansy) ((niy) ((kvw) obj2).be).a.b()).e("bugle.enable_prod1p_a_a_test"));
                                c5.q();
                                kuy.a.o(a.bV(fa.b, "Current theme mode: "));
                                cj fe = ((kvw) obj2).b.fe();
                                if (fe != null && fe.getIntent().getBooleanExtra("via_rcs_not_delivered_notification", false)) {
                                    ((znj) ((kvw) obj2).Y.b()).ah();
                                }
                                if (uyh.a()) {
                                    if (((Boolean) ((kvw) obj2).ae.b()).booleanValue() && ((Optional) ((apxx) ((kvw) obj2).ad).a).isPresent()) {
                                        qiu.h(((uyv) ((Optional) ((apxx) ((kvw) obj2).ad).a).get()).b());
                                    } else if (((Optional) ((apxx) ((kvw) obj2).ac).a).isPresent()) {
                                        qiu.h(((uyx) ((Optional) ((apxx) ((kvw) obj2).ac).a).get()).a());
                                    }
                                }
                                laj lajVar = (laj) ((kvw) obj2).v.b();
                                Instant f = ((kvw) obj2).l.f();
                                mdt mdtVar = (mdt) lajVar.g.b();
                                qiu.h(mdtVar.a().i(new ikd(mdtVar, f, 12), mdtVar.b).h(new ijq(lajVar, f, 9), lajVar.f));
                                qlh qlhVar = (qlh) ((kvw) obj2).ab.b();
                                int i2 = qlq.a;
                                if (!qlq.a()) {
                                    ((alwl) qlh.a.d()).q("ContactsSyncFeature is not enabled. Returning no-op.");
                                } else if (!qlhVar.d.d()) {
                                    ((alwl) qlh.a.d()).q("Default SMS App is not Bugle. Disabling Contacts sync.");
                                } else if (qlhVar.h.compareAndSet(false, true)) {
                                    qjh.l(qlhVar.b, null, new jks(qlhVar, (arpe) null, 15), 3);
                                }
                                wgd wgdVar = (wgd) ((kvw) obj2).P.b();
                                wgdVar.k.set(true);
                                wgdVar.m.q(aktp.ag(null), whj.b);
                                if (((odl) ((kvw) obj2).ay.b()).a()) {
                                    ((wpm) ((kvw) obj2).az.b()).f();
                                }
                            }
                            Object obj3 = leuVar.a;
                            ((kvw) obj3).b(((kvw) obj3).b).aL(new kvk((kvw) obj3));
                            if (((kvw) obj3).aE.a()) {
                                akrh e2 = aktp.e("registerPopUpListener");
                                try {
                                    lqn lqnVar = ((kvw) obj3).bm;
                                    lqx lqxVar = ((kvw) obj3).ao;
                                    aksr aksrVar = (aksr) lqnVar.a.b();
                                    aksrVar.getClass();
                                    lqxVar.getClass();
                                    ((kvw) obj3).aQ = new lqy(aksrVar, lqxVar);
                                    ((kvw) obj3).aQ.f(((kvw) obj3).b.y());
                                    e2.close();
                                } finally {
                                }
                            }
                            if (!((kvw) obj3).aE.a()) {
                                ((kvw) obj3).b.am(true);
                            }
                            int i3 = 5;
                            if (((kvw) obj3).aE.a()) {
                                ((kvw) obj3).E(null);
                                Object obj4 = ((kvw) obj3).bo.b;
                                if (kpt.a() && obj4 != null && (findViewById = ((kvw) obj3).g(((kvw) obj3).b).findViewById(R.id.gk_tooltip_hack)) != null) {
                                    ((View) obj4).getLocationOnScreen(new int[2]);
                                    float[] fArr = {r13[0] + (((View) obj4).getWidth() * 0.94f), r13[1] + ((((View) obj4).getHeight() * 3) / 5)};
                                    findViewById.setX(fArr[0]);
                                    findViewById.setY(fArr[1]);
                                }
                            } else {
                                kux kuxVar = ((kvw) obj3).b;
                                if (kuxVar.fe() != null) {
                                    kuxVar.F().invalidateOptionsMenu();
                                }
                            }
                            if (abal.b()) {
                                ((Optional) ((apxx) ((kvw) obj3).I).a).ifPresent(new ixe(i3));
                                if (abal.c() && ((Boolean) ((utz) abal.c.get()).e()).booleanValue() && ((Optional) ((apxx) ((kvw) obj3).I).a).isPresent()) {
                                    qiu.h(((woj) ((Optional) ((apxx) ((kvw) obj3).I).a).get()).c());
                                }
                                kyf D = ((kvw) obj3).D();
                                if (D.f == null) {
                                    kyf.a.q("Cannot init reminder trigger listener because the data source is still null.");
                                } else if (abal.c() && ((Optional) ((apxx) D.h).a).isPresent()) {
                                    D.r = new lga();
                                    ((woj) ((Optional) ((apxx) D.h).a).get()).e();
                                }
                            }
                            lpg lpgVar = (lpg) ((kvw) obj3).J.b();
                            aozy createBuilder = umw.a.createBuilder();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            umw.a((umw) createBuilder.b);
                            lpgVar.D((umw) createBuilder.s(), new uta(null, "update_unread_counter_dedupe", null, null, null, null));
                            if (((kvw) obj3).aE.a()) {
                                ((ksi) ((kvw) obj3).g.b()).a();
                                cj fe2 = ((kvw) obj3).b.fe();
                                if (fe2 != null && fe2.getIntent() != null && fe2.getIntent().getBooleanExtra("opted_in_through_growth_kit_flow", false)) {
                                    ((ksi) ((kvw) obj3).g.b()).a();
                                }
                                if (bundle == null && ((kvw) obj3).b.aw()) {
                                    ((kvw) obj3).m();
                                }
                                lag lagVar = ((kvw) obj3).s;
                                lag.a.o("Marking listShown");
                                lagVar.h.compareAndSet(false, true);
                            }
                            kwq kwqVar = ((kvw) obj3).z;
                            ((kws) kwqVar).g.set(true);
                            Iterator it = ((kws) kwqVar).h.iterator();
                            while (it.hasNext()) {
                                ((ahiy) ((kws) kwqVar).f.b()).q(aktp.ag(null), (String) it.next());
                            }
                            Iterator it2 = ((kws) kwqVar).i.iterator();
                            while (it2.hasNext()) {
                                ((ahiy) ((kws) kwqVar).f.b()).q(aktp.ag(null), (akfd) it2.next());
                            }
                            aiut.c();
                            ((kws) kwqVar).j = true;
                            ((kws) kwqVar).c();
                            zmt zmtVar = (zmt) ((las) ((kvw) obj3).w.b()).d.b();
                            zmtVar.d.set(true);
                            zmtVar.b();
                            kyc kycVar = ((kvw) obj3).q;
                            if (aczv.C()) {
                                Optional.of(Long.valueOf(((kvw) obj3).l.f().toEpochMilli()));
                            } else {
                                Optional.empty();
                            }
                            kycVar.c.ifPresent(new ixe(19));
                            lfl lflVar = (lfl) ((kvw) obj3).ba.b();
                            eno enoVar = ((kvw) obj3).b.a;
                            enoVar.getClass();
                            ((AtomicBoolean) lflVar.a).set(true);
                            Iterator it3 = lflVar.d.iterator();
                            while (it3.hasNext()) {
                                ((kzg) it3.next()).f(enoVar, (ahiy) lflVar.b);
                            }
                            Iterator it4 = lflVar.d.iterator();
                            while (it4.hasNext()) {
                                ((ahiy) lflVar.b).q(aktp.ag(null), ((kzg) it4.next()).d());
                            }
                            if (kpt.a() && xxy.a() && ((Boolean) ((utz) xxs.a.get()).e()).booleanValue() && ((Optional) ((apxx) ((kvw) obj3).am).a).isPresent()) {
                                ((ihn) ((Optional) ((apxx) ((kvw) obj3).am).a).get()).d();
                            }
                            if (((ohi) ((kvw) obj3).av.b()).a() && ((Optional) ((apxx) ((kvw) obj3).aw).a).isPresent()) {
                                ((lbc) ((Optional) ((apxx) ((kvw) obj3).aw).a).get()).d();
                            }
                            ((Optional) ((apxx) ((kvw) obj3).t).a).ifPresent(new ixe(16));
                            ((kvw) obj3).aG.h();
                            e.close();
                            kvw kvwVar = (kvw) leuVar.a;
                            apvo apvoVar = (apvo) kvwVar.bf.b();
                            ajwt ajwtVar = kvwVar.af;
                            ajwtVar.getClass();
                            aiut.g();
                            if (!apvoVar.a) {
                                return;
                            }
                            for (kpz kpzVar : (Set) apvoVar.b.b()) {
                                if (((peu) kpzVar.d.b()).a() && !kpzVar.b.isEmpty() && !d.F(ajwtVar, kpzVar.e)) {
                                    kpzVar.e = ajwtVar;
                                    qjh.l(kpzVar.a, null, new kda(kpzVar, ajwtVar, (arpe) null, 13), 3);
                                }
                            }
                            apvoVar.a = false;
                        } finally {
                        }
                    }
                });
                aiut.e(j);
            } else {
                kuy.a.l("Skipping pre-draw");
            }
            return true;
        }
        if (!((lex) this.a).b.isDestroyed()) {
            return false;
        }
        ((View) this.b).getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    public leu(lex lexVar, View view, int i) {
        this.c = i;
        this.a = lexVar;
        this.b = view;
    }
}
