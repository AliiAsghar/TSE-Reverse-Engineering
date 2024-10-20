package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agso implements aguc {
    public static final a b;
    private static volatile agso g;
    public final AccessibilityManager c;
    public final Application d;
    public volatile boolean e;
    private final aneo h = agtz.b;
    private volatile boolean i;
    private volatile boolean j;
    private volatile boolean k;
    private final alhr l;
    private ListenableFuture m;
    private ListenableFuture n;
    private final Set o;
    private final agyp p;
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils");
    private static final agyb f = agyd.a("screen_reader_min_version_for_lift_to_type", 60105832);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public final class a extends agzr {
    }

    static {
        a aVar = new a();
        b = aVar;
        agzt.c("TouchExplorationEnabled", aVar);
        new agsm();
        int i = agsk.a;
    }

    public agso(Context context) {
        ListenableFuture listenableFuture = aneh.a;
        this.m = listenableFuture;
        this.n = listenableFuture;
        this.o = alzz.L(4);
        this.p = new agsn();
        Application application = (Application) context.getApplicationContext();
        this.d = application;
        this.c = (AccessibilityManager) application.getSystemService("accessibility");
        albo.D(new ynw(this, 19));
        this.l = albo.D(new ynw(this, 20));
    }

    public static agso a(Context context) {
        agso agsoVar = g;
        if (agsoVar == null) {
            synchronized (agso.class) {
                agsoVar = g;
                if (agsoVar == null) {
                    agsoVar = new agso(context.getApplicationContext());
                    agsoVar.g();
                    agsoVar.c.addAccessibilityStateChangeListener(new agsl(agsoVar, 0));
                    agsoVar.c.addTouchExplorationStateChangeListener(new ajmw(agsoVar, 1));
                    agzy.a().f(agsoVar.p, agyq.class, agtz.a);
                    agub.a.a(agsoVar);
                    g = agsoVar;
                }
            }
        }
        return agsoVar;
    }

    public static void e(View view, CharSequence charSequence) {
        LocaleList locales;
        Locale locale;
        locales = view.getContext().getResources().getConfiguration().getLocales();
        locale = locales.get(0);
        view.setContentDescription(ahji.aK(locale, charSequence));
    }

    public final void b(int i) {
        c(this.d.getString(i, new Object[0]));
    }

    public final void c(CharSequence charSequence) {
        if (this.j && ((PowerManager) this.l.get()).isInteractive() && !TextUtils.isEmpty(charSequence)) {
            this.m.cancel(false);
            this.n.cancel(false);
            this.n = this.h.schedule(new adhc(this, ahji.aK(null, charSequence), 15, null), 0L, TimeUnit.MILLISECONDS);
            return;
        }
        ListenableFuture listenableFuture = aneh.a;
    }

    public final void d(View view) {
        if (this.j && view != null) {
            view.sendAccessibilityEvent(128);
        }
    }

    public final void f(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        if (z) {
            agzt.d(b);
            return;
        }
        a aVar = b;
        agzt.a(aVar);
        Class<?> cls = aVar.getClass();
        agzy a2 = agzy.a();
        ahbe b2 = agzy.b(agzy.c(cls));
        try {
            synchronized (cls) {
                agzu agzuVar = (agzu) a2.d.remove(cls);
                if (agzuVar != null) {
                    a2.e(agzuVar.getClass(), agzy.b, new agzw(a2.d, 0));
                }
            }
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        ResolveInfo resolveInfo;
        ApplicationInfo applicationInfo;
        PackageManager.PackageInfoFlags of;
        PackageManager.ApplicationInfoFlags of2;
        AccessibilityManager accessibilityManager = this.c;
        boolean z5 = this.j;
        this.e = accessibilityManager.isEnabled();
        if (this.e && this.c.isTouchExplorationEnabled()) {
            z = true;
        } else {
            z = false;
        }
        f(z);
        if (this.e && this.e && !this.c.getEnabledAccessibilityServiceList(1).isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.j = z2;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.c.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && !enabledAccessibilityServiceList.isEmpty()) {
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            while (true) {
                if (!it.hasNext() || (resolveInfo = it.next().getResolveInfo()) == null) {
                    break;
                }
                String str = resolveInfo.serviceInfo.packageName;
                Application application = this.d;
                PackageInfo packageInfo = null;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        PackageManager packageManager = application.getPackageManager();
                        of2 = PackageManager.ApplicationInfoFlags.of(128L);
                        applicationInfo = packageManager.getApplicationInfo(str, of2);
                    } else {
                        applicationInfo = application.getPackageManager().getApplicationInfo(str, 128);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    ((alvg) ((alvg) ahbj.a.i()).h("com/google/android/libraries/inputmethod/utils/PackageUtil", "getApplicationInfo", 50, "PackageUtil.java")).t("Package %s not found.", str);
                    applicationInfo = null;
                }
                Application application2 = this.d;
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        PackageManager packageManager2 = application2.getPackageManager();
                        of = PackageManager.PackageInfoFlags.of(0L);
                        packageInfo = packageManager2.getPackageInfo(str, of);
                    } else {
                        packageInfo = application2.getPackageManager().getPackageInfo(str, 0);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    ((alvg) ((alvg) ahbj.a.i()).h("com/google/android/libraries/inputmethod/utils/PackageUtil", "getPackageInfo", 31, "PackageUtil.java")).t("Package %s not found.", str);
                }
                if (applicationInfo == null || packageInfo == null) {
                    break;
                }
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.getBoolean("support_lift_to_type")) {
                    if (packageInfo.versionCode >= ((Long) f.b()).longValue()) {
                        z3 = true;
                    }
                }
            }
        }
        z3 = false;
        this.k = z3;
        float f2 = Settings.System.getFloat(this.d.getContentResolver(), "font_scale", 1.0f);
        if (Settings.Secure.getInt(this.d.getContentResolver(), "high_text_contrast_enabled", 0) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        alvg alvgVar = (alvg) ((alvg) a.c()).h("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils", "logA11ySettingsChangeEvents", 762, "AccessibilityUtils.java");
        Boolean valueOf = Boolean.valueOf(this.j);
        Boolean valueOf2 = Boolean.valueOf(this.i);
        Float valueOf3 = Float.valueOf(f2);
        Boolean valueOf4 = Boolean.valueOf(z4);
        alvgVar.K("A11y metrics. Screen reader activated %s, Touch exploration enabled %s, Font scale %f, High text contrast %s", valueOf, valueOf2, valueOf3, valueOf4);
        alvi alviVar = agzo.a;
        agzn.a.b(agsj.A11Y_SETTINGS_CHANGED, Boolean.valueOf(this.j), Boolean.valueOf(this.i), valueOf3, valueOf4);
        if (z5 != this.j) {
            synchronized (this.o) {
                arrayList = new ArrayList(this.o);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AccessibilityManager.AccessibilityStateChangeListener) arrayList.get(i)).onAccessibilityStateChanged(this.j);
            }
        }
    }

    public final void h(int i) {
        if (this.e && !this.j && i > 0) {
            this.m = this.h.schedule(new ebm(this, i, 16), 500L, TimeUnit.MILLISECONDS);
        }
    }
}
