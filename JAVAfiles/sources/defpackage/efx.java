package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.vcard.VCardConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efx {
    public final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    public efx(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    private final List ae(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    private final void af(int i, boolean z) {
        Bundle a = a();
        if (a != null) {
            int i2 = a.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (true != z) {
                i = 0;
            }
            a.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private final boolean ag(int i) {
        Bundle a = a();
        if (a == null || (a.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    public static efx b() {
        return new efx(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case R.id.accessibilityActionMoveWindow:
                        return "ACTION_MOVE_WINDOW";
                    case R.id.KEYCODE_3D_MODE:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowOnScreen:
                                return "ACTION_SHOW_ON_SCREEN";
                            case R.id.accessibilityActionScrollToPosition:
                                return "ACTION_SCROLL_TO_POSITION";
                            case R.id.accessibilityActionScrollUp:
                                return "ACTION_SCROLL_UP";
                            case R.id.accessibilityActionScrollLeft:
                                return "ACTION_SCROLL_LEFT";
                            case R.id.accessibilityActionScrollDown:
                                return "ACTION_SCROLL_DOWN";
                            case R.id.accessibilityActionScrollRight:
                                return "ACTION_SCROLL_RIGHT";
                            case R.id.accessibilityActionContextClick:
                                return "ACTION_CONTEXT_CLICK";
                            case R.id.accessibilityActionSetProgress:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionShowTooltip:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case R.id.accessibilityActionHideTooltip:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case R.id.accessibilityActionPageUp:
                                        return "ACTION_PAGE_UP";
                                    case R.id.accessibilityActionPageDown:
                                        return "ACTION_PAGE_DOWN";
                                    case R.id.accessibilityActionPageLeft:
                                        return "ACTION_PAGE_LEFT";
                                    case R.id.accessibilityActionPageRight:
                                        return "ACTION_PAGE_RIGHT";
                                    case R.id.accessibilityActionPressAndHold:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i) {
                                            case R.id.accessibilityActionImeEnter:
                                                return "ACTION_IME_ENTER";
                                            case R.id.ALT:
                                                return "ACTION_DRAG_START";
                                            case R.id.CTRL:
                                                return "ACTION_DRAG_DROP";
                                            case R.id.FUNCTION:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public final void A(boolean z) {
        if (Build.VERSION.SDK_INT < 28) {
            af(2, z);
        } else {
            this.a.setHeading(z);
        }
    }

    public final void B(CharSequence charSequence) {
        this.a.setHintText(charSequence);
    }

    public final void C(View view) {
        this.a.setLabelFor(view);
    }

    public final void D(boolean z) {
        this.a.setLongClickable(z);
    }

    public final void E(int i) {
        this.a.setMaxTextLength(i);
    }

    public final void F(int i) {
        this.a.setMovementGranularities(i);
    }

    public final void G(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public final void H(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        } else {
            this.a.setPaneTitle(charSequence);
        }
    }

    public final void I(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public final void J(View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public final void K(CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final void L(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            af(1, z);
        }
    }

    public final void M(boolean z) {
        this.a.setScrollable(z);
    }

    public final void N(boolean z) {
        this.a.setShowingHintText(z);
    }

    public final void O(View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public final void P(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT < 30) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        } else {
            this.a.setStateDescription(charSequence);
        }
    }

    public final void Q(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void R(View view) {
        this.a.setTraversalAfter(view);
    }

    public final void S(View view) {
        this.a.setTraversalBefore(view);
    }

    public final void T(View view, int i) {
        this.a.setTraversalBefore(view, i);
    }

    public final void U(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public final boolean V() {
        return this.a.isChecked();
    }

    public final boolean W() {
        return this.a.isClickable();
    }

    public final boolean X() {
        return this.a.isEnabled();
    }

    public final boolean Y() {
        return this.a.isFocusable();
    }

    public final boolean Z() {
        return this.a.isFocused();
    }

    public final Bundle a() {
        return this.a.getExtras();
    }

    public final boolean aa() {
        return this.a.isPassword();
    }

    public final boolean ab() {
        return this.a.isScrollable();
    }

    public final void ac(efw efwVar) {
        this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) efwVar.o);
    }

    public final void ad() {
        af(VCardConfig.FLAG_APPEND_TYPE_PARAM, true);
    }

    public final CharSequence c() {
        return this.a.getClassName();
    }

    public final CharSequence d() {
        return this.a.getContentDescription();
    }

    public final CharSequence e() {
        if (!ae("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List ae = ae("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List ae2 = ae("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List ae3 = ae("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List ae4 = ae("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < ae.size(); i++) {
                spannableString.setSpan(new efv(((Integer) ae4.get(i)).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) ae.get(i)).intValue(), ((Integer) ae2.get(i)).intValue(), ((Integer) ae3.get(i)).intValue());
            }
            return spannableString;
        }
        return this.a.getText();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof efx)) {
            return false;
        }
        efx efxVar = (efx) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (efxVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(efxVar.a)) {
            return false;
        }
        if (this.c == efxVar.c && this.b == efxVar.b) {
            return true;
        }
        return false;
    }

    public final void g(int i) {
        this.a.addAction(i);
    }

    public final void h(efw efwVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) efwVar.o);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(View view, int i) {
        this.a.addChild(view, i);
    }

    @Deprecated
    public final void j(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final void k(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void l(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    @Deprecated
    public final void m(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void n(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void o(boolean z) {
        this.a.setCheckable(z);
    }

    public final void p(boolean z) {
        this.a.setChecked(z);
    }

    public final void q(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void r(boolean z) {
        this.a.setClickable(z);
    }

    public final void s(Object obj) {
        this.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((efu) obj).a);
    }

    public final void t(Object obj) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((efu) obj).a);
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        CharSequence charSequence3;
        boolean isImportantForAccessibility;
        boolean ag;
        boolean ag2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        rect.toString();
        sb.append("; boundsInParent: ".concat(rect.toString()));
        k(rect);
        rect.toString();
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        if (Build.VERSION.SDK_INT >= 34) {
            this.a.getBoundsInWindow(rect);
        } else {
            Rect rect2 = (Rect) this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        rect.toString();
        sb.append("; boundsInWindow: ".concat(rect.toString()));
        sb.append("; packageName: ");
        sb.append(this.a.getPackageName());
        sb.append("; className: ");
        sb.append(c());
        sb.append("; text: ");
        sb.append(e());
        sb.append("; error: ");
        sb.append(this.a.getError());
        sb.append("; maxTextLength: ");
        sb.append(this.a.getMaxTextLength());
        sb.append("; stateDescription: ");
        if (Build.VERSION.SDK_INT >= 30) {
            charSequence = this.a.getStateDescription();
        } else {
            charSequence = this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(d());
        sb.append("; tooltipText: ");
        if (Build.VERSION.SDK_INT >= 28) {
            charSequence2 = this.a.getTooltipText();
        } else {
            charSequence2 = this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb.append(charSequence2);
        sb.append("; viewIdResName: ");
        sb.append(this.a.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (Build.VERSION.SDK_INT >= 33) {
            string = this.a.getUniqueId();
        } else {
            string = this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(this.a.isCheckable());
        sb.append("; checked: ");
        sb.append(V());
        sb.append("; focusable: ");
        sb.append(Y());
        sb.append("; focused: ");
        sb.append(Z());
        sb.append("; selected: ");
        sb.append(this.a.isSelected());
        sb.append("; clickable: ");
        sb.append(W());
        sb.append("; longClickable: ");
        sb.append(this.a.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(this.a.isContextClickable());
        sb.append("; enabled: ");
        sb.append(X());
        sb.append("; password: ");
        sb.append(aa());
        sb.append("; scrollable: " + ab());
        sb.append("; containerTitle: ");
        if (Build.VERSION.SDK_INT >= 34) {
            charSequence3 = this.a.getContainerTitle();
        } else {
            charSequence3 = this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence3);
        sb.append("; granularScrollingSupported: ");
        sb.append(ag(VCardConfig.FLAG_APPEND_TYPE_PARAM));
        sb.append("; importantForAccessibility: ");
        isImportantForAccessibility = this.a.isImportantForAccessibility();
        sb.append(isImportantForAccessibility);
        sb.append("; visible: ");
        sb.append(this.a.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (Build.VERSION.SDK_INT >= 33) {
            ag = this.a.isTextSelectable();
        } else {
            ag = ag(VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT);
        }
        sb.append(ag);
        sb.append("; accessibilityDataSensitive: ");
        if (Build.VERSION.SDK_INT >= 34) {
            ag2 = this.a.isAccessibilityDataSensitive();
        } else {
            ag2 = ag(64);
        }
        sb.append(ag2);
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new efw(actionList.get(i), 0, null, null, null));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            efw efwVar = (efw) arrayList.get(i2);
            String f = f(efwVar.a());
            if (f.equals("ACTION_UNKNOWN") && efwVar.b() != null) {
                f = efwVar.b().toString();
            }
            sb.append(f);
            if (i2 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void v(boolean z) {
        this.a.setDismissable(z);
    }

    public final void w(boolean z) {
        this.a.setEnabled(z);
    }

    public final void x(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public final void y(boolean z) {
        this.a.setFocusable(z);
    }

    public final void z(boolean z) {
        this.a.setFocused(z);
    }
}
