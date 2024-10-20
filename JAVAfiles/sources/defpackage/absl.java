package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.SignInCoordinator;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absl implements abre, abrf {
    public final abqz b;
    public final abrv c;
    public final int e;
    public boolean f;
    public final /* synthetic */ abso i;
    private final SignInCoordinator k;
    private final znp m;
    public final Queue a = new LinkedList();
    private final Set j = new HashSet();
    public final Map d = new HashMap();
    public final List g = new ArrayList();
    private ConnectionResult l = null;
    public int h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public absl(abso absoVar, abrc abrcVar) {
        this.i = absoVar;
        Looper looper = absoVar.o.getLooper();
        abua a = abrcVar.u().a();
        Object obj = abrcVar.k.a;
        abhg.m(obj);
        abqz w = ((abqt) obj).w(abrcVar.c, looper, a, abrcVar.e, this, this);
        zfm zfmVar = abrcVar.l;
        if (zfmVar != null && (w instanceof BaseGmsClient)) {
            ((BaseGmsClient) w).r = zfmVar;
        } else if (zfmVar != null && (w instanceof abtb)) {
        } else {
            String str = abrcVar.d;
            if (str != null && (w instanceof BaseGmsClient)) {
                ((BaseGmsClient) w).l = str;
            }
            if (str != null && (w instanceof abtb)) {
            }
        }
        this.b = w;
        this.c = abrcVar.f;
        this.m = new znp();
        this.e = abrcVar.h;
        if (w.j()) {
            this.k = new SignInCoordinator(absoVar.g, absoVar.o, abrcVar.u().a());
        } else {
            this.k = null;
        }
    }

    private final Feature n(Feature[] featureArr) {
        if (featureArr != null) {
            Feature[] s = this.b.s();
            if (s == null) {
                s = new Feature[0];
            }
            tm tmVar = new tm(s.length);
            for (Feature feature : s) {
                tmVar.put(feature.a, Long.valueOf(feature.a()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) tmVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final Status o(ConnectionResult connectionResult) {
        return abso.a(this.c, connectionResult);
    }

    private final void p(ConnectionResult connectionResult) {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            if (d.B(connectionResult, ConnectionResult.a)) {
                this.b.t();
            }
            throw null;
        }
        this.j.clear();
    }

    private final void q(Status status, Exception exc, boolean z) {
        boolean z2;
        abhg.d(this.i.o);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                abru abruVar = (abru) it.next();
                if (!z || abruVar.c == 2) {
                    if (status != null) {
                        abruVar.d(status);
                    } else {
                        abruVar.e(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void r() {
        this.i.o.removeMessages(12, this.c);
        abso absoVar = this.i;
        Handler handler = absoVar.o;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.c), absoVar.e);
    }

    private final void s(abru abruVar) {
        abruVar.g(this.m, l());
        try {
            abruVar.f(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.b.g("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean t(abru abruVar) {
        if (!(abruVar instanceof abro)) {
            s(abruVar);
            return true;
        }
        abro abroVar = (abro) abruVar;
        Feature n = n(abroVar.b(this));
        if (n == null) {
            s(abruVar);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + n.a + ", " + n.a() + ").");
        if (this.i.p && abroVar.a(this)) {
            absm absmVar = new absm(this.c, n);
            int indexOf = this.g.indexOf(absmVar);
            if (indexOf >= 0) {
                absm absmVar2 = (absm) this.g.get(indexOf);
                this.i.o.removeMessages(15, absmVar2);
                Handler handler = this.i.o;
                handler.sendMessageDelayed(Message.obtain(handler, 15, absmVar2), 5000L);
                return false;
            }
            this.g.add(absmVar);
            Handler handler2 = this.i.o;
            handler2.sendMessageDelayed(Message.obtain(handler2, 15, absmVar), 5000L);
            Handler handler3 = this.i.o;
            handler3.sendMessageDelayed(Message.obtain(handler3, 16, absmVar), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!u(connectionResult)) {
                this.i.i(connectionResult, this.e);
                return false;
            }
            return false;
        }
        abroVar.e(new abrn(n));
        return true;
    }

    private final boolean u(ConnectionResult connectionResult) {
        synchronized (abso.c) {
            abso absoVar = this.i;
            if (absoVar.m == null || !absoVar.n.contains(this.c)) {
                return false;
            }
            absi absiVar = this.i.m;
            atal atalVar = new atal(connectionResult, this.e);
            if (a.bE(absiVar.b, atalVar)) {
                absiVar.c.post(new absa(absiVar, atalVar, 0));
            }
            return true;
        }
    }

    public final void a() {
        abhg.d(this.i.o);
        this.l = null;
    }

    public final void b() {
        abhg.d(this.i.o);
        if (!this.b.p() && !this.b.q()) {
            try {
                abso absoVar = this.i;
                abul abulVar = absoVar.i;
                Context context = absoVar.g;
                abqz abqzVar = this.b;
                abhg.m(context);
                abhg.m(abqzVar);
                int i = 0;
                if (abqzVar.r()) {
                    int a = abqzVar.a();
                    int b = abulVar.b(a);
                    if (b == -1) {
                        synchronized (abulVar.a) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < ((SparseIntArray) abulVar.a).size()) {
                                    int keyAt = ((SparseIntArray) abulVar.a).keyAt(i2);
                                    if (keyAt > a && ((SparseIntArray) abulVar.a).get(keyAt) == 0) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    i = -1;
                                    break;
                                }
                            }
                            if (i == -1) {
                                i = ((abqb) abulVar.b).h(context, a);
                            }
                            ((SparseIntArray) abulVar.a).put(a, i);
                        }
                    } else {
                        i = b;
                    }
                }
                if (i != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(i, null);
                    Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult.toString());
                    onConnectionFailed(connectionResult);
                    return;
                }
                abso absoVar2 = this.i;
                abqz abqzVar2 = this.b;
                absn absnVar = new absn(absoVar2, abqzVar2, this.c);
                if (abqzVar2.j()) {
                    SignInCoordinator signInCoordinator = this.k;
                    abhg.m(signInCoordinator);
                    signInCoordinator.startSignIn(absnVar);
                }
                try {
                    this.b.m(absnVar);
                } catch (SecurityException e) {
                    g(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                g(new ConnectionResult(10), e2);
            }
        }
    }

    public final void c(abru abruVar) {
        abhg.d(this.i.o);
        if (this.b.p()) {
            if (t(abruVar)) {
                r();
                return;
            } else {
                this.a.add(abruVar);
                return;
            }
        }
        this.a.add(abruVar);
        ConnectionResult connectionResult = this.l;
        if (connectionResult != null && connectionResult.a()) {
            onConnectionFailed(connectionResult);
        } else {
            b();
        }
    }

    public final void d(Status status) {
        abhg.d(this.i.o);
        q(status, null, false);
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            abru abruVar = (abru) arrayList.get(i);
            if (this.b.p()) {
                if (t(abruVar)) {
                    this.a.remove(abruVar);
                }
            } else {
                return;
            }
        }
    }

    public final void f() {
        a();
        p(ConnectionResult.a);
        k();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            addy addyVar = (addy) it.next();
            if (n(((abtd) addyVar.b).b) != null) {
                it.remove();
            } else {
                try {
                    ((abtd) addyVar.b).b(this.b, new acit());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.b.g("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        e();
        r();
    }

    public final void g(ConnectionResult connectionResult, Exception exc) {
        abhg.d(this.i.o);
        SignInCoordinator signInCoordinator = this.k;
        if (signInCoordinator != null) {
            signInCoordinator.stopSignIn();
        }
        a();
        this.i.i.a();
        p(connectionResult);
        if ((this.b instanceof abuy) && connectionResult.c != 24) {
            abso absoVar = this.i;
            absoVar.f = true;
            Handler handler = absoVar.o;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = connectionResult.c;
        if (i != 4) {
            if (i == 25) {
                d(o(connectionResult));
                return;
            }
            if (this.a.isEmpty()) {
                this.l = connectionResult;
                return;
            }
            if (exc != null) {
                abhg.d(this.i.o);
                q(null, exc, false);
                return;
            }
            if (!this.i.p) {
                d(o(connectionResult));
                return;
            }
            q(o(connectionResult), null, true);
            if (!this.a.isEmpty() && !u(connectionResult) && !this.i.i(connectionResult, this.e)) {
                if (connectionResult.c == 18) {
                    this.f = true;
                }
                if (this.f) {
                    abso absoVar2 = this.i;
                    abrv abrvVar = this.c;
                    Handler handler2 = absoVar2.o;
                    handler2.sendMessageDelayed(Message.obtain(handler2, 9, abrvVar), 5000L);
                    return;
                }
                d(o(connectionResult));
                return;
            }
            return;
        }
        d(abso.b);
    }

    public final void h(int i) {
        a();
        this.f = true;
        String k = this.b.k();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (k != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(k);
        }
        this.m.c(true, new Status(20, sb.toString()));
        abso absoVar = this.i;
        abrv abrvVar = this.c;
        Handler handler = absoVar.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, abrvVar), 5000L);
        abso absoVar2 = this.i;
        abrv abrvVar2 = this.c;
        Handler handler2 = absoVar2.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, abrvVar2), 120000L);
        this.i.i.a();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Object obj = ((addy) it.next()).a;
        }
    }

    public final void i(ConnectionResult connectionResult) {
        abhg.d(this.i.o);
        abqz abqzVar = this.b;
        abqzVar.g("onSignInFailed for " + abqzVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        onConnectionFailed(connectionResult);
    }

    public final void j() {
        abhg.d(this.i.o);
        d(abso.a);
        this.m.c(false, abso.a);
        for (absw abswVar : (absw[]) this.d.keySet().toArray(new absw[0])) {
            c(new abrt(abswVar, new acit()));
        }
        p(new ConnectionResult(4));
        if (this.b.p()) {
            this.b.u(new ahjj(this, (byte[]) null));
        }
    }

    public final void k() {
        if (this.f) {
            abso absoVar = this.i;
            absoVar.o.removeMessages(11, this.c);
            abso absoVar2 = this.i;
            absoVar2.o.removeMessages(9, this.c);
            this.f = false;
        }
    }

    public final boolean l() {
        return this.b.j();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final boolean m(boolean z) {
        abhg.d(this.i.o);
        if (this.b.p() && this.d.isEmpty()) {
            znp znpVar = this.m;
            if (znpVar.a.isEmpty() && znpVar.b.isEmpty()) {
                this.b.g("Timing out service connection.");
                return true;
            }
            if (z) {
                r();
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.absf
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.i.o.getLooper()) {
            f();
            return;
        }
        abso absoVar = this.i;
        absoVar.o.post(new aaxu(this, 16, null));
    }

    @Override // defpackage.abtc
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        g(connectionResult, null);
    }

    @Override // defpackage.absf
    public final void onConnectionSuspended(int i) {
        if (Looper.myLooper() == this.i.o.getLooper()) {
            h(i);
            return;
        }
        abso absoVar = this.i;
        absoVar.o.post(new ebm(this, i, 14));
    }
}
