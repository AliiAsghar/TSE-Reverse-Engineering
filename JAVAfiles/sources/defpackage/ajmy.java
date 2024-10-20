package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajmy extends ajnc {
    public AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public ValueAnimator d;
    private final int i;
    private final int j;
    private final TimeInterpolator k;
    private final View.OnClickListener l;
    private final View.OnFocusChangeListener m;
    private final AccessibilityManager.TouchExplorationStateChangeListener n;
    private boolean o;
    private long p;
    private AccessibilityManager q;
    private ValueAnimator r;

    public ajmy(ajnb ajnbVar) {
        super(ajnbVar);
        this.l = new ajeg(this, 3);
        this.m = new ilc(this, 8);
        this.n = new ajmw(this, 0);
        this.p = Long.MAX_VALUE;
        this.j = ajgk.g(ajnbVar.getContext(), R.attr.motionDurationShort3, 67);
        this.i = ajgk.g(ajnbVar.getContext(), R.attr.motionDurationShort3, 50);
        this.k = ajgk.l(ajnbVar.getContext(), R.attr.motionEasingLinearInterpolator, ajdd.a);
    }

    private final ValueAnimator z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.k);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ztg(this, 16));
        return ofFloat;
    }

    @Override // defpackage.ajnc
    public final AccessibilityManager.TouchExplorationStateChangeListener A() {
        return this.n;
    }

    @Override // defpackage.ajnc
    public final int a() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.ajnc
    public final int b() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.ajnc
    public final View.OnClickListener c() {
        return this.l;
    }

    @Override // defpackage.ajnc
    public final View.OnFocusChangeListener d() {
        return this.m;
    }

    @Override // defpackage.ajnc
    public final void g(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.a = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new iiy(this, 9));
            this.a.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ajmv
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    ajmy ajmyVar = ajmy.this;
                    ajmyVar.n();
                    ajmyVar.k(false);
                }
            });
            this.a.setThreshold(0);
            this.e.b.m(null);
            if (!ajgl.m(editText) && this.q.isTouchExplorationEnabled()) {
                this.h.setImportantForAccessibility(2);
            }
            this.e.i(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // defpackage.ajnc
    public final void i() {
        this.d = z(this.j, brg.a, 1.0f);
        ValueAnimator z = z(this.i, 1.0f, brg.a);
        this.r = z;
        z.addListener(new ajmx(this));
        this.q = (AccessibilityManager) this.g.getSystemService("accessibility");
    }

    @Override // defpackage.ajnc
    public final void j() {
        AutoCompleteTextView autoCompleteTextView = this.a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.a.setOnDismissListener(null);
        }
    }

    public final void k(boolean z) {
        if (this.o != z) {
            this.o = z;
            this.d.cancel();
            this.r.start();
        }
    }

    @Override // defpackage.ajnc
    public final void l() {
        if (this.q.isTouchExplorationEnabled() && ajgl.m(this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post(new ajir(this, 7, null));
    }

    public final void m() {
        if (this.a == null) {
            return;
        }
        if (p()) {
            this.c = false;
        }
        if (!this.c) {
            k(!this.o);
            if (this.o) {
                this.a.requestFocus();
                this.a.showDropDown();
                return;
            } else {
                this.a.dismissDropDown();
                return;
            }
        }
        this.c = false;
    }

    public final void n() {
        this.c = true;
        this.p = System.currentTimeMillis();
    }

    @Override // defpackage.ajnc
    public final boolean o(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        long currentTimeMillis = System.currentTimeMillis() - this.p;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ajnc
    public final boolean q() {
        return true;
    }

    @Override // defpackage.ajnc
    public final boolean r() {
        return this.b;
    }

    @Override // defpackage.ajnc
    public final boolean s() {
        return true;
    }

    @Override // defpackage.ajnc
    public final boolean t() {
        return this.o;
    }

    @Override // defpackage.ajnc
    public final boolean u() {
        return true;
    }

    @Override // defpackage.ajnc
    public final void v(efx efxVar) {
        boolean isShowingHintText;
        if (!ajgl.m(this.a)) {
            efxVar.q(Spinner.class.getName());
        }
        isShowingHintText = efxVar.a.isShowingHintText();
        if (isShowingHintText) {
            efxVar.B(null);
        }
    }

    @Override // defpackage.ajnc
    public final void w(AccessibilityEvent accessibilityEvent) {
        if (this.q.isEnabled() && !ajgl.m(this.a)) {
            boolean z = false;
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.o && !this.a.isPopupShowing()) {
                z = true;
            }
            if (accessibilityEvent.getEventType() == 1 || z) {
                m();
                n();
            }
        }
    }
}
