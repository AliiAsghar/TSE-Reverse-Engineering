package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eae {
    public static final /* synthetic */ int a = 0;
    private static volatile List b;
    private static volatile dyp c;

    private eae() {
    }

    public static List a(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((dyl) Class.forName(string, false, eae.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static List b(Context context, int i) {
        List pinnedShortcuts;
        List dynamicShortcuts;
        List manifestShortcuts;
        List shortcuts;
        if (Build.VERSION.SDK_INT < 30) {
            ShortcutManager m343m = ead$$ExternalSyntheticApiModelOutline0.m343m(context.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m()));
            ArrayList arrayList = new ArrayList();
            if ((i & 1) != 0) {
                manifestShortcuts = m343m.getManifestShortcuts();
                arrayList.addAll(manifestShortcuts);
            }
            if ((i & 2) != 0) {
                dynamicShortcuts = m343m.getDynamicShortcuts();
                arrayList.addAll(dynamicShortcuts);
            }
            if ((i & 4) != 0) {
                pinnedShortcuts = m343m.getPinnedShortcuts();
                arrayList.addAll(pinnedShortcuts);
            }
            return ead.a(context, arrayList);
        }
        shortcuts = ead$$ExternalSyntheticApiModelOutline0.m343m(context.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m())).getShortcuts(i);
        return ead.a(context, shortcuts);
    }

    public static void c(Context context, List list) {
        ead$$ExternalSyntheticApiModelOutline0.m343m(context.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m())).removeDynamicShortcuts(list);
        e(context);
        Iterator it = a(context).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw null;
    }

    public static void d(Context context, List list) {
        if (Build.VERSION.SDK_INT < 30) {
            c(context, list);
            return;
        }
        ead$$ExternalSyntheticApiModelOutline0.m343m(context.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m())).removeLongLivedShortcuts(list);
        e(context);
        Iterator it = a(context).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw null;
    }

    public static void e(Context context) {
        if (c == null) {
            try {
                c = (dyp) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, eae.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (c == null) {
                c = new dyp();
            }
        }
    }
}
