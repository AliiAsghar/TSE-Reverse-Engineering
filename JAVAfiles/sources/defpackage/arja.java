package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.net.ssl.SSLSocketFactory;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arja implements aqze {
    final /* synthetic */ aqzf a;
    private final /* synthetic */ int b;

    public arja(aqzf aqzfVar, int i) {
        this.b = i;
        this.a = aqzfVar;
    }

    @Override // defpackage.aqze
    public final void a(Status status) {
        if (this.b != 0) {
            int i = aqyy.i;
            synchronized (((aqyz) this.a).o.a) {
                aqyy aqyyVar = ((aqyz) this.a).o;
                if (aqyyVar.d) {
                    return;
                }
                aqyyVar.d = true;
                aqyyVar.e = status;
                Iterator it = aqyyVar.b.iterator();
                while (it.hasNext()) {
                    ((ByteBuffer) ((aqyx) it.next()).c).clear();
                }
                aqyyVar.b.clear();
                aqzf aqzfVar = this.a;
                BidirectionalStream bidirectionalStream = ((aqyz) aqzfVar).k;
                if (bidirectionalStream != null) {
                    bidirectionalStream.cancel();
                } else {
                    ((aqyz) aqzfVar).i.a((aqyz) aqzfVar, status);
                }
                return;
            }
        }
        int i2 = armc.a;
        arjb arjbVar = ((arjc) this.a).f;
        int i3 = arjb.z;
        synchronized (arjbVar.a) {
            ((arjc) this.a).f.q(status, true, null);
        }
    }

    @Override // defpackage.aqze
    public final void b(arhv arhvVar, boolean z, boolean z2, int i) {
        asqu asquVar;
        boolean z3;
        ByteBuffer byteBuffer;
        if (this.b != 0) {
            int i2 = aqyy.i;
            synchronized (((aqyz) this.a).o.a) {
                if (((aqyz) this.a).o.d) {
                    return;
                }
                if (arhvVar != null) {
                    byteBuffer = ((aqzc) arhvVar).a;
                    byteBuffer.flip();
                } else {
                    byteBuffer = aqyz.a;
                }
                this.a.w(byteBuffer.remaining());
                aqzf aqzfVar = this.a;
                aqyy aqyyVar = ((aqyz) aqzfVar).o;
                if (!aqyyVar.c) {
                    aqyyVar.b.add(new aqyx(byteBuffer, z, z2));
                } else {
                    ((aqyz) aqzfVar).s(byteBuffer, z, z2);
                }
                return;
            }
        }
        int i3 = armc.a;
        if (arhvVar == null) {
            asquVar = arjc.a;
        } else {
            asquVar = ((arjn) arhvVar).a;
            int i4 = (int) asquVar.b;
            if (i4 > 0) {
                this.a.w(i4);
            }
        }
        arjb arjbVar = ((arjc) this.a).f;
        int i5 = arjb.z;
        synchronized (arjbVar.a) {
            arjb arjbVar2 = ((arjc) this.a).f;
            if (!arjbVar2.f) {
                if (arjbVar2.i) {
                    arjbVar2.c.hq(asquVar, (int) asquVar.b);
                    arjbVar2.d |= z;
                    arjbVar2.e |= z2;
                } else {
                    if (arjbVar2.w != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    albo.U(z3, "streamId should be set");
                    arjbVar2.y.e(z, arjbVar2.v, asquVar, z2);
                }
            }
            arhu arhuVar = this.a.r;
            if (i != 0) {
                arhuVar.f += i;
                arhuVar.a.a();
            }
        }
    }

    @Override // defpackage.aqze
    public final void c(aqut aqutVar) {
        if (this.b != 0) {
            ((aqyz) this.a).j.run();
            aqyz aqyzVar = (aqyz) this.a;
            aqyu aqyuVar = aqyzVar.p;
            if (aqyuVar == null) {
                return;
            }
            aqyw aqywVar = new aqyw(aqyzVar);
            String str = aqyzVar.d;
            boolean z = aqyuVar.b;
            BidirectionalStream.Builder newBidirectionalStreamBuilder = aqyuVar.a.newBidirectionalStreamBuilder(str, aqywVar, aqyzVar.g);
            if (z) {
                newBidirectionalStreamBuilder.setTrafficStatsTag(aqyuVar.c);
            }
            if (aqyuVar.d) {
                newBidirectionalStreamBuilder.setTrafficStatsUid(aqyuVar.e);
            }
            if (((aqyz) this.a).l) {
                newBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
            }
            aqyz aqyzVar2 = (aqyz) this.a;
            Object obj = aqyzVar2.m;
            if (obj != null || aqyzVar2.n != null) {
                if (obj != null) {
                    newBidirectionalStreamBuilder.addRequestAnnotation(obj);
                }
                Collection collection = ((aqyz) this.a).n;
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        newBidirectionalStreamBuilder.addRequestAnnotation(it.next());
                    }
                }
            }
            aqyz aqyzVar3 = (aqyz) this.a;
            newBidirectionalStreamBuilder.addHeader(arcb.j.a, aqyzVar3.e);
            newBidirectionalStreamBuilder.addHeader(arcb.h.a, "application/grpc");
            newBidirectionalStreamBuilder.addHeader("te", "trailers");
            byte[][] a = arht.a(aqyzVar3.h);
            for (int i = 0; i < a.length; i += 2) {
                String str2 = new String(a[i], StandardCharsets.UTF_8);
                if (!arcb.h.a.equalsIgnoreCase(str2) && !arcb.j.a.equalsIgnoreCase(str2) && !arcb.i.a.equalsIgnoreCase(str2)) {
                    newBidirectionalStreamBuilder.addHeader(str2, new String(a[i + 1], StandardCharsets.UTF_8));
                }
            }
            ((aqyz) this.a).k = newBidirectionalStreamBuilder.build();
            ((aqyz) this.a).k.start();
            return;
        }
        int i2 = armc.a;
        String cp = a.cp(((arjc) this.a).b.b, "/");
        arjb arjbVar = ((arjc) this.a).f;
        int i3 = arjb.z;
        synchronized (arjbVar.a) {
            arjb arjbVar2 = ((arjc) this.a).f;
            arjc arjcVar = arjbVar2.x;
            String str3 = arjcVar.e;
            String str4 = arjcVar.c;
            SSLSocketFactory sSLSocketFactory = arjbVar2.h.s;
            arkj arkjVar = arit.a;
            aqutVar.getClass();
            str3.getClass();
            aqutVar.e(arcb.h);
            aqutVar.e(arcb.i);
            aqutVar.e(arcb.j);
            Charset charset = aqth.a;
            ArrayList arrayList = new ArrayList(aqutVar.f + 7);
            if (sSLSocketFactory == null) {
                arrayList.add(arit.b);
            } else {
                arrayList.add(arit.a);
            }
            arrayList.add(arit.c);
            arrayList.add(new arkj(arkj.e, str3));
            arrayList.add(new arkj(arkj.c, cp));
            arrayList.add(new arkj(arcb.j.a, str4));
            arrayList.add(arit.e);
            arrayList.add(arit.f);
            byte[][] a2 = arht.a(aqutVar);
            for (int i4 = 0; i4 < a2.length; i4 += 2) {
                asqx f = asqx.f(a2[i4]);
                if (f.b() != 0 && f.a(0) != 58) {
                    arrayList.add(new arkj(f, asqx.f(a2[i4 + 1])));
                }
            }
            arjbVar2.b = arrayList;
            arjh arjhVar = arjbVar2.h;
            arjc arjcVar2 = arjbVar2.x;
            Status status = arjhVar.o;
            if (status != null) {
                arjcVar2.f.m(status, arak.MISCARRIED, true, new aqut());
            } else if (arjhVar.j.size() >= arjhVar.t) {
                arjhVar.u.add(arjcVar2);
                arjhVar.k(arjcVar2);
            } else {
                arjhVar.m(arjcVar2);
            }
        }
    }
}
