package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xil {
    private static final xze c = xze.g("BugleDataModel", "ForwardSyncExecutionScheduler");
    public final armf a;
    public final armf b;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;

    public xil(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        this.d = armfVar;
        this.a = armfVar2;
        this.b = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
        this.i = armfVar8;
    }

    private static boolean b(Instant instant) {
        if (instant.toEpochMilli() >= 0) {
            return true;
        }
        return false;
    }

    public final akul a(final Instant instant, final Instant instant2, final Instant instant3, final amvm amvmVar, final UUID uuid, final UUID uuid2) {
        int i;
        if (!((yjr) this.d.b()).y()) {
            xyo c2 = c.c();
            c2.H("Skipping sync, not default SMS app.");
            c2.z("batchId", uuid2);
            c2.z("syncId", uuid);
            c2.q();
            ((vyv) this.b.b()).M(uuid, uuid2, 1, alog.r(amvl.BUGLE_NOT_DEFAULT_SMS_APP));
            return aktp.ag(null);
        }
        if (((ppf) this.i.b()).a() && !((yjf) this.h.b()).h()) {
            xyo c3 = c.c();
            c3.H("Skipping sync, no permissions even though default sms app.");
            c3.z("batchId", uuid2);
            c3.z("syncId", uuid);
            c3.q();
            ((vyv) this.b.b()).M(uuid, uuid2, 1, alog.r(amvl.MISSING_PERMISSIONS));
            return aktp.ag(null);
        }
        xze xzeVar = c;
        xyo a = xzeVar.a();
        a.H("Request to sync messages.");
        a.y("lowerBoundTimeMillis", instant.toEpochMilli());
        a.y("upperBoundTimeMillis", instant2.toEpochMilli());
        a.y("startTimeMillis", instant3.toEpochMilli());
        a.x("initialMaxMessagesToUpdate", 0);
        a.z("batchId", uuid2);
        a.z("syncId", uuid);
        a.q();
        int i2 = 2;
        if (!amvm.EARLIER_MESSAGES_OUT_OF_SYNC.equals(amvmVar)) {
            if (((Boolean) ((utz) xim.b.get()).e()).booleanValue()) {
                if (true == b(instant)) {
                    i = 1;
                    final int i3 = i;
                    return ((wzp) this.f.b()).c(instant.isBefore(Instant.EPOCH), instant3.toEpochMilli(), instant.toEpochMilli(), instant2.toEpochMilli(), uuid).h(new algk() { // from class: xik
                        @Override // defpackage.algk
                        public final Object apply(Object obj) {
                            alog r;
                            wzo wzoVar = (wzo) obj;
                            int ordinal = wzoVar.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        int i4 = alog.d;
                                        r = alsx.a;
                                    } else {
                                        r = alog.r(amvl.PARTIAL_SYNC_QUEUED);
                                    }
                                } else {
                                    r = alog.r(amvl.FULL_SYNC_DELAYED);
                                }
                            } else {
                                r = alog.r(amvl.FULL_SYNC_DO_NOT_START);
                            }
                            int i5 = i3;
                            final UUID uuid3 = uuid2;
                            final UUID uuid4 = uuid;
                            xil xilVar = xil.this;
                            ((vyv) xilVar.b.b()).M(uuid4, uuid3, i5, r);
                            if (wzo.CAN_START.equals(wzoVar)) {
                                final amvm amvmVar2 = amvmVar;
                                final Instant instant4 = instant3;
                                final Instant instant5 = instant2;
                                final Instant instant6 = instant;
                                ((Optional) xilVar.a.b()).ifPresent(new Consumer() { // from class: xij
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void q(Object obj2) {
                                        Instant instant7 = Instant.this;
                                        amvm amvmVar3 = amvmVar2;
                                        ((vyv) obj2).Q(instant7, instant5, instant4, 0, -1, amvmVar3, uuid4, uuid3);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                return null;
                            }
                            return null;
                        }
                    }, (Executor) this.g.b());
                }
            } else if (b(instant)) {
                xiu x = ((aiqj) this.e.b()).x(-1L, instant.toEpochMilli());
                try {
                    boolean k = x.k();
                    x.close();
                    if (!k) {
                        i2 = 3;
                        if (((wzp) this.f.b()).a(instant3.toEpochMilli()) == 0) {
                            ((wzp) this.f.b()).j(instant.toEpochMilli(), amvm.EARLIER_MESSAGES_OUT_OF_SYNC);
                        } else {
                            xyo a2 = xzeVar.a();
                            a2.H("Messages before");
                            a2.G(instant.toEpochMilli());
                            a2.H("not in sync; will do incremental sync");
                            a2.z("batchId", uuid2);
                            a2.z("syncId", uuid);
                            a2.q();
                        }
                    } else {
                        xyo a3 = xzeVar.a();
                        a3.H("Messages before");
                        a3.G(instant.toEpochMilli());
                        a3.H(" are in sync");
                        a3.z("batchId", uuid2);
                        a3.z("syncId", uuid);
                        a3.q();
                    }
                } finally {
                }
            }
            i = 4;
            final int i32 = i;
            return ((wzp) this.f.b()).c(instant.isBefore(Instant.EPOCH), instant3.toEpochMilli(), instant.toEpochMilli(), instant2.toEpochMilli(), uuid).h(new algk() { // from class: xik
                @Override // defpackage.algk
                public final Object apply(Object obj) {
                    alog r;
                    wzo wzoVar = (wzo) obj;
                    int ordinal = wzoVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                int i4 = alog.d;
                                r = alsx.a;
                            } else {
                                r = alog.r(amvl.PARTIAL_SYNC_QUEUED);
                            }
                        } else {
                            r = alog.r(amvl.FULL_SYNC_DELAYED);
                        }
                    } else {
                        r = alog.r(amvl.FULL_SYNC_DO_NOT_START);
                    }
                    int i5 = i32;
                    final UUID uuid3 = uuid2;
                    final UUID uuid4 = uuid;
                    xil xilVar = xil.this;
                    ((vyv) xilVar.b.b()).M(uuid4, uuid3, i5, r);
                    if (wzo.CAN_START.equals(wzoVar)) {
                        final amvm amvmVar2 = amvmVar;
                        final Instant instant4 = instant3;
                        final Instant instant5 = instant2;
                        final Instant instant6 = instant;
                        ((Optional) xilVar.a.b()).ifPresent(new Consumer() { // from class: xij
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void q(Object obj2) {
                                Instant instant7 = Instant.this;
                                amvm amvmVar3 = amvmVar2;
                                ((vyv) obj2).Q(instant7, instant5, instant4, 0, -1, amvmVar3, uuid4, uuid3);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return null;
                    }
                    return null;
                }
            }, (Executor) this.g.b());
        }
        i = i2;
        final int i322 = i;
        return ((wzp) this.f.b()).c(instant.isBefore(Instant.EPOCH), instant3.toEpochMilli(), instant.toEpochMilli(), instant2.toEpochMilli(), uuid).h(new algk() { // from class: xik
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                alog r;
                wzo wzoVar = (wzo) obj;
                int ordinal = wzoVar.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            int i4 = alog.d;
                            r = alsx.a;
                        } else {
                            r = alog.r(amvl.PARTIAL_SYNC_QUEUED);
                        }
                    } else {
                        r = alog.r(amvl.FULL_SYNC_DELAYED);
                    }
                } else {
                    r = alog.r(amvl.FULL_SYNC_DO_NOT_START);
                }
                int i5 = i322;
                final UUID uuid3 = uuid2;
                final UUID uuid4 = uuid;
                xil xilVar = xil.this;
                ((vyv) xilVar.b.b()).M(uuid4, uuid3, i5, r);
                if (wzo.CAN_START.equals(wzoVar)) {
                    final amvm amvmVar2 = amvmVar;
                    final Instant instant4 = instant3;
                    final Instant instant5 = instant2;
                    final Instant instant6 = instant;
                    ((Optional) xilVar.a.b()).ifPresent(new Consumer() { // from class: xij
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void q(Object obj2) {
                            Instant instant7 = Instant.this;
                            amvm amvmVar3 = amvmVar2;
                            ((vyv) obj2).Q(instant7, instant5, instant4, 0, -1, amvmVar3, uuid4, uuid3);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return null;
                }
                return null;
            }
        }, (Executor) this.g.b());
    }
}
