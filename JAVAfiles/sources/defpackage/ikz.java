package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import defpackage.aklx;
import defpackage.ilw;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikz extends imc implements akkh, apxq, akkf, aklk, akrw, akwc {
    private boolean ag;
    private ilw d;
    private Context e;
    public final eno a = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public ikz() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return ilw.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            ilw E = E();
            if (true != ((Boolean) yig.af.e()).booleanValue()) {
                i = R.layout.draft_editor_fragment;
            } else {
                i = R.layout.draft_editor_fragment_smarter_panther;
            }
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            E.y = (ComposeMessageView) inflate.findViewById(R.id.draft_message_view);
            E.x = (AttachmentsContainer) inflate.findViewById(R.id.attachments_container);
            E.w.b = E.G;
            E.y.E().c.A = E.p;
            E.y.E().c.r(E.G);
            if (E.K != null) {
                E.y.E().z(E.K);
            }
            rre rreVar = E.z;
            if (rreVar != null && rreVar.g()) {
                E.y.E().M(E.z);
            }
            E.y.E().L(E.b);
            cg cgVar = E.k;
            enh N = cgVar.N();
            cgVar.x().getClass();
            iks iksVar = (iks) E.Z.a(iks.class);
            E.ac.C(iksVar.c().a(), new ilm(E));
            akfb b = E.ab.b(N, E.g.a, E.q(E.G.s()));
            E.ac.C(b, new iln(E));
            E.ac.C(E.ab.a(b), new ilo(E));
            E.ac.C(iksVar.b().a(), new ilp(E, bundle));
            E.ac.C(iksVar.a().a(), new ilq(E, bundle));
            E.ac.C(E.C.a(E.b), new ilr(E));
            if (E.U.c(bundle)) {
                E.ac.C(((uac) E.W.b()).e(((DefaultConversation) ((mlu) E.V.b()).A(E.g, false)).f, "SimPicker::localSelfIdentities", E.k.N()), new ilv(E));
            } else {
                E.ac.C(iksVar.f().a(), new ilj(E));
            }
            E.r.ifPresent(new ibo(E, 10));
            E.ac.C(E.s.a(), new ilt(E));
            if (bundle != null) {
                z = true;
            } else {
                z = false;
            }
            E.B = (EditText) E.y.findViewById(R.id.compose_message_text);
            E.H = (EditText) E.y.findViewById(R.id.compose_subject_text);
            E.B.setOnFocusChangeListener(new aksc(E.v, new ilc(E, 0), "DraftEditorFragmentPeer draftBodyEditText onFocusChange"));
            E.B.setOnEditorActionListener(new aksi(E.v, new ild(E, 0), "DraftEditorFragmentPeer#draftBodyEditText#onEditorAction"));
            E.B.addTextChangedListener(new aksq(E.v, new ilk(E, z), "DraftEditorFragmentPeer draftBodyEditText textWatcher"));
            E.H.setOnFocusChangeListener(new aksc(E.v, new ilc(E, 2), "DraftEditorFragmentPeer draftSubjectEditText onFocusChange"));
            mci mciVar = E.c;
            cg cgVar2 = E.k;
            if (cgVar2 instanceof ikz) {
                final iky ikyVar = new iky(mciVar, ((ikz) cgVar2).E(), E.n);
                String[] strArr = (String[]) iky.a.toArray(new String[0]);
                final cj fe = E.k.fe();
                fe.getClass();
                ComposeMessageView composeMessageView = E.y;
                final EditText[] editTextArr = {E.B, E.H};
                final ajcu ajcuVar = new ajcu(composeMessageView, new fwc(strArr, 4));
                for (int i2 = 0; i2 < 2; i2++) {
                    EditText editText = editTextArr[i2];
                    if (Build.VERSION.SDK_INT <= 30 && !(editText instanceof kn)) {
                        editText.setOnDragListener(new View.OnDragListener() { // from class: ajct
                            @Override // android.view.View.OnDragListener
                            public final boolean onDrag(View view, DragEvent dragEvent) {
                                ecq ecrVar;
                                DragAndDropPermissions requestDragAndDropPermissions;
                                if (dragEvent.getAction() == 3) {
                                    ClipData clipData = dragEvent.getClipData();
                                    if (Build.VERSION.SDK_INT >= 31) {
                                        ecrVar = new ecp(clipData, 3);
                                    } else {
                                        ecrVar = new ecr(clipData, 3);
                                    }
                                    ecv d = dye.d(ecrVar);
                                    ClipData clipData2 = dragEvent.getClipData();
                                    int i3 = 0;
                                    while (true) {
                                        edi ediVar = ikyVar;
                                        if (i3 < clipData2.getItemCount()) {
                                            if (clipData2.getItemAt(i3).getUri() != null) {
                                                requestDragAndDropPermissions = fe.requestDragAndDropPermissions(dragEvent);
                                                if (requestDragAndDropPermissions == null) {
                                                    Log.e("DropHelper", "Could not get permissions for dropped data.");
                                                    return true;
                                                }
                                                ediVar.a(view, d);
                                                return true;
                                            }
                                            i3++;
                                        } else {
                                            ediVar.a(view, d);
                                            return true;
                                        }
                                    }
                                } else {
                                    return ajcuVar.a(view, dragEvent);
                                }
                            }
                        });
                    }
                    eek.p(editText, strArr, ikyVar);
                    editText.setOnDragListener(new View.OnDragListener() { // from class: ajcr
                        @Override // android.view.View.OnDragListener
                        public final boolean onDrag(View view, DragEvent dragEvent) {
                            return ajcu.this.a(view, dragEvent);
                        }
                    });
                }
                composeMessageView.setOnDragListener(new View.OnDragListener() { // from class: ajcs
                    @Override // android.view.View.OnDragListener
                    public final boolean onDrag(View view, DragEvent dragEvent) {
                        if (dragEvent.getAction() == 3) {
                            int i3 = 0;
                            while (true) {
                                EditText[] editTextArr2 = editTextArr;
                                if (i3 < 2) {
                                    EditText editText2 = editTextArr2[i3];
                                    if (editText2.hasFocus()) {
                                        return editText2.onDragEvent(dragEvent);
                                    }
                                    i3++;
                                } else {
                                    editTextArr2[0].onDragEvent(dragEvent);
                                    return true;
                                }
                            }
                        } else {
                            return ajcuVar.a(view, dragEvent);
                        }
                    }
                });
                E.L = E.B;
                if (inflate == null) {
                    hwr.o(this, E());
                }
                akqj.p();
                return inflate;
            }
            throw new AssertionError("The fragment should be DraftEditorFragment but is ".concat(String.valueOf(cgVar2.getClass().getName())));
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.a;
    }

    @Override // defpackage.imc, defpackage.aiuc, defpackage.cg
    public final void Y(Activity activity) {
        this.c.k();
        try {
            super.Y(activity);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ilw E() {
        ilw ilwVar = this.d;
        if (ilwVar != null) {
            if (!this.ag) {
                return ilwVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.e == null) {
            this.e = new aklm(this, super.x());
        }
        return this.e;
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final aktr aW() {
        return this.c.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.c.e(aktrVar, z);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.c.b = aktrVar;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.c.k();
        try {
            aktp.bH(this).a = view;
            E();
            hwr.o(this, E());
            bf(view, bundle);
            ((nhh) E().d.b()).c();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void ak(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        albo.U(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ak(bundle);
    }

    @Override // defpackage.cg
    public final void ar(boolean z) {
        d.H(z);
    }

    @Override // defpackage.cg
    public final void au(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        aG(intent);
    }

    @Override // defpackage.imc
    protected final /* bridge */ /* synthetic */ aklw d() {
        return new akls(this, true);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.imc, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.d == null) {
                    try {
                        Object aS = aS();
                        apya apyaVar = ((kql) aS).ej.o;
                        apya apyaVar2 = ((kql) aS).b;
                        apya apyaVar3 = ((kql) aS).a.kE;
                        mci mciVar = (mci) ((kql) aS).c.b();
                        apya apyaVar4 = ((kql) aS).i;
                        krv krvVar = ((kql) aS).a;
                        apya apyaVar5 = krvVar.bO;
                        apya apyaVar6 = krvVar.eN;
                        apya apyaVar7 = krvVar.av;
                        apya apyaVar8 = ((kql) aS).j;
                        apya apyaVar9 = krvVar.bV;
                        hwo m = ((kql) aS).m();
                        apya apyaVar10 = ((kql) aS).ej.g;
                        eoy eoyVar = (eoy) ((kql) aS).k.b();
                        lig q = ((kql) aS).q();
                        apya apyaVar11 = ((kql) aS).o;
                        rss rssVar = (rss) ((kql) aS).q.b();
                        apya apyaVar12 = ((kql) aS).r;
                        cg cgVar = (cg) ((apxx) ((kql) aS).d).a;
                        akbo akboVar = (akbo) ((kql) aS).e.b();
                        kor korVar = (kor) ((kql) aS).l.b();
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) ((Context) ((kql) aS).a.a.a.n.b()).getSystemService("input_method");
                            inputMethodManager.getClass();
                            rtg rtgVar = (rtg) ((kql) aS).a.oG.b();
                            iji c = ((kql) aS).el.c();
                            krv krvVar2 = ((kql) aS).a;
                            apya apyaVar13 = krvVar2.kE;
                            apya apyaVar14 = krvVar2.dm;
                            apya apyaVar15 = krvVar2.de;
                            Optional empty = Optional.empty();
                            yya e = ((kql) aS).e();
                            apya apyaVar16 = ((kql) aS).a.aF;
                            aohs aohsVar = (aohs) ((kql) aS).s.b();
                            akgu akguVar = (akgu) ((kql) aS).u.b();
                            aksr aksrVar = (aksr) ((kql) aS).ej.d.b();
                            lbi c2 = ((kql) aS).c();
                            krv krvVar3 = ((kql) aS).a;
                            apya apyaVar17 = krvVar3.gD;
                            kor korVar2 = (kor) krvVar3.a.cb.b();
                            krv krvVar4 = ((kql) aS).a;
                            apya apyaVar18 = krvVar4.mn;
                            apya apyaVar19 = krvVar4.ih;
                            apya apyaVar20 = krvVar4.lC;
                            apya apyaVar21 = krvVar4.dd;
                            apya apyaVar22 = krvVar4.yF;
                            apya apyaVar23 = krvVar4.ee;
                            apya apyaVar24 = ((kql) aS).v;
                            apya apyaVar25 = ((kql) aS).w;
                            String g = ((kql) aS).g();
                            ajwt ajwtVar = (ajwt) ((kql) aS).ej.b.b();
                            krv krvVar5 = ((kql) aS).a;
                            krx krxVar = krvVar5.a;
                            this.d = new ilw(apyaVar, apyaVar2, apyaVar3, mciVar, apyaVar4, apyaVar5, apyaVar6, apyaVar7, apyaVar8, apyaVar9, m, apyaVar10, eoyVar, q, apyaVar11, rssVar, apyaVar12, cgVar, akboVar, korVar, inputMethodManager, rtgVar, c, apyaVar13, apyaVar14, apyaVar15, empty, e, apyaVar16, aohsVar, akguVar, aksrVar, c2, apyaVar17, korVar2, apyaVar18, apyaVar19, apyaVar20, apyaVar21, apyaVar22, apyaVar23, apyaVar24, apyaVar25, g, ajwtVar, krxVar.cc, krvVar5.dA, krvVar5.hr, krxVar.cd);
                            this.Z.c(new akli(this.c, this.a));
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                akqj.p();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (ClassCastException e2) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void g(Bundle bundle) {
        this.c.k();
        try {
            aP(bundle);
            ilw E = E();
            E.G.f = new ill(E);
            E.aa.d(bundle);
            E.J = new ilw.a();
            E.l.b(E.J);
            E.l.b(E.w);
            E.l.b(((nhh) E.d.b()).d);
            ((Optional) ((apxx) E.j).a).ifPresent(new ibo(E, 9));
            E.u.a(R.id.rcs_settings_data_local_subscription_id, ((wih) E.P.b()).c(), new isj(E, 1));
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aD = aD();
            LayoutInflater cloneInContext = aD.cloneInContext(new aklx.a(aD, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new aklm(this, cloneInContext));
            akqj.p();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void h() {
        aksa b = this.c.b();
        try {
            aT();
            ilw E = E();
            E.y.E().E();
            E.y.E().R();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public final void i() {
        aksa a = this.c.a();
        try {
            aV();
            this.ag = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void j(Bundle bundle) {
        this.c.k();
        try {
            bc(bundle);
            ilw E = E();
            E.U.a(bundle);
            E.y.E().J(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void k() {
        this.c.k();
        try {
            bd();
            ilw E = E();
            E.y.E().G();
            if (((Boolean) utw.q.e()).booleanValue()) {
                Context x = E.k.x();
                x.getClass();
                if (lgb.E(x) == 3) {
                    E.y.E().N(E.g.a);
                }
            }
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akwc
    public final void o(Class cls, akvz akvzVar) {
        this.ah.l(cls, akvzVar);
    }

    @Override // defpackage.imc, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
