package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zey implements uvx {
    public static final xze a = xze.g("Bugle", "StuckInSendingMessageTracker");
    public final via b;
    public final uwd c;
    public final armf d;
    public final xcu e;
    public final armf f;
    public final uac g;
    private final anen h;

    public zey(anen anenVar, via viaVar, uwd uwdVar, armf armfVar, xcu xcuVar, uac uacVar, armf armfVar2) {
        this.h = anenVar;
        this.b = viaVar;
        this.c = uwdVar;
        this.d = armfVar;
        this.e = xcuVar;
        this.g = uacVar;
        this.f = armfVar2;
    }

    public final akul a(MessageIdType messageIdType) {
        String str;
        tqg tqgVar = tqg.NOTIFY_STUCK_IN_SENDING;
        if (messageIdType.b()) {
            xyo e = uwd.a.e();
            e.H("Cannot check if tracking message - messageId cannot be");
            if (true != messageIdType.b()) {
                str = "empty";
            } else {
                str = "null";
            }
            e.H(str);
            e.z("TrackingPurpose", tqgVar);
            e.q();
            return aktp.ag(false);
        }
        uwc uwcVar = (uwc) this.c.d.b();
        if (messageIdType.b()) {
            uwc.a.q("Cannot query for flagged message - messageId cannot be empty.");
            return aktp.ag(false);
        }
        return aktp.ai(new ulo(messageIdType, tqgVar, 11), uwcVar.b);
    }

    public final void b(MessageIdType messageIdType) {
        this.c.c(messageIdType, tqg.NOTIFY_STUCK_IN_SENDING);
    }

    @Override // defpackage.uvx
    public final akul c(alog alogVar) {
        return aktp.ai(new yxs(this, alogVar, 7, null), this.h).i(new ancs() { // from class: zex
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v4, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                alog alogVar2 = (alog) obj;
                zey zeyVar = zey.this;
                if (((nxi) zeyVar.f.b()).a()) {
                    int size = alogVar2.size();
                    for (int i = 0; i < size; i++) {
                        MessageCoreData q = ((rwd) zeyVar.d.b()).q(((sqf) alogVar2.get(i)).h());
                        if (q != null) {
                            uac uacVar = zeyVar.g;
                            xcu xcuVar = zeyVar.e;
                            MessageIdType B = q.B();
                            aozy aozyVar = (aozy) xcuVar.c.get(B);
                            xcuVar.b.remove(B);
                            xcuVar.c.remove(B);
                            Optional ofNullable = Optional.ofNullable(aozyVar);
                            mho mhoVar = (mho) uacVar.a.b();
                            if (!mhoVar.al()) {
                                mhoVar.r();
                            } else {
                                int x = lgb.x(q.d());
                                amgl amglVar = (amgl) amgu.a.createBuilder();
                                long s = q.s();
                                if (!amglVar.b.isMutable()) {
                                    amglVar.u();
                                }
                                amgu amguVar = (amgu) amglVar.b;
                                amguVar.b |= 128;
                                amguVar.n = s;
                                if (!amglVar.b.isMutable()) {
                                    amglVar.u();
                                }
                                amgu amguVar2 = (amgu) amglVar.b;
                                amguVar2.g = x - 1;
                                amguVar2.b |= 1;
                                if (!amglVar.b.isMutable()) {
                                    amglVar.u();
                                }
                                amgu amguVar3 = (amgu) amglVar.b;
                                amguVar3.h = 24;
                                int i2 = 2;
                                amguVar3.b |= 2;
                                amgj j = ((MessageData) q).k.j();
                                if (!amglVar.b.isMutable()) {
                                    amglVar.u();
                                }
                                amgu amguVar4 = (amgu) amglVar.b;
                                amguVar4.m = j.w;
                                amguVar4.b |= 64;
                                ofNullable.ifPresent(new rge(q, amglVar, i2));
                                amfq amfqVar = (amfq) amfr.a.createBuilder();
                                amfp amfpVar = amfp.BUGLE_MESSAGE;
                                if (!amfqVar.b.isMutable()) {
                                    amfqVar.u();
                                }
                                amfr amfrVar = (amfr) amfqVar.b;
                                amfrVar.i = amfpVar.dg;
                                amfrVar.b |= 1;
                                if (!amfqVar.b.isMutable()) {
                                    amfqVar.u();
                                }
                                amfr amfrVar2 = (amfr) amfqVar.b;
                                amgu amguVar5 = (amgu) amglVar.s();
                                amguVar5.getClass();
                                amfrVar2.k = amguVar5;
                                amfrVar2.b |= 4;
                                ((mbb) uacVar.b.b()).a().b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                            }
                        }
                    }
                } else if (alogVar2 == null) {
                    int i3 = alog.d;
                    alogVar2 = alsx.a;
                }
                zeyVar.b.B(alogVar2);
                xyo a2 = zey.a.a();
                a2.H("Refreshed stuck messages notification for expired messages.");
                a2.q();
                Stream map = Collection.EL.stream(alogVar2).map(new yug(16));
                int i4 = alog.d;
                return zeyVar.c.a((List) map.collect(alls.a), tqg.NOTIFY_STUCK_IN_SENDING);
            }
        }, this.h);
    }

    @Override // defpackage.uvx
    public final long d() {
        return ((Integer) wos.c.e()).intValue();
    }
}
