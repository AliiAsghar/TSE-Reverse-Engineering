package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class egl {
    private static void a(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    @Deprecated
    public static InputConnection b(InputConnection inputConnection, EditorInfo editorInfo, egk egkVar) {
        d.aB(inputConnection, "inputConnection must be non-null");
        d.aB(editorInfo, "editorInfo must be non-null");
        return new egj(inputConnection, egkVar);
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        CharSequence subSequence;
        if (Build.VERSION.SDK_INT < 30) {
            dye.i(charSequence);
            if (Build.VERSION.SDK_INT >= 30) {
                eee.c(editorInfo, charSequence);
                return;
            }
            if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                i = editorInfo.initialSelEnd;
            } else {
                i = editorInfo.initialSelStart;
            }
            if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                i2 = editorInfo.initialSelStart;
            } else {
                i2 = editorInfo.initialSelEnd;
            }
            int length = charSequence.length();
            if (i >= 0 && i2 <= length) {
                int i4 = editorInfo.inputType & 4095;
                if (i4 != 129 && i4 != 225 && i4 != 18) {
                    if (length > 2048) {
                        int i5 = i2 - i;
                        int length2 = charSequence.length() - i2;
                        if (i5 > 1024) {
                            i3 = 0;
                        } else {
                            i3 = i5;
                        }
                        int i6 = 2048 - i3;
                        int min = Math.min(length2, i6 - Math.min(i, (int) (i6 * 0.8d)));
                        int min2 = Math.min(i, i6 - min);
                        int i7 = i - min2;
                        if (j(charSequence, i7, 0)) {
                            i7++;
                            min2--;
                        }
                        if (j(charSequence, (i2 + min) - 1, 1)) {
                            min--;
                        }
                        int i8 = min2 + i3;
                        if (i3 != i5) {
                            subSequence = TextUtils.concat(charSequence.subSequence(i7, i7 + min2), charSequence.subSequence(i2, min + i2));
                        } else {
                            subSequence = charSequence.subSequence(i7, min + i8 + i7);
                        }
                        a(editorInfo, subSequence, min2, i8);
                        return;
                    }
                    a(editorInfo, charSequence, i, i2);
                    return;
                }
                a(editorInfo, null, 0, 0);
                return;
            }
            a(editorInfo, null, 0, 0);
            return;
        }
        eee.c(editorInfo, charSequence);
    }

    public static void d(EditorInfo editorInfo, boolean z) {
        if (ebg.b()) {
            dbc$$ExternalSyntheticApiModelOutline0.m(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static int e(Context context, String str) {
        d.aB(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            if (new dzt(context).g()) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        Object obj;
        apuv apuvVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        eak eakVar = new eak(resources, theme2);
        synchronized (ean.b) {
            SparseArray sparseArray = (SparseArray) ean.a.get(eakVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (apuvVar = (apuv) sparseArray.get(i)) != null) {
                if (((Configuration) apuvVar.c).equals(eakVar.a.getConfiguration()) && (((theme = eakVar.b) == null && apuvVar.a == 0) || (theme != null && apuvVar.a == theme.hashCode()))) {
                    obj = apuvVar.b;
                } else {
                    sparseArray.remove(i);
                }
            }
            obj = null;
        }
        if (obj == null) {
            TypedValue c = ean.c();
            resources.getValue(i, c, true);
            if (c.type < 28 || c.type > 31) {
                try {
                    colorStateList = eah.a(resources, resources.getXml(i), theme2);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateList != null) {
                synchronized (ean.b) {
                    SparseArray sparseArray2 = (SparseArray) ean.a.get(eakVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        ean.a.put(eakVar, sparseArray2);
                    }
                    sparseArray2.append(i, new apuv(colorStateList, eakVar.a.getConfiguration(), theme2));
                }
                obj = colorStateList;
            } else {
                obj = resources.getColorStateList(i, theme2);
            }
        }
        return (ColorStateList) obj;
    }

    @Deprecated
    public static File[] g(Context context) {
        return context.getExternalFilesDirs(null);
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return i(context, broadcastReceiver, intentFilter, null);
    }

    public static Intent i(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            return bl$$ExternalSyntheticApiModelOutline0.m(context, broadcastReceiver, intentFilter, str, (Handler) null, 2);
        }
        return bl$$ExternalSyntheticApiModelOutline0.m(context, broadcastReceiver, intentFilter, str, (Handler) null, 0);
    }

    private static boolean j(CharSequence charSequence, int i, int i2) {
        if (i2 != 0) {
            return Character.isHighSurrogate(charSequence.charAt(i));
        }
        return Character.isLowSurrogate(charSequence.charAt(i));
    }
}
