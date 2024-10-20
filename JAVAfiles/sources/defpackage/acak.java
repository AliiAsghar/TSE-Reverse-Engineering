package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.iid.MessengerCompat;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import j$.util.Objects;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acak {
    private static acak c;
    public final Object a;
    public final Object b;

    public acak(acmc acmcVar, List list) {
        this.b = acmcVar;
        this.a = list;
    }

    public static synchronized acak l(Context context) {
        acak acakVar;
        synchronized (acak.class) {
            if (c == null) {
                c = new acak(context);
            }
            acakVar = c;
        }
        return acakVar;
    }

    public static acak o(String str) {
        return new acak(PutDataRequest.a(str));
    }

    public static acak p(long j) {
        return new acak(Long.TYPE, Long.valueOf(j));
    }

    public final int a() {
        return abqp.a((Context) this.a, 11925000);
    }

    public final void b(int i, GoogleHelp googleHelp) {
        Intent data = new Intent("android.intent.action.VIEW").setData(googleHelp.q);
        int i2 = 0;
        if (i != 7) {
            if (!((Activity) this.a).getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
                new acda(Looper.getMainLooper()).post(new acaj(this, data, i2));
                return;
            }
        } else {
            i = 7;
        }
        Object obj = this.a;
        if (true == abqp.e((Context) obj, i)) {
            i = 18;
        }
        abqa.a.e((Activity) obj, i, 0, null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [alhr, java.lang.Object] */
    public final void c(InProductHelp inProductHelp) {
        if (!TextUtils.isEmpty(inProductHelp.c)) {
            int a = a();
            if (a == 0) {
                Object obj = this.b.get();
                acbd acbdVar = (acbd) obj;
                abhg.m(acbdVar.a);
                abrg abrgVar = ((abrc) obj).i;
                acav acavVar = new acav(abrgVar, inProductHelp, new WeakReference(acbdVar.a));
                abrgVar.b(acavVar);
                abhg.o(acavVar);
                return;
            }
            b(a, inProductHelp.a);
            return;
        }
        throw new IllegalArgumentException("The content URL must be non-empty.");
    }

    public final void d(apuj apujVar) {
        aozy createBuilder = apuk.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((apuk) apagVar).c = 484;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apuk apukVar = (apuk) createBuilder.b;
        apujVar.getClass();
        apukVar.d = apujVar;
        apukVar.b |= 16777216;
        apuk apukVar2 = (apuk) createBuilder.s();
        aozy createBuilder2 = asla.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        asla aslaVar = (asla) createBuilder2.b;
        apukVar2.getClass();
        aslaVar.c = apukVar2;
        aslaVar.b |= 1;
        ((abnr) ((zfm) this.b).a).g((asla) createBuilder2.s()).c();
    }

    public final void e(boolean z) {
        int i;
        aozy createBuilder = apuj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        if (true != z) {
            i = 15;
        } else {
            i = 16;
        }
        ((apuj) createBuilder.b).d = a.av(i);
        Object obj = this.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        obj.getClass();
        ((apuj) apagVar).e = (String) obj;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).f = a.ao(4);
        d((apuj) createBuilder.s());
    }

    public final void f(apug apugVar) {
        aozy createBuilder = apuj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).d = a.av(14);
        Object obj = this.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        obj.getClass();
        ((apuj) apagVar).e = (String) obj;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).f = a.ao(4);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apuj apujVar = (apuj) createBuilder.b;
        apugVar.getClass();
        apujVar.c = apugVar;
        apujVar.b = 15;
        d((apuj) createBuilder.s());
    }

    public final void g(int i, int i2) {
        aozy createBuilder = apuj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).d = a.av(i);
        Object obj = this.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        obj.getClass();
        ((apuj) apagVar).e = (String) obj;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).f = a.ao(i2);
        d((apuj) createBuilder.s());
    }

    public final void h(int i) {
        g(i, 5);
    }

    public final void i(int i, algw algwVar) {
        aozy createBuilder = apuj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).d = a.av(i);
        Object obj = this.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        obj.getClass();
        ((apuj) apagVar).e = (String) obj;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).f = a.ao(3);
        if (algwVar.f()) {
            String str = (String) algwVar.b();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((apuj) createBuilder.b).g = str;
        }
        d((apuj) createBuilder.s());
    }

    public final void j(int i) {
        aozy createBuilder = apuj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).d = a.av(8);
        Object obj = this.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        obj.getClass();
        ((apuj) apagVar).e = (String) obj;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).f = a.ao(4);
        aozy createBuilder2 = apua.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((apua) createBuilder2.b).b = a.ao(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apuj apujVar = (apuj) createBuilder.b;
        apua apuaVar = (apua) createBuilder2.s();
        apuaVar.getClass();
        apujVar.c = apuaVar;
        apujVar.b = 7;
        d((apuj) createBuilder.s());
    }

    public final void k(int i) {
        aozy createBuilder = apuj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).d = a.av(7);
        Object obj = this.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        obj.getClass();
        ((apuj) apagVar).e = (String) obj;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apuj) createBuilder.b).f = a.ao(4);
        aozy createBuilder2 = apui.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((apui) createBuilder2.b).b = a.am(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apuj apujVar = (apuj) createBuilder.b;
        apui apuiVar = (apui) createBuilder2.s();
        apuiVar.getClass();
        apujVar.c = apuiVar;
        apujVar.b = 6;
        d((apuj) createBuilder.s());
    }

    public final Uri m() {
        return ((PutDataRequest) this.a).a;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public final PutDataRequest n() {
        acak x = actx.x((ackf) this.b);
        ((PutDataRequest) this.a).c = ((aoyj) x.b).toByteArray();
        int size = x.a.size();
        for (int i = 0; i < size; i++) {
            ?? r3 = x.a;
            String num = Integer.toString(i);
            Asset asset = (Asset) r3.get(i);
            if (num != null) {
                if (asset != null) {
                    if (Log.isLoggable("DataMap", 3)) {
                        Log.d("DataMap", "asPutDataRequest: adding asset: " + num + " " + asset.toString());
                    }
                    ((PutDataRequest) this.a).d(num, asset);
                } else {
                    throw new IllegalStateException("asset cannot be null: key=".concat(num));
                }
            } else {
                throw new IllegalStateException("asset key cannot be null: ".concat(String.valueOf(String.valueOf(asset))));
            }
        }
        return (PutDataRequest) this.a;
    }

    public acak(Activity activity) {
        this.a = activity;
        this.b = new ynw(activity, 14);
    }

    public acak(Class cls, Object obj) {
        this.a = cls;
        this.b = obj;
    }

    public acak(zfm zfmVar, Executor executor) {
        this.b = executor;
        this.a = zfmVar;
    }

    public acak(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.b = new MessengerCompat(iBinder);
            this.a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    private acak(PutDataRequest putDataRequest) {
        this.a = putDataRequest;
        this.b = new ackf();
    }

    public acak(File file, String str) {
        this.a = file;
        abmt abmtVar = accg.a;
        this.b = new File(abmt.f(file, str));
    }

    private acak(Context context) {
        this.b = new zfm(context);
        this.a = context.getPackageName();
    }
}
