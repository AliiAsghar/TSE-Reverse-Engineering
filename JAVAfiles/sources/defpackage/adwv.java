package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwv {
    private static volatile adwv b;
    public final Object a;

    public adwv() {
        this.a = alvi.m("com/google/android/libraries/abuse/hades/moirai/tartarus/ClassicTartarusScarUnpacker");
    }

    public static adwv a(Context context) {
        if (b == null) {
            synchronized (adwv.class) {
                if (b == null) {
                    b = new adwv(context);
                }
            }
        }
        return b;
    }

    public final boolean b(String str, int i) {
        try {
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("checkCarrierPrivilegesForPackage", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(((adwt) this.a).e(i), str);
            if (!Objects.isNull(invoke)) {
                if (((Integer) invoke).intValue() == 1) {
                    return true;
                }
                return false;
            }
            throw new NoSuchMethodException("Unexpected null returned by checkCarrierPrivilegesForPackage");
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw new NoSuchMethodException("No checkCarrierPrivilegesForPackage method in TelephonyManager");
        } catch (SecurityException e) {
            throw new adwk(e);
        }
    }

    public final ListenableFuture c(Callable callable, Executor executor) {
        return ((andr) ((ahmn) this.a).a).a(akto.k(callable), executor);
    }

    public final ListenableFuture d(ancr ancrVar, Executor executor) {
        return ((ahmn) this.a).k(ancrVar, executor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aegu] */
    public final long e() {
        return this.a.f().toEpochMilli();
    }

    public adwv(Object obj) {
        this.a = obj;
    }

    protected adwv(Context context) {
        this.a = adwt.g(context);
    }

    public adwv(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicBoolean(false);
    }

    public adwv(char[] cArr) {
        this.a = new ahmn((short[]) null);
    }

    public adwv(byte[] bArr) {
        this.a = new AtomicBoolean(false);
    }
}
