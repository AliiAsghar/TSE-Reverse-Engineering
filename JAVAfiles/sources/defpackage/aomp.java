package defpackage;

import android.media.AudioTimestamp;
import android.os.Process;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aomp implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aomp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, aree] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, aree] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int timestamp;
        long j;
        switch (this.b) {
            case 0:
                int i = aoms.c;
                if (this.a.isCancelled()) {
                    Log.d("ClientLoggingBackend", "Log cancelled. The app has crashed.");
                    return;
                }
                return;
            case 1:
                ((apsd) this.a).e();
                return;
            case 2:
                ((aoxg) this.a.getKey()).a();
                return;
            case 3:
                aoxj.f((aoxm) this.a);
                return;
            case 4:
                Process.setThreadPriority(-16);
                System.nanoTime();
                int i2 = 0;
                while (true) {
                    Object obj = this.a;
                    aoxk aoxkVar = (aoxk) obj;
                    if (aoxkVar.h && aoxkVar.e != null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aoxkVar.d);
                        int i3 = 0;
                        while (i3 < allocateDirect.capacity()) {
                            try {
                                int read = ((aoxk) obj).e.read(allocateDirect, allocateDirect.capacity() - i3, 0);
                                if (read <= 0) {
                                    String str = "ERROR";
                                    if (read != -3) {
                                        if (read != -2) {
                                            if (read == -6) {
                                                str = "ERROR_DEAD_OBJECT";
                                            }
                                        } else {
                                            str = "ERROR_BAD_VALUE";
                                        }
                                    } else {
                                        str = "ERROR_INVALID_OPERATION";
                                    }
                                    throw new IOException("AudioRecord.read(...) failed due to ".concat(str));
                                    break;
                                } else {
                                    i3 += read;
                                    allocateDirect.position(i3);
                                }
                            } catch (IOException e) {
                                Log.e("MicrophoneHelper", e.getMessage());
                            }
                        }
                        allocateDirect.position(0);
                        long j2 = i2;
                        aoxkVar.e.getClass();
                        AudioTimestamp audioTimestamp = new AudioTimestamp();
                        timestamp = aoxkVar.e.getTimestamp(audioTimestamp, 0);
                        if (timestamp != 0) {
                            Log.e("MicrophoneHelper", a.bV(timestamp, "audioRecord.getTimestamp failed with status: "));
                            audioTimestamp = null;
                        }
                        if (audioTimestamp != null) {
                            j = audioTimestamp.framePosition;
                            long j3 = audioTimestamp.nanoTime;
                        } else {
                            j = 0;
                        }
                        long j4 = ((j2 - j) * 1000000000) / aoxkVar.a;
                        if (i2 == 0) {
                            i2 = 0;
                        }
                        i2 += allocateDirect.limit() / 2;
                        if (aoxkVar.h) {
                            Iterator it = aoxkVar.i.iterator();
                            while (it.hasNext()) {
                                Object obj2 = ((ahjj) it.next()).a;
                                ShortBuffer asShortBuffer = allocateDirect.order(ByteOrder.nativeOrder()).asShortBuffer();
                                asShortBuffer.getClass();
                                while (asShortBuffer.hasRemaining()) {
                                    int abs = Math.abs((int) asShortBuffer.get());
                                    afft afftVar = (afft) obj2;
                                    if (abs > afftVar.h) {
                                        afftVar.h = abs;
                                    }
                                }
                                allocateDirect.getClass();
                                afft afftVar2 = (afft) obj2;
                                arrn.G(afftVar2.b, new lxi(afftVar2, allocateDirect, (arpe) null, 7));
                            }
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                ((apvs) this.a).c.cancel();
                return;
            case 6:
                ((apvs) this.a).c.start();
                return;
            case 7:
                try {
                    ((aqsf) this.a).j(new TimeoutException("context timed out"));
                    return;
                } catch (Throwable th) {
                    aqsm.c.logp(Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", th);
                    return;
                }
            case 8:
                ((aqxe) this.a).b();
                return;
            case 9:
                Object obj3 = this.a;
                synchronized (obj3) {
                    if (((aqxh) obj3).A(4)) {
                        ((aqxh) obj3).u(((aqxh) obj3).l, true);
                    }
                }
                return;
            case 10:
                Object obj4 = this.a;
                synchronized (obj4) {
                    if (((aqxh) obj4).A(1)) {
                        ((aqxh) obj4).z(2);
                        ((aqxf) obj4).b.a();
                        ((aqxf) obj4).d = ((aqxh) obj4).i.schedule(new aomp(obj4, 11), ((aqxf) obj4).c, TimeUnit.MILLISECONDS);
                    }
                }
                return;
            case 11:
                ((aqxf) this.a).l();
                return;
            case 12:
                aqzb aqzbVar = (aqzb) this.a;
                aree areeVar = aqzbVar.b;
                aqrm aqrmVar = aqzbVar.h;
                areeVar.e();
                aqzbVar.h = aqrmVar;
                ((aqzb) this.a).b.b();
                return;
            case 13:
                aqzt aqztVar = (aqzt) this.a;
                asmb asmbVar = aqztVar.e;
                if (asmbVar != null && asmbVar.n()) {
                    asmbVar.m();
                }
                aqztVar.d = null;
                return;
            case 14:
                ((arbd) this.a).b.d();
                return;
            case 15:
                ((arbc) this.a).c.e();
                return;
            case 16:
                this.a.a(true);
                return;
            case 17:
                this.a.a(false);
                return;
            case 18:
                ardf ardfVar = (ardf) this.a;
                albo.U(ardfVar.a.B.get(), "Channel must have been shut down");
                ardr ardrVar = ardfVar.a;
                ardrVar.C = true;
                ardrVar.m(false);
                ardfVar.a.k();
                return;
            case 19:
                albo.U(((ardf) ((arbf) this.a).f).a.B.get(), "Channel must have been shut down");
                return;
            default:
                ((arbi) this.a).e.f();
                return;
        }
    }

    public aomp(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
