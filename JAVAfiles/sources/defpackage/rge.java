package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rge implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rge(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v64, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        aqce aqceVar;
        int i = 20;
        switch (this.c) {
            case 0:
                ?? r0 = this.b;
                akul a = ((zey) obj).a(r0.B());
                Object obj2 = this.a;
                a.k(qiu.c(new ksn(obj2, r0, i)), ((rgf) obj2).e);
                return;
            case 1:
                int i2 = rgf.g;
                ((ujz) obj).a((MessageIdType) this.a, (rve) this.b);
                return;
            case 2:
                aozy aozyVar = (aozy) obj;
                int a2 = this.a.a();
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                Object obj3 = this.b;
                ammx ammxVar = (ammx) aozyVar.b;
                ammx ammxVar2 = ammx.a;
                ammxVar.b |= 1;
                ammxVar.e = a2;
                aozy aozyVar2 = (aozy) obj3;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amgu amguVar = (amgu) ((amgl) obj3).b;
                ammx ammxVar3 = (ammx) aozyVar.s();
                amgu amguVar2 = amgu.a;
                ammxVar3.getClass();
                amguVar.ar = ammxVar3;
                amguVar.d |= 64;
                return;
            case 3:
                aqby aqbyVar = (aqby) obj;
                ryi ryiVar = (ryi) this.a;
                ConversationIdType conversationIdType = ryiVar.b;
                MessageIdType messageIdType = ryiVar.c;
                if (aqbyVar.b == 2) {
                    aqceVar = (aqce) aqbyVar.c;
                } else {
                    aqceVar = aqce.a;
                }
                this.b.add(ryi.a(conversationIdType, messageIdType, aqceVar));
                return;
            case 4:
                boolean b = ryx.b((apzp) obj);
                Object obj4 = this.b;
                Object obj5 = this.a;
                if (!b) {
                    synchronized (((ryx) obj5).n) {
                        ((ryx) obj5).o.m(obj4);
                    }
                    return;
                }
                return;
            case 5:
                Object obj6 = this.a;
                Object obj7 = ((ryx) obj6).n;
                Object obj8 = this.b;
                synchronized (obj7) {
                    ((ryx) obj6).o.m(obj8);
                }
                return;
            case 6:
                ConversationIdType z = ((MessagesTable.BindData) obj).z();
                if (!z.b()) {
                    ((ujk) this.b).b.j(z, (MessageIdType) this.a, new String[0]);
                    return;
                }
                return;
            case 7:
                ujw ujwVar = (ujw) obj;
                smr q = ((rtz) ((ujv) this.b).c.b()).q((ConversationIdType) this.a);
                if (q != null && !q.F().d()) {
                    ujwVar.a();
                    return;
                }
                return;
            case 8:
                ConversationSuggestion conversationSuggestion = (ConversationSuggestion) obj;
                uuf uufVar = umm.a;
                conversationSuggestion.setRcsMessageId(((rvf) this.a).f());
                conversationSuggestion.setTargetRcsMessageId(((rvf) this.b).f());
                return;
            case 9:
                Object obj9 = this.a;
                ((ArrayList) this.b).add(akul.g(((uqh) obj9).g.k(new imi(obj9, (upr) obj, i, null), andi.a)));
                return;
            case 10:
                Boolean bool = (Boolean) obj;
                xze xzeVar = uwd.a;
                if (bool != null && bool.booleanValue()) {
                    Object obj10 = this.a;
                    Object obj11 = this.b;
                    xyo c = uwd.a.c();
                    c.H("Started tracking message");
                    c.z("TrackingPurpose", obj11);
                    c.c((MessageIdType) obj10);
                    c.q();
                    return;
                }
                return;
            case 11:
                xyo e = uwd.a.e();
                e.H("Error when trying to start tracking");
                e.z("TrackingPurpose", this.b);
                e.c((MessageIdType) this.a);
                e.r((Throwable) obj);
                return;
            case 12:
                Boolean bool2 = (Boolean) obj;
                xze xzeVar2 = uwd.a;
                if (bool2 != null && bool2.booleanValue()) {
                    Object obj12 = this.a;
                    Object obj13 = this.b;
                    xyo c2 = uwd.a.c();
                    c2.H("Stopped tracking message");
                    c2.z("TrackingPurpose", obj13);
                    c2.c((MessageIdType) obj12);
                    c2.q();
                    return;
                }
                return;
            case 13:
                xyo e2 = uwd.a.e();
                e2.H("Error when trying to stop tracking");
                e2.z("TrackingPurpose", this.b);
                e2.c((MessageIdType) this.a);
                e2.r((Throwable) obj);
                return;
            case 14:
                ((xhc) obj).b((ConversationIdType) this.a, alog.n(this.b));
                return;
            case 15:
                xyo a3 = vbu.a.a();
                a3.H("Updating subscription map with: ");
                a3.j((String) obj);
                a3.H(" for subscription: ");
                vbu vbuVar = (vbu) this.a;
                a3.F(vbuVar.g);
                a3.q();
                vbuVar.f.put(Integer.valueOf(vbuVar.g), this.b);
                return;
            case 16:
                sec secVar = (sec) obj;
                if (secVar.k() && secVar.j()) {
                    Object obj14 = this.a;
                    this.b.add(secVar.g());
                    ((alpu) obj14).b(secVar.g(), secVar.h());
                    return;
                }
                xyo c3 = vcb.a.c();
                c3.H("No group encryption support for at least one participant.");
                c3.L("participant", secVar.g());
                c3.q();
                return;
            case 17:
                Map.Entry entry = (Map.Entry) obj;
                qei qeiVar = (qei) ((alor) this.a).get(entry.getKey());
                if (qeiVar != null) {
                    ((alpu) this.b).b(qeiVar, (String) entry.getValue());
                    return;
                }
                return;
            case 18:
                xbz xbzVar = (xbz) ((armf) obj).b();
                ((vqp) this.b).n(this.a);
                xbzVar.h();
                return;
            case 19:
                ung ungVar = new ung((vrl) obj, this.b, 12);
                vrj vrjVar = (vrj) this.a;
                aktp.ah(ungVar, vrjVar.i).k(qiu.b(), vrjVar.i);
                return;
            default:
                RcsAvailabilityLogWorker rcsAvailabilityLogWorker = (RcsAvailabilityLogWorker) this.a;
                rcsAvailabilityLogWorker.c(((vrn) ((xyt) rcsAvailabilityLogWorker.f.b()).a()).w(new adiw(((wxb) obj).c)), (Optional) this.b);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ rge(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
