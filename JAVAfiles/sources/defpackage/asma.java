package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asma {
    private static WeakReference d;
    public final Object a;
    public Object b;
    public final Object c;

    private asma(SharedPreferences sharedPreferences, Executor executor) {
        this.a = executor;
        this.c = sharedPreferences;
    }

    public static synchronized asma d(Context context, Executor executor) {
        asma asmaVar;
        synchronized (asma.class) {
            WeakReference weakReference = d;
            if (weakReference != null) {
                asmaVar = (asma) weakReference.get();
            } else {
                asmaVar = null;
            }
            if (asmaVar == null) {
                asma asmaVar2 = new asma(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                asmaVar2.e();
                d = new WeakReference(asmaVar2);
                return asmaVar2;
            }
            return asmaVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.Object] */
    private final synchronized void e() {
        atqq atqqVar = new atqq((SharedPreferences) this.c, (Executor) this.a);
        synchronized (atqqVar.d) {
            ((ArrayDeque) atqqVar.d).clear();
            String string = atqqVar.a.getString((String) atqqVar.e, "");
            if (!TextUtils.isEmpty(string) && string.contains(atqqVar.c)) {
                String[] split = string.split((String) atqqVar.c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        ((ArrayDeque) atqqVar.d).add(str);
                    }
                }
            }
        }
        this.b = atqqVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object] */
    public final void a(asmb asmbVar) {
        this.c.add(asmbVar);
    }

    public final synchronized aoiw b() {
        String str;
        Object obj = this.b;
        synchronized (((atqq) obj).d) {
            str = (String) ((ArrayDeque) ((atqq) obj).d).peek();
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                return new aoiw(split[0], split[1]);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final synchronized void c(aoiw aoiwVar) {
        Object obj = this.b;
        Object obj2 = ((atqq) obj).d;
        String str = aoiwVar.c;
        synchronized (obj2) {
            if (((ArrayDeque) ((atqq) obj).d).remove(str)) {
                ((atqq) obj).b.execute(new akwm(obj, 15));
            }
        }
    }

    public asma() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        asqx asqxVar = asqx.a;
        this.a = aotl.R(uuid);
        this.b = asmc.a;
        this.c = new ArrayList();
    }
}
