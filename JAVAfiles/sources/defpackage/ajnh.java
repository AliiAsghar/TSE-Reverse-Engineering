package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajnh extends kh {
    public final nd a;
    public final float b;
    public ColorStateList c;
    public final int d;
    public final ColorStateList e;
    private final AccessibilityManager f;
    private final Rect g;
    private final int h;

    public ajnh(Context context, AttributeSet attributeSet) {
        super(ajnr.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.g = new Rect();
        Context context2 = getContext();
        TypedArray a = ajig.a(context2, attributeSet, ajnj.a, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = a.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.h = resourceId;
        this.b = a.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (a.hasValue(2)) {
            this.c = ColorStateList.valueOf(a.getColor(2, 0));
        }
        this.d = a.getColor(4, 0);
        this.e = ajki.e(context2, a, 5);
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        nd ndVar = new nd(context2);
        this.a = ndVar;
        ndVar.y();
        ndVar.l = this;
        ndVar.x();
        ndVar.e(getAdapter());
        ndVar.m = new ov(this, 4);
        if (a.hasValue(6)) {
            setAdapter(new ajng(this, getContext(), resourceId, getResources().getStringArray(a.getResourceId(6, 0))));
        }
        a.recycle();
    }

    private final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            AccessibilityManager accessibilityManager2 = this.f;
            if (accessibilityManager2 != null && accessibilityManager2.isEnabled() && (enabledAccessibilityServiceList = this.f.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.a.k();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout b = b();
        if (b != null && b.k) {
            return b.d();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.k && super.getHint() == null && ajgk.e()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.k();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i4 = 0;
            if (adapter != null && b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                int min = Math.min(adapter.getCount(), Math.max(0, this.a.o()) + 15);
                int max = Math.max(0, min - 15);
                View view = null;
                int i5 = 0;
                while (max < min) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        i3 = itemViewType;
                    } else {
                        i3 = i4;
                    }
                    if (itemViewType != i4) {
                        view = null;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                    max++;
                    i4 = i3;
                }
                Drawable c = this.a.c();
                if (c != null) {
                    c.getPadding(this.g);
                    Rect rect = this.g;
                    i5 += rect.left + rect.right;
                }
                i4 = i5 + b.b.d.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.e(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        nd ndVar = this.a;
        if (ndVar != null) {
            ndVar.f(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.n = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b = b();
        if (b != null) {
            b.x();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.a.s();
        } else {
            super.showDropDown();
        }
    }
}
