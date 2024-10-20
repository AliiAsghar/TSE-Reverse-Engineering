package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Process;
import android.os.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtw {
    public static final /* synthetic */ int a = 0;
    private static volatile List d;
    private static volatile List e;
    private static final alvi b = alvi.m("com/google/android/ims/security/SecurityUtil");
    private static final Object c = new Object();
    private static final acyz f = aczd.a(132284100);
    private static final acyz g = aczd.a(183130735);

    public static int a(Context context, String str, List list) {
        PackageManager packageManager = context.getPackageManager();
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
                int length = signatureArr.length;
                if (length <= 0) {
                    alvw h = b.h();
                    h.X(alwp.a, "BugleRcsEngine");
                    ((alvg) ((alvg) h).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 290, "SecurityUtil.java")).q("Package signed with < 1 signature.");
                    return -1;
                }
                alvw d2 = b.d();
                d2.X(alwp.a, "BugleRcsEngine");
                ((alvg) ((alvg) d2).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 294, "SecurityUtil.java")).t("SecurityUtil>getUidIfValidSignature: whiteListedSignatures: %s", list);
                int i = 0;
                while (i < length) {
                    byte[] digest = messageDigest.digest(signatureArr[i].toByteArray());
                    try {
                        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                        int length2 = digest.length;
                        StringBuilder sb = new StringBuilder(length2 + length2);
                        int i2 = 0;
                        while (i2 < length2) {
                            MessageDigest messageDigest2 = messageDigest;
                            byte b2 = digest[i2];
                            sb.append(cArr[(b2 & 240) >>> 4]);
                            sb.append(cArr[b2 & 15]);
                            i2++;
                            messageDigest = messageDigest2;
                            signatureArr = signatureArr;
                        }
                        MessageDigest messageDigest3 = messageDigest;
                        Signature[] signatureArr2 = signatureArr;
                        String sb2 = sb.toString();
                        alvi alviVar = b;
                        alvw d3 = alviVar.d();
                        d3.X(alwp.a, "BugleRcsEngine");
                        ((alvg) ((alvg) d3).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 302, "SecurityUtil.java")).D("SecurityUtil>getUidIfValidSignature: packageName: %s, hexSignatureSha1: %s", str, sb2);
                        if (!list.contains(sb2)) {
                            alvw h2 = alviVar.h();
                            h2.X(alwp.a, "BugleRcsEngine");
                            ((alvg) ((alvg) h2).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 308, "SecurityUtil.java")).D("Invalid signature found for %s: %s", str, sb2);
                            return -1;
                        }
                        i++;
                        messageDigest = messageDigest3;
                        signatureArr = signatureArr2;
                    } catch (PackageManager.NameNotFoundException unused) {
                        return -1;
                    }
                }
                advr.o("All signatures are whitelisted. Allowing %s", str);
                return packageManager.getApplicationInfo(str, 0).uid;
            } catch (PackageManager.NameNotFoundException unused2) {
                return -1;
            }
        } catch (NoSuchAlgorithmException e2) {
            alvw h3 = b.h();
            h3.X(alwp.a, "BugleRcsEngine");
            ((alvg) ((alvg) ((alvg) h3).g(e2)).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", (char) 317, "SecurityUtil.java")).q("checkForValidSignature caught");
            return -1;
        }
    }

    public static String b() {
        if (((Boolean) aczf.o().a.aE.a()).booleanValue()) {
            return (String) aczf.o().a.aF.a();
        }
        return (String) acqa.c.a();
    }

    public static void c(Context context, Intent intent) {
        PendingIntent broadcast;
        if (((Boolean) g.a()).booleanValue()) {
            broadcast = PendingIntent.getBroadcast(context, 0, intent, yhy.a(1073741824));
        } else {
            broadcast = PendingIntent.getBroadcast(context, 0, intent, 0);
        }
        intent.putExtra("pending_intent", broadcast);
    }

    public static void d(Context context, int i) {
        boolean contains;
        if (i != Process.myUid()) {
            Object obj = c;
            synchronized (obj) {
                acyz acyzVar = f;
                if (((Boolean) acyzVar.a()).booleanValue()) {
                    contains = g(context).contains(Integer.valueOf(i));
                } else {
                    if (d == null) {
                        if (((Boolean) acyzVar.a()).booleanValue()) {
                            alvw f2 = b.f();
                            f2.X(alwp.a, "BugleRcsEngine");
                            ((alvg) ((alvg) f2).h("com/google/android/ims/security/SecurityUtil", "updateWhitelists", 136, "SecurityUtil.java")).q("Skipping UID allowlist cache update");
                        } else {
                            d = g(context);
                            synchronized (obj) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = agkx.S((String) acqa.b.a()).iterator();
                                while (it.hasNext()) {
                                    int f3 = f(context, (String) it.next(), (String) acqa.d.a());
                                    if (f3 != -1) {
                                        arrayList.add(Integer.valueOf(f3));
                                    }
                                }
                                e = arrayList;
                                aduv.a.e(b());
                                aduv.c.e((String) acqa.a.a());
                                aduv.b.e((String) acqa.d.a());
                                aduv.d.e((String) acqa.b.a());
                            }
                        }
                    }
                    List list = d;
                    list.getClass();
                    contains = list.contains(Integer.valueOf(i));
                }
            }
            if (contains) {
            } else {
                throw new RemoteException("Operation not allowed: Package not white listed.");
            }
        }
    }

    public static boolean e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent == null) {
            advr.k("Missing pending intent.", new Object[0]);
            return false;
        }
        if (Binder.getCallingPid() != Process.myPid() && (!"com.google.android.ims".equals(pendingIntent.getCreatorPackage()) || !adwi.l(context))) {
            return false;
        }
        return true;
    }

    private static int f(Context context, String str, String str2) {
        return a(context, str, agkx.S(str2));
    }

    private static List g(Context context) {
        ArrayList arrayList;
        synchronized (c) {
            arrayList = new ArrayList();
            Iterator it = agkx.S((String) acqa.a.a()).iterator();
            while (it.hasNext()) {
                int f2 = f(context, (String) it.next(), b());
                if (f2 != -1) {
                    arrayList.add(Integer.valueOf(f2));
                }
            }
        }
        return arrayList;
    }
}
