package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.time.Instant;
import j$.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wua implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ wua(WearableBindService wearableBindService, ackf ackfVar, ConversationIdType conversationIdType, Uri uri, int i) {
        this.e = i;
        this.a = wearableBindService;
        this.d = ackfVar;
        this.c = conversationIdType;
        this.b = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [xoj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [xoj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [apus, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [apus, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = 1;
        switch (this.e) {
            case 0:
                psu psuVar = new psu("Jibe ContactsService had an error.", (ajny) obj);
                Object obj2 = this.d;
                ((wub) this.a).h(psuVar, (dtq) this.b, (qei) this.c, (String) obj2);
                return null;
            case 1:
                ContactsServiceResult contactsServiceResult = (ContactsServiceResult) obj;
                if (contactsServiceResult == null) {
                    contactsServiceResult = new ContactsServiceResult(1, "ContactsService returned null.");
                }
                if (!contactsServiceResult.succeeded()) {
                    Object obj3 = this.d;
                    Object obj4 = this.c;
                    ((wub) this.a).h(new psu(contactsServiceResult), (dtq) this.b, (qei) obj4, (String) obj3);
                }
                return null;
            case 2:
                xnv xnvVar = ((xbw) this.b).a;
                xbu xbuVar = (xbu) obj;
                Object obj5 = this.a;
                Instant f = xnvVar.f();
                AtomicReference atomicReference = (AtomicReference) obj5;
                atomicReference.set(f);
                aozy builder = xbuVar.toBuilder();
                UUID uuid = (UUID) this.c;
                String uuid2 = uuid.toString();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                xbu xbuVar2 = (xbu) builder.b;
                uuid2.getClass();
                xbuVar2.b |= 2;
                xbuVar2.d = uuid2;
                apct j = aotl.j((Instant) atomicReference.get());
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                Object obj6 = this.d;
                xbu xbuVar3 = (xbu) builder.b;
                j.getClass();
                xbuVar3.e = j;
                xbuVar3.b |= 4;
                if (uuid.toString().equals(xbuVar.d)) {
                    apct apctVar = xbuVar.e;
                    if (apctVar == null) {
                        apctVar = apct.a;
                    }
                    ((AtomicReference) obj6).set(aotl.l(apctVar));
                } else {
                    ((AtomicReference) obj6).set(f);
                }
                apct j2 = aotl.j((Instant) ((AtomicReference) obj6).get());
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                xbu xbuVar4 = (xbu) builder.b;
                j2.getClass();
                xbuVar4.f = j2;
                xbuVar4.b |= 8;
                return (xbu) builder.s();
            case 3:
                Object obj7 = this.a;
                xpr xprVar = (xpr) obj;
                Optional g = ((FileInformation) obj7).g();
                if (g.isPresent() && ajqd.FILE.equals(g.get())) {
                    albo.U(((xot) ((xqb) this.c).c.b()).n((MessageIdType) this.b, xprVar.a, xpg.DOWNLOAD, (qep) new pwc().m().fu(obj7), ((aozb) this.d).H()), "Failed to insert OR update file transfer entry in database.");
                }
                return xprVar;
            case 4:
                Object obj8 = this.a;
                upk g2 = vjs.g();
                amrl amrlVar = ((amgu) obj8).an;
                if (amrlVar == null) {
                    amrlVar = amrl.a;
                }
                ((xqq) this.c).j(this.b, amrlVar, (String) this.d);
                return upm.c(alog.r(g2));
            case 5:
                asmb asmbVar = (asmb) obj;
                Object obj9 = this.b;
                Object obj10 = this.a;
                synchronized (((xsl) obj10).g) {
                    ((xsl) obj10).h.remove(obj9);
                }
                return yyb.dj(asmbVar, new xsm((xrz) this.c, i), (String) this.d);
            case 6:
                apvh apvhVar = (apvh) obj;
                apvhVar.getClass();
                ((xtf) this.a).f((pzn) this.b, apvhVar, this.d, this.c);
                return apvhVar;
            case 7:
                apvh apvhVar2 = (apvh) obj;
                apvhVar2.getClass();
                ((xtf) this.a).f((pzn) this.b, apvhVar2, this.d, this.c);
                return apvhVar2;
            default:
                ackf ackfVar = (ackf) this.d;
                Object obj11 = ackfVar.a.get("42");
                long j3 = 0;
                if (obj11 != null) {
                    try {
                        j3 = ((Long) obj11).longValue();
                    } catch (ClassCastException e) {
                        ackf.q("42", obj11, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG, e);
                    }
                }
                long j4 = j3;
                Object obj12 = this.b;
                Object obj13 = this.c;
                Object obj14 = this.a;
                String g3 = yyb.g(ackfVar, "26");
                rgc rgcVar = (rgc) ((ibi) ((WearableBindService) obj14).m.b()).a;
                ryg rygVar = (ryg) rgcVar.a.b();
                rygVar.getClass();
                wyt wytVar = (wyt) rgcVar.e.b();
                wytVar.getClass();
                xnv xnvVar2 = (xnv) rgcVar.f.b();
                xnvVar2.getClass();
                tqx tqxVar = (tqx) rgcVar.g.b();
                tqxVar.getClass();
                agnq agnqVar = (agnq) rgcVar.h.b();
                agnqVar.getClass();
                rsv rsvVar = (rsv) rgcVar.i.b();
                rsvVar.getClass();
                rtb rtbVar = (rtb) rgcVar.j.b();
                rtbVar.getClass();
                anen anenVar = (anen) rgcVar.k.b();
                anenVar.getClass();
                anen anenVar2 = (anen) rgcVar.l.b();
                anenVar2.getClass();
                armf armfVar = rgcVar.o;
                armf armfVar2 = rgcVar.n;
                armf armfVar3 = rgcVar.m;
                new SendMessageToConversationOrParticipantsAction(rygVar, rgcVar.b, rgcVar.c, rgcVar.d, wytVar, xnvVar2, tqxVar, agnqVar, rsvVar, rtbVar, anenVar, anenVar2, armfVar3, armfVar2, armfVar, (ConversationIdType) obj13, (Uri) obj12, j4, g3).z();
                return null;
        }
    }

    public /* synthetic */ wua(Object obj, Object obj2, Object obj3, String str, int i) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = str;
    }

    public /* synthetic */ wua(xbw xbwVar, AtomicReference atomicReference, UUID uuid, AtomicReference atomicReference2, int i) {
        this.e = i;
        this.b = xbwVar;
        this.a = atomicReference;
        this.c = uuid;
        this.d = atomicReference2;
    }

    public /* synthetic */ wua(xqb xqbVar, FileInformation fileInformation, MessageIdType messageIdType, aozb aozbVar, int i) {
        this.e = i;
        this.c = xqbVar;
        this.a = fileInformation;
        this.b = messageIdType;
        this.d = aozbVar;
    }

    public /* synthetic */ wua(xqq xqqVar, MessageCoreData messageCoreData, amgu amguVar, String str, int i) {
        this.e = i;
        this.c = xqqVar;
        this.b = messageCoreData;
        this.a = amguVar;
        this.d = str;
    }

    public /* synthetic */ wua(xtf xtfVar, pzn pznVar, apus apusVar, xoj xojVar, int i) {
        this.e = i;
        this.a = xtfVar;
        this.b = pznVar;
        this.d = apusVar;
        this.c = xojVar;
    }
}
