package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiiv extends Thread {
    private static final advp b = new advp("MsrpReceiver");
    public boolean a = false;
    private final InputStream c;
    private final PowerManager.WakeLock d;
    private final aijb e;

    public aiiv(Context context, aijb aijbVar, InputStream inputStream) {
        this.e = aijbVar;
        this.c = inputStream;
        this.d = adwm.a(context).newWakeLock(1, "CarrierServices:MsrpReceiver");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        aijc p;
        long j;
        String b2;
        PowerManager.WakeLock wakeLock;
        int i = 2;
        try {
            advr.c("Receiver is started", new Object[0]);
            while (!this.a) {
                try {
                    if (((Boolean) acpy.g.a()).booleanValue() && aczl.o()) {
                        aigi aigiVar = new aigi(this.c);
                        p = ahji.p(aigiVar);
                        if (p != null) {
                            advr.d(b, "MSRP message: %s", new String(aigiVar.a.array()));
                        }
                    } else {
                        p = ahji.p(this.c);
                    }
                } catch (SocketTimeoutException unused) {
                    advr.c("Socket read timeout due to inactivity", new Object[0]);
                }
                if (p != null) {
                    if (this.e != null) {
                        if (adaa.o() > 0 && (wakeLock = this.d) != null) {
                            wakeLock.acquire(adaa.o());
                        }
                        if (p instanceof aiiw) {
                            aijb aijbVar = this.e;
                            aiiw aiiwVar = (aiiw) p;
                            advr.d(aijbVar.f, "New request transaction (id=%s)", aiiwVar.d);
                            String a = aiiwVar.a();
                            if (a == null) {
                                advr.r(aijbVar.f, "Received a MSRP request with null message ID. Ignoring", new Object[0]);
                            } else {
                                advr.w(18, 3, "MSRP request received ", new Object[0]);
                                aiiu aiiuVar = (aiiu) aijbVar.g.get(aiiwVar.a());
                                if (aiiuVar == null) {
                                    aiiuVar = new aiiu(aiiwVar.c);
                                    aijbVar.g.put(a, aiiuVar);
                                    advr.d(aijbVar.f, "Created new msrp message with message ID: %s", aiiuVar.b());
                                    if (aiiwVar.e(assi.a) != null) {
                                        alur it = ((alog) aijbVar.d).iterator();
                                        while (it.hasNext()) {
                                            ((aiio) it.next()).aM(aiiuVar);
                                        }
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            aiiuVar.s.k(aiiwVar.b.o());
                                            int i2 = aiiwVar.a;
                                            String e = aiiwVar.e("Failure-Report");
                                            int i3 = i2 - 1;
                                            if (i3 != 1) {
                                                if (i3 != 2) {
                                                    advr.h(aijbVar.f, "receiveMsrpRequest: UNKNOWN method", new Object[0]);
                                                    aijbVar.c(aiix.a(aiiwVar, 501, "MIME-not-understood"), aiiwVar);
                                                } else {
                                                    advr.d(aijbVar.f, "REPORT request received", new Object[0]);
                                                    alur it2 = ((alog) aijbVar.d).iterator();
                                                    while (it2.hasNext()) {
                                                        ((aiio) it2.next()).bm(aiiwVar);
                                                    }
                                                }
                                            } else {
                                                if (e == null || "yes".equals(e)) {
                                                    aijbVar.c(aiix.a(aiiwVar, BasePaymentResult.ERROR_REQUEST_FAILED, "OK"), aiiwVar);
                                                }
                                                int i4 = aiiwVar.e;
                                                if (i4 == 36) {
                                                    aijbVar.g.remove(aiiwVar.a());
                                                    advr.c("Timestamp for LAST_CHUNK_RECEIVED: %d", agkx.W());
                                                    advr.w(17, 3, "complete request received (messageid=%s, data size=%d", aiiuVar.b(), Long.valueOf(aiiuVar.e));
                                                    if (((Boolean) aczl.c().a.d.a()).booleanValue() && (b2 = aiiuVar.b()) != null && !aijbVar.i.add(b2)) {
                                                        advr.l(aijbVar.f, "Discarding received MSRP message duplicate with ID: %s", b2);
                                                    } else {
                                                        boolean equals = "yes".equals(aiiuVar.h);
                                                        if (aiiuVar.g != null) {
                                                            byte[] o = aiiuVar.s.o();
                                                            aiiuVar.s.n();
                                                            if (o != null) {
                                                                aiiuVar.b = aozb.w(o);
                                                            }
                                                            if (o != null) {
                                                                j = o.length;
                                                            } else {
                                                                j = 0;
                                                            }
                                                            aiiuVar.e = j;
                                                            alur it3 = ((alog) aijbVar.d).iterator();
                                                            while (it3.hasNext()) {
                                                                ((aiio) it3.next()).be(aijbVar, aiiuVar);
                                                            }
                                                            if (ahkc.d() && aczg.d()) {
                                                                ahkc.a().e(new ahka("msrpMessageReceived"));
                                                            }
                                                        }
                                                        if (equals) {
                                                            try {
                                                                aiiu aiiuVar2 = new aiiu();
                                                                aiiuVar2.p = 3;
                                                                aiiuVar2.q = 1;
                                                                aiiuVar2.f = aiiuVar.e;
                                                                ahlp ahlpVar = new ahlp((byte[]) null, (byte[]) null);
                                                                String a2 = aiiuVar.a();
                                                                a2.getClass();
                                                                ahlpVar.e("To-Path", a2);
                                                                String d = aiiuVar.d();
                                                                d.getClass();
                                                                ahlpVar.e("From-Path", d);
                                                                String b3 = aiiuVar.b();
                                                                b3.getClass();
                                                                ahlpVar.e("Message-ID", b3);
                                                                aiiuVar2.r = ahlpVar;
                                                                aiiuVar2.n = BasePaymentResult.ERROR_REQUEST_FAILED;
                                                                aijbVar.a(aiiuVar2, false);
                                                            } catch (IOException e2) {
                                                                advr.j(e2, aijbVar.f, "Error while sending success report: %s", e2.getMessage());
                                                            }
                                                        }
                                                    }
                                                } else if (i4 == 35) {
                                                    aijbVar.g.remove(aiiwVar.a());
                                                    advr.d(aijbVar.f, "Aborted request received. Message ID: %s. Data size: %s", aiiuVar.b(), Long.valueOf(aiiuVar.e));
                                                    atkt atktVar = aiiuVar.s;
                                                    if (atktVar != null) {
                                                        try {
                                                            atktVar.m();
                                                            aiiuVar.s.l();
                                                        } catch (IOException e3) {
                                                            advr.j(e3, aiiu.a, "Error while closing message: %s", e3.getMessage());
                                                        }
                                                    }
                                                    aiiuVar.s.n();
                                                    try {
                                                        aiiuVar.s.l();
                                                    } catch (IOException e4) {
                                                        advr.j(e4, aijbVar.f, "Error while closing chunk cache", new Object[0]);
                                                    }
                                                    aijbVar.b(aiiuVar);
                                                } else if (i4 == 43) {
                                                    advr.d(aijbVar.f, "More chunks are coming - expecting next transaction", new Object[0]);
                                                }
                                            }
                                        } finally {
                                            aiiwVar.b();
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        Exception exc = e;
                                        advr.j(exc, aijbVar.f, "Error while processing request: %s", exc.getMessage());
                                        aijbVar.e(aiiuVar, 1);
                                    }
                                } catch (aiip e6) {
                                    e = e6;
                                    Exception exc2 = e;
                                    advr.j(exc2, aijbVar.f, "Error while processing request: %s", exc2.getMessage());
                                    aijbVar.e(aiiuVar, 1);
                                }
                            }
                        } else {
                            aijb aijbVar2 = this.e;
                            aiix aiixVar = (aiix) p;
                            advr.d(aijbVar2.f, "New response transaction (id=%s)", aiixVar.d);
                            if (aijbVar2.h.isEmpty()) {
                                advr.r(aijbVar2.f, "No pending transaction found for response: %s", aiixVar.d);
                            } else {
                                advr.w(19, 3, "Received MSRP response %d", Integer.valueOf(aiixVar.a));
                                if (!aiixVar.d.equals(((aiiy) aijbVar2.h.get()).a())) {
                                    advr.r(aijbVar2.f, "Received a response but there is no pending transactions associated with the ID: %s", aiixVar.d);
                                } else {
                                    ((aiiy) aijbVar2.h.get()).b = aiixVar;
                                    int i5 = aiixVar.a;
                                    if (i5 != 200) {
                                        if (i5 != 413) {
                                            advr.d(aijbVar2.f, "Received %d response", Integer.valueOf(i5));
                                        } else {
                                            advr.d(aijbVar2.f, "Received 413 response - stop sending message", new Object[0]);
                                        }
                                    } else {
                                        advr.c("Timestamp for MSRP_OK_RESPONSE: %d", agkx.W());
                                    }
                                }
                            }
                            aiiu aiiuVar3 = (aiiu) aijbVar2.h.map(new aiec(13)).orElse(null);
                            alur it4 = ((alog) aijbVar2.d).iterator();
                            while (it4.hasNext()) {
                                ((aiio) it4.next()).bi(aijbVar2, aiixVar, aiiuVar3);
                            }
                            aijbVar2.h.ifPresent(new aihs(i));
                        }
                    }
                } else {
                    throw new EOFException();
                }
            }
        } catch (Exception e7) {
            if (this.a) {
                advr.c("MSRP receiver thread terminated", new Object[0]);
                return;
            }
            advr.i(e7, "MSRP receiver has failed", new Object[0]);
            this.a = true;
            aijb aijbVar3 = this.e;
            if (aijbVar3 != null) {
                String valueOf = String.valueOf(e7.getMessage());
                aiip aiipVar = new aiip(e7);
                if (aiipVar.getCause() != null && aiipVar.getCause().getClass() == EOFException.class) {
                    advr.r(aijbVar3.f, "MSRP socket is closed by the server.", new Object[0]);
                    aijbVar3.e(null, 4);
                } else {
                    advr.h(aijbVar3.f, "Generic transfer error:[%s] on message:[%s]", aiipVar.getMessage(), "MSRP receiver has failed : ".concat(valueOf));
                    aijbVar3.e(null, 1);
                }
            }
        }
    }
}
