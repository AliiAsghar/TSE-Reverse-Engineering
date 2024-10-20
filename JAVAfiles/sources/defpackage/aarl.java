package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.Compose2oMessagePartDataConverter;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.FullscreenGalleryRecyclerView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import defpackage.aklx;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarl extends aata implements akkh, apxq, akkf, aklk, akrw, akwc {
    private aarm a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public aarl() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aarm.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            aarm E = E();
            View inflate = layoutInflater.inflate(R.layout.full_screen_gallery_fragment, viewGroup, false);
            FullscreenGalleryRecyclerView fullscreenGalleryRecyclerView = (FullscreenGalleryRecyclerView) inflate.findViewById(R.id.full_screen_gallery_recycler_view);
            if (fullscreenGalleryRecyclerView.ab == null) {
                fullscreenGalleryRecyclerView.getContext();
                fullscreenGalleryRecyclerView.ab = new GridLayoutManager(fullscreenGalleryRecyclerView.ac);
                fullscreenGalleryRecyclerView.aj(fullscreenGalleryRecyclerView.ab);
            }
            fullscreenGalleryRecyclerView.ag(E.s);
            fullscreenGalleryRecyclerView.aJ(new aarz(E.j.getResources().getDimensionPixelSize(R.dimen.full_screen_recycler_view_padding)));
            nt ntVar = fullscreenGalleryRecyclerView.C;
            if (ntVar instanceof pg) {
                ((pg) ntVar).t();
            }
            ((aohs) E.g.b()).C(((aatg) E.h.b()).a(), E.o);
            if (((Boolean) aarw.a.e()).booleanValue()) {
                E.k.am(true);
            }
            if (inflate == null) {
                aajv.f(this, E());
            }
            akqj.p();
            return inflate;
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
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r13v9, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        Bundle extras;
        Uri uri;
        aksa f = this.c.f();
        try {
            aO(i, i2, intent);
            aarm E = E();
            if (E.a) {
                E.a = false;
                ahmv ahmvVar = (ahmv) E.f.b();
                if (i == 1400) {
                    if (i2 == -1 && intent != null) {
                        String stringExtra = intent.getStringExtra("photo_url");
                        if (stringExtra == null && (stringExtra = intent.getDataString()) == null && (extras = intent.getExtras()) != null && (uri = (Uri) extras.getParcelable("android.intent.extra.STREAM")) != null) {
                            stringExtra = uri.toString();
                        }
                        if (stringExtra != null) {
                            new aass(ahmvVar, Uri.parse(stringExtra), E).e(new Void[0]);
                        }
                    }
                    mcm mcmVar = (mcm) ahmvVar.b.b();
                    Object obj = ahmvVar.h;
                    amqh amqhVar = amqh.EXTERNAL;
                    amqi amqiVar = amqi.EXPANDED;
                    ((xnv) obj).f().toEpochMilli();
                    mcmVar.b(amqhVar, amqiVar, amqd.UNKNOWN_CLOSING_SOURCE);
                }
            } else {
                if (i == 130) {
                    if (i2 == -1) {
                        E.c.l();
                    } else {
                        i = 130;
                    }
                }
                if (i == 130) {
                    E.c.k();
                } else if (i == 501 && i2 == -1 && intent.getData() != null) {
                    Uri V = aabr.V(intent.getData(), rvt.a());
                    aasm aasmVar = E.c;
                    ameb amebVar = ameb.VIDEO_TRIMMER;
                    if (V != null) {
                        if (((Boolean) utw.o.e()).booleanValue()) {
                            imz n = GalleryContent.n();
                            n.g(V);
                            n.c("video/mp4");
                            n.a = new Size(-1, -1);
                            n.b(amebVar);
                            n.e(TimeUnit.MILLISECONDS.toSeconds(aasmVar.h.f().toEpochMilli()));
                            aasmVar.v(n.a(), true, -1);
                        } else {
                            aasmVar.w(new GalleryContentItem(V, "video/mp4", -1, -1, amebVar, TimeUnit.MILLISECONDS.toSeconds(aasmVar.h.f().toEpochMilli())), true, -1);
                        }
                    }
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aata, defpackage.aiuc, defpackage.cg
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

    @Override // defpackage.aiuc, defpackage.cg
    public final void Z(Menu menu, MenuInflater menuInflater) {
        super.Z(menu, menuInflater);
        E().u.b();
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aarm E() {
        aarm aarmVar = this.a;
        if (aarmVar != null) {
            if (!this.ag) {
                return aarmVar;
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
        if (this.d == null) {
            this.d = new aklm(this, super.x());
        }
        return this.d;
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
            aajv.f(this, E());
            bf(view, bundle);
            aarm E = E();
            if (E.m.b() != null && ((Boolean) vof.a.e()).booleanValue()) {
                ((aohs) E.g.b()).C(((ahiy) E.m.b()).A(E.l), new aars(E, bundle));
            } else {
                E.a(new xyn(20), bundle);
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

    @Override // defpackage.aata
    protected final /* bridge */ /* synthetic */ aklw d() {
        return new akls(this, true);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.aata, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        Context context2 = (Context) ((kql) aS).el.e.b();
                        krv krvVar = ((kql) aS).a;
                        apya apyaVar = krvVar.a.cs;
                        apya apyaVar2 = ((kql) aS).ee;
                        apya apyaVar3 = ((kql) aS).av;
                        apya apyaVar4 = ((kql) aS).s;
                        apya apyaVar5 = ((kql) aS).ef;
                        apya apyaVar6 = krvVar.aC;
                        cg cgVar = (cg) ((apxx) ((kql) aS).d).a;
                        if (cgVar instanceof aarl) {
                            aarl aarlVar = (aarl) cgVar;
                            ajwt ajwtVar = (ajwt) ((kql) aS).ej.b.b();
                            apya apyaVar7 = ((kql) aS).a.tE;
                            Bundle a = ((kql) aS).a();
                            aozs aozsVar = (aozs) ((kql) aS).a.a.dt.b();
                            d.t(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            aary aaryVar = (aary) aowt.f(a, "TIKTOK_FRAGMENT_ARGUMENT", aary.a, aozsVar);
                            aaryVar.getClass();
                            this.a = new aarm(context2, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, aarlVar, ajwtVar, apyaVar7, aaryVar);
                            this.Z.c(new akli(this.c, this.e));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, aarm.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
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
    public final void g(Bundle bundle) {
        this.c.k();
        try {
            aP(bundle);
            aarm E = E();
            if (((aapj) E.j).C == null) {
                ((aapj) E.j).C = new AttachmentQueueState(new Compose2oMessagePartDataConverter());
            }
            E.t = new aajq(E.k);
            E.b = new aaru(E);
            ((aapj) E.j).C.f(new aaum(E, 1));
            ((aapj) E.j).C.b = new ahjj(E, (byte[]) null);
            if (bundle != null) {
                E.a = bundle.getBoolean("is_external_gallery_launched", false);
            }
            if (!((Boolean) aarw.a.e()).booleanValue()) {
                E.c();
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
            aarm E = E();
            bundle.putBoolean("is_external_gallery_launched", E.a);
            E.c.n(bundle);
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

    @Override // defpackage.aata, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
