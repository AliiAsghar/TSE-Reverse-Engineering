package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.datamodel.action.FillPartSizeAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReplaceSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateCloudSyncMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ndb implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ndb(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        agnw d;
        agnw d2;
        boolean booleanValue;
        int i = 19;
        int i2 = 10;
        boolean z = false;
        Boolean bool = false;
        switch (this.c) {
            case 0:
                alwo alwoVar = DefaultRecipient.a;
                return lga.aG((ParticipantsTable.BindData) this.b);
            case 1:
                alwo alwoVar2 = DefaultRecipient.a;
                return ((kjp) this.a.b()).b(this.b);
            case 2:
                alwo alwoVar3 = DefaultRecipient.a;
                return lga.aH((ParticipantsTable.BindData) this.b);
            case 3:
                return ((puo) this.b).c().a(this.a);
            case 4:
                return ((puo) this.b).c().b((qei) this.a);
            case 5:
                Object obj = this.a;
                obj.getClass();
                Object obj2 = this.b;
                obj2.getClass();
                qsn qsnVar = (qsn) obj2;
                String str = (String) obj;
                qso a = qta.a(str, qsnVar);
                if (a == null) {
                    UUID randomUUID = UUID.randomUUID();
                    randomUUID.getClass();
                    qss qssVar = new qss(randomUUID);
                    qso qsoVar = new qso(qssVar, qsnVar, str);
                    alvw g = qtc.a.g();
                    g.X(alwp.a, "BugleCME");
                    ((alvg) g.h("com/google/android/apps/messaging/shared/core/destination/DestinationsTableOperations", "matchExactOrCreate$lambda$1", 56, "DestinationsTableOperations.kt")).t("Creating a new Destination with token %s", qssVar);
                    qta.b(qsoVar).d();
                    return qsoVar;
                }
                return a;
            case 6:
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ?? r1 = this.a;
                ArrayList arrayList = new ArrayList(aqjn.J(r1, 10));
                Iterator it = r1.iterator();
                while (it.hasNext()) {
                    qwc j = ((qwd) this.b).j((qxc) it.next());
                    linkedHashSet.add(j.a);
                    arrayList.add(Boolean.valueOf(j.b));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    z |= ((Boolean) it2.next()).booleanValue();
                }
                return new qvl(linkedHashSet, z);
            case 7:
                Object obj3 = this.a;
                int b = qyo.b();
                ajwt ajwtVar = (ajwt) obj3;
                if (b == ajwtVar.a) {
                    return Optional.empty();
                }
                if (b != -1) {
                    return Optional.of(new IllegalStateException(String.format("Cannot link account; one is already linked with id: %s", Integer.valueOf(b))));
                }
                String[] strArr = stb.a;
                int i3 = srr.a;
                ssw sswVar = new ssw();
                sswVar.b(ajwtVar.a);
                ssu a2 = sswVar.a();
                d = agnc.d("$primary");
                d2 = agnc.d("$primary");
                agnc.a(d2, "linked_account", a2, new spl(d, 8), new rbc(i));
                if (xxy.a()) {
                    Object obj4 = this.b;
                    ((qyo) obj4).b.h(new mla(i2), "LinkedAccountManager#afterSetLinkedAccount", new nau(obj4, 13));
                }
                return Optional.empty();
            case 8:
                ?? r0 = this.a;
                ConversationIdType z2 = r0.z();
                if (z2 == null) {
                    z2 = ruy.a;
                }
                rxc rxcVar = (rxc) ((FillPartSizeAction) this.b).a.b();
                MessageIdType A = r0.A();
                String Z = r0.Z();
                tbt tbtVar = new tbt();
                tbtVar.aj("FillPartSizeAction#doBackgroundWork");
                tbtVar.u(r0.c());
                tbtVar.j(r0.b());
                return Boolean.valueOf(rxcVar.e(z2, A, Z, tbtVar));
            case 9:
                ?? r02 = this.a;
                r02.getClass();
                return ((rvw) ((rat) this.b).y.b()).a(r02);
            case 10:
                return ((qih) ((rat) this.b).i.b()).b(tqc.UNARCHIVED, this.a);
            case 11:
                rbk rbkVar = (rbk) this.b;
                if (!((pdg) rbkVar.f.b()).a()) {
                    booleanValue = rbkVar.b.O();
                } else {
                    booleanValue = ((Boolean) this.a.ac().flatMap(new qza(17)).map(new qwz(rbkVar.c, i)).orElse(bool)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case 12:
                ?? r03 = this.a;
                Object obj5 = this.b;
                Uri t = r03.t();
                if (t != null) {
                    sxy d3 = MessagesTable.d();
                    d3.w("replaceMessage");
                    d3.g(new rbw(t, 6));
                    d3.u(1);
                    sxt sxtVar = (sxt) d3.b().n();
                    try {
                        if (sxtVar.moveToFirst()) {
                            r03.bQ(sxtVar.E());
                            ((rwd) ((ReplaceSmsMessageAction) obj5).b.b()).H(r03);
                            bool = true;
                        }
                        sxtVar.close();
                    } catch (Throwable th) {
                        try {
                            sxtVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return bool;
            case 13:
                return ((qih) ((SendMessageToConversationOrParticipantsAction) this.b).g.b()).b(tqc.UNARCHIVED, this.a);
            case 14:
                UpdateCloudSyncMessageAction updateCloudSyncMessageAction = (UpdateCloudSyncMessageAction) this.b;
                boolean z3 = false;
                for (Parcelable parcelable : updateCloudSyncMessageAction.u.E()) {
                    Bundle bundle = (Bundle) parcelable;
                    String string = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.ID");
                    MessageCoreData p = ((rwd) updateCloudSyncMessageAction.b.b()).p(string);
                    if (p == null) {
                        this.a.add(string);
                    } else {
                        z3 |= ((qih) updateCloudSyncMessageAction.a.b()).e(string, bundle, p);
                    }
                }
                return Boolean.valueOf(z3);
            case 15:
                Object obj6 = this.b;
                obj6.getClass();
                for (ConversationIdType conversationIdType : this.a) {
                    alvw f = rqc.a.f();
                    f.X(alwp.a, "BugleBackup");
                    ((alvg) f.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/impl/ConversationRefresherImpl", "refreshConversationsInBatch$lambda$2$lambda$1", 68, "ConversationRefresherImpl.kt")).t("Refreshing conversation [%s]", conversationIdType);
                    ((ruq) ((rqc) obj6).b.b()).b(conversationIdType, true, null);
                }
                return arnb.a;
            case 16:
                lrf lrfVar = (lrf) ((rto) this.b).f.b();
                san sanVar = (san) this.a;
                return lrfVar.l(sanVar.l(), sanVar.p(), sanVar.q());
            case 17:
                lrf lrfVar2 = (lrf) ((rto) this.b).f.b();
                sac sacVar = (sac) this.a;
                return lrfVar2.l(sacVar.l(), sacVar.p(), sacVar.q());
            case 18:
                snf e = sni.e();
                e.w("conversations.updateAndReturnUpdatedRows-query");
                agpr agprVar = (agpr) this.b;
                alog alogVar = agprVar.e;
                int i4 = ((alsx) alogVar).c;
                for (int i5 = 0; i5 < i4; i5++) {
                    e.k((agpw) alogVar.get(i5));
                }
                if (agprVar.d.b) {
                    snh snhVar = new snh();
                    snhVar.W(agprVar.f());
                    e.g(snhVar);
                }
                if (agprVar.d.c) {
                    e.q();
                }
                Object obj7 = this.a;
                alog t2 = e.b().t();
                ((Integer) obj7).intValue();
                agprVar.r();
                return t2;
            case 19:
                sxy d4 = MessagesTable.d();
                d4.w("messages.updateAndReturnUpdatedRows-query");
                Object obj8 = this.b;
                sxz sxzVar = (sxz) obj8;
                alog alogVar2 = sxzVar.e;
                int i6 = ((alsx) alogVar2).c;
                for (int i7 = 0; i7 < i6; i7++) {
                    d4.k((syb) ((agpw) alogVar2.get(i7)));
                }
                if (sxzVar.d.b) {
                    syc sycVar = new syc();
                    sycVar.W(((agpr) obj8).f());
                    d4.f(sycVar);
                }
                if (sxzVar.d.c) {
                    d4.q();
                }
                Object obj9 = this.a;
                alog t3 = d4.b().t();
                ((Integer) obj9).intValue();
                ((agpr) obj8).r();
                return t3;
            default:
                taz e2 = ParticipantsTable.e();
                e2.w("participants.updateAndReturnUpdatedRows-query");
                Object obj10 = this.b;
                tba tbaVar = (tba) obj10;
                alog alogVar3 = tbaVar.e;
                int i8 = ((alsx) alogVar3).c;
                for (int i9 = 0; i9 < i8; i9++) {
                    e2.k((tbc) ((agpw) alogVar3.get(i9)));
                }
                if (tbaVar.d.b) {
                    tbd tbdVar = new tbd();
                    tbdVar.W(((agpr) obj10).f());
                    e2.f(tbdVar);
                }
                if (tbaVar.d.c) {
                    e2.q();
                }
                Object obj11 = this.a;
                alog t4 = e2.b().t();
                ((Integer) obj11).intValue();
                ((agpr) obj10).r();
                return t4;
        }
    }

    public /* synthetic */ ndb(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
