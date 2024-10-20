package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjo extends Handler implements Runnable {
    public IOException a;
    public int b;
    final /* synthetic */ fjq c;
    private fjn d;
    private Thread e;
    private boolean f;
    private volatile boolean g;
    private final fhj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjo(fjq fjqVar, Looper looper, fhj fhjVar, fjn fjnVar) {
        super(looper);
        this.c = fjqVar;
        this.h = fhjVar;
        this.d = fjnVar;
    }

    private final void c() {
        SystemClock.elapsedRealtime();
        dzg.g(this.d);
        this.a = null;
        fjq fjqVar = this.c;
        fjo fjoVar = fjqVar.c;
        dzg.g(fjoVar);
        fjqVar.a.execute(fjoVar);
    }

    private final void d() {
        this.c.c = null;
    }

    public final void a(boolean z) {
        this.g = z;
        this.a = null;
        if (hasMessages(1)) {
            this.f = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.f = true;
                this.h.e = true;
                Thread thread = this.e;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            d();
            SystemClock.elapsedRealtime();
            fjn fjnVar = this.d;
            dzg.g(fjnVar);
            fjnVar.y(this.h, true);
            this.d = null;
        }
    }

    public final void b(long j) {
        boolean z;
        if (this.c.c == null) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        this.c.c = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [fhx, java.lang.Object, fjn] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        fmk fmkVar;
        int i;
        atgu atguVar;
        fmk fmkVar2;
        boolean z;
        if (!this.g) {
            if (message.what == 1) {
                c();
                return;
            }
            if (message.what != 4) {
                d();
                SystemClock.elapsedRealtime();
                ?? r2 = this.d;
                dzg.g(r2);
                if (this.f) {
                    r2.y(this.h, false);
                    return;
                }
                int i2 = message.what;
                long j = 0;
                if (i2 != 2) {
                    if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.a = iOException;
                        int i3 = this.b + 1;
                        this.b = i3;
                        fhj fhjVar = this.h;
                        ewb ewbVar = fhjVar.c;
                        long j2 = fhjVar.a;
                        evl evlVar = fhjVar.h;
                        fgm fgmVar = new fgm();
                        long j3 = fhjVar.g;
                        int i4 = eul.a;
                        long h = eec.h(new atal(iOException, i3));
                        if (h == -9223372036854775807L) {
                            atguVar = fjq.f;
                        } else {
                            fhm fhmVar = (fhm) r2;
                            int b = fhmVar.b();
                            if (b > fhmVar.s) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            if (!fhmVar.p && ((fmkVar2 = fhmVar.k) == null || fmkVar2.a() == -9223372036854775807L)) {
                                boolean z2 = fhmVar.j;
                                if (z2 && !fhmVar.x()) {
                                    fhmVar.r = true;
                                    atguVar = fjq.e;
                                } else {
                                    fhmVar.o = z2;
                                    fhmVar.q = 0L;
                                    fhmVar.s = 0;
                                    for (fhu fhuVar : fhmVar.i) {
                                        fhuVar.j();
                                    }
                                    fhjVar.b(0L, 0L);
                                }
                            } else {
                                fhmVar.s = b;
                            }
                            atguVar = new atgu(i, h);
                        }
                        int i5 = atguVar.a;
                        if (i5 != 0 && i5 != 1) {
                            z = false;
                        } else {
                            z = true;
                        }
                        fhm fhmVar2 = (fhm) r2;
                        fhmVar2.x.v(fgmVar, new fgr(-1, null, eul.z(fhjVar.g), eul.z(fhmVar2.l)), iOException, !z);
                        if (!z) {
                            long j4 = fhjVar.a;
                        }
                        int i6 = atguVar.a;
                        if (i6 != 3) {
                            if (i6 != 2) {
                                if (i6 == 1) {
                                    this.b = 1;
                                }
                                long j5 = atguVar.b;
                                if (j5 == -9223372036854775807L) {
                                    j5 = Math.min((this.b - 1) * 1000, 5000);
                                }
                                b(j5);
                                return;
                            }
                            return;
                        }
                        this.c.d = this.a;
                        return;
                    }
                    return;
                }
                try {
                    fhj fhjVar2 = this.h;
                    if (((fhm) r2).l == -9223372036854775807L && (fmkVar = ((fhm) r2).k) != null) {
                        boolean c = fmkVar.c();
                        long c2 = ((fhm) r2).c(true);
                        if (c2 != Long.MIN_VALUE) {
                            j = 10000 + c2;
                        }
                        ((fhm) r2).l = j;
                        ((fhm) r2).v.u(j, c, ((fhm) r2).m);
                    }
                    ewb ewbVar2 = fhjVar2.c;
                    long j6 = fhjVar2.a;
                    evl evlVar2 = fhjVar2.h;
                    ((fhm) r2).x.u(new fgm(), new fgr(-1, null, eul.z(fhjVar2.g), eul.z(((fhm) r2).l)));
                    ((fhm) r2).t = true;
                    fgs fgsVar = ((fhm) r2).g;
                    dzg.g(fgsVar);
                    fgsVar.b(r2);
                    return;
                } catch (RuntimeException e) {
                    eub.d("LoadTask", "Unexpected exception handling load completed", e);
                    this.c.d = new fjp(e);
                    return;
                }
            }
            throw ((Error) message.obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x020f A[EDGE_INSN: B:107:0x020f->B:88:0x020f BREAK  A[LOOP:1: B:69:0x01c9->B:80:0x01c9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6 A[Catch: all -> 0x022e, TryCatch #12 {all -> 0x022e, blocks: (B:15:0x0033, B:20:0x0067, B:21:0x0075, B:23:0x0089, B:25:0x008f, B:30:0x00bc, B:32:0x00c6, B:33:0x00d2, B:35:0x00dc, B:36:0x00e8, B:38:0x00f2, B:39:0x00fe, B:41:0x0108, B:42:0x011a, B:44:0x0124, B:46:0x012a, B:51:0x0155, B:52:0x015e, B:54:0x0168, B:56:0x016c, B:57:0x0188, B:59:0x01a1, B:62:0x01a8, B:64:0x01ac, B:65:0x01b0, B:67:0x01b4, B:112:0x0134, B:115:0x0141, B:124:0x009b, B:127:0x00a8), top: B:14:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc A[Catch: all -> 0x022e, TryCatch #12 {all -> 0x022e, blocks: (B:15:0x0033, B:20:0x0067, B:21:0x0075, B:23:0x0089, B:25:0x008f, B:30:0x00bc, B:32:0x00c6, B:33:0x00d2, B:35:0x00dc, B:36:0x00e8, B:38:0x00f2, B:39:0x00fe, B:41:0x0108, B:42:0x011a, B:44:0x0124, B:46:0x012a, B:51:0x0155, B:52:0x015e, B:54:0x0168, B:56:0x016c, B:57:0x0188, B:59:0x01a1, B:62:0x01a8, B:64:0x01ac, B:65:0x01b0, B:67:0x01b4, B:112:0x0134, B:115:0x0141, B:124:0x009b, B:127:0x00a8), top: B:14:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2 A[Catch: all -> 0x022e, TryCatch #12 {all -> 0x022e, blocks: (B:15:0x0033, B:20:0x0067, B:21:0x0075, B:23:0x0089, B:25:0x008f, B:30:0x00bc, B:32:0x00c6, B:33:0x00d2, B:35:0x00dc, B:36:0x00e8, B:38:0x00f2, B:39:0x00fe, B:41:0x0108, B:42:0x011a, B:44:0x0124, B:46:0x012a, B:51:0x0155, B:52:0x015e, B:54:0x0168, B:56:0x016c, B:57:0x0188, B:59:0x01a1, B:62:0x01a8, B:64:0x01ac, B:65:0x01b0, B:67:0x01b4, B:112:0x0134, B:115:0x0141, B:124:0x009b, B:127:0x00a8), top: B:14:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108 A[Catch: all -> 0x022e, TryCatch #12 {all -> 0x022e, blocks: (B:15:0x0033, B:20:0x0067, B:21:0x0075, B:23:0x0089, B:25:0x008f, B:30:0x00bc, B:32:0x00c6, B:33:0x00d2, B:35:0x00dc, B:36:0x00e8, B:38:0x00f2, B:39:0x00fe, B:41:0x0108, B:42:0x011a, B:44:0x0124, B:46:0x012a, B:51:0x0155, B:52:0x015e, B:54:0x0168, B:56:0x016c, B:57:0x0188, B:59:0x01a1, B:62:0x01a8, B:64:0x01ac, B:65:0x01b0, B:67:0x01b4, B:112:0x0134, B:115:0x0141, B:124:0x009b, B:127:0x00a8), top: B:14:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124 A[Catch: all -> 0x022e, TRY_LEAVE, TryCatch #12 {all -> 0x022e, blocks: (B:15:0x0033, B:20:0x0067, B:21:0x0075, B:23:0x0089, B:25:0x008f, B:30:0x00bc, B:32:0x00c6, B:33:0x00d2, B:35:0x00dc, B:36:0x00e8, B:38:0x00f2, B:39:0x00fe, B:41:0x0108, B:42:0x011a, B:44:0x0124, B:46:0x012a, B:51:0x0155, B:52:0x015e, B:54:0x0168, B:56:0x016c, B:57:0x0188, B:59:0x01a1, B:62:0x01a8, B:64:0x01ac, B:65:0x01b0, B:67:0x01b4, B:112:0x0134, B:115:0x0141, B:124:0x009b, B:127:0x00a8), top: B:14:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0155 A[Catch: all -> 0x022e, TryCatch #12 {all -> 0x022e, blocks: (B:15:0x0033, B:20:0x0067, B:21:0x0075, B:23:0x0089, B:25:0x008f, B:30:0x00bc, B:32:0x00c6, B:33:0x00d2, B:35:0x00dc, B:36:0x00e8, B:38:0x00f2, B:39:0x00fe, B:41:0x0108, B:42:0x011a, B:44:0x0124, B:46:0x012a, B:51:0x0155, B:52:0x015e, B:54:0x0168, B:56:0x016c, B:57:0x0188, B:59:0x01a1, B:62:0x01a8, B:64:0x01ac, B:65:0x01b0, B:67:0x01b4, B:112:0x0134, B:115:0x0141, B:124:0x009b, B:127:0x00a8), top: B:14:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168 A[Catch: all -> 0x022e, TryCatch #12 {all -> 0x022e, blocks: (B:15:0x0033, B:20:0x0067, B:21:0x0075, B:23:0x0089, B:25:0x008f, B:30:0x00bc, B:32:0x00c6, B:33:0x00d2, B:35:0x00dc, B:36:0x00e8, B:38:0x00f2, B:39:0x00fe, B:41:0x0108, B:42:0x011a, B:44:0x0124, B:46:0x012a, B:51:0x0155, B:52:0x015e, B:54:0x0168, B:56:0x016c, B:57:0x0188, B:59:0x01a1, B:62:0x01a8, B:64:0x01ac, B:65:0x01b0, B:67:0x01b4, B:112:0x0134, B:115:0x0141, B:124:0x009b, B:127:0x00a8), top: B:14:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a1 A[Catch: all -> 0x022e, TryCatch #12 {all -> 0x022e, blocks: (B:15:0x0033, B:20:0x0067, B:21:0x0075, B:23:0x0089, B:25:0x008f, B:30:0x00bc, B:32:0x00c6, B:33:0x00d2, B:35:0x00dc, B:36:0x00e8, B:38:0x00f2, B:39:0x00fe, B:41:0x0108, B:42:0x011a, B:44:0x0124, B:46:0x012a, B:51:0x0155, B:52:0x015e, B:54:0x0168, B:56:0x016c, B:57:0x0188, B:59:0x01a1, B:62:0x01a8, B:64:0x01ac, B:65:0x01b0, B:67:0x01b4, B:112:0x0134, B:115:0x0141, B:124:0x009b, B:127:0x00a8), top: B:14:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b4 A[Catch: all -> 0x022e, TRY_LEAVE, TryCatch #12 {all -> 0x022e, blocks: (B:15:0x0033, B:20:0x0067, B:21:0x0075, B:23:0x0089, B:25:0x008f, B:30:0x00bc, B:32:0x00c6, B:33:0x00d2, B:35:0x00dc, B:36:0x00e8, B:38:0x00f2, B:39:0x00fe, B:41:0x0108, B:42:0x011a, B:44:0x0124, B:46:0x012a, B:51:0x0155, B:52:0x015e, B:54:0x0168, B:56:0x016c, B:57:0x0188, B:59:0x01a1, B:62:0x01a8, B:64:0x01ac, B:65:0x01b0, B:67:0x01b4, B:112:0x0134, B:115:0x0141, B:124:0x009b, B:127:0x00a8), top: B:14:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0212 A[Catch: all -> 0x024d, TRY_ENTER, TryCatch #11 {all -> 0x024d, blocks: (B:10:0x0029, B:11:0x002b, B:132:0x0049, B:134:0x0053, B:135:0x005b, B:89:0x0212, B:91:0x021c, B:93:0x0225, B:101:0x0231, B:103:0x023b, B:104:0x0243, B:105:0x0248), top: B:9:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022c A[LOOP:0: B:11:0x002b->B:95:0x022c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0249 A[EDGE_INSN: B:96:0x0249->B:97:0x0249 BREAK  A[LOOP:0: B:11:0x002b->B:95:0x022c], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v39, types: [flv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, flu] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, flu] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjo.run():void");
    }
}
