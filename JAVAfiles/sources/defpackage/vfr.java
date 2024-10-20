package defpackage;

import io.grpc.Status;
import j$.time.Instant;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfr implements arlq {
    final AtomicBoolean a = new AtomicBoolean(false);
    final /* synthetic */ vfv b;

    public vfr(vfv vfvVar) {
        this.b = vfvVar;
        akrh e = aktp.e("InnerReceiveMessagesResponseObserver");
        try {
            ((trh) vfvVar.e.b()).h(amjv.BINDING_STARTED, 2, ((vbm) vfvVar.t.b()).h(), vfvVar.E);
            alvw d = vfv.c.d();
            d.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "<init>", 756, "BindHandlerImpl.java")).t("%s BindHandler: New receiveMessages observer, pushing watchdog", akec.aD(vfvVar.E));
            vfvVar.g();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void d() {
        if (this.a.compareAndSet(false, true)) {
            akrh e = aktp.e("InnerReceiveMessagesResponseObserver::onNext::logDittoBindingStatusEvent");
            try {
                ((trh) this.b.e.b()).h(amjv.FIRST_DATA_RECEIVED, 2, ((vbm) this.b.t.b()).h(), this.b.E);
                e.close();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.arlq
    public final void a() {
        ((trh) this.b.e.b()).h(amjv.ON_COMPLETE, 2, ((vbm) this.b.t.b()).h(), this.b.E);
        alvw g = vfv.c.g();
        g.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onCompleted", 874, "BindHandlerImpl.java")).D("%s BindHandler: onCompleted thread: %s", akec.aD(this.b.E), Thread.currentThread().getName());
        this.b.j();
    }

    @Override // defpackage.arlq
    public final void b(Throwable th) {
        int i;
        armf armfVar = this.b.e;
        Status c = Status.c(th);
        trh trhVar = (trh) armfVar.b();
        amjv amjvVar = amjv.ON_ERROR;
        Status.Code code = c.getCode();
        int i2 = 7;
        switch (code) {
            case OK:
                i = 2;
                break;
            case CANCELLED:
                i = 3;
                break;
            case UNKNOWN:
                i = 4;
                break;
            case INVALID_ARGUMENT:
                i = 5;
                break;
            case DEADLINE_EXCEEDED:
                i = 6;
                break;
            case NOT_FOUND:
                i = 7;
                break;
            case ALREADY_EXISTS:
                i = 8;
                break;
            case PERMISSION_DENIED:
                i = 9;
                break;
            case RESOURCE_EXHAUSTED:
                i = 10;
                break;
            case FAILED_PRECONDITION:
                i = 11;
                break;
            case ABORTED:
                i = 12;
                break;
            case OUT_OF_RANGE:
                i = 13;
                break;
            case UNIMPLEMENTED:
                i = 14;
                break;
            case INTERNAL:
                i = 15;
                break;
            case UNAVAILABLE:
                i = 16;
                break;
            case DATA_LOSS:
                i = 17;
                break;
            case UNAUTHENTICATED:
                i = 18;
                break;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(code.toString()));
        }
        trhVar.h(amjvVar, i, ((vbm) this.b.t.b()).h(), this.b.E);
        this.b.u.e("Bugle.Binding.Error.Counts", c.getCode().value());
        if (th.getCause() instanceof vfs) {
            alvw g = vfv.c.g();
            g.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 837, "BindHandlerImpl.java")).t("%s BindHandler: onError is called with IntendedStreamCloseException. No-op.", akec.aD(this.b.E));
            return;
        }
        if (th.getCause() instanceof vft) {
            alvw i3 = vfv.c.i();
            i3.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) ((alvg) i3).g(th)).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 845, "BindHandlerImpl.java")).t("%s BindHandler: onError triggered due to pong watchdog timeout", akec.aD(this.b.E));
        } else {
            alvw i4 = vfv.c.i();
            i4.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) ((alvg) i4).g(th)).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 849, "BindHandlerImpl.java")).J("%s BindHandler: onError status: %s thread: %s", akec.aD(this.b.E), c, Thread.currentThread().getName());
        }
        if (!vch.c(c.getCode())) {
            vfv vfvVar = this.b;
            if (c.getCode() == Status.Code.UNAUTHENTICATED) {
                alvw g2 = vfv.c.g();
                g2.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "isUnauthenticateAndRetriable", 883, "BindHandlerImpl.java")).t("%s BindHandler: Got Unauthenticated error. Will use refreshed token for next Bind retry", akec.aD(vfvVar.E));
                vfvVar.k.set(true);
            } else {
                alvw g3 = vfv.c.g();
                g3.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 858, "BindHandlerImpl.java")).t("%s BindHandler: Error is not retriable. Stopping bind handler.", akec.aD(this.b.E));
                this.b.j();
                return;
            }
        }
        this.b.i();
        vfv vfvVar2 = this.b;
        AtomicInteger atomicInteger = vfvVar2.j;
        int i5 = vfvVar2.A;
        int andIncrement = atomicInteger.getAndIncrement();
        int i6 = i5 - andIncrement;
        boolean z = ((xym) vfvVar2.f.b()).a;
        if (z) {
            alvw g4 = vfv.c.g();
            g4.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g4).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shouldRetry", 895, "BindHandlerImpl.java")).B("%s BindHandler: Retry bind because app is in foreground count: %d", akec.aD(vfvVar2.E), andIncrement);
        } else if (i6 > 0) {
            alvw g5 = vfv.c.g();
            g5.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g5).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shouldRetry", 901, "BindHandlerImpl.java")).J("%s BindHandler: Retry bind count: %d left: %d", akec.aD(vfvVar2.E), Integer.valueOf(andIncrement), Integer.valueOf(i6));
        } else {
            alvw g6 = vfv.c.g();
            g6.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g6).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shouldRetry", 906, "BindHandlerImpl.java")).K("%s BindHandler: Not retrying bind count: %d left: %d isForeground: %s", akec.aD(vfvVar2.E), Integer.valueOf(andIncrement), Integer.valueOf(i6), false);
            alvw g7 = vfv.c.g();
            g7.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g7).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "retryStreamOrCloseSession", 571, "BindHandlerImpl.java")).t("%s BindHandler: No binding retry times left, skip binding retry", akec.aD(vfvVar2.E));
            vfvVar2.u.e("Bugle.Ditto.Binding.Retry.Counts", 1);
            vfvVar2.j();
            return;
        }
        if (andIncrement != 0) {
            if (andIncrement != 1) {
                if (andIncrement != 2) {
                    vfvVar2.u.e("Bugle.Ditto.Binding.Retry.Counts", 5);
                } else {
                    vfvVar2.u.e("Bugle.Ditto.Binding.Retry.Counts", 4);
                }
            } else {
                vfvVar2.u.e("Bugle.Ditto.Binding.Retry.Counts", 3);
            }
        } else {
            vfvVar2.u.e("Bugle.Ditto.Binding.Retry.Counts", 2);
        }
        double doubleValue = ((Double) vfv.a.e()).doubleValue();
        int intValue = ((Integer) vbh.e.e()).intValue();
        int intValue2 = ((Integer) vfv.b.e()).intValue();
        synchronized (vfvVar2.m) {
            ScheduledFuture scheduledFuture = vfvVar2.n;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                alvw d = vfv.c.d();
                d.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "randomizeRetryBackOff", 591, "BindHandlerImpl.java")).t("%s BindHandler: RetryTimeoutFuture is running, skipping", akec.aD(vfvVar2.E));
                return;
            }
            if (z) {
                andIncrement = Math.min(andIncrement, intValue2);
            }
            int pow = (int) (Math.pow(doubleValue, andIncrement) * 1000.0d);
            int nextInt = intValue * (pow - ThreadLocalRandom.current().nextInt(pow / 2));
            alvw g8 = vfv.c.g();
            g8.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g8).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "randomizeRetryBackOff", 599, "BindHandlerImpl.java")).B("%s BindHandler: Start binding retry in: %d ms", akec.aD(vfvVar2.E), nextInt);
            vfvVar2.n = vfvVar2.w.schedule(new uql(vfvVar2, i2), nextInt, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    @Override // defpackage.arlq
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        aqds aqdsVar;
        aqeg aqegVar;
        alvw g = vfv.c.g();
        g.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onNext", 765, "BindHandlerImpl.java")).D("%s BindHandler: Received onNext in BindHandlerImpl body: %s", akec.aD(this.b.E), aqed.a(((aqel) obj).b));
        try {
            this.b.g();
            int ordinal = aqed.a(((aqel) obj).b).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    Instant f = this.b.g.f();
                    synchronized (this.b.m) {
                        if (f.isAfter(this.b.q)) {
                            alvw g2 = vfv.c.g();
                            g2.X(alwp.a, "BugleNetwork");
                            alvg alvgVar = (alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onNext", 785, "BindHandlerImpl.java");
                            vfv vfvVar = this.b;
                            alvgVar.J("%s BindHandler: Received pong after scheduled idle timeout. Treat it as idle timeout. now: %s idleTimerExpirationTime: %s", akec.aD(vfvVar.E), f, vfvVar.q);
                            this.b.k();
                        }
                    }
                }
            } else {
                this.b.u.g("Bugle.Network.Rpc.Response.Size.Bytes", ((apag) obj).getSerializedSize());
                vfv vfvVar2 = this.b;
                if (((aqel) obj).b == 2) {
                    aqdsVar = (aqds) ((aqel) obj).c;
                } else {
                    aqdsVar = aqds.a;
                }
                alvw g3 = vfv.c.g();
                g3.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "handleInboxMessage", 434, "BindHandlerImpl.java")).D("%s BindHandler: Received message messageId: %s", akec.aD(vfvVar2.E), aqdsVar.c);
                yyt yytVar = (yyt) vfvVar2.i.b();
                aqeh aqehVar = ((aqel) obj).d;
                if (aqehVar == null) {
                    aqehVar = aqeh.a;
                }
                aqdr b = aqdr.b(aqdsVar.d);
                if (b == null) {
                    b = aqdr.UNRECOGNIZED;
                }
                if (b == aqdr.TACHYGRAM_MESSAGE) {
                    aozy createBuilder = asgw.a.createBuilder();
                    vhp vhpVar = new vhp();
                    int i = aqehVar.b;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    aqegVar = null;
                                } else {
                                    aqegVar = aqeg.INITIAL_PULL_MESSAGES;
                                }
                            } else {
                                aqegVar = aqeg.COLLIDER_SECOND_FANOUT_ATTEMPT;
                            }
                        } else {
                            aqegVar = aqeg.COLLIDER_FIRST_FANOUT_ATTEMPT;
                        }
                    } else {
                        aqegVar = aqeg.UNKNOWN_MESSAGE_ORIGIN;
                    }
                    if (aqegVar == null) {
                        aqegVar = aqeg.UNRECOGNIZED;
                    }
                    asgu asguVar = (asgu) vhpVar.fu(aqegVar);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    asgw asgwVar = (asgw) createBuilder.b;
                    asgwVar.c = Integer.valueOf(asguVar.a());
                    asgwVar.b = 5;
                    asgw asgwVar2 = (asgw) createBuilder.s();
                    rve a = rve.a(aqdsVar.c);
                    aozy createBuilder2 = asgx.a.createBuilder();
                    atok ba = yyb.ba();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar = createBuilder2.b;
                    asgx asgxVar = (asgx) apagVar;
                    ba.getClass();
                    asgxVar.c = ba;
                    asgxVar.b = 1 | asgxVar.b;
                    if (!apagVar.isMutable()) {
                        createBuilder2.u();
                    }
                    ((asgx) createBuilder2.b).e = a.aq(9);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ((asgx) createBuilder2.b).g = arsd.at(50);
                    aozy createBuilder3 = asgv.a.createBuilder();
                    createBuilder3.bP(aqdsVar.c);
                    asgv asgvVar = (asgv) createBuilder3.s();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar2 = createBuilder2.b;
                    asgx asgxVar2 = (asgx) apagVar2;
                    asgvVar.getClass();
                    asgxVar2.d = asgvVar;
                    asgxVar2.b |= 2;
                    if (!apagVar2.isMutable()) {
                        createBuilder2.u();
                    }
                    asgx asgxVar3 = (asgx) createBuilder2.b;
                    asgwVar2.getClass();
                    asgxVar3.i = asgwVar2;
                    asgxVar3.b |= 32;
                    yytVar.W(a, createBuilder2);
                }
                vfvVar2.h();
                vfvVar2.D.b(aqdsVar);
            }
        } finally {
            d();
        }
    }
}
