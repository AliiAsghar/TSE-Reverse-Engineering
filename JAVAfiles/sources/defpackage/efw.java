package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efw {
    public static final efw a;
    public static final efw b;
    public static final efw c;
    public static final efw d;
    public static final efw e;
    public static final efw f;
    public static final efw g;
    public static final efw h;
    public static final efw i;
    public static final efw j;
    public static final efw k;
    public static final efw l;
    public static final efw m;
    public static final efw n;
    final Object o;
    public final int p;
    public final Class q;
    public final egi r;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction27 = null;
        new efw(1, (CharSequence) null);
        new efw(2, (CharSequence) null);
        new efw(4, (CharSequence) null);
        new efw(8, (CharSequence) null);
        a = new efw(16, (CharSequence) null);
        new efw(32, (CharSequence) null);
        b = new efw(64, (CharSequence) null);
        c = new efw(128, (CharSequence) null);
        new efw(256, egb.class);
        new efw(512, egb.class);
        new efw(1024, egc.class);
        new efw(2048, egc.class);
        d = new efw(4096, (CharSequence) null);
        e = new efw(8192, (CharSequence) null);
        new efw(16384, (CharSequence) null);
        new efw(32768, (CharSequence) null);
        new efw(65536, (CharSequence) null);
        new efw(131072, egg.class);
        f = new efw(262144, (CharSequence) null);
        g = new efw(524288, (CharSequence) null);
        h = new efw(1048576, (CharSequence) null);
        new efw(2097152, egh.class);
        new efw(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        i = new efw(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, ege.class);
        j = new efw(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        k = new efw(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        l = new efw(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        m = new efw(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction26;
        } else {
            accessibilityAction = null;
        }
        new efw(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction25;
        } else {
            accessibilityAction2 = null;
        }
        new efw(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            accessibilityAction3 = accessibilityAction24;
        } else {
            accessibilityAction3 = null;
        }
        new efw(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction23;
        } else {
            accessibilityAction4 = null;
        }
        new efw(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
        new efw(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        new efw(accessibilityAction5, R.id.accessibilityActionSetProgress, null, null, egf.class);
        accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        new efw(accessibilityAction6, R.id.accessibilityActionMoveWindow, null, null, egd.class);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction7 = accessibilityAction22;
        } else {
            accessibilityAction7 = null;
        }
        new efw(accessibilityAction7, R.id.accessibilityActionShowTooltip, null, null, null);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction8 = accessibilityAction21;
        } else {
            accessibilityAction8 = null;
        }
        new efw(accessibilityAction8, R.id.accessibilityActionHideTooltip, null, null, null);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            accessibilityAction9 = accessibilityAction20;
        } else {
            accessibilityAction9 = null;
        }
        new efw(accessibilityAction9, R.id.accessibilityActionPressAndHold, null, null, null);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction10 = accessibilityAction19;
        } else {
            accessibilityAction10 = null;
        }
        new efw(accessibilityAction10, R.id.accessibilityActionImeEnter, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            accessibilityAction11 = accessibilityAction18;
        } else {
            accessibilityAction11 = null;
        }
        new efw(accessibilityAction11, R.id.ALT, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction12 = accessibilityAction17;
        } else {
            accessibilityAction12 = null;
        }
        new efw(accessibilityAction12, R.id.CTRL, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction13 = accessibilityAction16;
        } else {
            accessibilityAction13 = null;
        }
        new efw(accessibilityAction13, R.id.FUNCTION, null, null, null);
        if (Build.VERSION.SDK_INT >= 33) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction14 = accessibilityAction15;
        } else {
            accessibilityAction14 = null;
        }
        new efw(accessibilityAction14, R.id.KEYCODE_0, null, null, null);
        if (Build.VERSION.SDK_INT >= 34) {
            accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }
        n = new efw(accessibilityAction27, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public efw(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.o).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.o).getLabel();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof efw) || !this.o.equals(((efw) obj).o)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String f2 = efx.f(this.p);
        if (f2.equals("ACTION_UNKNOWN") && b() != null) {
            f2 = b().toString();
        }
        sb.append(f2);
        return sb.toString();
    }

    private efw(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public efw(Object obj, int i2, CharSequence charSequence, egi egiVar, Class cls) {
        this.p = i2;
        this.r = egiVar;
        this.o = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.q = cls;
    }
}
