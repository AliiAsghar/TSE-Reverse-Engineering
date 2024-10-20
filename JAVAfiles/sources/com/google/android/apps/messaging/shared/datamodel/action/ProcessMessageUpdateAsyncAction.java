package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessMessageUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alib;
import defpackage.alig;
import defpackage.amdy;
import defpackage.ancr;
import defpackage.andi;
import defpackage.anen;
import defpackage.angj;
import defpackage.angn;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apax;
import defpackage.aqdu;
import defpackage.armf;
import defpackage.ibi;
import defpackage.mbl;
import defpackage.qyv;
import defpackage.rau;
import defpackage.ray;
import defpackage.rcy;
import defpackage.rjd;
import defpackage.rjg;
import defpackage.rjo;
import defpackage.trg;
import defpackage.trn;
import defpackage.vid;
import defpackage.wpp;
import defpackage.xze;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessMessageUpdateAsyncAction extends Action<aqdu> {
    public static final Parcelable.Creator<Action<aqdu>> CREATOR;
    public static final xze a = xze.g("BugleAction", "ProcessMessageUpdateAsyncAction");
    public static final alib b;
    public final rjo c;
    public final trn d;
    public final armf e;
    public final armf f;
    public final rjg g;
    public final rjd h;
    public final armf i;
    public final mbl j;
    public final anen k;
    public final armf l;
    public final vid m;
    public final ibi n;
    public final wpp o;
    private final anen p;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rcy NB();
    }

    static {
        alig aligVar = new alig();
        aligVar.e(100L);
        aligVar.d(10L, TimeUnit.MINUTES);
        b = aligVar.a();
        CREATOR = new ray(13);
    }

    public ProcessMessageUpdateAsyncAction(trn trnVar, armf armfVar, armf armfVar2, wpp wppVar, armf armfVar3, mbl mblVar, rjd rjdVar, rjg rjgVar, rjo rjoVar, vid vidVar, anen anenVar, anen anenVar2, ibi ibiVar, armf armfVar4, Parcel parcel) {
        super(parcel, amdy.PROCESS_MESSAGE_UPDATE_ACTION);
        this.d = trnVar;
        this.e = armfVar;
        this.f = armfVar2;
        this.o = wppVar;
        this.i = armfVar3;
        this.j = mblVar;
        this.k = anenVar;
        this.p = anenVar2;
        this.l = armfVar4;
        this.h = rjdVar;
        this.g = rjgVar;
        this.c = rjoVar;
        this.m = vidVar;
        this.n = ibiVar;
    }

    public static void h(aozy aozyVar, angj angjVar) {
        angj angjVar2 = (angj) b.l(angjVar.c);
        if (angjVar2 != null && angjVar2.equals(angjVar)) {
            return;
        }
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        angn angnVar = (angn) aozyVar.b;
        angn angnVar2 = angn.a;
        angjVar.getClass();
        apax apaxVar = angnVar.b;
        if (!apaxVar.c()) {
            angnVar.b = apag.mutableCopy(apaxVar);
        }
        angnVar.b.add(angjVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessMessageUpdateAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessMessageUpdate.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        Boolean bool = (Boolean) trg.a.e();
        if (bool.booleanValue()) {
            this.j.e("Bugle.Ditto.Action.Success.Metrics.Counts", 13);
        }
        akul e = aktp.aj(new ancr() { // from class: rcx
            @Override // defpackage.ancr
            public final ListenableFuture a() {
                alog alogVar;
                atkn atknVar;
                sbd sbdVar;
                boolean z;
                aozy aozyVar;
                angj angjVar;
                ProcessMessageUpdateAsyncAction processMessageUpdateAsyncAction = ProcessMessageUpdateAsyncAction.this;
                rhl rhlVar = processMessageUpdateAsyncAction.u;
                rhl rhlVar2 = processMessageUpdateAsyncAction.u;
                String l = rhlVar.l("request_id_key");
                byte[] A = rhlVar2.A("desktop_id_key");
                alog c = processMessageUpdateAsyncAction.d.c();
                if (c.isEmpty()) {
                    return aktp.ag(null);
                }
                rhl rhlVar3 = processMessageUpdateAsyncAction.u;
                rhl rhlVar4 = processMessageUpdateAsyncAction.u;
                long e2 = rhlVar3.e("message_timestamp_key", Long.MAX_VALUE);
                ConversationIdType b2 = ruy.b(rhlVar4.l("conversation_id_key"));
                MessageIdType b3 = rvc.b(processMessageUpdateAsyncAction.u.l("message_id_key"));
                aozy createBuilder = angn.a.createBuilder();
                if (!b2.b() && !b3.b()) {
                    sbdVar = (sbd) processMessageUpdateAsyncAction.n.l(b3).n();
                    try {
                        if (sbdVar.moveToNext()) {
                            rry c2 = processMessageUpdateAsyncAction.m.c(sbdVar);
                            if (qkv.b.contains(Integer.valueOf(c2.f()))) {
                                sbdVar.close();
                                alogVar = c;
                            } else {
                                if (!((Boolean) tru.a.e()).booleanValue()) {
                                    processMessageUpdateAsyncAction.c.a(c2).t();
                                } else {
                                    iew iewVar = (iew) processMessageUpdateAsyncAction.i.b();
                                    aozy createBuilder2 = trv.a.createBuilder();
                                    createBuilder2.O(b3.a());
                                    iewVar.l((trv) createBuilder2.s(), new uta(null, "blobstore-" + b3.a(), null, null, null, null));
                                }
                                alogVar = c;
                                angjVar = ((vbm) processMessageUpdateAsyncAction.e.b()).e(c2, false);
                            }
                        } else {
                            if (((Boolean) MessagesTable.f(b3, new rbs(2), new qxs(10))).booleanValue()) {
                                sup supVar = new sup(sur.a);
                                supVar.w("message_edits.queryOnMessageId");
                                suq suqVar = new suq();
                                alogVar = c;
                                suqVar.U(new agmd("message_edits.message_id", 1, Long.valueOf(rvc.a(b3))));
                                supVar.k(new agpw(suqVar));
                                if (!Optional.ofNullable((suj) agnc.b(supVar.b())).isPresent()) {
                                    angjVar = null;
                                }
                            } else {
                                alogVar = c;
                            }
                            aozy createBuilder3 = angj.a.createBuilder();
                            String a2 = b2.a();
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            angj angjVar2 = (angj) createBuilder3.b;
                            a2.getClass();
                            angjVar2.i = a2;
                            String a3 = b3.a();
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            angj angjVar3 = (angj) createBuilder3.b;
                            a3.getClass();
                            angjVar3.c = a3;
                            aozy createBuilder4 = angm.a.createBuilder();
                            if (!createBuilder4.b.isMutable()) {
                                createBuilder4.u();
                            }
                            ((angm) createBuilder4.b).c = 300;
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            angj angjVar4 = (angj) createBuilder3.b;
                            angm angmVar = (angm) createBuilder4.s();
                            angmVar.getClass();
                            angjVar4.g = angmVar;
                            angjVar4.b |= 4;
                            angjVar = (angj) createBuilder3.s();
                        }
                        sbdVar.close();
                        if (angjVar != null) {
                            ProcessMessageUpdateAsyncAction.h(createBuilder, angjVar);
                        }
                    } finally {
                        try {
                            sbdVar.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } else {
                    alogVar = c;
                    boolean z2 = processMessageUpdateAsyncAction.u.z("is_standalone_push_key", false);
                    ibi ibiVar = processMessageUpdateAsyncAction.n;
                    if (z2) {
                        atknVar = new atkn(sbi.c.j, true);
                    } else {
                        atknVar = new atkn(sbi.c.j, false);
                    }
                    sbf a4 = ((say) ibiVar.a).a();
                    a4.e(new ilg(e2, 17));
                    a4.t((agmh) sbi.c.m);
                    a4.f(atknVar);
                    sbdVar = (sbd) a4.b().n();
                    if (z2) {
                        try {
                            if (sbdVar.getCount() > 0) {
                                processMessageUpdateAsyncAction.j.e("Bugle.Ditto.Messages.NoConversationUpdate.ToSend.Counts", sbdVar.getCount());
                            }
                            z = true;
                        } finally {
                        }
                    } else {
                        z = false;
                    }
                    xyo c3 = ProcessMessageUpdateAsyncAction.a.c();
                    c3.F(sbdVar.getCount());
                    c3.H("messages need retrying.");
                    c3.q();
                    while (sbdVar.moveToNext()) {
                        rry c4 = processMessageUpdateAsyncAction.m.c(sbdVar);
                        if (!qkv.b.contains(Integer.valueOf(c4.f()))) {
                            if (!((Boolean) tru.a.e()).booleanValue()) {
                                processMessageUpdateAsyncAction.c.a(c4).t();
                            } else {
                                iew iewVar2 = (iew) processMessageUpdateAsyncAction.i.b();
                                aozy createBuilder5 = trv.a.createBuilder();
                                createBuilder5.O(c4.u().a());
                                iewVar2.l((trv) createBuilder5.s(), new uta(null, "blobstore-" + b3.a(), null, null, null, null));
                            }
                            xyo a5 = ProcessMessageUpdateAsyncAction.a.a();
                            a5.H("Re-pushed messageId: ");
                            a5.H(c4.u());
                            a5.q();
                            ProcessMessageUpdateAsyncAction.h(createBuilder, ((vbm) processMessageUpdateAsyncAction.e.b()).e(c4, z));
                        }
                    }
                    sbdVar.close();
                }
                if (((angn) createBuilder.b).b.size() == 0) {
                    return aktp.ag(null);
                }
                if (processMessageUpdateAsyncAction.u.z("is_standalone_push_key", false)) {
                    if (A != null && l != null) {
                        try {
                            aqfn aqfnVar = (aqfn) apag.parseFrom(aqfn.a, A, aozs.a());
                            if (((angn) createBuilder.b).b.size() > ((Integer) trf.b.e()).intValue()) {
                                ProcessMessageUpdateAsyncAction.a.l("Notify Ditto to refresh since there are too many messages needs to repush");
                                return processMessageUpdateAsyncAction.g.a(10, aqfnVar, l);
                            }
                            ProcessMessageUpdateAsyncAction.a.l("Send corresponding conversation update");
                            rjd rjdVar = processMessageUpdateAsyncAction.h;
                            trn trnVar = (trn) rjdVar.a.b();
                            trnVar.getClass();
                            mbl mblVar = (mbl) rjdVar.b.b();
                            mblVar.getClass();
                            anen anenVar = (anen) rjdVar.c.b();
                            anenVar.getClass();
                            anen anenVar2 = (anen) rjdVar.d.b();
                            anenVar2.getClass();
                            anen anenVar3 = (anen) rjdVar.e.b();
                            anenVar3.getClass();
                            wpp wppVar = (wpp) rjdVar.i.b();
                            wppVar.getClass();
                            wyp wypVar = (wyp) rjdVar.j.b();
                            wypVar.getClass();
                            ahmv ahmvVar = (ahmv) rjdVar.l.b();
                            ahmvVar.getClass();
                            psw pswVar = (psw) rjdVar.n.b();
                            pswVar.getClass();
                            aqfnVar.getClass();
                            aozyVar = createBuilder;
                            new ProcessConversationUpdateAsyncAction(trnVar, mblVar, anenVar, anenVar2, anenVar3, rjdVar.f, rjdVar.g, rjdVar.h, wppVar, wypVar, rjdVar.k, ahmvVar, rjdVar.m, pswVar, rjdVar.o, aqfnVar, l, e2).B(processMessageUpdateAsyncAction);
                        } catch (apba e3) {
                            ProcessMessageUpdateAsyncAction.a.n("Couldn't parse protobuff.", e3);
                            return aktp.ag(null);
                        }
                    } else {
                        return aktp.ag(null);
                    }
                } else {
                    aozyVar = createBuilder;
                }
                aozy aozyVar2 = aozyVar;
                return trn.g(alogVar, new rbp(processMessageUpdateAsyncAction, aozyVar2, 3)).h(new rau(aozyVar2, 6), processMessageUpdateAsyncAction.k);
            }
        }, this.p).e(Throwable.class, new qyv(9), andi.a);
        if (bool.booleanValue()) {
            e.h(new rau(this, 7), this.k);
        }
        return aktp.ag(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
