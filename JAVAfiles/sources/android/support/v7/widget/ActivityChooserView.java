package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.eco;
import defpackage.eek;
import defpackage.gc;
import defpackage.ja;
import defpackage.jz;
import defpackage.ka;
import defpackage.kb;
import defpackage.kc;
import defpackage.kd;
import defpackage.ke;
import defpackage.kf;
import defpackage.ktk;
import defpackage.nd;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ActivityChooserView extends ViewGroup {
    public final ke a;
    public final View b;
    public final Drawable c;
    public final FrameLayout d;
    public final ImageView e;
    public final FrameLayout f;
    public final ImageView g;
    public eco h;
    final DataSetObserver i;
    public boolean j;
    public int k;
    public int l;
    private final kf m;
    private final int n;
    private final ViewTreeObserver.OnGlobalLayoutListener o;
    private nd p;
    private boolean q;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {
        private static final int[] a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            ktk z = ktk.z(context, attributeSet, a);
            setBackgroundDrawable(z.p(0));
            z.t();
        }
    }

    public ActivityChooserView(Context context) {
        super(context, null, 0);
        this.i = new ka(this);
        this.o = new ja(this, 2);
        this.k = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, gc.e, 0, 0);
        eek.m(this, context, gc.e, null, obtainStyledAttributes, 0, 0);
        this.k = obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(com.google.android.apps.messaging.R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        kf kfVar = new kf(this);
        this.m = kfVar;
        View findViewById = findViewById(com.google.android.apps.messaging.R.id.activity_chooser_view_content);
        this.b = findViewById;
        this.c = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(com.google.android.apps.messaging.R.id.default_activity_button);
        this.f = frameLayout;
        frameLayout.setOnClickListener(kfVar);
        frameLayout.setOnLongClickListener(kfVar);
        this.g = (ImageView) frameLayout.findViewById(com.google.android.apps.messaging.R.id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(com.google.android.apps.messaging.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(kfVar);
        frameLayout2.setAccessibilityDelegate(new kb());
        frameLayout2.setOnTouchListener(new kc(this, frameLayout2));
        this.d = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(com.google.android.apps.messaging.R.id.image);
        this.e = imageView;
        imageView.setImageDrawable(drawable);
        ke keVar = new ke(this);
        this.a = keVar;
        keVar.registerDataSetObserver(new kd(this));
        Resources resources = context.getResources();
        this.n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.abc_config_prefDialogWidth));
    }

    public final nd a() {
        if (this.p == null) {
            nd ndVar = new nd(getContext());
            this.p = ndVar;
            ndVar.e(this.a);
            nd ndVar2 = this.p;
            ndVar2.l = this;
            ndVar2.y();
            nd ndVar3 = this.p;
            kf kfVar = this.m;
            ndVar3.m = kfVar;
            ndVar3.v(kfVar);
        }
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int, boolean] */
    public final void b(int i) {
        ?? r0;
        if (this.a.a != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.o);
            if (this.f.getVisibility() == 0) {
                r0 = 1;
            } else {
                r0 = 0;
            }
            int a = this.a.a();
            if (i != Integer.MAX_VALUE && a > i + r0) {
                this.a.e(true);
                this.a.c(i - 1);
            } else {
                this.a.e(false);
                this.a.c(i);
            }
            nd a2 = a();
            if (!a2.u()) {
                if (!this.j && r0 != 0) {
                    this.a.d(false, false);
                } else {
                    this.a.d(true, r0);
                }
                ke keVar = this.a;
                int i2 = keVar.b;
                keVar.b = Integer.MAX_VALUE;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                int count = keVar.getCount();
                int i3 = 0;
                View view = null;
                for (int i4 = 0; i4 < count; i4++) {
                    view = keVar.getView(i4, view, null);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i3 = Math.max(i3, view.getMeasuredWidth());
                }
                keVar.b = i2;
                a2.r(Math.min(i3, this.n));
                a2.s();
                eco ecoVar = this.h;
                if (ecoVar != null) {
                    ecoVar.subUiVisibilityChanged(true);
                }
                a2.e.setContentDescription(getContext().getString(com.google.android.apps.messaging.R.string.abc_activitychooserview_choose_application));
                a2.e.setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public final boolean c() {
        return a().u();
    }

    public final void d() {
        if (c()) {
            a().k();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.o);
            }
        }
    }

    public final void e() {
        if (!c() && this.q) {
            this.j = false;
            b(this.k);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jz jzVar = this.a.a;
        if (jzVar != null) {
            jzVar.registerObserver(this.i);
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jz jzVar = this.a.a;
        if (jzVar != null) {
            jzVar.unregisterObserver(this.i);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.o);
        }
        if (c()) {
            d();
        }
        this.q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
        if (!c()) {
            d();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.b;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
