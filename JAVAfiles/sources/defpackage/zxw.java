package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.ui.conversation.details.CdpOpeningArguments;
import defpackage.aklx;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxw extends zyb implements akkh, apxq, akkf, aklk, akrw {
    private zxy a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public zxw() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zxy.class;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            zxy E = E();
            layoutInflater.getClass();
            Window window = ((zxw) E.b.b()).F().getWindow();
            eea.c(window, false);
            window.setNavigationBarColor(0);
            window.setStatusBarColor(0);
            window.setFlags(512, 512);
            ComposeView composeView = new ComposeView(((zxw) E.b.b()).y(), null, 0, 6, null);
            composeView.setFitsSystemWindows(true);
            composeView.setOnApplyWindowInsetsListener(new ivf(8));
            composeView.a(new cdj(-930641910, true, new zny(E, 3)));
            akqj.p();
            return composeView;
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

    @Override // defpackage.zyb, defpackage.aiuc, defpackage.cg
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
    public final zxy E() {
        zxy zxyVar = this.a;
        if (zxyVar != null) {
            if (!this.ag) {
                return zxyVar;
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

    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void aa() {
        aksa b = this.c.b();
        try {
            aQ();
            Window window = ((zxw) E().b.b()).F().getWindow();
            eea.c(window, true);
            window.clearFlags(512);
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

    @Override // defpackage.zyb
    protected final /* bridge */ /* synthetic */ aklw d() {
        return new akls(this, true);
    }

    @Override // defpackage.zyb, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        this.a = new zxy(((kql) aS).el.G, ((kql) aS).ed, ((kql) aS).an, ((kql) aS).cb);
                        this.Z.c(new akli(this.c, this.e));
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

    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void g(Bundle bundle) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        this.c.k();
        try {
            aP(bundle);
            zxy E = E();
            lkc lkcVar = (lkc) E.a.b();
            lkcVar.b();
            lkcVar.c(llg.a, true);
            Intent intent = ((zxw) E.b.b()).F().getIntent();
            intent.getClass();
            if (Build.VERSION.SDK_INT > 33) {
                parcelableExtra2 = intent.getParcelableExtra("mapi_conversation_id", ConversationId.class);
                parcelableExtra = (Parcelable) parcelableExtra2;
            } else {
                parcelableExtra = intent.getParcelableExtra("mapi_conversation_id");
            }
            parcelableExtra.getClass();
            ConversationId conversationId = (ConversationId) parcelableExtra;
            int intExtra = intent.getIntExtra("conversation_settings_launch_source", 0);
            Bundle bundle2 = ((zxw) E.b.b()).m;
            if (bundle2 != null) {
                bundle2.putParcelable("open_conversation2_arguments", new OpenConversation2Arguments(conversationId, null, null, true, false, false, null, 118, null));
                bundle2.putParcelable("cdp_opening_arguments", new CdpOpeningArguments(intExtra));
                bundle2.putParcelable("mapi_conversation_id", conversationId);
                hld.B(bundle2, jhq.a);
            }
            akqj.p();
        } finally {
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

    @Override // defpackage.zyb, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
