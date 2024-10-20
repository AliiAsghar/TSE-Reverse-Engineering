package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlr implements yfx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mlr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.yfx
    public final void fs() {
        boolean z;
        boolean z2;
        boolean z3;
        anen anenVar;
        int i = 3;
        int i2 = 2;
        final int i3 = 0;
        final int i4 = 1;
        switch (this.b) {
            case 0:
                alob alobVar = new alob();
                alobVar.h(((mls) this.a).h.a(new mlq(this, i3)));
                alobVar.h(((mls) this.a).f.f(new kzq(this, i), "BugleConversationPropertiesSupplier::register", "BugleConversationPropertiesSupplier::callback", "BugleConversationPropertiesSupplier::unregister"));
                if (((Boolean) ((utz) yig.Z.get()).e()).booleanValue() || ((Boolean) ((utz) yig.aa.get()).e()).booleanValue()) {
                    alobVar.h(((mls) this.a).p.a(new mlq(this, i2)));
                }
                ((mls) this.a).i = yfy.b(alobVar.g());
                return;
            case 1:
                final Object obj = this.a;
                qdt qdtVar = new qdt() { // from class: mxb
                    @Override // defpackage.yfv
                    public final akul a(Object obj2) {
                        akul c;
                        if (i4 != 0) {
                            nen nenVar = (nen) obj;
                            c = qjh.c(nenVar.a, arpj.a, arwf.a, new leb(nenVar, (arpe) null, 1, (byte[]) null));
                            return c;
                        }
                        BugleConversationId bugleConversationId = new BugleConversationId(ruy.b((String) obj2));
                        mxc mxcVar = (mxc) ((mlr) obj).a;
                        if (!mxcVar.d.equals(bugleConversationId)) {
                            return aktp.ag(null);
                        }
                        return mxcVar.d();
                    }
                };
                nen nenVar = (nen) obj;
                nenVar.c = yyb.aK(((usk) nenVar.e).j(qdtVar));
                return;
            case 2:
                Object obj2 = this.a;
                moc mocVar = (moc) obj2;
                sqz i5 = moc.i(mocVar.b.a);
                Object obj3 = this.a;
                mocVar.d = yyb.aK(mocVar.e.m(i5, "PenpalObservableSupplier#penpalQuery").f(new kzq(obj2, 5), "PenpalObservableSupplier::register", "PenpalObservableSupplier::callback", "PenpalObservableSupplier::unregister"), ((moc) obj3).c.a(new mlq(obj3, i)));
                return;
            case 3:
                mlq mlqVar = new mlq(this, 8);
                mwf mwfVar = (mwf) this.a;
                mwfVar.q = yyb.aK(mwfVar.i.a(mlqVar));
                synchronized (((mwf) this.a).b) {
                    Object obj4 = this.a;
                    ((mwf) obj4).r = true;
                    if (((mwf) obj4).t == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    albo.T(z);
                }
                synchronized (((mwf) this.a).c) {
                    if (((mwf) this.a).u == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    albo.T(z2);
                    if (((mwf) this.a).v == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    albo.T(z3);
                }
                Object obj5 = this.a;
                mwf mwfVar2 = (mwf) obj5;
                ncq ncqVar = mwfVar2.j;
                akul b = mwfVar2.i.b();
                akul b2 = ncqVar.b();
                ahmn an = aktp.an(b, b2);
                hbd hbdVar = new hbd(obj5, b, b2, 11);
                if (((oiz) mwfVar2.o.b()).a() && Build.VERSION.SDK_INT <= 26) {
                    anenVar = mwfVar2.e;
                } else {
                    anenVar = mwfVar2.d;
                }
                an.h(hbdVar, anenVar).k(qiu.b(), mwfVar2.d);
                return;
            case 4:
                qdt qdtVar2 = new qdt() { // from class: mxb
                    @Override // defpackage.yfv
                    public final akul a(Object obj22) {
                        akul c;
                        if (i3 != 0) {
                            nen nenVar2 = (nen) this;
                            c = qjh.c(nenVar2.a, arpj.a, arwf.a, new leb(nenVar2, (arpe) null, 1, (byte[]) null));
                            return c;
                        }
                        BugleConversationId bugleConversationId = new BugleConversationId(ruy.b((String) obj22));
                        mxc mxcVar = (mxc) ((mlr) this).a;
                        if (!mxcVar.d.equals(bugleConversationId)) {
                            return aktp.ag(null);
                        }
                        return mxcVar.d();
                    }
                };
                mxc mxcVar = (mxc) this.a;
                mxcVar.f = yyb.aK(mxcVar.g.j(qdtVar2), ((mxc) this.a).e.a(new mlq(this, 10)));
                return;
            case 5:
                Object obj6 = this.a;
                kzq kzqVar = new kzq(obj6, 16);
                mza mzaVar = (mza) obj6;
                mzaVar.d = yyb.aK(mzaVar.a.e.w(kzqVar, "FileTransferDataService::Register", "FileTransferDataService::Callback", "FileTransferDataService::Unregister"));
                return;
            case 6:
                Object obj7 = this.a;
                kzq kzqVar2 = new kzq(obj7, 18);
                mzb mzbVar = (mzb) obj7;
                mzbVar.d = mzbVar.b.f.w(kzqVar2, "RichCardMediaTransferProgressManager::Register", "RichCardMediaTransferProgressManager::Callback", "RichCardMediaTransferProgressManager::Unregister");
                return;
            case 7:
                Object obj8 = this.a;
                nen nenVar2 = (nen) obj8;
                nenVar2.c = ((iew) nenVar2.e).m(nen.d(null), "RecipientBusinessInfoObservableSupplier#businessInfoQuery").f(new nem(obj8, 1), "RecipientBusinessInfoObservableSupplier::register", "RecipientBusinessInfoObservableSupplier::callback", "RecipientBusinessInfoObservableSupplier::unregister");
                return;
            default:
                Optional i6 = ((wwn) ((ngk) this.a).g.b()).i(((ngk) this.a).d);
                if (i6.isPresent() && (((wxb) i6.get()).b & 1) != 0) {
                    adjc adjcVar = (adjc) ((ngk) this.a).f.b();
                    String str = ((wxb) i6.get()).c;
                    ngk ngkVar = (ngk) this.a;
                    adjcVar.q(str, ngkVar.e, ngkVar.c);
                    return;
                }
                alvw i7 = ngk.a.i();
                i7.X(alwp.a, "BugleSelfIdentity");
                alvg alvgVar = (alvg) i7;
                alvgVar.X(ydl.t, Integer.valueOf(((ngk) this.a).d));
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier$1", "onFirstRegister", 133, "SubscriptionRcsAvailabilitySupplier.java")).q("Not able to setup RCS availability listener since there is no available SIM ID for the subscription ID.");
                return;
        }
    }

    @Override // defpackage.yfx
    public final void ft() {
        yga ygaVar;
        yga ygaVar2;
        switch (this.b) {
            case 0:
                yga ygaVar3 = ((mls) this.a).i;
                ygaVar3.getClass();
                ygaVar3.a();
                ((mls) this.a).i = null;
                return;
            case 1:
                yga ygaVar4 = ((nen) this.a).c;
                if (ygaVar4 != null) {
                    ygaVar4.a();
                }
                ((nen) this.a).c = null;
                return;
            case 2:
                yga ygaVar5 = ((moc) this.a).d;
                if (ygaVar5 != null) {
                    ygaVar5.a();
                }
                ((moc) this.a).d = null;
                return;
            case 3:
                synchronized (((mwf) this.a).c) {
                    Object obj = this.a;
                    ygaVar = ((mwf) obj).u;
                    ((mwf) obj).u = null;
                    ((mwf) obj).v = null;
                }
                if (ygaVar != null) {
                    ygaVar.a();
                }
                synchronized (((mwf) this.a).b) {
                    Object obj2 = this.a;
                    ((mwf) obj2).r = false;
                    ygaVar2 = ((mwf) obj2).t;
                    ((mwf) obj2).s = null;
                    ((mwf) obj2).t = null;
                }
                if (ygaVar2 != null) {
                    ygaVar2.a();
                }
                yga ygaVar6 = ((mwf) this.a).q;
                ygaVar6.getClass();
                ygaVar6.a();
                ((mwf) this.a).q = null;
                return;
            case 4:
                yga ygaVar7 = ((mxc) this.a).f;
                ygaVar7.getClass();
                ygaVar7.a();
                ((mxc) this.a).f = null;
                return;
            case 5:
                yga ygaVar8 = ((mza) this.a).d;
                ygaVar8.getClass();
                ygaVar8.a();
                ((mza) this.a).d = null;
                return;
            case 6:
                yga ygaVar9 = ((mzb) this.a).d;
                if (ygaVar9 != null) {
                    ygaVar9.a();
                }
                ((mzb) this.a).d = null;
                return;
            case 7:
                yga ygaVar10 = ((nen) this.a).c;
                if (ygaVar10 != null) {
                    ygaVar10.a();
                }
                ((nen) this.a).c = null;
                return;
            default:
                ((adjc) ((ngk) this.a).f.b()).t(((ngk) this.a).e);
                return;
        }
    }
}
