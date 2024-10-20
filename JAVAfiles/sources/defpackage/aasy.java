package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Size;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasy extends aasn {
    public static final /* synthetic */ int r = 0;
    private final fyc A;
    public final xnv l;
    public aavm m;
    public final Optional n;
    public int o;
    public final aabz p;
    public aast q;
    private final aasx s;
    private int t;
    private int u;
    private int v;
    private int w;
    private final boolean x;
    private int y;
    private na z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aasy(defpackage.inx r17, defpackage.yti r18, defpackage.yyz r19, defpackage.yjf r20, defpackage.xnv r21, defpackage.armf r22, defpackage.kor r23, boolean r24, defpackage.aaqu r25) {
        /*
            r16 = this;
            r14 = r16
            r15 = r25
            cg r0 = r15.a
            abck r1 = new abck
            java.lang.Class<aatl> r2 = defpackage.aatl.class
            r1.<init>(r0, r2)
            r0 = r22
            eor r0 = r1.b(r0)
            r4 = r0
            aatn r4 = (defpackage.aatn) r4
            cg r5 = r15.a
            aapk r6 = r15.c
            com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState r7 = r15.b
            aasu r8 = new aasu
            r0 = 0
            r1 = r17
            r8.<init>(r15, r1, r0)
            com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView r9 = r15.g
            aabz r10 = r15.d
            int r11 = r15.e
            uuf r0 = defpackage.abdh.a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L53
            aabz r0 = r15.d
            boolean r0 = r0.b()
            if (r0 == 0) goto L47
            aabz r0 = r15.d
            long r0 = r0.p()
            goto L55
        L47:
            aabz r0 = r15.d
            xbe r0 = r0.F()
            int r0 = r0.d()
            long r0 = (long) r0
            goto L55
        L53:
            r0 = 0
        L55:
            r12 = r0
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r14.y = r0
            r0 = r21
            r14.l = r0
            aasx r0 = new aasx
            r0.<init>(r14)
            r14.s = r0
            fyc r0 = new fyc
            r1 = 14
            r2 = 0
            r0.<init>(r14, r1, r2)
            r14.A = r0
            j$.util.Optional r0 = r23.c()
            r14.n = r0
            aabz r0 = r15.d
            r14.p = r0
            r0 = r24
            r14.x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aasy.<init>(inx, yti, yyz, yjf, xnv, armf, kor, boolean, aaqu):void");
    }

    public final int B() {
        int i;
        if (this.b == null || r().b() <= this.e.c() + 1 || this.e.b(0) == 2) {
            return 0;
        }
        int b = (r().b() - 1) - (r().H() ? 1 : 0);
        int height = this.b.getHeight() / this.e.n();
        int n = ((b + this.e.n()) - 1) / this.e.n();
        if (r().H()) {
            i = this.v + this.u + this.w;
        } else {
            i = 0;
        }
        return Math.max(0, this.b.getWidth() - (((height * n) + i) + this.u));
    }

    public final na C() {
        if (this.z == null) {
            this.z = new aasv(this);
        }
        return this.z;
    }

    public final void D() {
        int L;
        View U;
        int i;
        int left;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b.m;
        if (linearLayoutManager != null && this.m != null && (U = linearLayoutManager.U((L = linearLayoutManager.L()))) != null) {
            int height = this.b.getHeight();
            int i2 = this.t;
            int i3 = height - (i2 + i2);
            int gk = (int) (i3 / this.m.a().gk());
            if (L == 0) {
                if (w()) {
                    left = this.b.getWidth() - U.getRight();
                } else {
                    left = U.getLeft();
                }
                i = left + gk;
            } else {
                i = 0;
            }
            if (this.m.a().getRight() != U.getRight()) {
                this.m.c(gk, i3, i);
            }
        }
    }

    public final boolean E() {
        if (((Boolean) ipe.e.e()).booleanValue()) {
            if (this.x && this.e.e) {
                return true;
            }
            return false;
        }
        return this.e.e;
    }

    @Override // defpackage.aasn, defpackage.aaqd
    public final int a() {
        return -2;
    }

    @Override // defpackage.aasn, defpackage.aaqd
    protected final int c() {
        return -1;
    }

    @Override // defpackage.aaqm, defpackage.aaqd
    public final void e(View view) {
        super.e(view);
        if (E()) {
            this.m = (aavm) new xvy(view, R.id.camera_container_view_stub, R.id.camera_container).b();
            if (!this.p.b()) {
                this.n.ifPresent(new aakw(this, 19));
            }
            this.m.e(new ahjj(this, (byte[]) null));
            Resources resources = this.m.a().getResources();
            this.t = resources.getDimensionPixelSize(R.dimen.camera_gallery_category_vertical_margin);
            this.u = resources.getDimensionPixelSize(R.dimen.camera_gallery_camera_item_horizontal_margin);
            this.v = resources.getDimensionPixelSize(R.dimen.category_overflow_width);
            this.o = resources.getDimensionPixelSize(R.dimen.camera_gallery_placeholder_start_margin);
            this.w = resources.getDimensionPixelSize(R.dimen.category_content_overflow_item_margin_end);
        }
        this.b.addOnLayoutChangeListener(this.A);
        this.b.F = null;
        C().e(this.b);
    }

    @Override // defpackage.aasn, defpackage.aaqd
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.q = (aast) bundle.getParcelable("mini_camera_capture");
        }
    }

    @Override // defpackage.aasn, defpackage.aaqd
    public final void h(Bundle bundle) {
        super.h(bundle);
        aast aastVar = this.q;
        if (aastVar != null) {
            bundle.putParcelable("mini_camera_capture", aastVar);
        }
    }

    @Override // defpackage.aaqm
    protected final mr k() {
        return new aasw(this);
    }

    @Override // defpackage.aasn, defpackage.aaqd
    public final void l(aaas aaasVar) {
        Uri uri;
        aast aastVar;
        super.l(aaasVar);
        if (aaasVar != null && aaasVar.a == 127 && aaasVar.b == -1 && (uri = (Uri) ((Intent) aaasVar.c).getParcelableExtra("android.intent.extra.STREAM")) != null && (aastVar = this.q) != null) {
            boolean booleanValue = ((Boolean) utw.o.e()).booleanValue();
            String str = aastVar.a;
            long j = aastVar.e;
            ampy ampyVar = aastVar.d;
            int i = aastVar.c;
            int i2 = aastVar.b;
            if (booleanValue) {
                ims n = imt.n();
                n.d(str);
                n.g(uri);
                n.c(ameb.MINI_CAMERA);
                n.a = new Size(i2, i);
                n.b(ampyVar);
                n.f(j);
                imt a = n.a();
                this.d.h(a);
                this.h.e(a, aauj.a(amqh.CAMERA, amqi.COLLAPSED));
                return;
            }
            CameraContentItem cameraContentItem = new CameraContentItem(uri, str, i2, i, -1L, ameb.MINI_CAMERA, j, ampyVar);
            this.d.n(cameraContentItem);
            this.h.g(cameraContentItem, aauj.a(amqh.CAMERA, amqi.COLLAPSED));
        }
    }

    @Override // defpackage.aaqm, defpackage.aaqd
    public final int m() {
        return R.layout.compose2o_camera_gallery_roll_recycler_view_m2;
    }

    @Override // defpackage.aaqd
    public final int n() {
        if (E()) {
            return R.layout.compose2o_camera_gallery_placeholder;
        }
        return R.layout.compose2o_empty_placeholder;
    }

    @Override // defpackage.aaqd
    public final void o(Configuration configuration) {
        View view;
        String str;
        if (this.m != null) {
            aase aaseVar = this.g;
            if (aaseVar != null && (view = aaseVar.e) != null) {
                int i = view.getResources().getConfiguration().orientation;
                ConstraintLayout constraintLayout = (ConstraintLayout) aaseVar.e;
                dxl dxlVar = new dxl();
                constraintLayout.getClass();
                dxlVar.d(constraintLayout);
                dxh dxhVar = dxlVar.b(R.id.camera_place_holder).d;
                if (i == 2) {
                    str = "W,4:3";
                } else {
                    str = "H,4:3";
                }
                dxhVar.A = str;
                dxlVar.c(constraintLayout);
            }
            this.m.d(configuration);
        }
        if (this.y != configuration.screenHeightDp) {
            this.b.post(new aaqk(this, 3));
            this.y = configuration.screenHeightDp;
        }
    }

    @Override // defpackage.aaqd
    public final void p() {
        aavm aavmVar = this.m;
        if (aavmVar != null) {
            aavmVar.b();
        }
    }

    @Override // defpackage.aaqm
    protected final nq x() {
        return this.s;
    }

    @Override // defpackage.aasn
    public final int y() {
        return R.layout.compose2o_camera_gallery_storage_permission_item_view;
    }

    @Override // defpackage.aasn
    protected final aase z(aasm aasmVar) {
        if (((Boolean) vof.a.e()).booleanValue()) {
            return aase.I(aasmVar, -2, n(), R.layout.compose2o_camera_gallery_storage_permission_item_view, new ahjj(this));
        }
        return super.z(aasmVar);
    }
}
