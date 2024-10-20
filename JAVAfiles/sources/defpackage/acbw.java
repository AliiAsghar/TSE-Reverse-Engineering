package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.iid.MessengerCompat;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbw {
    static String a = null;
    static boolean b = false;
    static int c;
    static BroadcastReceiver d;
    private static final Pattern k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context e;
    final Map f = new tm();
    Messenger g;
    Messenger h;
    MessengerCompat i;
    PendingIntent j;

    public acbw(Context context) {
        this.e = context;
    }

    public static String b(Context context) {
        String str = a;
        if (str != null) {
            return str;
        }
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0);
        if (queryBroadcastReceivers != null) {
            Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
            while (it.hasNext()) {
                String str2 = it.next().activityInfo.packageName;
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str2) == 0) {
                    if (h(packageManager, str2)) {
                        break;
                    }
                } else {
                    Log.w("InstanceID", a.bW(str2, "Possible malicious package ", " declares com.google.iid.TOKEN_REQUEST without permission"));
                }
            }
        }
        Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
        if (!h(packageManager, "com.google.android.gms")) {
            Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
            return null;
        }
        b = true;
        return a;
    }

    public static synchronized String c() {
        String num;
        synchronized (acbw.class) {
            int i = c;
            c = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.os.Bundle f(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acbw.f(android.os.Bundle):android.os.Bundle");
    }

    private final void g(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.f.get(str);
            this.f.put(str, obj);
            if (obj2 != null) {
                i(obj2, obj);
            }
        }
    }

    private static boolean h(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            a = applicationInfo.packageName;
            int i = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static final void i(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                Log.w("InstanceID", "Failed to send response ".concat(e.toString()));
            }
        }
    }

    public final Bundle a(Bundle bundle) {
        Bundle f = f(bundle);
        if (f != null && f.containsKey("google.messenger") && (f = f(bundle)) != null && f.containsKey("google.messenger")) {
            return null;
        }
        return f;
    }

    public final void d(Intent intent) {
        String str;
        if (intent == null) {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Unexpected response: null");
                return;
            }
            return;
        }
        String action = intent.getAction();
        if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION") && !Objects.equals(action, "com.google.android.gms.iid.InstanceID")) {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Unexpected response ".concat(String.valueOf(intent.getAction())));
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        if (stringExtra == null) {
            String stringExtra2 = intent.getStringExtra("error");
            if (stringExtra2 == null) {
                Log.w("InstanceID", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
                return;
            }
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Received InstanceID error ".concat(stringExtra2));
            }
            String str2 = null;
            if (stringExtra2.startsWith("|")) {
                String[] split = stringExtra2.split("\\|");
                if (!Objects.equals(split[1], "ID")) {
                    Log.w("InstanceID", "Unexpected structured response ".concat(stringExtra2));
                }
                if (split.length > 2) {
                    String str3 = split[2];
                    str = split[3];
                    if (str.startsWith(":")) {
                        str = str.substring(1);
                    }
                    str2 = str3;
                } else {
                    str = "UNKNOWN";
                }
                stringExtra2 = str;
                intent.putExtra("error", stringExtra2);
            }
            if (str2 == null) {
                synchronized (getClass()) {
                    for (String str4 : this.f.keySet()) {
                        Object obj = this.f.get(str4);
                        this.f.put(str4, stringExtra2);
                        if (obj != null) {
                            i(obj, stringExtra2);
                        }
                    }
                }
                return;
            }
            g(str2, stringExtra2);
            return;
        }
        Matcher matcher = k.matcher(stringExtra);
        if (!matcher.matches()) {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Unexpected response string: ".concat(stringExtra));
                return;
            }
            return;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putString("registration_id", group2);
        g(group, extras);
    }

    final synchronized void e(Intent intent) {
        if (this.j == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            Context context = this.e;
            abhg.m(context);
            this.j = accy.b(context, intent2, VCardConfig.FLAG_APPEND_TYPE_PARAM);
        }
        intent.putExtra("app", this.j);
    }
}
