package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.nio.channels.ReadableByteChannel;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arer implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public arer(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        asmv asmvVar;
        long j;
        boolean z;
        int i = 0;
        asmv asmvVar2 = null;
        switch (this.b) {
            case 0:
                arey areyVar = (arey) this.a;
                areyVar.q = null;
                areyVar.i.c();
                ((aqtz) this.a).d();
                return;
            case 1:
                ((aqzj) this.a).f.g(ardr.c);
                return;
            case 2:
                arey areyVar2 = (arey) this.a;
                areyVar2.p = null;
                if (areyVar2.i.e()) {
                    ((aqtz) this.a).d();
                    return;
                }
                return;
            case 3:
                ((aqtz) this.a).d();
                return;
            case 4:
                ((arfc) this.a).a.a();
                return;
            case 5:
                arfn arfnVar = (arfn) this.a;
                if (!arfnVar.e) {
                    arfnVar.f = null;
                    return;
                }
                long a = arfnVar.a();
                Object obj = this.a;
                arfn arfnVar2 = (arfn) obj;
                long j2 = arfnVar2.d - a;
                if (j2 > 0) {
                    arfnVar2.f = arfnVar2.a.schedule(new arer(obj, 6), j2, TimeUnit.NANOSECONDS);
                    return;
                }
                arfnVar2.e = false;
                arfnVar2.f = null;
                arfnVar2.c.run();
                return;
            case 6:
                Object obj2 = this.a;
                ((arfn) obj2).b.execute(new arer(obj2, 5));
                return;
            case 7:
                argc.x((argc) ((qzc) this.a).d);
                argc argcVar = (argc) ((qzc) this.a).d;
                aral aralVar = argcVar.v;
                asqe asqeVar = argcVar.E;
                aralVar.a((Status) asqeVar.c, (arak) asqeVar.b, (aqut) asqeVar.a);
                return;
            case 8:
                argc argcVar2 = (argc) this.a;
                if (!argcVar2.z) {
                    argcVar2.v.e();
                    return;
                }
                return;
            case 9:
                argc.x(((arfz) this.a).b);
                argc argcVar3 = ((arfz) this.a).b;
                aral aralVar2 = argcVar3.v;
                asqe asqeVar2 = argcVar3.E;
                aralVar2.a((Status) asqeVar2.c, (arak) asqeVar2.b, (aqut) asqeVar2.a);
                return;
            case 10:
                argc argcVar4 = ((arfz) this.a).b;
                if (!argcVar4.z) {
                    argcVar4.v.e();
                    return;
                }
                return;
            case 11:
                ((aqvd) this.a).b();
                return;
            case 12:
                ((argy) this.a).c.k(Status.c.withDescription("Handshake timeout exceeded"));
                return;
            case 13:
                try {
                    Object obj3 = this.a;
                    asro asroVar = ((arip) obj3).f;
                    if (asroVar != null) {
                        asqu asquVar = ((arip) obj3).b;
                        long j3 = asquVar.b;
                        if (j3 > 0) {
                            asroVar.hq(asquVar, j3);
                        }
                    }
                } catch (IOException e) {
                    ((arip) this.a).c.a(e);
                }
                try {
                    asro asroVar2 = ((arip) this.a).f;
                    if (asroVar2 != null) {
                        asroVar2.close();
                    }
                } catch (IOException e2) {
                    ((arip) this.a).c.a(e2);
                }
                try {
                    Socket socket = ((arip) this.a).g;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    ((arip) this.a).c.a(e3);
                    return;
                }
            case 14:
                aqzl aqzlVar = (aqzl) this.a;
                AtomicLong atomicLong = aqzlVar.b.c;
                long j4 = aqzlVar.a;
                long max = Math.max(j4 + j4, j4);
                if (atomicLong.compareAndSet(j4, max)) {
                    aqzm.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{aqzlVar.b.b, Long.valueOf(max)});
                    return;
                }
                return;
            case 15:
                arjh arjhVar = (arjh) this.a;
                arjhVar.k.execute(arjhVar.m);
                synchronized (((arjh) this.a).i) {
                    Object obj4 = this.a;
                    ((arjh) obj4).t = Integer.MAX_VALUE;
                    ((arjh) obj4).q();
                }
                return;
            case 16:
                break;
            case 17:
                ((atew) this.a).g++;
                return;
            case 18:
                atfe atfeVar = (atfe) this.a;
                atew atewVar = atfeVar.y;
                if (atewVar != null) {
                    try {
                        atewVar.e();
                    } catch (IOException e4) {
                        Log.e(atfe.a, "Exception when closing OutputChannel", e4);
                    }
                }
                HttpURLConnection httpURLConnection = atfeVar.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    atfeVar.q = null;
                    return;
                }
                return;
            case 19:
                atfe atfeVar2 = (atfe) this.a;
                atfeVar2.f.add(atfeVar2.m);
                atfeVar2.g();
                return;
            default:
                atfe atfeVar3 = (atfe) this.a;
                ReadableByteChannel readableByteChannel = atfeVar3.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    atfeVar3.n = null;
                    return;
                }
                return;
        }
        while (true) {
            Object obj5 = this.a;
            synchronized (obj5) {
                byte[] bArr = asmt.a;
                while (true) {
                    if (((asmy) obj5).f.isEmpty()) {
                        asmvVar = asmvVar2;
                    } else {
                        long nanoTime = System.nanoTime();
                        Iterator it = ((asmy) obj5).f.iterator();
                        long j5 = Long.MAX_VALUE;
                        asmvVar = asmvVar2;
                        while (true) {
                            if (it.hasNext()) {
                                asmv asmvVar3 = (asmv) ((asmx) it.next()).e.get(i);
                                long max2 = Math.max(0L, asmvVar3.c - nanoTime);
                                if (max2 > 0) {
                                    j5 = Math.min(max2, j5);
                                } else if (asmvVar != null) {
                                    z = true;
                                } else {
                                    asmvVar = asmvVar3;
                                }
                                i = 0;
                            } else {
                                z = false;
                            }
                        }
                        if (asmvVar != null) {
                            asmvVar.c = -1L;
                            asmx asmxVar = asmvVar.b;
                            asmxVar.getClass();
                            asmxVar.e.remove(asmvVar);
                            ((asmy) obj5).f.remove(asmxVar);
                            asmxVar.d = asmvVar;
                            ((asmy) obj5).e.add(asmxVar);
                            if (z || (!((asmy) obj5).c && !((asmy) obj5).f.isEmpty())) {
                                ((asmy) obj5).h.g(((asmy) obj5).g);
                            }
                        } else if (((asmy) obj5).c) {
                            if (j5 < ((asmy) obj5).d - nanoTime) {
                                obj5.notify();
                            }
                            asmvVar = null;
                        } else {
                            ((asmy) obj5).c = true;
                            ((asmy) obj5).d = nanoTime + j5;
                            try {
                                try {
                                    long j6 = j5 / 1000000;
                                    if (j6 > 0 || j5 > 0) {
                                        Long.signum(j6);
                                        obj5.wait(j6, (int) (j5 - (1000000 * j6)));
                                    }
                                    ((asmy) obj5).c = false;
                                } catch (InterruptedException unused) {
                                    int size = ((asmy) obj5).e.size();
                                    while (true) {
                                        size--;
                                        if (size >= 0) {
                                            ((asmx) ((asmy) obj5).e.get(size)).c();
                                        } else {
                                            int size2 = ((asmy) obj5).f.size();
                                            while (true) {
                                                size2--;
                                                if (size2 >= 0) {
                                                    asmx asmxVar2 = (asmx) ((asmy) obj5).f.get(size2);
                                                    asmxVar2.c();
                                                    if (asmxVar2.e.isEmpty()) {
                                                        ((asmy) obj5).f.remove(size2);
                                                    }
                                                } else {
                                                    ((asmy) obj5).c = false;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = 0;
                                asmvVar2 = null;
                            } catch (Throwable th) {
                                ((asmy) obj5).c = false;
                                throw th;
                            }
                        }
                    }
                }
            }
            if (asmvVar == null) {
                return;
            }
            asmx asmxVar3 = asmvVar.b;
            asmxVar3.getClass();
            Object obj6 = this.a;
            boolean isLoggable = asmy.b.isLoggable(Level.FINE);
            if (isLoggable) {
                j = System.nanoTime();
                aotl.ai(asmvVar, asmxVar3, "starting");
            } else {
                j = -1;
            }
            try {
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                currentThread.setName(asmvVar.a);
                try {
                    long a2 = asmvVar.a();
                    synchronized (obj6) {
                        ((asmy) obj6).b(asmvVar, a2);
                    }
                    currentThread.setName(name);
                    if (isLoggable) {
                        aotl.ai(asmvVar, asmxVar3, "finished run in ".concat(aotl.ah(System.nanoTime() - j)));
                    }
                    i = 0;
                    asmvVar2 = null;
                } catch (Throwable th2) {
                    synchronized (obj6) {
                        ((asmy) obj6).b(asmvVar, -1L);
                        currentThread.setName(name);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    ((asmy) obj6).h.g(this);
                    throw th3;
                } catch (Throwable th4) {
                    if (isLoggable) {
                        aotl.ai(asmvVar, asmxVar3, "failed a run in ".concat(aotl.ah(System.nanoTime() - j)));
                    }
                    throw th4;
                }
            }
        }
    }

    public /* synthetic */ arer(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
