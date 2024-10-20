package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IInterface;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajnv<E> {
    public static final uuf a = uuh.q(160342172);
    public static final uuf b = uuh.q(184728843);
    private static final uuf h = uuh.q(181200999);
    public final Class c;
    public final Object d = new Object();
    public final Context e;
    public Object f;
    public armf g;
    private final ajoa i;
    private final int j;
    private final ajnw k;
    private final advp l;
    private ServiceConnection m;
    private final ServiceConnection n;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        armf LV();

        agxw Rs();
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [armf, java.lang.Object] */
    public ajnv(Class<E> cls, Context context, ajoa ajoaVar, int i, Optional<ajnw> optional) {
        ajnu ajnuVar = new ajnu(this);
        this.n = ajnuVar;
        xyl.l(context);
        this.c = cls;
        this.e = context;
        this.i = ajoaVar;
        this.j = i;
        this.k = optional.orElse(new ajns());
        this.l = new advp(String.format("JibeServiceBase<%s>", cls.getSimpleName()));
        try {
            a aVar = (a) akec.w(context, a.class);
            aksr aksrVar = (aksr) aVar.Rs().b.b();
            aksrVar.getClass();
            cls.getClass();
            this.m = new ajnx(aksrVar, cls, ajnuVar);
            this.g = aVar.LV();
        } catch (Exception unused) {
            this.m = this.n;
        }
    }

    private final void g() {
        this.f = null;
        try {
            this.e.unbindService(this.m);
        } catch (Exception e) {
            xzb.p("RcsClientLib", e, "Unexpected error when trying to unbind " + this.c.getCanonicalName() + ": " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a() {
        if (((Boolean) h.e()).booleanValue()) {
            Object obj = this.f;
            if (isConnected(obj)) {
                advr.m(this.l, "JibeServiceBase#checkPreconditions(jibeServiceInterface) thread trace", new Object[0]);
                return obj;
            }
            throw new ajob(getClass().getSimpleName());
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        if (isConnected()) {
            advr.m(this.l, "JibeServiceBase#checkPreconditions thread trace", new Object[0]);
            return;
        }
        throw new ajob();
    }

    public boolean bindToJibeServiceInBugle() {
        Intent s = adom.s(this.c.getName());
        s.putExtra("expected_version", this.j);
        return this.e.bindService(s, this.m, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(ajnz ajnzVar) {
        xzb.o("RcsClientLib", "Service failed to connect with reason: %s", ajnzVar);
        synchronized (this.d) {
            g();
        }
        this.i.fG(getClass().getName(), ajnzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean connect() {
        /*
            r9 = this;
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "Connecting %s"
            java.lang.String r4 = "RcsClientLib"
            defpackage.xzb.k(r4, r0, r2)
            android.content.Context r0 = r9.e
            java.lang.String r2 = r9.getRcsServiceClass()
            boolean r0 = defpackage.adwi.k(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            if (r2 == 0) goto L27
            r6 = r1
            goto L28
        L27:
            r6 = r3
        L28:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r3] = r5
            r8[r1] = r6
            java.lang.String r3 = "shouldUseCarrierServicesJibeService: %b, CarrierServices rcs service found: %b"
            defpackage.xzb.k(r4, r3, r8)
            if (r0 == 0) goto L5e
            if (r2 == 0) goto L5d
            java.lang.Class r0 = r9.c
            java.lang.String r0 = r0.getName()
            android.content.Intent r0 = defpackage.adom.r(r2, r0)
            int r2 = r9.j
            java.lang.String r3 = "expected_version"
            r0.putExtra(r3, r2)
            apfi r2 = r9.getServiceNameLoggingEnum()
            r9.f(r2, r7)
            android.content.Context r2 = r9.e
            android.content.ServiceConnection r3 = r9.m
            boolean r0 = r2.bindService(r0, r3, r1)
            goto La6
        L5d:
            r2 = 0
        L5e:
            boolean r0 = defpackage.aczf.y()
            if (r0 == 0) goto L75
            if (r2 == 0) goto L75
            java.lang.Class r0 = r9.c
            java.lang.String r0 = r0.getName()
            android.content.Intent r0 = defpackage.adom.r(r2, r0)
            android.content.Context r1 = r9.e
            r1.stopService(r0)
        L75:
            android.content.Context r0 = r9.e
            boolean r0 = defpackage.adwi.d(r0)
            if (r0 == 0) goto L8e
            java.lang.String r0 = "Starting Bugle JibeService."
            defpackage.xzb.c(r4, r0)
            android.content.Context r0 = r9.e
            java.lang.String r1 = "com.google.android.ims.JibeService"
            android.content.Intent r1 = defpackage.adom.s(r1)
            r0.startService(r1)
            goto L9b
        L8e:
            android.content.Context r0 = r9.e
            boolean r0 = defpackage.adwi.e(r0)
            if (r0 != 0) goto L9b
            java.lang.String r0 = "Can't start Bugle JibeService in the background."
            defpackage.xzb.n(r4, r0)
        L9b:
            apfi r0 = r9.getServiceNameLoggingEnum()
            r9.f(r0, r7)
            boolean r0 = r9.bindToJibeServiceInBugle()
        La6:
            if (r0 != 0) goto Lb7
            ajoa r1 = r9.i
            java.lang.Class r2 = r9.getClass()
            java.lang.String r2 = r2.getName()
            ajnz r3 = defpackage.ajnz.UNKNOWN
            r1.fG(r2, r3)
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnv.connect():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str) {
        xzb.k("RcsClientLib", "%s connected", str);
        this.i.fH(str);
    }

    public void disconnect() {
        xzb.k("RcsClientLib", "Disconnecting %s", getClass().getSimpleName());
        synchronized (this.d) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(String str) {
        xzb.o("RcsClientLib", "%s disconnected", str);
        this.i.c(str);
    }

    public final void f(apfi apfiVar, int i) {
        this.k.a(apfiVar, i);
    }

    public String getRcsServiceClass() {
        Intent intent = new Intent("com.google.android.ims.START_RCS_ENGINE");
        intent.setPackage("com.google.android.ims");
        List<ResolveInfo> queryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 128);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            if (queryIntentServices.size() != 1) {
                xzb.h("RcsClientLib", "There should be one and only one RCS service. Number of services: %d", Integer.valueOf(queryIntentServices.size()));
                return null;
            }
            return queryIntentServices.get(0).serviceInfo.name;
        }
        xzb.n("RcsClientLib", "No CS.apk RCS service found. Is RCS running in Bugle?");
        return null;
    }

    public abstract String getRcsServiceMetaDataKey();

    public ServiceConnection getServiceConnection() {
        return this.m;
    }

    public ajoa getServiceListener() {
        return this.i;
    }

    public apfi getServiceNameLoggingEnum() {
        return apfi.UNKNOWN_SERVICE;
    }

    public boolean isConnected() {
        synchronized (this.d) {
            Object obj = this.f;
            if (obj == null) {
                return false;
            }
            boolean pingBinder = ((IInterface) obj).asBinder().pingBinder();
            if (!pingBinder) {
                xzb.k("RcsClientLib", "isConnected:binding is broken for %s", getClass().getSimpleName());
            }
            return pingBinder;
        }
    }

    public boolean isConnected(E e) {
        synchronized (this.d) {
            if (e == null) {
                return false;
            }
            boolean pingBinder = ((IInterface) e).asBinder().pingBinder();
            if (!pingBinder) {
                xzb.o("RcsClientLib", "isConnected:binding is broken for %s", getClass().getSimpleName());
            }
            return pingBinder;
        }
    }
}
