package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwf implements ncq {
    public static final alwo a = alwo.o("BugleConversation");
    public final anen d;
    public final anen e;
    public final apwt f;
    public final mwq g;
    public final BugleConversationId h;
    public final ncq i;
    public final ncq j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public yga q;
    public ncq s;
    public yga t;
    public yga u;
    public nfw v;
    public final kor w;
    public final yyt x;
    private final yep y;
    public final Object b = new Object();
    public final Object c = new Object();
    public boolean r = false;

    public mwf(wfh wfhVar, anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, yep yepVar, armf armfVar3, kor korVar, armf armfVar4, armf armfVar5, armf armfVar6, apwt apwtVar, BugleConversationId bugleConversationId, ncq ncqVar, ncq ncqVar2, mwq mwqVar) {
        this.x = wfhVar.Y(new mlr(this, 3));
        this.d = anenVar;
        this.e = anenVar2;
        this.k = armfVar;
        this.l = armfVar2;
        this.y = yepVar;
        this.w = korVar;
        this.n = armfVar4;
        this.o = armfVar5;
        this.f = apwtVar;
        this.g = mwqVar;
        this.h = bugleConversationId;
        this.i = ncqVar;
        this.j = ncqVar2;
        this.m = armfVar3;
        this.p = armfVar6;
    }

    public static boolean h(mll mllVar, alog alogVar) {
        if (!((Boolean) ((utz) yig.Q.get()).e()).booleanValue() || mllVar.b() != mit.ONE_ON_ONE || !((ResolvedRecipient) alogVar.get(0)).f().z()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.x.w(new kzq(ncpVar, 12), "ComposeConstraints::register", "ComposeConstraints::callback", "ComposeConstraints::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        anen anenVar;
        armf armfVar = this.o;
        ncq ncqVar = this.j;
        akul b = this.i.b();
        akul b2 = ncqVar.b();
        if (((oiz) armfVar.b()).a() && Build.VERSION.SDK_INT <= 26) {
            anenVar = this.e;
        } else {
            anenVar = this.d;
        }
        return aktp.an(b, b2).i(new mtz((Object) this, (Object) b, (Object) b2, (Object) anenVar, 2), anenVar);
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final ncq d(ncq ncqVar) {
        boolean z;
        synchronized (this.b) {
            if (this.r && this.s == null) {
                this.s = ncqVar;
                alwl alwlVar = (alwl) a.g();
                alwlVar.X(ydl.q, this.h);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "maybeUpdateRcsCapabilitiesSubscription", 788, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: Listening to RCS Capabilities For Single Recipient.");
                if (this.t == null) {
                    z = true;
                } else {
                    z = false;
                }
                albo.T(z);
                ncq ncqVar2 = this.s;
                ncqVar2.getClass();
                this.t = ncqVar2.a(new mlq(this, 6));
            }
            if (this.r) {
                ncqVar = this.s;
                ncqVar.getClass();
            }
        }
        return ncqVar;
    }

    public final akul e(String str) {
        alwl alwlVar = (alwl) a.d();
        alwlVar.X(ydl.q, this.h);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "notifyUpdate", 845, "BugleComposeConstraintsSupplier.java")).t("Compose Constraints: Update notification from %s.", str);
        return aktp.ah(new kut(this, 19), this.d);
    }

    public final void f(nfw nfwVar) {
        synchronized (this.c) {
            if (Objects.equals(this.v, nfwVar)) {
                return;
            }
            yga ygaVar = this.u;
            if (ygaVar != null) {
                ygaVar.a();
                this.u = null;
            }
            this.v = nfwVar;
            if (nfwVar != null) {
                alwl alwlVar = (alwl) a.g();
                alwlVar.X(ydl.q, this.h);
                alwl alwlVar2 = (alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "maybeUpdateRcsAvailabilitySubscription", 819, "BugleComposeConstraintsSupplier.java");
                nfw nfwVar2 = this.v;
                nfwVar2.getClass();
                alwlVar2.t("Compose Constraints: Switching RCS Availability listener to SelfIdentity %s.", nfwVar2);
                nfw nfwVar3 = this.v;
                nfwVar3.getClass();
                nfw nfwVar4 = this.v;
                nfwVar4.getClass();
                this.u = yyb.aK(nfwVar3.d().a(new mlq(this, 5)), nfwVar4.e().a(new mlq(this, 7)));
            } else {
                alwl alwlVar3 = (alwl) a.i();
                alwlVar3.X(ydl.q, this.h);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "maybeUpdateRcsAvailabilitySubscription", 834, "BugleComposeConstraintsSupplier.java")).q("Compose Constraints: Cleared RCS Availability listener. No activeSelfIdentity.");
            }
        }
    }

    public final void g(mjq mjqVar, mwb mwbVar) {
        int i = 0;
        if (mwbVar.c() != 2) {
            if (mjqVar != mjq.NONE) {
                if (mjqVar.g) {
                    i = this.y.b("bugle_rcs_attachment_limit", 10);
                } else {
                    i = this.y.b("bugle_mms_attachment_limit", 10);
                }
            }
            mwbVar.d(i);
            return;
        }
        mwbVar.d(0);
    }
}
