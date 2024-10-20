package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Builder b(Notification.Builder builder, String str) {
        return builder.setCategory("call");
    }

    public static float c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!k(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public static int d(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static int e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!k(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    public static int f(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence h(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        if (text == null) {
            return typedArray.getText(i2);
        }
        return text;
    }

    public static String i(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    public static boolean j(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean k(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static CharSequence[] l(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        if (textArray == null) {
            return typedArray.getTextArray(i2);
        }
        return textArray;
    }

    public static int m(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static boolean n(TypedArray typedArray, XmlPullParser xmlPullParser, boolean z) {
        if (!k(xmlPullParser, "autoMirrored")) {
            return z;
        }
        return typedArray.getBoolean(5, z);
    }

    public static int o(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!k(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    public static ColorStateList p(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!k(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        if (typedValue.type != 2) {
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return ColorStateList.valueOf(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(1, 0);
            int i = eah.a;
            try {
                return eah.a(resources, resources.getXml(resourceId), theme);
            } catch (Exception e) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                return null;
            }
        }
        typedValue.toString();
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
    }

    public static float q(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= brg.a) {
            return brg.a;
        }
        int min = Math.min((int) (200.0f * f), 199);
        float f2 = f - (min * 0.005f);
        float f3 = fArr[min];
        return f3 + ((f2 / 0.005f) * (fArr[min + 1] - f3));
    }

    public static final eoi r(iba ibaVar, enh enhVar, String str, Bundle bundle) {
        Bundle b = ibaVar.b(str);
        List list = eog.a;
        eoi eoiVar = new eoi(str, eob.b(b, bundle));
        eoiVar.b(ibaVar, enhVar);
        u(ibaVar, enhVar);
        return eoiVar;
    }

    public static final void s(eor eorVar, iba ibaVar, enh enhVar) {
        enhVar.getClass();
        eoi eoiVar = (eoi) eorVar.j("androidx.lifecycle.savedstate.vm.tag");
        if (eoiVar != null && !eoiVar.b) {
            eoiVar.b(ibaVar, enhVar);
            u(ibaVar, enhVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0174, code lost:
    
        if (r12.size() <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0176, code lost:
    
        r0 = new defpackage.fvq((java.util.List) r12, (java.util.List) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017d, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018f, code lost:
    
        if (r13 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0192, code lost:
    
        if (r13 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0194, code lost:
    
        r15 = r23;
        r1 = new android.graphics.LinearGradient(r14, r15, r16, r17, (int[]) r0.b, (float[]) r0.a, defpackage.dys.f(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e3, code lost:
    
        r0 = new defpackage.arrt(r1, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ad, code lost:
    
        r1 = new android.graphics.SweepGradient(r22, r5, (int[]) r0.b, (float[]) r0.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c6, code lost:
    
        if (r21 <= defpackage.brg.a) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c8, code lost:
    
        r1 = new android.graphics.RadialGradient(r22, r5, r21, (int[]) r0.b, (float[]) r0.a, defpackage.dys.f(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f2, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0181, code lost:
    
        if (r18 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0183, code lost:
    
        r0 = new defpackage.fvq(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0189, code lost:
    
        r0 = new defpackage.fvq(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017c, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.arrt t(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyv.t(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):arrt");
    }

    private static final void u(iba ibaVar, enh enhVar) {
        eng a = enhVar.a();
        if (a != eng.INITIALIZED && !a.a(eng.STARTED)) {
            enhVar.c(new end(enhVar, ibaVar, 0));
        } else {
            ibaVar.d(enc.class);
        }
    }
}
