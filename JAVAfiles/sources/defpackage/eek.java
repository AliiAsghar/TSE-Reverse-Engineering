package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eek {
    private static WeakHashMap b = null;
    private static Field c = null;
    private static boolean d = false;
    public static final int[] a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final edv e = new edv();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT < 29) {
            if (d) {
                return null;
            }
            if (c == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    c = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    d = true;
                    return null;
                }
            }
            Object obj = c.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        }
        return eee.a(view);
    }

    public static View b(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) eed.b(view, i);
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static ecl c(View view) {
        View.AccessibilityDelegate a2 = a(view);
        if (a2 == null) {
            return null;
        }
        if (a2 instanceof eck) {
            return ((eck) a2).a;
        }
        return new ecl(a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ecv d(View view, ecv ecvVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + ecvVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return eeg.a(view, ecvVar);
        }
        edi ediVar = (edi) view.getTag(R.id.tag_on_receive_content_listener);
        if (ediVar != null) {
            ecv a2 = ediVar.a(view, ecvVar);
            if (a2 == null) {
                return null;
            }
            return view.a(a2);
        }
        return view.a(ecvVar);
    }

    public static efo e(View view, efo efoVar) {
        WindowInsets e2 = efoVar.e();
        if (e2 != null) {
            WindowInsets a2 = edx.a(view, e2);
            if (!a2.equals(e2)) {
                return efo.p(a2, view);
            }
        }
        return efoVar;
    }

    public static efo f(View view, efo efoVar) {
        WindowInsets e2 = efoVar.e();
        if (e2 != null) {
            WindowInsets b2 = edx.b(view, e2);
            if (!b2.equals(e2)) {
                return efo.p(b2, view);
            }
        }
        return efoVar;
    }

    public static CharSequence g(View view) {
        return (CharSequence) new eds(CharSequence.class).d(view);
    }

    public static List h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void i(View view, efw efwVar) {
        j(view);
        x(efwVar.a(), view);
        h(view).add(efwVar);
        k(view, 0);
    }

    public static void j(View view) {
        ecl c2 = c(view);
        if (c2 == null) {
            c2 = new ecl();
        }
        n(view, c2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (g(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z) {
                if (i == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(32);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(g(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            if (true != z) {
                i2 = 2048;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            obtain2.setEventType(i2);
            obtain2.setContentChangeTypes(i);
            if (z) {
                obtain2.getText().add(g(view));
                y(view);
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    public static void l(View view, int i) {
        x(i, view);
        k(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            eee.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void n(View view, ecl eclVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (eclVar == null && (a(view) instanceof eck)) {
            eclVar = new ecl();
        }
        y(view);
        if (eclVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = eclVar.F;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void o(View view, CharSequence charSequence) {
        new eds(CharSequence.class).e(view, charSequence);
        if (charSequence != null) {
            edv edvVar = e;
            WeakHashMap weakHashMap = edvVar.a;
            boolean z = false;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(edvVar);
            if (view.isAttachedToWindow()) {
                edvVar.a(view);
                return;
            }
            return;
        }
        edv edvVar2 = e;
        edvVar2.a.remove(view);
        view.removeOnAttachStateChangeListener(edvVar2);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(edvVar2);
    }

    public static void p(View view, String[] strArr, edi ediVar) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            eeg.b(view, strArr, ediVar);
            return;
        }
        String[] strArr2 = null;
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z2 = true;
        if (ediVar != null) {
            if (strArr != null) {
                z = true;
            } else {
                z = false;
            }
            d.t(z, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i].startsWith("*")) {
                    z2 = false;
                    break;
                }
                i++;
            }
            d.t(z2, "A MIME type set here must not start with *: ".concat(String.valueOf(Arrays.toString(strArr))));
            strArr2 = strArr;
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr2);
        view.setTag(R.id.tag_on_receive_content_listener, ediVar);
    }

    public static void q(View view, CharSequence charSequence) {
        new edt(CharSequence.class).e(view, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        eej c2 = eej.c(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c2.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!eej.a.isEmpty()) {
                synchronized (eej.a) {
                    if (c2.b == null) {
                        c2.b = new WeakHashMap();
                    }
                    int size = eej.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) eej.a.get(size)).get();
                        if (view2 == null) {
                            eej.a.remove(size);
                        } else {
                            c2.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                c2.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View b2 = c2.b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (b2 != null && !KeyEvent.isModifierKey(keyCode)) {
                c2.a().put(keyCode, new WeakReference(b2));
            }
        }
        if (b2 == null) {
            return false;
        }
        return true;
    }

    public static boolean s(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        eej c2 = eej.c(view);
        WeakReference weakReference = c2.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        c2.c = new WeakReference(keyEvent);
        SparseArray a2 = c2.a();
        WeakReference weakReference2 = null;
        if (keyEvent.getAction() == 1 && (indexOfKey = a2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = (WeakReference) a2.valueAt(indexOfKey);
            a2.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = (WeakReference) a2.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 == null || !view2.isAttachedToWindow()) {
            return true;
        }
        eej.d(view2);
        return true;
    }

    public static String[] t(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return eeg.c(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void u(View view, efw efwVar, egi egiVar) {
        if (egiVar == null) {
            l(view, efwVar.a());
        } else {
            i(view, new efw(null, efwVar.p, null, egiVar, efwVar.q));
        }
    }

    @Deprecated
    public static efu v(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        efu efuVar = (efu) b.get(view);
        if (efuVar == null) {
            efu efuVar2 = new efu(view);
            b.put(view, efuVar2);
            return efuVar2;
        }
        return efuVar;
    }

    public static void w(View view, efu efuVar) {
        eeb.a(view, fo$$ExternalSyntheticApiModelOutline0.m388m(efuVar.a));
    }

    private static void x(int i, View view) {
        List h = h(view);
        for (int i2 = 0; i2 < h.size(); i2++) {
            if (((efw) h.get(i2)).a() == i) {
                h.remove(i2);
                return;
            }
        }
    }

    private static void y(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }
}
