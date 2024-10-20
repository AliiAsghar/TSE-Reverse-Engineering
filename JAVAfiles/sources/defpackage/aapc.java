package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapc implements aapk {
    private final Optional A;
    private final Optional B;
    private final mbl C;
    private final armf D;
    private final xnv E;
    private final abbu F;
    private final aqws G;
    private final ahmv H;
    public CoordinatorLayout a;
    public View b;
    public aapb c;
    public int d;
    public ContentGridView e;
    public boolean f;
    public final Compose2oFragment r;
    public final yti s;
    public final abdc t;
    public final qky u;
    public final armf v;
    public aaas w;
    public aajq x;
    private View y;
    public int g = 0;
    public boolean h = false;
    public boolean i = false;
    private boolean z = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public Bundle n = null;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;

    public aapc(Optional optional, Optional optional2, Compose2oFragment compose2oFragment, mbl mblVar, ahmv ahmvVar, armf armfVar, yti ytiVar, abdc abdcVar, qky qkyVar, xnv xnvVar, aqws aqwsVar, abbu abbuVar, armf armfVar2) {
        this.A = optional;
        this.B = optional2;
        this.r = compose2oFragment;
        this.C = mblVar;
        this.H = ahmvVar;
        this.D = armfVar;
        this.s = ytiVar;
        this.t = abdcVar;
        this.u = qkyVar;
        this.E = xnvVar;
        this.G = aqwsVar;
        this.F = abbuVar;
        this.v = armfVar2;
    }

    public final void a(aaqd aaqdVar) {
        LayoutInflater.from(this.r.x()).inflate(aaqdVar.m(), this.a);
        this.y = this.a.findViewById(R.id.single_category_container);
        if (!((Boolean) utw.ag.e()).booleanValue()) {
            this.y.setOnApplyWindowInsetsListener(new iwv(this, 7));
            WindowInsets rootWindowInsets = this.a.getRootWindowInsets();
            ContentGridView contentGridView = this.e;
            if (contentGridView != null && contentGridView.getVisibility() == 0 && rootWindowInsets != null) {
                this.y.dispatchApplyWindowInsets(rootWindowInsets);
            }
        }
        l(this.f);
        aaqdVar.e(this.y);
    }

    public final void b() {
        if (this.j) {
            this.a.setVisibility(0);
            aapb aapbVar = this.c;
            ContentGridView contentGridView = this.e;
            epj.a(this.r);
            aapbVar.l(contentGridView);
            this.j = false;
        }
        if (this.m) {
            this.c.c(this.n);
            this.m = false;
        }
        if (this.o) {
            this.c.i();
            this.o = false;
        }
        if (this.p) {
            this.c.g();
            this.p = false;
        }
        if (this.z) {
            this.c.a();
            this.z = false;
        }
    }

    public final void c() {
        ContentGridView contentGridView = this.e;
        if (contentGridView != null) {
            contentGridView.a(0, 0);
        }
    }

    public final void d(aapb aapbVar) {
        aaas aaasVar;
        this.c = aapbVar;
        if (this.q) {
            this.q = false;
            return;
        }
        if (this.e != null) {
            b();
        }
        if (this.l && (aaasVar = this.w) != null) {
            aapbVar.m(aaasVar);
            this.l = false;
            this.k = true;
        }
        if (this.k) {
            if (!aapbVar.k()) {
                Log.e("Bugle", "Compose2oFragment: Processing intent results failed");
            }
            this.k = false;
        }
    }

    public final void e(int i) {
        this.d = i;
        ContentGridView contentGridView = this.e;
        if (contentGridView != null) {
            contentGridView.aN(i);
        }
    }

    public final void f() {
        if (this.e == null) {
            return;
        }
        boolean m = this.F.m();
        this.i = m;
        this.r.am(m);
        aapb aapbVar = this.c;
        if (aapbVar != null) {
            aapbVar.a();
        } else {
            this.z = true;
        }
    }

    public final void g(View view, WindowInsets windowInsets) {
        int i;
        if (windowInsets != null) {
            i = windowInsets.getSystemWindowInsetBottom();
        } else {
            i = 0;
        }
        view.setPadding(0, this.r.z().getDimensionPixelSize(R.dimen.c2o_padding_top), 0, this.r.z().getDimensionPixelSize(R.dimen.c2o_padding_bottom) + i);
    }

    public final void h(Intent intent, int i, amqe amqeVar) {
        if (amqeVar != null) {
            intent.putExtra("EXTRA_OPENING_SOURCE", amqeVar.name());
        }
        intent.putExtra("EXTRA_OPENING_TIME", this.E.f().toEpochMilli());
        this.r.startActivityForResult(intent, i);
    }

    @Override // defpackage.aapk
    public final void i(amqe amqeVar) {
        this.H.b(this.r);
        o(amqh.EXTERNAL, amqeVar);
    }

    @Override // defpackage.aapk
    public final void j(ajwt ajwtVar, amqe amqeVar, AttachmentQueueState attachmentQueueState) {
        Intent intent = new Intent(this.r.fe(), (Class<?>) GalleryBrowserActivity.class);
        ajya.c(intent, ajwtVar);
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        intent.putExtra("draft_message_data", attachmentQueueState);
        intent.putExtra("theme_color", this.d);
        if (((Boolean) abdh.a.e()).booleanValue()) {
            intent.putExtra("EXTRA_MAX_ATTACHMENT_SIZE", this.g);
        }
        if (((Boolean) vof.a.e()).booleanValue()) {
            intent.putExtra("EXTRA_IS_RCS_ON_OPEN", this.h);
        }
        h(intent, 124, amqeVar);
        o(amqh.GALLERY, amqeVar);
    }

    public final void k(amqe amqeVar, int i) {
        this.C.c("Bugle.Share.LocationAttachmentPicker.Entered");
        Intent intent = new Intent(this.r.fe(), (Class<?>) this.B.get());
        intent.putExtra("theme_color", this.d);
        intent.putExtra("message_type", i);
        h(intent, 125, amqeVar);
    }

    public final void l(boolean z) {
        int i;
        this.f = z;
        View view = this.y;
        if (view != null) {
            int i2 = 8;
            if (true != z) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            ContentGridView contentGridView = this.e;
            if (contentGridView != null) {
                if (true != z) {
                    i2 = 0;
                }
                contentGridView.setVisibility(i2);
            }
        }
    }

    public final boolean m() {
        return yhx.d(this.r.fe(), this.G.a);
    }

    @Override // defpackage.aapk
    public final boolean n(amqe amqeVar, AttachmentQueueState attachmentQueueState) {
        if (yhx.d(this.r.fe(), this.G.a)) {
            this.F.h(R.string.camera_fullscreen_does_not_work_in_split_screen);
            return false;
        }
        Intent intent = new Intent(this.r.fe(), (Class<?>) this.A.get());
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        intent.putExtra("draft_message_data", attachmentQueueState);
        intent.putExtra("theme_color", this.d);
        intent.putExtra("is_bubble_activity", this.G.a);
        intent.putExtra("IS_USING_C2O_CAMERA_GALLERY", true);
        h(intent, 126, amqeVar);
        return true;
    }

    public final void o(amqh amqhVar, amqe amqeVar) {
        ((mdc) this.D.b()).d(amqhVar, amqi.EXPANDED, amqeVar, amqf.UNKNOWN_OPENING_STATE, 0, Duration.ofMillis(0L));
    }

    @Override // defpackage.aapk
    public final void p(Intent intent) {
        aajq aajqVar = this.x;
        if (aajqVar != null) {
            aajqVar.d(intent);
        }
    }
}
