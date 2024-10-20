package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aska {
    public static asjy a;
    public static ComponentName b;
    private static final List c;
    private static volatile Boolean d;
    private static final Object e;

    static {
        LinkedList linkedList = new LinkedList();
        c = linkedList;
        e = new Object();
        linkedList.add(askb.class);
        linkedList.add(askc.class);
        linkedList.add(askf.class);
        linkedList.add(askg.class);
        linkedList.add(askk.class);
        linkedList.add(askn.class);
        linkedList.add(askd.class);
        linkedList.add(aske.class);
        linkedList.add(askh.class);
        linkedList.add(aski.class);
        linkedList.add(askp.class);
        linkedList.add(askm.class);
        linkedList.add(asko.class);
        linkedList.add(askl.class);
    }

    public static boolean a(Context context) {
        asjy asklVar;
        asjy asjyVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package ".concat(String.valueOf(context.getPackageName())));
            return false;
        }
        b = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.packageName;
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                asjyVar = (asjy) ((Class) it.next()).newInstance();
            } catch (Exception unused) {
                asjyVar = null;
            }
            if (asjyVar != null && asjyVar.a().contains(str)) {
                a = asjyVar;
                break;
            }
        }
        if (a == null) {
            if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                a = new askn();
            } else if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
                a = new askp();
            } else if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                a = new askh();
            } else if (Build.MANUFACTURER.equalsIgnoreCase("VIVO")) {
                a = new askm();
            } else if (Build.MANUFACTURER.equalsIgnoreCase("ZTE")) {
                a = new asko();
            } else {
                if (!Build.MANUFACTURER.equalsIgnoreCase("TECNO") && !Build.MANUFACTURER.equalsIgnoreCase("INFINIX") && !Build.MANUFACTURER.equalsIgnoreCase("ITEL") && !Build.MANUFACTURER.equalsIgnoreCase("TECNO MOBILE")) {
                    asklVar = new askb(1);
                } else {
                    asklVar = new askl();
                }
                a = asklVar;
            }
        }
        return true;
    }

    public static boolean b(Context context) {
        int i;
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    String str = null;
                    int i2 = 0;
                    while (i2 < 3) {
                        try {
                            i = i2 + 1;
                            Log.i("ShortcutBadger", "Checking if platform supports badge counters, attempt " + String.format("%d/%d.", Integer.valueOf(i), 3));
                        } catch (Exception e2) {
                            str = e2.getMessage();
                            i2++;
                        }
                        if (a(context)) {
                            a.b(context, b, 0);
                            d = true;
                            Log.i("ShortcutBadger", "Badge counter is supported in this platform.");
                            break;
                        }
                        str = "Failed to initialize the badge counter.";
                        i2 = i;
                    }
                    if (d == null) {
                        Log.w("ShortcutBadger", a.cp(str, "Badge counter seems not supported in this platform: "));
                        d = false;
                    }
                }
            }
        }
        return d.booleanValue();
    }
}
