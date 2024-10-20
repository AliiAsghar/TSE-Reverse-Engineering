package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aqxh implements IBinder.DeathRecipient, aqxu {
    public static final Logger e = Logger.getLogger(aqxh.class.getName());
    public static final aqrl f = new aqrl("internal:remote-uid");
    public static final aqrl g = new aqrl("internal:server-authority");
    public static final aqrl h = new aqrl("internal:inbound-parcelable-policy");
    private final arep a;
    private final aqtf b;
    public final ScheduledExecutorService i;
    protected aqrm k;
    public Status l;
    public aqyc m;
    private long p;
    private final LinkedHashSet d = new LinkedHashSet();
    private int q = 1;
    private final aqxv c = new aqxv(this);
    protected final ConcurrentHashMap j = new ConcurrentHashMap();
    private final aqxo n = new aqxo();
    private final AtomicLong o = new AtomicLong();

    public aqxh(arep arepVar, aqrm aqrmVar, aqtf aqtfVar) {
        this.a = arepVar;
        this.k = aqrmVar;
        this.b = aqtfVar;
        this.i = (ScheduledExecutorService) arepVar.a();
    }

    private static Status b(RemoteException remoteException) {
        if (!(remoteException instanceof DeadObjectException) && !(remoteException instanceof TransactionTooLargeException)) {
            return Status.m.d(remoteException);
        }
        return Status.n.d(remoteException);
    }

    private final void e() {
        aqyc aqycVar = this.m;
        if (aqycVar != null) {
            try {
                aqycVar.b.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            try {
                aqyg c = aqyg.c();
                try {
                    c.a().writeInt(0);
                    this.m.a(2, c);
                    c.close();
                } finally {
                }
            } catch (RemoteException unused2) {
            }
        }
    }

    public final boolean A(int i) {
        if (this.q == i) {
            return true;
        }
        return false;
    }

    protected aqxt C(int i) {
        return null;
    }

    @Override // defpackage.aqxu
    public final boolean a(int i, Parcel parcel) {
        aqyg c;
        boolean z;
        aqyf aqyfVar;
        arhq arhqVar;
        try {
            if (i < 1001) {
                synchronized (this) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        return false;
                                    }
                                    g(parcel);
                                } else {
                                    int readInt = parcel.readInt();
                                    if (this.q == 3) {
                                        try {
                                            c = aqyg.c();
                                            try {
                                                c.a().writeInt(readInt);
                                                this.m.a(5, c);
                                                c.close();
                                            } finally {
                                            }
                                        } catch (RemoteException unused) {
                                        }
                                    }
                                }
                            } else if (this.n.a(parcel.readLong())) {
                                e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(toString()));
                                this.d.addAll(this.j.keySet());
                                Iterator it = this.d.iterator();
                                while (w() && it.hasNext()) {
                                    aqxt aqxtVar = (aqxt) this.j.get(it.next());
                                    it.remove();
                                    if (aqxtVar != null) {
                                        synchronized (aqxtVar) {
                                            aqyfVar = aqxtVar.e;
                                            arhqVar = aqxtVar.g;
                                        }
                                        if (arhqVar != null) {
                                            arhqVar.e();
                                        }
                                        if (aqyfVar != null) {
                                            try {
                                                synchronized (aqyfVar) {
                                                    aqyfVar.g();
                                                }
                                            } catch (StatusException e2) {
                                                synchronized (aqxtVar) {
                                                    aqxtVar.h(e2.a);
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                        } else {
                            u(Status.n.withDescription("transport shutdown by peer"), true);
                        }
                    } else {
                        h(parcel);
                    }
                }
            } else {
                int dataSize = parcel.dataSize();
                ConcurrentHashMap concurrentHashMap = this.j;
                Integer valueOf = Integer.valueOf(i);
                aqxt aqxtVar2 = (aqxt) concurrentHashMap.get(valueOf);
                if (aqxtVar2 == null) {
                    synchronized (this) {
                        if (!x() && (aqxtVar2 = C(i)) != null) {
                            aqxt aqxtVar3 = (aqxt) this.j.put(valueOf, aqxtVar2);
                            if (aqxtVar3 == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            albo.z(z, "impossible appearance of %s", aqxtVar3);
                        }
                    }
                }
                if (aqxtVar2 != null) {
                    aqxtVar2.k(parcel);
                }
                if (this.o.addAndGet(dataSize) - this.p > 16384) {
                    synchronized (this) {
                        aqyc aqycVar = this.m;
                        aqycVar.getClass();
                        long j = this.o.get();
                        this.p = j;
                        try {
                            c = aqyg.c();
                            try {
                                c.a().writeLong(j);
                                aqycVar.a(3, c);
                                c.close();
                            } finally {
                            }
                        } catch (RemoteException e3) {
                            u(b(e3), true);
                        }
                    }
                }
            }
            return true;
        } catch (RuntimeException e4) {
            e.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", a.bV(i, "Terminating transport for uncaught Exception in transaction "), (Throwable) e4);
            synchronized (this) {
                u(Status.m.d(e4), true);
                return false;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        u(Status.n.withDescription("binderDied"), true);
    }

    public final aqtf c() {
        return this.b;
    }

    public abstract void i(Status status);

    public abstract void j();

    public void n() {
        this.a.b(this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(aqxt aqxtVar) {
        v(aqxtVar.d);
    }

    public final synchronized aqrm r() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(aqyc aqycVar) {
        try {
            aqyg c = aqyg.c();
            try {
                c.a().writeInt(1);
                c.a().writeStrongBinder(this.c);
                aqycVar.a(1, c);
                c.close();
            } finally {
            }
        } catch (RemoteException e2) {
            u(b(e2), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(int i, aqyg aqygVar) {
        int dataSize = aqygVar.a().dataSize();
        try {
            this.m.a(i, aqygVar);
            if (this.n.b(dataSize)) {
                e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (RemoteException e2) {
            throw b(e2).asException();
        }
    }

    public final void u(Status status, boolean z) {
        if (!x()) {
            this.l = status;
            z(4);
            i(status);
        }
        if (!A(5)) {
            if (z || this.j.isEmpty()) {
                this.c.a = null;
                z(5);
                e();
                ArrayList arrayList = new ArrayList(this.j.values());
                this.j.clear();
                this.i.execute(new aofo(this, arrayList, status, 12));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(int i) {
        if (this.j.remove(Integer.valueOf(i)) != null && this.j.isEmpty()) {
            this.i.execute(new aomp(this, 9));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w() {
        if (!this.n.a) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x() {
        if (!A(4) && !A(5)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean y(aqyc aqycVar) {
        this.m = aqycVar;
        try {
            aqycVar.b.linkToDeath(this, 0);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final void z(int i) {
        int i2 = this.q;
        int i3 = i - 1;
        boolean z = false;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i2 == 4) {
                        z = true;
                    }
                    albo.T(z);
                } else {
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        z = true;
                    }
                    albo.T(z);
                }
            } else {
                if (i2 == 1 || i2 == 2) {
                    z = true;
                }
                albo.T(z);
            }
        } else {
            if (i2 == 1) {
                z = true;
            }
            albo.T(z);
        }
        this.q = i;
    }

    protected void g(Parcel parcel) {
    }

    protected void h(Parcel parcel) {
    }
}
