package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewPager;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerAddMoreButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import com.google.android.material.button.MaterialButton;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxd implements zqe {
    public static final xze a = xze.g("Bugle", "MediaViewerFragmentPeer");
    public final aaxa A;
    public final Optional B;
    public Uri D;
    public MediaViewerItem E;
    public cg F;
    public String G;
    public final abdc H;
    public long K;
    public aaxi L;
    public final pjz R;
    public final afmd X;
    public akrq Y;
    public final zrs Z;
    public final zoh aa;
    public zxy ab;
    public final aqws ac;
    public final hmk ad;
    public final aohs ae;
    public final aohs af;
    public final wfh ag;
    private final mei ah;
    private final mee ai;
    private final med aj;
    private final mea ak;
    private final Optional al;
    private final gpx am;
    private final znp an;
    public final abax b;
    public final aaou c;
    public final akbo d;
    public final qoq e;
    public final armf f;
    public final yai g;
    public final meg h;
    public final armf i;
    public final xnv j;
    public final armf k;
    public MediaViewerButton l;
    public ArrayList m;
    public MediaViewerButton n;
    public ViewGroup o;
    public TextView p;
    public TextView q;
    public TextView r;
    public LinearLayout s;
    public ImageView t;
    public TextView u;
    public View v;
    public xvy w;
    public aawu x;
    public TextView y;
    public MaterialButton z;
    public int C = -1;
    public final af I = new af();
    public boolean J = false;
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public int P = 0;
    public int Q = 0;
    public final akgh S = new akgh<List<MediaViewerItem>>() { // from class: aaxd.2
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            aaxd.a.q("Media Viewer data service failed ".concat(String.valueOf(th.getMessage())));
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            boolean z;
            List list = (List) obj;
            if (aaxd.this.x != null && list != null && !list.isEmpty()) {
                aaxd.this.x.h = alog.n(list);
                aawu aawuVar = aaxd.this.x;
                synchronized (aawuVar) {
                    DataSetObserver dataSetObserver = aawuVar.g;
                    if (dataSetObserver != null) {
                        dataSetObserver.onChanged();
                    }
                }
                aawuVar.f.notifyChanged();
                int i = aaxd.this.C;
                if (i == -1) {
                    i = -1;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        MediaViewerItem mediaViewerItem = (MediaViewerItem) list.get(i2);
                        if (mediaViewerItem != null && (aaxd.this.q(mediaViewerItem.b()) || aaxd.this.q(mediaViewerItem.a()))) {
                            aaxd.this.C = i2;
                            i = i2;
                        }
                    }
                }
                if (i == -1) {
                    ((mbl) aaxd.this.i.b()).c("Bugle.Media.Viewer.Photo.Not.Found.Counts");
                    if (list.isEmpty()) {
                        ((mbl) aaxd.this.i.b()).c("Bugle.Media.Viewer.Loaded.With.Empty.Data.Counts");
                    }
                    i = -1;
                }
                if (i == -1) {
                    xyo e = aaxd.a.e();
                    e.H("MediaViewer failed to find media:");
                    e.H(aaxd.this.D);
                    e.H("in data.");
                    e.K("count", list);
                    e.q();
                    i = !list.isEmpty() ? list.size() - 1 : -1;
                }
                if (i != -1) {
                    ((MediaViewPager) aaxd.this.w.b()).k(i, false);
                    if (i == 0) {
                        aaxd.this.h(0);
                    }
                    aaxd aaxdVar = aaxd.this;
                    if (aaxdVar.J) {
                        long epochMilli = aaxdVar.j.f().toEpochMilli() - aaxdVar.K;
                        if (epochMilli >= 0 && epochMilli <= 2147483647L) {
                            z = true;
                        } else {
                            z = false;
                        }
                        d.s(z);
                        aaxdVar.Y = new akrq((int) epochMilli, aaxd.this.C, list.size());
                        aaxd aaxdVar2 = aaxd.this;
                        aaxdVar2.J = false;
                        aaxdVar2.e();
                    }
                }
            }
        }

        @Override // defpackage.akgh
        public final void b() {
        }
    };
    public final akbp T = new akbp<Uri, Uri>() { // from class: aaxd.3
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            aaxd.this.t(2);
            ((uvi) aaxd.this.k.b()).b(th);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            aaxd.this.t(3);
            aaxd aaxdVar = aaxd.this;
            aaxdVar.k((Uri) obj2, aaxdVar.E.g());
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final akbp U = new akbp<Uri, Uri>() { // from class: aaxd.4
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            aaxd.this.t(2);
            ((uvi) aaxd.this.k.b()).b(th);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            aaxd.this.t(5);
            aaxd.this.v();
            throw null;
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final akbp V = new akbp<Uri, Uri>() { // from class: aaxd.5
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            aaxd.this.t(2);
            ((uvi) aaxd.this.k.b()).b(th);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            aaxd.this.t(5);
            aaxd.this.v();
            throw null;
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final akbp W = new akbp<Uri, Uri>() { // from class: aaxd.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            aaxd.this.t(2);
            ((uvi) aaxd.this.k.b()).b(th);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Uri uri = (Uri) obj2;
            aaxd.this.t(4);
            aaxd.this.v();
            if (aaxd.this.E.b().equals((Uri) obj)) {
                aaxd aaxdVar = aaxd.this;
                if (aaxdVar.E != null && aaxdVar.A.fe() != null) {
                    aaxd aaxdVar2 = aaxd.this;
                    aaxdVar2.p(uri, aaxdVar2.E.g());
                }
            }
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public aaxd(aaxa aaxaVar, aohs aohsVar, aohs aohsVar2, akbo akboVar, zrs zrsVar, qoq qoqVar, armf armfVar, gpx gpxVar, yai yaiVar, mei meiVar, meg megVar, mee meeVar, med medVar, mea meaVar, armf armfVar2, xnv xnvVar, aqws aqwsVar, Optional optional, Optional optional2, armf armfVar3, hmk hmkVar, wfh wfhVar, abdc abdcVar, afmd afmdVar, zoh zohVar, znp znpVar, pjz pjzVar) {
        this.A = aaxaVar;
        this.ae = aohsVar;
        this.af = aohsVar2;
        this.d = akboVar;
        this.Z = zrsVar;
        this.e = qoqVar;
        this.f = armfVar;
        this.am = gpxVar;
        this.g = yaiVar;
        this.ah = meiVar;
        this.h = megVar;
        this.ai = meeVar;
        this.aj = medVar;
        this.ak = meaVar;
        this.i = armfVar2;
        this.j = xnvVar;
        this.al = optional;
        this.B = optional2;
        this.k = armfVar3;
        this.ac = aqwsVar;
        this.ad = hmkVar;
        this.ag = wfhVar;
        this.H = abdcVar;
        this.X = afmdVar;
        this.aa = zohVar;
        this.an = znpVar;
        this.R = pjzVar;
        if (yhx.b && aaxaVar.fe() != null) {
            cj fe = aaxaVar.fe();
            fe.getClass();
            if (fe.getWindow() != null) {
                cj fe2 = aaxaVar.fe();
                fe2.getClass();
                if (fe2.getWindow().getAttributes() != null) {
                    cj fe3 = aaxaVar.fe();
                    fe3.getClass();
                    fe3.getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                }
            }
        }
        this.c = new aaou(aaxaVar);
        cj fe4 = aaxaVar.fe();
        fe4.getClass();
        fe4.getWindow().setStatusBarColor(ahnz.f(aaxaVar.fe(), R.attr.colorBackgroundDark, "MediaViewerFragmentPeer"));
        this.b = new abax(aaxaVar, aaxaVar.a, ahnz.f(aaxaVar.fe(), R.attr.colorBackgroundDark, "MediaViewerFragmentPeer"));
    }

    public static int s(Bundle bundle) {
        if (bundle != null && bundle.getInt("opening_source") != 0) {
            return a.ae(bundle.getInt("opening_source"));
        }
        return 1;
    }

    private final amsb w(int i) {
        String g = this.E.g();
        int i2 = this.L.d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            int i4 = 1;
            switch (i3) {
                case 4:
                case 5:
                case 6:
                    i4 = 2;
                    break;
            }
            aozy createBuilder = ampm.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ampm ampmVar = (ampm) createBuilder.b;
            ampmVar.b |= 8;
            ampmVar.g = g;
            ampm ampmVar2 = (ampm) createBuilder.s();
            u(i2);
            return lgb.D(i, i4, ampmVar2);
        }
        throw null;
    }

    private final void x() {
        int i;
        View view = this.r;
        if (view != null) {
            boolean z = this.M;
            if (z && this.z == null) {
                return;
            }
            if (z) {
                i = R.dimen.direct_send_viewer_primary_button_margin_bottom;
            } else {
                i = R.dimen.media_viewer_primary_button_margin_bottom;
            }
            if (z) {
                view = this.z;
            }
            aabr.ag(view, i);
        }
    }

    private final void y() {
        int i;
        LinearLayout linearLayout = this.s;
        if (linearLayout == null) {
            return;
        }
        if (true != this.M) {
            i = R.dimen.media_viewer_secondary_button_margin_bottom;
        } else {
            i = R.dimen.direct_send_viewer_secondary_button_margin_bottom;
        }
        aabr.ag(linearLayout, i);
    }

    public final View a() {
        if (this.M) {
            return this.A.L().findViewById(R.id.media_viewer_action_bar_direct_send_viewer);
        }
        return this.A.L().findViewById(R.id.media_viewer_action_bar);
    }

    public final amsg b() {
        int i;
        int i2 = this.L.d;
        akrq akrqVar = this.Y;
        if (akrqVar != null) {
            i = akrqVar.c;
        } else {
            i = 0;
        }
        return lgb.C(i2, i);
    }

    public final void c(akbp akbpVar) {
        aaxo n = aajv.n(null);
        this.E.b();
        this.d.j(new ahlp(n.a()), new ahlp(this.E.b()), akbpVar);
    }

    public final void d(int i) {
        if (this.L != null && this.Y != null) {
            this.ai.b(b(), w(i));
        }
    }

    public final void e() {
        if (this.L != null && this.Y != null) {
            mei meiVar = this.ah;
            amsg b = b();
            akrq akrqVar = this.Y;
            meiVar.n(new meh(b, akrqVar.b, akrqVar.a, 0));
        }
    }

    public final void f() {
        String charSequence;
        if (r()) {
            c(this.U);
            return;
        }
        this.A.Q.getClass();
        if (this.M) {
            MediaViewerAddMoreButtonEvent mediaViewerAddMoreButtonEvent = (MediaViewerAddMoreButtonEvent) ((MediaViewerButton) this.m.get(0)).d();
            if (this.y.getText() == null) {
                charSequence = null;
            } else {
                charSequence = this.y.getText().toString();
            }
            mediaViewerAddMoreButtonEvent.b = Optional.ofNullable(charSequence);
            aktp.L(mediaViewerAddMoreButtonEvent, this.A.Q);
            return;
        }
        aktp.L(((MediaViewerButton) this.m.get(0)).d(), this.A.Q);
    }

    public final void g() {
        int i;
        int i2;
        int a2;
        albo.T(this.M);
        albo.T(this.M);
        View L = this.A.L();
        int i3 = 8;
        int i4 = 0;
        if (true != this.H.b) {
            i = 8;
        } else {
            i = 0;
        }
        if (true != this.H.b) {
            i3 = 0;
        }
        L.findViewById(R.id.direct_send_done_button).setVisibility(i);
        L.findViewById(R.id.media_overlay).setVisibility(i);
        this.I.m(R.id.primary_button_icon, i);
        this.I.m(R.id.primary_button, i3);
        this.I.m(R.id.secondary_button_container, i3);
        albo.T(this.M);
        if (this.H.b && (a2 = this.H.a()) > 0) {
            i4 = a2;
        }
        af afVar = this.I;
        if (this.H.b) {
            i2 = i4 + this.Q;
        } else {
            i2 = this.P;
        }
        afVar.i(R.id.media_viewer_caption, 4, i2);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.o;
        constraintLayout.getClass();
        this.I.b(constraintLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i) {
        int i2;
        MediaViewerItem mediaViewerItem = (MediaViewerItem) this.x.h.get(i);
        this.E = mediaViewerItem;
        TextView textView = this.p;
        if (textView != null) {
            textView.setText(this.ag.z(mediaViewerItem.i()));
        }
        TextView textView2 = this.q;
        if (textView2 != null) {
            textView2.setText(mediaViewerItem.h());
        }
        this.F = this.x.b(i);
        d(i);
        aaxi aaxiVar = this.L;
        if (aaxiVar != null) {
            i2 = aaxiVar.d;
        } else {
            i2 = 1;
        }
        this.E.g();
        u(i2);
        this.v.setVisibility(8);
        this.E.g();
        x();
        y();
    }

    public final void i() {
        String charSequence;
        if (r()) {
            c(this.V);
            return;
        }
        if (this.M) {
            MediaViewerPrimaryButtonEvent mediaViewerPrimaryButtonEvent = (MediaViewerPrimaryButtonEvent) this.l.d();
            if (this.y.getText() == null) {
                charSequence = null;
            } else {
                charSequence = this.y.getText().toString();
            }
            mediaViewerPrimaryButtonEvent.b = Optional.ofNullable(charSequence);
            aktp.L(mediaViewerPrimaryButtonEvent, this.A.Q);
            return;
        }
        aktp.L(this.l.d(), this.A.Q);
    }

    public final void j() {
        if (this.E == null) {
            return;
        }
        if (r()) {
            c(this.T);
        } else {
            k(this.E.b(), this.E.g());
        }
    }

    public final void k(Uri uri, String str) {
        if (this.A.fe() != null) {
            ibr o = this.am.o("Bugle.Async.BuglePhotoViewController.onOptionsItemSelected.Duration");
            o.b(uri, str, null, null);
            o.e(new Void[0]);
        }
    }

    public final void l(View view, MediaViewerButton mediaViewerButton) {
        if (mediaViewerButton.a() != -1) {
            view.setContentDescription(this.A.S(mediaViewerButton.a()));
        }
    }

    public final void m(MediaViewerButton mediaViewerButton) {
        int i;
        float f;
        if (!this.M) {
            TextView textView = this.r;
            if (mediaViewerButton == null) {
                f = brg.a;
            } else {
                f = 1.0f;
            }
            textView.setAlpha(f);
        }
        if (!this.M) {
            this.r.getLayoutParams().height = -2;
        }
        if (mediaViewerButton != null) {
            int i2 = 1;
            int i3 = 0;
            if (this.M) {
                this.z.setText(mediaViewerButton.c());
                this.z.c(mediaViewerButton.b());
                l(this.z, mediaViewerButton);
                if (this.N) {
                    this.z.setOnClickListener(new aaxc(this, i2));
                } else {
                    this.z.setOnClickListener(new aaxc(this, i3));
                }
            } else {
                this.r.setText(mediaViewerButton.c());
                if (mediaViewerButton.b() != -1) {
                    TextView textView2 = this.r;
                    int b = mediaViewerButton.b();
                    int dimensionPixelSize = this.A.z().getDimensionPixelSize(R.dimen.media_viewer_button_drawable_padding);
                    int layoutDirection = textView2.getContext().getResources().getConfiguration().getLayoutDirection();
                    if (layoutDirection == 1) {
                        i = 0;
                    } else {
                        i = b;
                    }
                    if (layoutDirection != 1) {
                        b = 0;
                    }
                    textView2.setCompoundDrawablesWithIntrinsicBounds(i, 0, b, 0);
                    textView2.setCompoundDrawablePadding(dimensionPixelSize);
                }
                l(this.r, mediaViewerButton);
                this.r.setOnClickListener(new aaxc(this, 2));
            }
        }
        this.A.m.getString("content_type");
        x();
        if (this.M) {
            this.z.setAccessibilityDelegate(new aaxh());
        } else {
            this.r.setAccessibilityDelegate(new aaxh());
        }
    }

    @Override // defpackage.zqe
    public final boolean n() {
        throw null;
    }

    public final void o(List list) {
        boolean z;
        boolean z2;
        boolean z3;
        this.s.removeAllViews();
        if (list == null) {
            return;
        }
        if (this.m.size() <= 2) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Media Viewer should not have  more than two secondary buttons.");
        LayoutInflater I = this.A.I();
        for (int i = 0; i < list.size(); i++) {
            MediaViewerButton mediaViewerButton = (MediaViewerButton) list.get(i);
            if (this.M && mediaViewerButton.c() == R.string.camera_add_more_media) {
                MaterialButton materialButton = (MaterialButton) I.inflate(R.layout.direct_send_viewer_add_more_button, (ViewGroup) this.s, false);
                this.s.addView(materialButton);
                if (mediaViewerButton.b() != -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                d.s(z3);
                l(materialButton, mediaViewerButton);
                materialButton.setText(mediaViewerButton.c());
                materialButton.c(mediaViewerButton.b());
                if (this.M) {
                    aabr.ah(materialButton, R.dimen.direct_send_viewer_secondary_button_margin);
                }
                if (i == list.size() - 1) {
                    aabr.ai(materialButton);
                }
                materialButton.setOnClickListener(new aaxc(this, 5));
            } else {
                ImageView imageView = (ImageView) I.inflate(R.layout.media_viewer_secondary_button, (ViewGroup) this.s, false);
                this.s.addView(imageView);
                if (mediaViewerButton.b() != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                d.s(z2);
                imageView.setImageResource(mediaViewerButton.b());
                l(imageView, mediaViewerButton);
                aabr.ah(imageView, R.dimen.media_viewer_secondary_button_margin);
                if (i == list.size() - 1) {
                    aabr.ai(imageView);
                }
                this.ae.s(imageView, mediaViewerButton.d());
            }
        }
        this.A.m.getString("content_type");
        y();
    }

    public final void p(Uri uri, String str) {
        cj fe = this.A.fe();
        if (this.E != null && fe != null) {
            if (Objects.equals(uri.getScheme(), "file") && uri.getPath() != null) {
                Context applicationContext = fe.getApplicationContext();
                znp znpVar = this.an;
                String path = uri.getPath();
                path.getClass();
                uri = FileProvider.a(applicationContext, (String) znpVar.b, new File(path));
            }
            fe.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType(str).putExtra("android.intent.extra.STREAM", lzv.v(fe.getApplicationContext(), uri, str)), this.A.fe().getResources().getText(R.string.action_share)));
        }
    }

    public final boolean q(Uri uri) {
        if (uri != null && uri.equals(this.D)) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        return false;
    }

    public final void t(final int i) {
        if (this.L != null && this.Y != null) {
            med medVar = this.aj;
            final amsg b = b();
            final amsb w = w(0);
            final int i2 = 0;
            final int i3 = 0;
            medVar.n(new Supplier() { // from class: mec
                @Override // java.util.function.Supplier
                public final Object get() {
                    aozy createBuilder = amrv.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amsg amsgVar = amsg.this;
                    apag apagVar = createBuilder.b;
                    amrv amrvVar = (amrv) apagVar;
                    amsgVar.getClass();
                    amrvVar.c = amsgVar;
                    amrvVar.b |= 1;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    amsb amsbVar = w;
                    apag apagVar2 = createBuilder.b;
                    amrv amrvVar2 = (amrv) apagVar2;
                    amsbVar.getClass();
                    amrvVar2.d = amsbVar;
                    amrvVar2.b |= 2;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    int i4 = i;
                    apag apagVar3 = createBuilder.b;
                    amrv amrvVar3 = (amrv) apagVar3;
                    amrvVar3.e = i4 - 1;
                    amrvVar3.b |= 4;
                    if (!apagVar3.isMutable()) {
                        createBuilder.u();
                    }
                    int i5 = i2;
                    apag apagVar4 = createBuilder.b;
                    amrv amrvVar4 = (amrv) apagVar4;
                    amrvVar4.f = med.b(i5) - 1;
                    amrvVar4.b |= 8;
                    if (!apagVar4.isMutable()) {
                        createBuilder.u();
                    }
                    int i6 = i3;
                    amrv amrvVar5 = (amrv) createBuilder.b;
                    amrvVar5.g = med.b(i6) - 1;
                    amrvVar5.b |= 16;
                    return (amrv) createBuilder.s();
                }
            });
        }
    }

    public final void u(int i) {
        boolean booleanValue;
        if (i != 0) {
            switch (i - 1) {
                case 1:
                    booleanValue = ((Boolean) aaxj.d.e()).booleanValue();
                    break;
                case 2:
                case 3:
                    booleanValue = ((Boolean) aaxj.f.e()).booleanValue();
                    break;
                case 4:
                    booleanValue = ((Boolean) aaxj.a.e()).booleanValue();
                    break;
                case 5:
                    booleanValue = ((Boolean) aaxj.e.e()).booleanValue();
                    break;
                case 6:
                    booleanValue = ((Boolean) aaxj.b.e()).booleanValue();
                    break;
                default:
                    return;
            }
            if (booleanValue) {
                this.al.isPresent();
                return;
            }
            return;
        }
        throw null;
    }

    public final void v() {
        if (this.L != null && this.Y != null) {
            this.ak.n(new mau(b(), w(0), 4));
        }
    }
}
