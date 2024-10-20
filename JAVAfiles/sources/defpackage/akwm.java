package defpackage;

import android.app.VoiceInteractor;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akwm implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akwm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, j$.util.stream.BaseStream] */
    /* JADX WARN: Type inference failed for: r0v18, types: [amdv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        VoiceInteractor voiceInteractor;
        boolean isDestroyed;
        ApplicationInfo applicationInfo;
        boolean z = true;
        switch (this.b) {
            case 0:
                akwo akwoVar = (akwo) this.a;
                if (!akwoVar.a.isDestroyed() && (voiceInteractor = akwoVar.a.getVoiceInteractor()) != null) {
                    isDestroyed = voiceInteractor.isDestroyed();
                    if (!isDestroyed) {
                        voiceInteractor.notifyDirectActionsChanged();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Object obj = ((akpq) this.a).a;
                synchronized (akto.c) {
                    if (d.F(akto.d, obj)) {
                        akto.d = null;
                    }
                }
                return;
            case 2:
                Object obj2 = this.a;
                akwn akwnVar = (akwn) obj2;
                if (((Optional) akwnVar.b.getAndSet(akwn.a)).isPresent()) {
                    akwnVar.e.e.remove(obj2);
                    return;
                }
                return;
            case 3:
                ((alcm) this.a).c();
                return;
            case 4:
                ((Future) ((AtomicReference) this.a).get()).cancel(false);
                return;
            case 5:
                this.a.close();
                return;
            case 6:
                this.a.a();
                return;
            case 7:
                anek anekVar = andc.a;
                try {
                    this.a.close();
                    return;
                } catch (Exception e) {
                    albo.bA(e);
                    andc.a.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", "thrown by close()", (Throwable) e);
                    return;
                }
            case 8:
                ((andc) this.a).h(anda.WILL_CLOSE, anda.CLOSING);
                ((andc) this.a).i();
                ((andc) this.a).h(anda.CLOSING, anda.CLOSED);
                return;
            case 9:
                this.a.cancel(false);
                return;
            case 10:
                aoik aoikVar = (aoik) ((asqc) this.a.getKey()).a;
                if (aoikVar.b()) {
                    aoikVar.a.f();
                    return;
                }
                return;
            case 11:
                ((aohh) this.a).i();
                return;
            case 12:
                ((aohh) this.a).i();
                return;
            case 13:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.a;
                if (firebaseMessaging.h()) {
                    firebaseMessaging.f();
                    return;
                }
                return;
            case 14:
                Context context = ((FirebaseMessaging) this.a).d;
                if (aode.af(context).getBoolean("proxy_notification_initialized", false)) {
                    return;
                }
                try {
                    Context applicationContext = context.getApplicationContext();
                    PackageManager packageManager = applicationContext.getPackageManager();
                    if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (abvk.c()) {
                    new ldv(context, z, new acit(), 7).run();
                    return;
                } else {
                    actx.s(null);
                    return;
                }
            case 15:
                Object obj3 = this.a;
                synchronized (((atqq) obj3).d) {
                    SharedPreferences.Editor edit = ((atqq) obj3).a.edit();
                    Object obj4 = ((atqq) obj3).e;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) ((atqq) obj3).d).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) ((atqq) obj3).c);
                    }
                    edit.putString((String) obj4, sb.toString()).commit();
                }
                return;
            case 16:
                asmb asmbVar = (asmb) this.a;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + ((Intent) asmbVar.b).getAction() + " finishing.");
                asmbVar.u();
                return;
            case 17:
                ((aokz) this.a).b().d();
                return;
            case 18:
                ((aold) this.a).b.d();
                return;
            case 19:
                aoln aolnVar = (aoln) this.a;
                if (!aolnVar.h) {
                    aolnVar.f = true;
                    aolnVar.b();
                    return;
                }
                return;
            default:
                aolj aoljVar = (aolj) this.a;
                if (!aoljVar.a) {
                    aoljVar.c.e();
                    return;
                }
                return;
        }
    }

    public akwm(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
