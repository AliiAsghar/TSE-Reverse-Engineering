package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.CenterFitVideoView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;
import defpackage.apxm;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawo extends aawk implements akkh, apxq, akkf, aklk, akrw {
    public final eno a = new eno(this);
    private boolean ag;
    private aawt d;
    private Context e;

    @Deprecated
    public aawo() {
        aiut.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aawo o() {
        aawo aawoVar = new aawo();
        apxh.e(aawoVar);
        return aawoVar;
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aawt.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            E();
            View inflate = layoutInflater.inflate(R.layout.media_fragment, viewGroup, false);
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
        return this.a;
    }

    @Override // defpackage.aawk, defpackage.aiuc, defpackage.cg
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
    public final void aa() {
        aksa b = this.c.b();
        try {
            aQ();
            aawt E = E();
            E.b = false;
            CenterFitVideoView centerFitVideoView = E.c;
            if (centerFitVideoView != null) {
                centerFitVideoView.stopPlayback();
            }
            E.a();
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ad() {
        this.c.k();
        try {
            ba();
            E().a();
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
    public final void af() {
        aksa b = this.c.b();
        try {
            bb();
            aawt E = E();
            if (E.g.aw()) {
                E.b();
            }
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        char c;
        int i;
        this.c.k();
        try {
            bf(view, bundle);
            final aawt E = E();
            E.d = (ZoomableImageView) view.findViewById(R.id.zoomable_image_view);
            E.d.setImportantForAccessibility(2);
            E.c = (CenterFitVideoView) view.findViewById(R.id.media_viewer_video_preview);
            Bundle bundle2 = E.g.m;
            if (bundle2 != null) {
                Uri uri = (Uri) bundle2.getParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                String string = bundle2.getString("content_type");
                int i2 = 0;
                if (bundle2.getInt("starting_view_state", 0) != 1) {
                    c = 1;
                } else {
                    c = 2;
                }
                boolean z = gh.z(string);
                ZoomableImageView zoomableImageView = E.d;
                int i3 = 8;
                if (true != z) {
                    i = 0;
                } else {
                    i = 8;
                }
                zoomableImageView.setVisibility(i);
                CenterFitVideoView centerFitVideoView = E.c;
                if (true == z) {
                    i3 = 0;
                }
                centerFitVideoView.setVisibility(i3);
                aaxd aaxdVar = E.i;
                if (aaxdVar != null) {
                    aaxdVar.u.setVisibility(i3);
                }
                E.b = z;
                if (z) {
                    if (uri != null) {
                        E.c.setOnPreparedListener(new aawp(E, i2));
                        E.c.setVideoURI(uri);
                        E.c.setOnCompletionListener(new aawq(0));
                        E.c.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: aawr
                            @Override // android.media.MediaPlayer.OnInfoListener
                            public final boolean onInfo(MediaPlayer mediaPlayer, int i4, int i5) {
                                if (i4 == 3) {
                                    aawt aawtVar = aawt.this;
                                    aawtVar.e = 0L;
                                    aawtVar.b();
                                    return false;
                                }
                                return false;
                            }
                        });
                        E.c.setOnClickListener(new aarv(E, 19));
                    } else {
                        throw new IllegalStateException("MediaFragmentPeer: Video uri cannot be null.");
                    }
                } else {
                    E.d.m = new ahjj(E);
                    aawo aawoVar = E.g;
                    hlp hlpVar = (hlp) hkz.e(aawoVar.x()).c(aawoVar).e(uri).F();
                    if (((Boolean) ((utz) aaxj.g.get()).e()).booleanValue() && uri != null && ydk.y(uri)) {
                        hlpVar = (hlp) hlpVar.B(hpb.a);
                    }
                    hlpVar.f(new aaws(E, 0)).t(E.d);
                    if (!bundle2.getBoolean("show_direct_send_viewer", false)) {
                        E.d.f = new aarv(E, 20);
                    }
                    if (c == 2) {
                        E.c();
                    }
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

    @Override // defpackage.aawk
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.aawk, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.d == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof aawo) {
                            ((kqm) aS).v();
                            this.d = new aawt((aawo) cgVar, ((kqm) aS).a.cp);
                            this.Z.c(new akli(this.c, this.a));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, aawt.class));
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
            aawt E = E();
            if (E.g.fe() != null) {
                E.a = (aaov) new eoy(E.g.fe()).a(aaov.class);
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
            LayoutInflater cloneInContext = aD.cloneInContext(new apxm.a(aD, this));
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

    @Override // defpackage.aiuc, defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aawt E = E();
        View view = E.g.Q;
        view.getClass();
        aabr.am(view, new aaqk(E, 18));
    }

    @Override // defpackage.akkh
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final aawt E() {
        aawt aawtVar = this.d;
        if (aawtVar != null) {
            if (!this.ag) {
                return aawtVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.aawk, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
