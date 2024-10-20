package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.Compose2oMessagePartDataConverter;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabk extends aabo implements aapb, aaqt {
    private final abac A;
    aapf a;
    public boolean b;
    public boolean c;
    public final mci d;
    public final mho e;
    public final xbe f;
    public final ydf g;
    public final abbu h;
    public final rre i;
    public final ifb j;
    public final ifb k;
    private aaqd r;
    private AttachmentQueueState s;
    private aaqq t;
    private final mcm u;
    private final xnv v;
    private final zpt w;
    private final rre x;
    private ContentGridView y;
    private final zme z;

    public aabk(mci mciVar, mcm mcmVar, abac abacVar, zme zmeVar, mho mhoVar, xnv xnvVar, zpt zptVar, ifb ifbVar, ifb ifbVar2, abbu abbuVar, aabp aabpVar, aabz aabzVar, aacb aacbVar, da daVar, ydf ydfVar, xbe xbeVar, rre rreVar, rre rreVar2, Context context) {
        super(aabpVar, aabzVar, aacbVar, daVar, context, false);
        this.b = false;
        this.d = mciVar;
        this.u = mcmVar;
        this.A = abacVar;
        this.z = zmeVar;
        this.e = mhoVar;
        this.v = xnvVar;
        this.k = ifbVar;
        this.j = ifbVar2;
        this.h = abbuVar;
        this.g = ydfVar;
        this.f = xbeVar;
        this.i = rreVar;
        this.x = rreVar2;
        this.w = zptVar;
    }

    private final void A() {
        Compose2oFragment n = n();
        if (((Boolean) utw.M.e()).booleanValue() && this.b && n != null && this.r == null) {
            aaqd a = this.t.a(apel.CAMERA_GALLERY, -1);
            this.r = a;
            if (a != null) {
                a.q(new ioj(this, 2));
                n.E().a(this.r);
            }
        }
    }

    private final boolean B() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    private final void z(Consumer consumer) {
        int a = this.a.a();
        for (int i = 0; i < a; i++) {
            consumer.q(this.a.b(i));
        }
        aaqd aaqdVar = this.r;
        if (aaqdVar != null) {
            consumer.q(aaqdVar);
        }
    }

    @Override // defpackage.aapb
    public final void a() {
        this.n.X();
    }

    @Override // defpackage.aapb
    public final void b(Configuration configuration) {
        int a = this.a.a();
        for (int i = 0; i < a; i++) {
            this.a.b(i).o(configuration);
        }
        aaqd aaqdVar = this.r;
        if (aaqdVar != null) {
            aaqdVar.o(configuration);
        }
    }

    @Override // defpackage.aapb
    public final void c(Bundle bundle) {
        if (!B()) {
            xzb.n("Bugle", "ConversationCompose2oPicker: Cannot create, contentGridPresenter is null");
            return;
        }
        int a = this.a.a();
        for (int i = 0; i < a; i++) {
            this.a.b(i).f(bundle);
        }
        if (bundle != null) {
            boolean z = bundle.getBoolean("is_camera_gallery_roll_visible_key", false);
            this.c = z;
            r(z);
        }
        aaqd aaqdVar = this.r;
        if (aaqdVar != null) {
            aaqdVar.f(bundle);
        }
    }

    @Override // defpackage.aapb
    public final void d() {
        if (!B()) {
            xzb.n("Bugle", "ConversationCompose2oPicker: Cannot destroy, contentGridPresenter is null");
        } else {
            z(new aabj(1));
        }
    }

    @Override // defpackage.aapb
    public final void e() {
        if (!B()) {
            xzb.n("Bugle", "ConversationCompose2oPicker: Cannot react to low memory, contentGridPresenter is null");
        } else {
            z(new aabj(2));
        }
    }

    @Override // defpackage.aapb
    public final void f() {
        if (!B()) {
            xzb.n("Bugle", "ConversationCompose2oPicker: Cannot pause, contentGridPresenter is null");
        } else {
            z(new aabj(3));
        }
    }

    @Override // defpackage.aapb
    public final void g() {
        if (!B()) {
            xzb.n("Bugle", "ConversationCompose2oPicker: Cannot resume, contentGridPresenter is null");
        } else {
            z(new aabj(0));
        }
    }

    @Override // defpackage.aapb
    public final void h(Bundle bundle) {
        if (!B()) {
            xzb.n("Bugle", "ConversationCompose2oPicker: Cannot save instance state, contentGridPresenter is null");
            return;
        }
        int a = this.a.a();
        for (int i = 0; i < a; i++) {
            this.a.b(i).h(bundle);
        }
        aaqd aaqdVar = this.r;
        if (aaqdVar != null) {
            aaqdVar.h(bundle);
        }
        if (this.c) {
            bundle.putBoolean("is_camera_gallery_roll_visible_key", true);
        }
    }

    @Override // defpackage.aapb
    public final void i() {
        if (!B()) {
            xzb.n("Bugle", "ConversationCompose2oPicker: Cannot start, contentGridPresenter is null");
        } else {
            z(new aabj(4));
        }
    }

    @Override // defpackage.aapb
    public final void j() {
        if (!B()) {
            xzb.n("Bugle", "ConversationCompose2oPicker: Cannot stop, contentGridPresenter is null");
        } else {
            z(new zrf(20));
        }
    }

    @Override // defpackage.aapb
    public final boolean k() {
        if (!B()) {
            xzb.n("Bugle", "ConversationCompose2oPicker: Cannot process intent results, contentGridPresenter is null");
            return false;
        }
        this.a.e();
        return true;
    }

    @Override // defpackage.aapb
    public final void l(ContentGridView contentGridView) {
        this.y = contentGridView;
        aapf g = aapf.g(contentGridView);
        this.a = g;
        this.s.f(g);
        Compose2oFragment n = n();
        n.E();
        aaqq aaqqVar = this.t;
        aaqqVar.b = this.a;
        aaqqVar.c = this.y;
        aaqqVar.a = n.E();
        aaqq aaqqVar2 = this.t;
        boolean z = false;
        if (((rrl) this.x.a()).e.a() != null && vcp.k(((rrl) this.x.a()).e.a())) {
            z = true;
        }
        this.a.c(aaqqVar2.b((CustomizationModel) this.z.a, z));
        this.a.f(new ioj(this, 2));
        if (this.c) {
            A();
        }
    }

    @Override // defpackage.aapb
    public final void m(aaas aaasVar) {
        if (B()) {
            this.a.i(aaasVar);
            aaqd aaqdVar = this.r;
            if (aaqdVar != null) {
                aaqdVar.l(aaasVar);
            }
        }
    }

    public final Compose2oFragment n() {
        return (Compose2oFragment) this.p.e("c2oFragment");
    }

    public final void o(Compose2oFragment compose2oFragment) {
        if (!this.b) {
            this.b = true;
            this.s = new AttachmentQueueState((rsr) this.i.a(), new Compose2oMessagePartDataConverter());
            ((rsr) this.i.a()).C(this.s);
            this.t = this.A.i(compose2oFragment, Boolean.valueOf(((rrl) this.x.a()).b.b()), this.i, this.q, this.s, this.y, this.n, this.a, this, compose2oFragment.E());
        } else {
            this.t.a = compose2oFragment.E();
        }
        compose2oFragment.E().e(this.w.d());
        compose2oFragment.E().d(this);
        compose2oFragment.E().l(this.c);
    }

    public final void p(amoq amoqVar, int i) {
        this.d.d(amoqVar, i);
    }

    public final void r(boolean z) {
        if (z) {
            A();
        }
        Compose2oFragment n = n();
        if (n != null) {
            n.E().l(z);
        }
        this.c = z;
    }

    @Override // defpackage.aaca
    public final boolean s(boolean z) {
        amqh amqhVar;
        Compose2oFragment n = n();
        if (n == null) {
            return false;
        }
        bd bdVar = new bd(this.p);
        bdVar.k(n);
        try {
            bdVar.i();
            this.o.X();
        } catch (IllegalStateException e) {
            xzb.i("Bugle", e, "compose2o cannot commit fragment");
        }
        rsr rsrVar = (rsr) this.i.a();
        mcm mcmVar = this.u;
        if (this.c) {
            amqhVar = amqh.CAMERA_GALLERY;
        } else {
            amqhVar = amqh.ALL;
        }
        List list = rsrVar.u;
        amqi amqiVar = amqi.COLLAPSED;
        list.size();
        this.v.f().toEpochMilli();
        mcmVar.b(amqhVar, amqiVar, amqd.UNKNOWN_CLOSING_SOURCE);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    @Override // defpackage.aabo, defpackage.aaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(defpackage.en r6) {
        /*
            r5 = this;
            com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment r0 = r5.n()
            r1 = 0
            if (r0 == 0) goto L80
            aapc r0 = r0.E()
            abdc r2 = r0.t
            boolean r2 = r2.b
            r3 = r2 ^ 1
            uuf r4 = defpackage.aapd.b
            java.lang.Object r4 = r4.e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L28
            boolean r4 = r0.m()
            if (r4 == 0) goto L28
            if (r2 == 0) goto L42
            r3 = r1
        L28:
            uuf r2 = defpackage.aapd.b
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L80
            boolean r2 = r0.i
            if (r2 != 0) goto L40
            boolean r2 = r0.m()
            if (r2 == 0) goto L80
        L40:
            if (r3 == 0) goto L80
        L42:
            boolean r1 = r6.isShowing()
            if (r1 != 0) goto L4b
            r6.show()
        L4b:
            r1 = 12
            r6.setDisplayOptions(r1)
            r1 = 2131232290(0x7f080622, float:1.8080685E38)
            r6.setHomeAsUpIndicator(r1)
            com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment r1 = r0.r
            cj r1 = r1.fe()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2132017237(0x7f140055, float:1.9672747E38)
            java.lang.String r1 = r1.getString(r2)
            r6.setHomeActionContentDescription(r1)
            com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment r1 = r0.r
            cj r1 = r1.fe()
            boolean r0 = r0.f
            r2 = 1
            if (r2 == r0) goto L79
            r0 = 2132017644(0x7f1401ec, float:1.9673572E38)
            goto L7c
        L79:
            r0 = 2132017647(0x7f1401ef, float:1.9673578E38)
        L7c:
            defpackage.yzc.p(r1, r6, r0)
            r1 = r2
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabk.t(en):boolean");
    }

    public final void u(boolean z, boolean z2) {
        boolean z3;
        bd bdVar = new bd(this.p);
        Compose2oFragment n = n();
        if (n == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            n = new Compose2oFragment();
            apxh.e(n);
            n.a.c(new iwu(this, n, 2));
            bdVar.v(R.id.c2o_fragment_container, n, "c2oFragment");
        } else if (z) {
            bdVar.l(n);
        }
        if (!z) {
            bdVar.k(n);
        }
        try {
            aksa k = akqj.k();
            try {
                bdVar.i();
                k.close();
            } finally {
            }
        } catch (IllegalStateException e) {
            xzb.i("Bugle", e, "compose2o cannot commit fragment");
        }
        if (!z3) {
            o(n);
        }
        if (z2) {
            this.p.ag();
        }
    }

    @Override // defpackage.aaca
    public final void v(boolean z) {
        this.v.f().toEpochMilli();
        u(true, false);
    }

    @Override // defpackage.aabo, defpackage.aaca
    public final void q(Bundle bundle) {
    }
}
