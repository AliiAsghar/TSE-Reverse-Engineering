package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class usu extends arpw implements arqr {
    Object a;
    int b;
    final /* synthetic */ uss c;
    final /* synthetic */ usz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usu(uss ussVar, usz uszVar, arpe arpeVar) {
        super(1, arpeVar);
        this.c = ussVar;
        this.d = uszVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new usu(this.c, this.d, (arpe) obj).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                Object obj2 = this.a;
                aqil.P(obj);
                return obj2;
            }
            aqil.P(obj);
        } else {
            aqil.P(obj);
            uss ussVar = this.c;
            this.b = 1;
            obj = ussVar.a(this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        final usz uszVar = this.d;
        final uss ussVar2 = this.c;
        final upm upmVar = (upm) obj;
        this.a = upmVar;
        this.b = 2;
        akul d = uszVar.g.d("WorkQueueTikTokWorker::handleTrancheExecutionResults", new Runnable() { // from class: usl
            @Override // java.lang.Runnable
            public final void run() {
                Object apply;
                agpk agpkVar;
                upm upmVar2 = upmVar;
                upmVar2.getClass();
                upy a = uqb.a();
                uss ussVar3 = uss.this;
                a.d(new uuy(ussVar3, 1));
                a.w("WorkQueueTikTokWorker::countRowsToUpdate");
                if (a.b().i() == ussVar3.c.size()) {
                    usz uszVar2 = uszVar;
                    int i2 = 0;
                    if (upmVar2.a) {
                        xyo d2 = usz.a.d();
                        d2.H("Tranche succeeded");
                        usz.g(d2, ussVar3);
                        alog alogVar = upmVar2.c;
                        if (alogVar != null) {
                            i2 = alogVar.size();
                        }
                        d2.x("follow-up items", i2);
                        d2.q();
                        alog alogVar2 = upmVar2.c;
                        if (alogVar2 != null && !alogVar2.isEmpty()) {
                            alog alogVar3 = upmVar2.c;
                            alogVar3.getClass();
                            ((alpt) uszVar2.f.d(alzz.aZ(alogVar3)).keySet()).containsAll(alogVar3);
                        }
                        usz.e(ussVar3.c);
                        return;
                    }
                    if (upmVar2.b) {
                        xyo d3 = usz.a.d();
                        d3.H("Tranche failed retriably");
                        usz.g(d3, ussVar3);
                        d3.q();
                        unx unxVar = ussVar3.a;
                        List list = ussVar3.c;
                        unf a2 = unxVar.a();
                        upz upzVar = new upz();
                        upzVar.aj("incrementAttemptCountAndApplyBackoff");
                        apply = new uol(list, 18).apply(new uqa());
                        upzVar.Z(new agpw((uqa) apply));
                        upzVar.aa("attempts", new agpk("$V + 1", new Object[]{uqb.c.d}));
                        Long valueOf = Long.valueOf(uszVar2.b.f().toEpochMilli());
                        Long valueOf2 = Long.valueOf(a2.f);
                        gry gryVar = a2.g;
                        gryVar.getClass();
                        int ordinal = gryVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                agpkVar = new agpk("$V + 1", new Object[]{uqb.c.d});
                            } else {
                                throw new armm();
                            }
                        } else {
                            agpkVar = new agpk("1 << $V", new Object[]{uqb.c.d});
                        }
                        upzVar.aa("minimum_start_time", new agpk("$V + min($V, $V * ($V))", new Object[]{valueOf, 18000000L, valueOf2, agpkVar}));
                        if (upzVar.a().e() == list.size()) {
                            int i3 = ussVar3.a.a().e;
                            upw upwVar = new upw();
                            upwVar.f("deleteExhaustedItems");
                            upwVar.b(new rbe(ussVar3, i3, 8));
                            int d4 = upwVar.d();
                            if (d4 > 0) {
                                xyo e = usz.a.e();
                                e.H("Retries exhausted for items");
                                e.z("queue", ussVar3.b);
                                e.x("count", d4);
                                e.x("attempts", i3);
                                e.q();
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Could not update attempt counts for all " + list.size() + " failed items");
                    }
                    xyo e2 = usz.a.e();
                    e2.H("Tranche failed permanently");
                    usz.g(e2, ussVar3);
                    e2.q();
                    usz.e(ussVar3.c);
                    return;
                }
                throw new unk();
            }
        });
        d.getClass();
        Object F = arro.F(d, this);
        if (F != arpl.a) {
            F = arnb.a;
        }
        if (F != arplVar) {
            return upmVar;
        }
        return arplVar;
    }
}
