package defpackage;

import android.animation.TimeInterpolator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import j$.time.Instant;
import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajgk {
    public static Instant A(Parcel parcel, int i) {
        char c = (char) (i >> 16);
        if (c == '\f') {
            return Instant.ofEpochSecond(parcel.readLong(), parcel.readInt());
        }
        throw new abuv("Expected size 12 got " + ((int) c) + " (0x" + Integer.toHexString(c) + ")", parcel);
    }

    public static Enum B(Parcel parcel, int i, Class cls) {
        int length;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null && (length = enumArr.length) != 0) {
            int N = abhi.N(parcel, i);
            if (N >= 0 && N < length) {
                return enumArr[N];
            }
            return enumArr[0];
        }
        throw new abuv("Unexpected enum without labels ".concat(String.valueOf(cls.getName())), parcel);
    }

    public static void C(Parcel parcel, int i, Enum r2) {
        abhi.m(parcel, i, r2.ordinal());
    }

    public static void D(Parcel parcel, int i, Instant instant) {
        parcel.writeInt(i | 786432);
        parcel.writeLong(instant.getEpochSecond());
        parcel.writeInt(instant.getNano());
    }

    public static /* synthetic */ String E(int i) {
        if (i != 1) {
            return "GROUP";
        }
        return "ONE_TO_ONE";
    }

    public static final akyr F(Class cls, String str, arqg arqgVar, arqg arqgVar2) {
        aoad aoadVar = new aoad(adai.a);
        aoadVar.z().h(albo.ap("proto_type"), str);
        return new akyr(cls, aoadVar.y(), arqgVar, arqgVar2);
    }

    private static float G(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= brg.a && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    private static String H(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean I(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    private static final ajvb J(XmlPullParser xmlPullParser, Context context) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            try {
                next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("FooterButton")) {
                        return new ajvb(context, asAttributeSet);
                    }
                    throw new InflateException(xmlPullParser.getPositionDescription() + ": not a FooterButton");
                }
            } catch (IOException e) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } while (next != 1);
        throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Outline outline, Path path) {
        outline.setConvexPath(path);
    }

    public static double b(double d) {
        double d2 = d % 360.0d;
        if (d2 < 0.0d) {
            return d2 + 360.0d;
        }
        return d2;
    }

    public static int c(double d) {
        if (d < 0.0d) {
            return -1;
        }
        if (d == 0.0d) {
            return 0;
        }
        return 1;
    }

    public static double[] d(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        return new double[]{d2 + d4 + d6, d7 + d8 + d9, (d * dArr5[0]) + (d3 * dArr5[1]) + (d5 * dArr5[2])};
    }

    public static boolean e() {
        String str;
        String str2 = Build.MANUFACTURER;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.ENGLISH);
        } else {
            str = "";
        }
        return str.equals("meizu");
    }

    public static void f(Window window, boolean z) {
        new efu(window, window.getDecorView()).b(z);
    }

    public static int g(Context context, int i, int i2) {
        TypedValue h = h(context, i);
        if (h != null && h.type == 16) {
            return h.data;
        }
        return i2;
    }

    public static TypedValue h(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue i(Context context, int i, String str) {
        TypedValue h = h(context, i);
        if (h != null) {
            return h;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean j(Context context, int i, boolean z) {
        TypedValue h = h(context, i);
        if (h != null && h.type == 18) {
            if (h.data == 0) {
                return false;
            }
            return true;
        }
        return z;
    }

    public static final float k(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static TimeInterpolator l(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!I(valueOf, "cubic-bezier") && !I(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (I(valueOf, "cubic-bezier")) {
                String[] split = H(valueOf, "cubic-bezier").split(",");
                int length = split.length;
                if (length == 4) {
                    return new PathInterpolator(G(split, 0), G(split, 1), G(split, 2), G(split, 3));
                }
                throw new IllegalArgumentException(a.bV(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
            }
            if (I(valueOf, "path")) {
                String H = H(valueOf, "path");
                Path path = new Path();
                try {
                    dyw.b(dyw.c(H), path);
                    return new PathInterpolator(path);
                } catch (RuntimeException e) {
                    throw new RuntimeException("Error in parsing ".concat(String.valueOf(H)), e);
                }
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(valueOf)));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static float m(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static boolean n(float[] fArr) {
        float f = fArr[0];
        for (int i = 1; i < 4; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }

    public static final ajvb o(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            return J(xml, context);
        } finally {
            xml.close();
        }
    }

    public static void p(String str, String str2, int i, int i2) {
        boolean z;
        d.aB(str, String.format("%s cannot be null.", str2));
        int length = str.length();
        if (length <= i2 && length >= i) {
            z = true;
        } else {
            z = false;
        }
        r(z, String.format("Length of %s should be in the range [%s-%s]", str2, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "NOT_STARTED";
            case 2:
                return "BIND_FAILED";
            case 3:
                return "BINDING";
            case 4:
                return "CONNECTED";
            case 5:
                return "DISCONNECTED";
            case 6:
                return "SERVICE_NOT_USABLE";
            default:
                return "REBIND_REQUIRED";
        }
    }

    public static void r(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void s(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalStateException(str.concat(" must be called from the UI thread."));
        }
    }

    public static int t(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (RuntimeException e) {
            throw new ajsh("Invalid reading tag in XML for FileTransferInformation", e);
        }
    }

    public static int u(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (RuntimeException e) {
            throw new ajsh("Invalid tag in XML for MessageReceipt", e);
        }
    }

    public static Instant v(String str, String str2) {
        try {
            long a = advj.a(str2);
            if (a >= 0) {
                return Instant.ofEpochMilli(a);
            }
            throw new ajrx(str);
        } catch (ParseException e) {
            throw new ajrx(str, e);
        }
    }

    public static String w(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextText();
        } catch (RuntimeException e) {
            throw new ajsh("Invalid reading value in XML for FileTransferInformation", e);
        }
    }

    public static XmlPullParser x() {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        return newPullParser;
    }

    public static void y(XmlSerializer xmlSerializer, String str, String str2, String str3) {
        xmlSerializer.startTag(str, str2);
        xmlSerializer.text(str3);
        xmlSerializer.endTag(str, str2);
    }

    public static void z(String str, String str2) {
        if (str2 != null && !str2.trim().isEmpty()) {
        } else {
            throw new ajrx(str);
        }
    }
}
