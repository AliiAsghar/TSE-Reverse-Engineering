package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.aaxu;
import defpackage.abhg;
import defpackage.abqb;
import defpackage.absl;
import defpackage.abtt;
import defpackage.abtu;
import defpackage.abtv;
import defpackage.abtw;
import defpackage.abty;
import defpackage.abtz;
import defpackage.abuh;
import defpackage.abui;
import defpackage.abus;
import defpackage.aej$$ExternalSyntheticApiModelOutline0;
import defpackage.ahjj;
import defpackage.anna;
import defpackage.d;
import defpackage.zfm;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class BaseGmsClient<T extends IInterface> {
    private static final Feature[] fu = new Feature[0];
    public final Context b;
    public final abqb c;
    public final Handler d;
    private final abui fv;
    private IInterface fw;
    public IGmsServiceBroker g;
    public abtv h;
    public final int k;
    public volatile String l;
    anna q;
    public volatile zfm r;
    public final ahjj s;
    public final ahjj t;
    private abtw x;
    private final String y;
    private volatile String u = null;
    public final Object e = new Object();
    public final Object f = new Object();
    public final ArrayList i = new ArrayList();
    public int j = 1;
    public ConnectionResult m = null;
    public boolean n = false;
    public volatile ConnectionInfo o = null;
    public final AtomicInteger p = new AtomicInteger(0);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static final class GmsCallbacks extends IGmsCallbacks.Stub {
        private BaseGmsClient a;
        private final int b;

        public GmsCallbacks(BaseGmsClient baseGmsClient, int i) {
            this.a = baseGmsClient;
            this.b = i;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public void onAccountValidationComplete(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
            d.aC(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.A(i, iBinder, bundle, this.b);
            this.a = null;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
            RootTelemetryConfiguration rootTelemetryConfiguration;
            BaseGmsClient baseGmsClient = this.a;
            d.aC(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            abhg.m(connectionInfo);
            baseGmsClient.o = connectionInfo;
            if (baseGmsClient.gn()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
                abus a = abus.a();
                if (connectionTelemetryConfiguration == null) {
                    rootTelemetryConfiguration = null;
                } else {
                    rootTelemetryConfiguration = connectionTelemetryConfiguration.a;
                }
                a.b(rootTelemetryConfiguration);
            }
            onPostInitComplete(i, iBinder, connectionInfo.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseGmsClient(Context context, Looper looper, abui abuiVar, abqb abqbVar, int i, ahjj ahjjVar, ahjj ahjjVar2, String str) {
        d.aC(context, "Context must not be null");
        this.b = context;
        d.aC(looper, "Looper must not be null");
        d.aC(abuiVar, "Supervisor must not be null");
        this.fv = abuiVar;
        d.aC(abqbVar, "API availability must not be null");
        this.c = abqbVar;
        this.d = new abtt(this, looper);
        this.k = i;
        this.t = ahjjVar;
        this.s = ahjjVar2;
        this.y = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.d.sendMessage(this.d.obtainMessage(1, i2, -1, new abty(this, i, iBinder, bundle)));
    }

    public final void B(int i, Bundle bundle, int i2) {
        this.d.sendMessage(this.d.obtainMessage(7, i2, -1, new abtz(this, i, bundle)));
    }

    public final void C(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        anna annaVar;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        d.s(z3);
        synchronized (this.e) {
            this.j = i;
            this.fw = iInterface;
            Bundle bundle = null;
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        abhg.m(iInterface);
                        System.currentTimeMillis();
                    }
                } else {
                    abtw abtwVar = this.x;
                    if (abtwVar != null && (annaVar = this.q) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) annaVar.c) + " on " + ((String) annaVar.d));
                        abui abuiVar = this.fv;
                        anna annaVar2 = this.q;
                        Object obj = annaVar2.c;
                        Object obj2 = annaVar2.d;
                        int i2 = annaVar2.a;
                        x();
                        abuiVar.e((String) obj, (String) obj2, i2, abtwVar, this.q.b);
                        this.p.incrementAndGet();
                    }
                    abtw abtwVar2 = new abtw(this, this.p.get());
                    this.x = abtwVar2;
                    anna annaVar3 = new anna(y(), d(), abui.a, h());
                    this.q = annaVar3;
                    if (annaVar3.b && a() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat((String) annaVar3.c));
                    }
                    abui abuiVar2 = this.fv;
                    Object obj3 = annaVar3.c;
                    Object obj4 = annaVar3.d;
                    int i3 = annaVar3.a;
                    String x = x();
                    boolean z4 = this.q.b;
                    I();
                    ConnectionResult b = abuiVar2.b(new abuh((String) obj3, (String) obj4, i3, z4), abtwVar2, x);
                    if (!b.b()) {
                        anna annaVar4 = this.q;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) annaVar4.c) + " on " + ((String) annaVar4.d));
                        int i4 = b.c;
                        if (i4 == -1) {
                            i4 = 16;
                        }
                        if (b.d != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(RcsIntents.EXTRA_PENDING_INTENT, b.d);
                        }
                        B(i4, bundle, this.p.get());
                    }
                }
            } else {
                abtw abtwVar3 = this.x;
                if (abtwVar3 != null) {
                    abui abuiVar3 = this.fv;
                    anna annaVar5 = this.q;
                    Object obj5 = annaVar5.c;
                    Object obj6 = annaVar5.d;
                    int i5 = annaVar5.a;
                    x();
                    abuiVar3.e((String) obj5, (String) obj6, i5, abtwVar3, this.q.b);
                    this.x = null;
                }
            }
        }
    }

    public final void D(abtv abtvVar, int i, PendingIntent pendingIntent) {
        this.h = abtvVar;
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(3, this.p.get(), i, pendingIntent));
    }

    public final boolean E(int i, int i2, IInterface iInterface) {
        synchronized (this.e) {
            if (this.j != i) {
                return false;
            }
            C(i2, iInterface);
            return true;
        }
    }

    public final boolean F() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    public Feature[] G() {
        throw null;
    }

    protected void I() {
        throw null;
    }

    public void J() {
        System.currentTimeMillis();
    }

    public int a() {
        throw null;
    }

    public abstract IInterface b(IBinder iBinder);

    public abstract String c();

    protected abstract String d();

    public void g(String str) {
        this.u = str;
        n();
    }

    public boolean gn() {
        return false;
    }

    public Feature[] go() {
        return fu;
    }

    protected boolean h() {
        if (a() >= 211700000) {
            return true;
        }
        return false;
    }

    protected Bundle i() {
        return new Bundle();
    }

    public boolean j() {
        return false;
    }

    public final String k() {
        return this.u;
    }

    public void m(abtv abtvVar) {
        this.h = abtvVar;
        C(2, null);
    }

    public void n() {
        this.p.incrementAndGet();
        synchronized (this.i) {
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                ((abtu) this.i.get(i)).e();
            }
            this.i.clear();
        }
        synchronized (this.f) {
            this.g = null;
        }
        C(1, null);
    }

    public final void o(IAccountAccessor iAccountAccessor, Set set) {
        Object obj;
        String attributionTag;
        String attributionTag2;
        Bundle i = i();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.l;
        } else if (this.r == null || (obj = this.r.a) == null) {
            attributionTag2 = this.l;
        } else {
            attributionTag = aej$$ExternalSyntheticApiModelOutline0.m(obj).getAttributionTag();
            if (attributionTag == null) {
                attributionTag2 = this.l;
            } else {
                attributionTag2 = aej$$ExternalSyntheticApiModelOutline0.m(obj).getAttributionTag();
            }
        }
        String str = attributionTag2;
        int i2 = this.k;
        int i3 = abqb.c;
        Scope[] scopeArr = GetServiceRequest.a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.b;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i2, i3, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f = this.b.getPackageName();
        getServiceRequest.i = i;
        if (set != null) {
            getServiceRequest.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (j()) {
            Account v = v();
            if (v == null) {
                v = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.j = v;
            if (iAccountAccessor != null) {
                getServiceRequest.g = iAccountAccessor.asBinder();
            }
        }
        getServiceRequest.k = G();
        getServiceRequest.l = go();
        if (gn()) {
            getServiceRequest.o = true;
        }
        try {
            synchronized (this.f) {
                IGmsServiceBroker iGmsServiceBroker = this.g;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new GmsCallbacks(this, this.p.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.d;
            handler.sendMessage(handler.obtainMessage(6, this.p.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            A(8, null, null, this.p.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            A(8, null, null, this.p.get());
        }
    }

    public final boolean p() {
        boolean z;
        synchronized (this.e) {
            if (this.j == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.e) {
            int i = this.j;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean r() {
        return true;
    }

    public final Feature[] s() {
        ConnectionInfo connectionInfo = this.o;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final void t() {
        if (p() && this.q != null) {
        } else {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void u(ahjj ahjjVar) {
        ((absl) ahjjVar.a).i.o.post(new aaxu(ahjjVar, 17, null));
    }

    public Account v() {
        throw null;
    }

    public final IInterface w() {
        IInterface iInterface;
        synchronized (this.e) {
            if (this.j != 5) {
                if (p()) {
                    iInterface = this.fw;
                    d.aC(iInterface, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    protected final String x() {
        String str = this.y;
        if (str == null) {
            return this.b.getClass().getName();
        }
        return str;
    }

    protected String y() {
        return "com.google.android.gms";
    }

    public Set z() {
        throw null;
    }
}
