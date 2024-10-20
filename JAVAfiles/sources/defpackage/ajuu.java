package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import j$.util.Objects;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajuu {
    public static final String a = "ajuu";
    static Bundle b = null;
    public static Bundle c = null;
    public static Bundle d = null;
    public static Bundle e = null;
    public static Bundle f = null;
    public static Bundle g = null;
    public static Bundle h = null;
    public static Bundle i = null;
    public static Bundle j = null;
    static Bundle k = null;
    public static int l = 1;
    public static int m;
    public static int n;
    private static ajuu q;
    private static ContentObserver r;
    private static int s;
    private static boolean t;
    Bundle o;
    final EnumMap p;

    private ajuu(Context context) {
        Object obj;
        this.o = null;
        EnumMap enumMap = new EnumMap(ajus.class);
        this.p = enumMap;
        Bundle bundle = this.o;
        if (bundle == null || bundle.isEmpty()) {
            try {
                this.o = context.getContentResolver().call(g(), "getOverlayConfig", (String) null, (Bundle) null);
                enumMap.clear();
                String str = a;
                Bundle bundle2 = this.o;
                if (bundle2 != null) {
                    obj = Integer.valueOf(bundle2.size());
                } else {
                    obj = "(null)";
                }
                Log.i(str, hht.c(obj, "PartnerConfigsBundle="));
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "Fail to get config from suw provider");
            }
        }
        if (s(context)) {
            if (r != null) {
                try {
                    context.getContentResolver().unregisterContentObserver(r);
                    r = null;
                } catch (IllegalArgumentException | NullPointerException | SecurityException e2) {
                    Log.w(a, "Failed to unregister content observer: ".concat(e2.toString()));
                }
            }
            Uri g2 = g();
            try {
                r = new ajut();
                context.getContentResolver().registerContentObserver(g2, true, r);
            } catch (IllegalArgumentException | NullPointerException | SecurityException e3) {
                Log.w(a, "Failed to register content observer for " + String.valueOf(g2) + ": " + e3.toString());
            }
        }
    }

    private static float A(Context context, TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    public static Activity e(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }

    public static Uri g() {
        return new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").build();
    }

    public static synchronized ajuu h(Context context) {
        boolean z;
        ajuu ajuuVar;
        synchronized (ajuu.class) {
            Configuration configuration = context.getResources().getConfiguration();
            boolean z2 = true;
            if (q == null) {
                if (!n(context) || !ajgl.x()) {
                    z2 = false;
                }
                t = z2;
                s = configuration.uiMode & 48;
                l = configuration.orientation;
                n = configuration.screenWidthDp;
                m = configuration.screenHeightDp;
            } else {
                if (s(context) && (configuration.uiMode & 48) != s) {
                    z = true;
                } else {
                    z = false;
                }
                if (!n(context) || !ajgl.x()) {
                    z2 = false;
                }
                if (z || z2 != t || configuration.orientation != l || configuration.screenWidthDp != n || configuration.screenHeightDp != m) {
                    s = configuration.uiMode & 48;
                    l = configuration.orientation;
                    m = configuration.screenHeightDp;
                    n = configuration.screenWidthDp;
                    k();
                }
                ajuuVar = q;
            }
            q = new ajuu(context);
            ajuuVar = q;
        }
        return ajuuVar;
    }

    public static synchronized void k() {
        synchronized (ajuu.class) {
            q = null;
            b = null;
            c = null;
            d = null;
            e = null;
            f = null;
            h = null;
            j = null;
            k = null;
            i = null;
        }
    }

    public static boolean n(Context context) {
        if (h == null) {
            try {
                h = context.getContentResolver().call(g(), "isEmbeddedActivityOnePaneEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard one-pane support in embedded activity status unknown; return as false.");
                h = null;
                return false;
            }
        }
        Bundle bundle = h;
        if (bundle == null || !bundle.getBoolean("isEmbeddedActivityOnePaneEnabled", false)) {
            return false;
        }
        return true;
    }

    public static boolean o(Context context) {
        if (g == null) {
            try {
                g = context.getContentResolver().call(g(), "isFontWeightEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "Font weight supporting status unknown; return as false.");
                g = null;
                return false;
            }
        }
        Bundle bundle = g;
        if (bundle == null || !bundle.getBoolean("isFontWeightEnabled", true)) {
            return false;
        }
        return true;
    }

    public static boolean p(Context context) {
        Bundle bundle = j;
        if (bundle == null || bundle.isEmpty()) {
            try {
                j = context.getContentResolver().call(g(), "isForceTwoPaneEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "isForceTwoPaneEnabled status is unknown; return as false.");
            }
        }
        Bundle bundle2 = j;
        if (bundle2 == null || bundle2.isEmpty()) {
            return false;
        }
        return j.getBoolean("isForceTwoPaneEnabled", false);
    }

    public static boolean q(Context context) {
        Bundle bundle = k;
        if (bundle == null || bundle.isEmpty()) {
            try {
                Activity e2 = e(context);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("isSetupFlow", ajgl.v(e2.getIntent()));
                k = context.getContentResolver().call(g(), "isGlifExpressiveEnabled", (String) null, bundle2);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "isGlifExpressiveEnabled status is unknown; return as false.");
            }
        }
        Bundle bundle3 = k;
        if (bundle3 == null || bundle3.isEmpty()) {
            return false;
        }
        return k.getBoolean("isGlifExpressiveEnabled", false);
    }

    public static boolean s(Context context) {
        if (b == null) {
            try {
                b = context.getContentResolver().call(g(), "isSuwDayNightEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard DayNight supporting status unknown; return as false.");
                b = null;
                return false;
            }
        }
        Bundle bundle = b;
        if (bundle == null || !bundle.getBoolean("isSuwDayNightEnabled", false)) {
            return false;
        }
        return true;
    }

    public static boolean t(Context context) {
        if (f == null) {
            try {
                f = context.getContentResolver().call(g(), "isFullDynamicColorEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard full dynamic color supporting status unknown; return as false.");
                f = null;
                return false;
            }
        }
        Bundle bundle = f;
        if (bundle == null || !bundle.getBoolean("isFullDynamicColorEnabled", false)) {
            return false;
        }
        return true;
    }

    public static boolean u(Context context) {
        if (c == null) {
            try {
                c = context.getContentResolver().call(g(), "isExtendedPartnerConfigEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard extended partner configs supporting status unknown; return as false.");
                c = null;
                return false;
            }
        }
        Bundle bundle = c;
        if (bundle == null || !bundle.getBoolean("isExtendedPartnerConfigEnabled", false)) {
            return false;
        }
        return true;
    }

    static final ajuv v(Context context, ajuv ajuvVar) {
        String resourceTypeName;
        String concat;
        int identifier;
        try {
            resourceTypeName = ajuvVar.d.getResourceTypeName(ajuvVar.c);
            concat = ajuvVar.b.concat("_embedded_activity");
            identifier = ajuvVar.d.getIdentifier(concat, resourceTypeName, ajuvVar.a);
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
        }
        if (identifier != 0) {
            Log.i(a, a.cp(concat, "use embedded activity resource:"));
            return new ajuv(ajuvVar.a, concat, identifier, ajuvVar.d);
        }
        Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.setupwizard");
        int identifier2 = resourcesForApplication.getIdentifier(concat, resourceTypeName, "com.google.android.setupwizard");
        if (identifier2 != 0) {
            return new ajuv("com.google.android.setupwizard", concat, identifier2, resourcesForApplication);
        }
        return ajuvVar;
    }

    static final ajuv w(Context context, ajuv ajuvVar) {
        if (context != null) {
            try {
                String resourceTypeName = ajuvVar.d.getResourceTypeName(ajuvVar.c);
                String concat = ajuvVar.b.concat("_two_pane");
                int identifier = ajuvVar.d.getIdentifier(concat, resourceTypeName, ajuvVar.a);
                if (identifier != 0) {
                    Log.i(a, a.cp(concat, "two pane resource="));
                    return new ajuv(ajuvVar.a, concat, identifier, ajuvVar.d);
                }
                Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.setupwizard");
                int identifier2 = resourcesForApplication.getIdentifier(concat, resourceTypeName, "com.google.android.setupwizard");
                if (identifier2 != 0) {
                    return new ajuv("com.google.android.setupwizard", concat, identifier2, resourcesForApplication);
                }
            } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            }
        }
        return ajuvVar;
    }

    static final ajuv x(ajuv ajuvVar) {
        try {
            if (Objects.equals(ajuvVar.a, "com.google.android.setupwizard")) {
                String resourceTypeName = ajuvVar.d.getResourceTypeName(ajuvVar.c);
                String concat = ajuvVar.b.concat("_expressive");
                int identifier = ajuvVar.d.getIdentifier(concat, resourceTypeName, ajuvVar.a);
                if (identifier != 0) {
                    Log.i(a, a.cp(concat, "use expressive resource:"));
                    return new ajuv(ajuvVar.a, concat, identifier, ajuvVar.d);
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        return ajuvVar;
    }

    static final ajuv y(ajuv ajuvVar) {
        try {
            if (Objects.equals(ajuvVar.a, "com.google.android.setupwizard")) {
                String resourceTypeName = ajuvVar.d.getResourceTypeName(ajuvVar.c);
                String concat = ajuvVar.b.concat("_material_you");
                int identifier = ajuvVar.d.getIdentifier(concat, resourceTypeName, ajuvVar.a);
                if (identifier != 0) {
                    Log.i(a, a.cp(concat, "use material you resource:"));
                    return new ajuv(ajuvVar.a, concat, identifier, ajuvVar.d);
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        return ajuvVar;
    }

    public final float a(Context context, ajus ajusVar) {
        return b(context, ajusVar, brg.a);
    }

    public final float b(Context context, ajus ajusVar, float f2) {
        if (ajusVar.bz == 6) {
            if (!this.p.containsKey(ajusVar)) {
                try {
                    ajuv i2 = i(context, ajusVar.by);
                    Resources resources = i2.d;
                    int i3 = i2.c;
                    resources.getDimension(i3);
                    TypedValue typedValue = new TypedValue();
                    resources.getValue(i3, typedValue, true);
                    if (typedValue.type == 5) {
                        this.p.put((EnumMap) ajusVar, (ajus) typedValue);
                        return A(context, (TypedValue) this.p.get(ajusVar));
                    }
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i3) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
                } catch (Resources.NotFoundException | NullPointerException unused) {
                    return f2;
                }
            }
            return A(context, (TypedValue) this.p.get(ajusVar));
        }
        throw new IllegalArgumentException("Not a dimension resource");
    }

    public final int c(Context context, ajus ajusVar) {
        if (ajusVar.bz == 3) {
            if (!this.p.containsKey(ajusVar)) {
                int i2 = 0;
                try {
                    ajuv i3 = i(context, ajusVar.by);
                    Resources resources = i3.d;
                    int i4 = i3.c;
                    TypedValue typedValue = new TypedValue();
                    resources.getValue(i4, typedValue, true);
                    if (typedValue.type == 1 && typedValue.data == 0) {
                        return 0;
                    }
                    i2 = resources.getColor(i4, null);
                    this.p.put((EnumMap) ajusVar, (ajus) Integer.valueOf(i2));
                    return i2;
                } catch (NullPointerException unused) {
                    return i2;
                }
            }
            return ((Integer) this.p.get(ajusVar)).intValue();
        }
        throw new IllegalArgumentException("Not a color resource");
    }

    public final int d(Context context, ajus ajusVar, int i2) {
        if (ajusVar.bz == 1) {
            if (!this.p.containsKey(ajusVar)) {
                try {
                    ajuv i3 = i(context, ajusVar.by);
                    i2 = i3.d.getInteger(i3.c);
                    this.p.put((EnumMap) ajusVar, (ajus) Integer.valueOf(i2));
                    return i2;
                } catch (Resources.NotFoundException | NullPointerException unused) {
                    return i2;
                }
            }
            return ((Integer) this.p.get(ajusVar)).intValue();
        }
        throw new IllegalArgumentException("Not a integer resource");
    }

    public final Drawable f(Context context, ajus ajusVar) {
        if (ajusVar.bz == 4) {
            if (!this.p.containsKey(ajusVar)) {
                Drawable drawable = null;
                try {
                    ajuv i2 = i(context, ajusVar.by);
                    Resources resources = i2.d;
                    int i3 = i2.c;
                    TypedValue typedValue = new TypedValue();
                    resources.getValue(i3, typedValue, true);
                    if (typedValue.type == 1 && typedValue.data == 0) {
                        return null;
                    }
                    drawable = resources.getDrawable(i3, null);
                    this.p.put((EnumMap) ajusVar, (ajus) drawable);
                    return drawable;
                } catch (Resources.NotFoundException | NullPointerException unused) {
                    return drawable;
                }
            }
            return (Drawable) this.p.get(ajusVar);
        }
        throw new IllegalArgumentException("Not a drawable resource");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        if (r0.getBoolean("IsMaterialYouStyleEnabled", false) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        r6 = y(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (q(r5) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
    
        if (u(r5) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.ajuv i(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            android.os.Bundle r0 = r4.o
            android.os.Bundle r0 = r0.getBundle(r6)
            android.os.Bundle r1 = r4.o
            java.lang.String r2 = "fallbackConfig"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 == 0) goto L17
            android.os.Bundle r6 = r1.getBundle(r6)
            r0.putBundle(r2, r6)
        L17:
            ajuv r6 = defpackage.ajuv.a(r5, r0)
            boolean r0 = defpackage.ajgl.x()
            if (r0 == 0) goto L42
            android.app.Activity r0 = e(r5)     // Catch: java.lang.IllegalArgumentException -> L3b
            boolean r1 = n(r5)
            if (r1 == 0) goto L42
            hgi r1 = defpackage.hgi.w(r0)
            boolean r0 = r1.r(r0)
            if (r0 == 0) goto L42
            ajuv r6 = v(r5, r6)
            goto Lb9
        L3b:
            java.lang.String r0 = defpackage.ajuu.a
            java.lang.String r1 = "Not a Activity instance in parent tree"
            android.util.Log.w(r0, r1)
        L42:
            boolean r0 = defpackage.ajgl.x()
            if (r0 == 0) goto L53
            boolean r0 = p(r5)
            if (r0 == 0) goto L53
            ajuv r6 = w(r5, r6)
            goto Lb9
        L53:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L64
            boolean r0 = q(r5)
            if (r0 == 0) goto L64
            ajuv r6 = x(r6)
            goto Lb9
        L64:
            boolean r0 = defpackage.ajgl.w()
            if (r0 == 0) goto Lb9
            android.os.Bundle r0 = defpackage.ajuu.d
            java.lang.String r1 = "IsMaterialYouStyleEnabled"
            if (r0 == 0) goto L76
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9a
        L76:
            r0 = 0
            android.content.ContentResolver r2 = r5.getContentResolver()     // Catch: java.lang.Throwable -> Lb0
            android.net.Uri r3 = g()     // Catch: java.lang.Throwable -> Lb0
            android.os.Bundle r2 = r2.call(r3, r1, r0, r0)     // Catch: java.lang.Throwable -> Lb0
            defpackage.ajuu.d = r2     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9a
            boolean r2 = defpackage.ajgl.w()     // Catch: java.lang.Throwable -> Lb0
            if (r2 != 0) goto L9a
            boolean r0 = u(r5)     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto Lb9
            goto Lab
        L9a:
            android.os.Bundle r0 = defpackage.ajuu.d
            if (r0 == 0) goto La5
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Lab
        La5:
            boolean r0 = q(r5)
            if (r0 == 0) goto Lb9
        Lab:
            ajuv r6 = y(r6)
            goto Lb9
        Lb0:
            java.lang.String r1 = defpackage.ajuu.a
            java.lang.String r2 = "SetupWizard Material You configs supporting status unknown; return as false."
            android.util.Log.w(r1, r2)
            defpackage.ajuu.d = r0
        Lb9:
            android.content.res.Resources r0 = r6.d
            android.content.res.Configuration r1 = r0.getConfiguration()
            boolean r5 = s(r5)
            if (r5 != 0) goto Le6
            int r5 = r1.uiMode
            r5 = r5 & 48
            r2 = 32
            if (r5 != r2) goto Le6
            if (r6 != 0) goto Ld7
            java.lang.String r5 = defpackage.ajuu.a
            java.lang.String r0 = "resourceEntry is null, skip to force day mode."
            android.util.Log.w(r5, r0)
            goto Le6
        Ld7:
            int r5 = r1.uiMode
            r5 = r5 & (-49)
            r5 = r5 | 16
            r1.uiMode = r5
            android.util.DisplayMetrics r5 = r0.getDisplayMetrics()
            r0.updateConfiguration(r1, r5)
        Le6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajuu.i(android.content.Context, java.lang.String):ajuv");
    }

    public final String j(Context context, ajus ajusVar) {
        if (ajusVar.bz == 5) {
            if (!this.p.containsKey(ajusVar)) {
                try {
                    ajuv i2 = i(context, ajusVar.by);
                    String string = i2.d.getString(i2.c);
                    try {
                        this.p.put((EnumMap) ajusVar, (ajus) string);
                        return string;
                    } catch (NullPointerException unused) {
                        return string;
                    }
                } catch (NullPointerException unused2) {
                    return null;
                }
            }
            return (String) this.p.get(ajusVar);
        }
        throw new IllegalArgumentException("Not a string resource");
    }

    public final boolean l(Context context, ajus ajusVar, boolean z) {
        if (ajusVar.bz == 2) {
            if (!this.p.containsKey(ajusVar)) {
                try {
                    ajuv i2 = i(context, ajusVar.by);
                    z = i2.d.getBoolean(i2.c);
                    this.p.put((EnumMap) ajusVar, (ajus) Boolean.valueOf(z));
                    return z;
                } catch (Resources.NotFoundException | NullPointerException unused) {
                    return z;
                }
            }
            return ((Boolean) this.p.get(ajusVar)).booleanValue();
        }
        throw new IllegalArgumentException("Not a bool resource");
    }

    public final boolean m() {
        Bundle bundle = this.o;
        if (bundle != null && !bundle.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean r(ajus ajusVar) {
        if (m() && this.o.containsKey(ajusVar.by)) {
            return true;
        }
        return false;
    }

    public final float z(Context context, ajus ajusVar) {
        if (ajusVar.bz == 7) {
            if (!this.p.containsKey(ajusVar)) {
                try {
                    ajuv i2 = i(context, ajusVar.by);
                    float fraction = i2.d.getFraction(i2.c, 1, 1);
                    try {
                        this.p.put((EnumMap) ajusVar, (ajus) Float.valueOf(fraction));
                        return fraction;
                    } catch (Resources.NotFoundException | NullPointerException unused) {
                        return fraction;
                    }
                } catch (Resources.NotFoundException | NullPointerException unused2) {
                    return brg.a;
                }
            }
            return ((Float) this.p.get(ajusVar)).floatValue();
        }
        throw new IllegalArgumentException("Not a fraction resource");
    }
}
