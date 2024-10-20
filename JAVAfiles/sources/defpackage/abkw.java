package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.auth.IAuthManagerService;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkw {
    public static final String[] a = {"com.google", "com.google.work", "cn.google"};
    public static final String b = "androidPackageName";
    public static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final apuv d = new apuv("Auth", "GoogleAuthUtil");

    public static TokenData a(final Context context, final Account account, final String str, Bundle bundle) {
        final Bundle bundle2;
        Object g;
        abhg.g("Calling this from your main thread can lead to deadlock");
        abhg.l(str, "Scope cannot be empty or null.");
        e(account);
        h(context);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        d(context, bundle2);
        ahtp.f(context);
        if (aqmg.b() && f(context)) {
            abld abldVar = new abld(context);
            d.aC(account, "Account name cannot be null!");
            abhg.l(str, "Scope cannot be null!");
            ajxp ajxpVar = new ajxp(null);
            ajxpVar.d = new Feature[]{abkr.c};
            ajxpVar.c = new acgg(account, str, bundle2, 1);
            ajxpVar.b = 1512;
            try {
                Bundle bundle3 = (Bundle) b(abldVar.i(ajxpVar.b()), "token retrieval");
                j(bundle3);
                g = i(context, bundle3);
            } catch (abra e) {
                c(e, "token retrieval");
            }
            return (TokenData) g;
        }
        g = g(context, c, new abkv() { // from class: abkt
            @Override // defpackage.abkv
            public final Object a(IBinder iBinder) {
                Bundle tokenByAccount = IAuthManagerService.Stub.asInterface(iBinder).getTokenByAccount(account, str, bundle2);
                if (tokenByAccount != null) {
                    return abkw.i(context, tokenByAccount);
                }
                throw new IOException("Service call returned null");
            }
        });
        return (TokenData) g;
    }

    public static Object b(acir acirVar, String str) {
        try {
            return actx.u(acirVar);
        } catch (InterruptedException e) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            d.n(format, new Object[0]);
            throw new IOException(format, e);
        } catch (CancellationException e2) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            d.n(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof abra) {
                throw ((abra) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            d.n(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static void c(abra abraVar, String str) {
        d.n("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(abraVar));
    }

    public static void d(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static void e(Account account) {
        if (account != null) {
            if (!TextUtils.isEmpty(account.name)) {
                String[] strArr = a;
                for (int i = 0; i < 3; i++) {
                    if (strArr[i].equals(account.type)) {
                        return;
                    }
                }
                throw new IllegalArgumentException("Account type not supported");
            }
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        throw new IllegalArgumentException("Account cannot be null");
    }

    public static boolean f(Context context) {
        if (abqa.a.h(context, 17895000) != 0) {
            return false;
        }
        apax apaxVar = aqmg.a.get().a().b;
        String str = context.getApplicationInfo().packageName;
        Iterator<E> it = apaxVar.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static Object g(Context context, ComponentName componentName, abkv abkvVar) {
        abpx abpxVar = new abpx();
        abui a2 = abui.a(context);
        try {
            try {
                if (a2.b(new abuh(componentName, abui.a), abpxVar, "GoogleAuthUtil").b()) {
                    try {
                        abhg.g("BlockingServiceConnection.getService() called on main thread");
                        if (!abpxVar.a) {
                            abpxVar.a = true;
                            return abkvVar.a((IBinder) abpxVar.b.take());
                        }
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    } catch (RemoteException | InterruptedException | TimeoutException e) {
                        Log.i("GoogleAuthUtil", "Error on service connection.", e);
                        throw new IOException("Error on service connection.", e);
                    }
                }
                throw new IOException("Could not bind to service.");
            } finally {
                a2.c(componentName, abpxVar);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static void h(Context context) {
        try {
            abqp.c(context.getApplicationContext(), 8400000);
        } catch (abqn e) {
            e = e;
            throw new abks(e.getMessage(), e);
        } catch (abqo e2) {
            String message = e2.getMessage();
            new Intent(e2.b);
            throw new abkx(message);
        } catch (GooglePlayServicesIncorrectManifestValueException e3) {
            e = e3;
            throw new abks(e.getMessage(), e);
        }
    }

    public static TokenData i(Context context, Bundle bundle) {
        TokenData tokenData;
        abmn abmnVar;
        int i;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        abmn[] values = abmn.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                abmnVar = values[i2];
                if (abmnVar.ak.equals(string)) {
                    break;
                }
                i2++;
            } else {
                abmnVar = abmn.UNKNOWN;
                break;
            }
        }
        d.n(String.format("[GoogleAuthUtil] error status:%s with method:%s", abmnVar, "getTokenWithDetails"), new Object[0]);
        if (!abmn.BAD_AUTHENTICATION.equals(abmnVar) && !abmn.CAPTCHA.equals(abmnVar) && !abmn.NEED_PERMISSION.equals(abmnVar) && !abmn.NEED_REMOTE_CONSENT.equals(abmnVar) && !abmn.NEEDS_BROWSER.equals(abmnVar) && !abmn.USER_CANCEL.equals(abmnVar) && !abmn.DEVICE_MANAGEMENT_REQUIRED.equals(abmnVar) && !abmn.DM_INTERNAL_ERROR.equals(abmnVar) && !abmn.DM_SYNC_DISABLED.equals(abmnVar) && !abmn.DM_ADMIN_BLOCKED.equals(abmnVar) && !abmn.DM_ADMIN_PENDING_APPROVAL.equals(abmnVar) && !abmn.DM_STALE_SYNC_REQUIRED.equals(abmnVar) && !abmn.DM_DEACTIVATED.equals(abmnVar) && !abmn.DM_REQUIRED.equals(abmnVar) && !abmn.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(abmnVar) && !abmn.DM_SCREENLOCK_REQUIRED.equals(abmnVar)) {
            if (!abmn.NETWORK_ERROR.equals(abmnVar) && !abmn.SERVICE_UNAVAILABLE.equals(abmnVar) && !abmn.INTNERNAL_ERROR.equals(abmnVar) && !abmn.AUTH_SECURITY_ERROR.equals(abmnVar) && !abmn.ACCOUNT_NOT_PRESENT.equals(abmnVar)) {
                throw new abks(string);
            }
            throw new IOException(string);
        }
        ahtp.f(context);
        if (pendingIntent != null && intent != null) {
            throw new UserRecoverableAuthException(string, abky.AUTH_INSTANTIATION);
        }
        abqa abqaVar = abqa.a;
        int i3 = abqp.c;
        try {
            i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            i = 0;
        }
        if (i >= 233800000 && pendingIntent == null) {
            d.l(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.valueOf(i), "getTokenWithDetails", 233800000), new Object[0]);
        }
        if (intent == null) {
            d.l(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", string, "getTokenWithDetails"), new Object[0]);
        }
        throw new UserRecoverableAuthException(string);
    }

    public static void j(Object obj) {
        if (obj != null) {
            return;
        }
        d.n("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }
}
