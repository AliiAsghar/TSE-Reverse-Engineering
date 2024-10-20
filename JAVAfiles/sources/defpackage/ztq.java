package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztq extends MaterialCardView {
    public static final /* synthetic */ int j = 0;
    public float g;
    public boolean h;
    public final /* synthetic */ ztr i;
    private final ArrayList k;
    private final VelocityTracker l;
    private final ViewTreeObserver.OnGlobalLayoutListener m;
    private float n;
    private float o;
    private boolean p;
    private boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztq(ztr ztrVar, Context context) {
        super(context);
        this.i = ztrVar;
        this.k = new ArrayList();
        this.l = VelocityTracker.obtain();
        this.m = new ja(this, 7, null);
        int i = 1;
        this.p = true;
        this.h = true;
        this.q = false;
        LayoutInflater.from(context).inflate(R.layout.full_banner_card_view_v2, (ViewGroup) this, true);
        ztrVar.j = (IllustrationViewStub) findViewById(R.id.banner_full_icon);
        ztrVar.k = (IllustrationViewStub) findViewById(R.id.banner_chip_icon);
        setClipChildren(false);
        if (!yyb.aG()) {
            setElevation(brg.a);
        } else {
            setElevation(context.getResources().getDimension(R.dimen.banner2o_elevation));
        }
        gb(context.getResources().getDimension(R.dimen.banner2o_full_corner_radius));
        p(ahnz.f(context, R.attr.colorSurface, "FullBannerUiController"));
        setFocusable(true);
        ztrVar.i = (LinearLayout) findViewById(R.id.banner_chip_content);
        ztrVar.h = (ConstraintLayout) findViewById(R.id.banner_full_content);
        ztrVar.l = (ImageView) findViewById(R.id.banner_close_icon);
        new xvy(this, R.id.banner_secondary_icon_stub, R.id.banner_secondary_icon);
        ztrVar.m = (Button) findViewById(R.id.banner_full_end_button);
        ztrVar.n = (Button) findViewById(R.id.banner_full_start_button);
        ztrVar.o = (TextView) findViewById(R.id.banner_full_title);
        ztrVar.p = (TextView) findViewById(R.id.banner_full_body);
        ahnz.s(ztrVar.p);
        ztrVar.i.setOnClickListener(new akwb(ztrVar.b, "FullBannerUiController: Chip clicked", new zqq(ztrVar, 9), i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        if (java.lang.Math.abs(r11.n - r12.getRawX()) >= r11.i.d.getResources().getDimension(com.google.android.apps.messaging.R.dimen.banner2o_click_distance)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean g(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztq.g(android.view.MotionEvent):boolean");
    }

    private final boolean h() {
        ztr ztrVar = this.i;
        if (ztrVar.E == 1 && ztrVar.x) {
            return true;
        }
        return false;
    }

    public final void f() {
        this.h = true;
        this.i.u = false;
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.m);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.m);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.q = true;
        return g(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.q) {
            this.q = false;
            return true;
        }
        g(motionEvent);
        return true;
    }
}
