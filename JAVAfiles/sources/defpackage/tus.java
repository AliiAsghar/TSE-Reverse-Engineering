package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.communication.synapse.security.scytale.ReceiptInfo;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tus implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ tus(Object obj, Instant instant, qei qeiVar, String str, String str2, ReceiptInfo receiptInfo, int i) {
        this.g = i;
        this.a = obj;
        this.b = instant;
        this.c = qeiVar;
        this.d = str;
        this.e = str2;
        this.f = receiptInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i;
        alog g;
        String J;
        boolean z;
        int i2 = this.g;
        if (i2 != 0) {
            if (i2 != 1) {
                vmf vmfVar = (vmf) this.d;
                IconCompat iconCompat = (IconCompat) obj;
                xzu xzuVar = (xzu) vmfVar.f.get();
                ConversationIdType conversationIdType = (ConversationIdType) this.b;
                String f = xzuVar.f(conversationIdType);
                wfh wfhVar = (wfh) vmfVar.g.b();
                Object obj2 = this.a;
                rru rruVar = (rru) obj2;
                if (true != wfhVar.T(rruVar)) {
                    i = 2147483646;
                } else {
                    i = 0;
                }
                ?? r10 = this.e;
                alog alogVar = (alog) r10;
                rto rtoVar = (rto) obj2;
                String p = vmfVar.u.p(rtoVar, alogVar);
                vjx a = vjy.a();
                a.b = conversationIdType;
                ?? r4 = this.c;
                a.d(r4);
                a.a = f;
                a.b(p);
                a.c(rtoVar.S());
                a.e(rruVar.n());
                a.f(i);
                if (alogVar.isEmpty()) {
                    g = alsx.a;
                } else {
                    HashSet hashSet = new HashSet();
                    alob alobVar = new alob();
                    int size = r10.size();
                    int i3 = 0;
                    while (i3 < size) {
                        rry rryVar = (rry) r10.get(i3);
                        ParticipantsTable.BindData bindData = rryVar.c;
                        int i4 = i3;
                        long s = bindData.s();
                        String N = bindData.N();
                        Uri uri = null;
                        if (s > -1 && !TextUtils.isEmpty(N)) {
                            uri = ContactsContract.Contacts.getLookupUri(s, N);
                        }
                        Uri uri2 = uri;
                        if (rryVar.au() && uri2 != null && !hashSet.contains(uri2)) {
                            hashSet.add(uri2);
                            ParticipantsTable.BindData bindData2 = rryVar.c;
                            String L = bindData2.L();
                            if (TextUtils.isEmpty(L)) {
                                vti vtiVar = vmfVar.u;
                                if (((Boolean) new mss(3).get()).booleanValue()) {
                                    J = vtiVar.h.o(bindData2).F().a;
                                    J.getClass();
                                } else {
                                    J = bindData2.J();
                                }
                                if (TextUtils.isEmpty(J)) {
                                    L = ((Context) vtiVar.g).getString(R.string.unknown_sender);
                                } else {
                                    L = J;
                                }
                            }
                            alobVar.h(vlq.b(L, rryVar.o(), uri2));
                        }
                        i3 = i4 + 1;
                    }
                    g = alobVar.g();
                }
                a.f = Optional.of(g);
                a.c = iconCompat;
                qoq qoqVar = vmfVar.e;
                Context context = vmfVar.b;
                if (((plc) vmfVar.r.b()).a() && rtoVar.R()) {
                    z = true;
                } else {
                    z = false;
                }
                a.d = Optional.of(vlb.a(qoqVar.B(context, r4, (lrf) this.f, z), false, Optional.empty(), Optional.empty()));
                return Optional.of(a.a());
            }
            tuo tuoVar = (tuo) obj;
            if (!tuoVar.a) {
                tup.a.q("SIGNAL_FTD FTD was processed but was not successful.");
                return upm.b();
            }
            ?? r8 = this.e;
            Object obj3 = this.d;
            Object obj4 = this.c;
            Object obj5 = this.a;
            if (tuoVar.b.isEmpty()) {
                xyo e = tup.a.e();
                e.H("FTD handler did not provide a new identity. It's an FTD from an existing identity.");
                e.z("remoteUserId", yyb.bh(tup.a((qei) obj4, (String) obj3)));
                e.z("remoteRegistrationId", yyb.bh(r8));
                e.q();
            } else {
                qei qeiVar = (qei) obj4;
                String str = (String) obj3;
                String str2 = (String) r8;
                ((tup) obj5).h.f(qeiVar, str, str2, (aozb) tuoVar.b.get(), (Instant) this.b);
            }
            rve a2 = rve.a(((ReceiptInfo) this.f).getMessageId());
            final tup tupVar = (tup) obj5;
            final MessageCoreData r = ((rwd) tupVar.g.b()).r(a2);
            if (r == null) {
                xyo e2 = tup.a.e();
                e2.H("Message not found");
                e2.g(a2);
                e2.q();
                ((mbl) tupVar.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
            } else {
                final qei qeiVar2 = (qei) obj4;
                final String str3 = (String) obj3;
                tupVar.j.e("copyMessageAsANewHiddenOne", new Runnable() { // from class: tun
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageIdType C;
                        agnw d;
                        agnw d2;
                        MessageCoreData messageCoreData = r;
                        MessagesTable.BindData a3 = MessagesTable.a(messageCoreData.B());
                        tup tupVar2 = tup.this;
                        if (a3 == null) {
                            ((mbl) tupVar2.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
                            xyo e3 = tup.a.e();
                            e3.H("Message did not exist. FTD can't be handled.");
                            e3.g(messageCoreData.E());
                            e3.q();
                            return;
                        }
                        rto z2 = ((uac) tupVar2.e.b()).z(messageCoreData.z());
                        if (z2 == null) {
                            ((mbl) tupVar2.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 15);
                            xyo e4 = tup.a.e();
                            e4.H("Conversation does not exist. FTD can't be handled.");
                            e4.g(messageCoreData.E());
                            e4.b(messageCoreData.z());
                            e4.q();
                            return;
                        }
                        if (tupVar2.d.f().toEpochMilli() - a3.u() >= ((Long) trz.b.e()).longValue()) {
                            ((mbl) tupVar2.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 20);
                            alvw i5 = tup.b.i();
                            i5.X(alwp.a, "BugleEtouffee");
                            ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/FtdHandler", "copyMessageAsANewHiddenOne", 414, "FtdHandler.java")).D("FTD ignored because the original message is old. RCS messageId: %s, conversationId: %s", messageCoreData.E().f(), messageCoreData.z().a());
                            return;
                        }
                        sxn F = a3.F();
                        if (z2.G() == 2) {
                            String str4 = str3;
                            qei qeiVar3 = qeiVar2;
                            armf armfVar = tupVar2.f;
                            String a4 = tup.a(qeiVar3, str4);
                            String k = ((rxq) armfVar.b()).k(a4);
                            if (TextUtils.isEmpty(k)) {
                                xyo e5 = tup.a.e();
                                e5.H("Participant is missing for a message.");
                                e5.g(messageCoreData.E());
                                e5.b(messageCoreData.z());
                                e5.L("remoteUserIdFtdSender", a4);
                                e5.q();
                                return;
                            }
                            F.u(k);
                            if (tte.e()) {
                                rve E = messageCoreData.E();
                                xyo c = twu.a.c();
                                c.H("Add custom headers");
                                c.g(E);
                                c.q();
                                if (!E.i()) {
                                    String str5 = E.b;
                                    vxu a5 = vxu.a();
                                    vxt vxtVar = vxt.ETOUFFEE_NAMESPACE;
                                    str5.getClass();
                                    a5.d(vxtVar, "original-message-id", str5);
                                    a5.d(vxt.ETOUFFEE_NAMESPACE, "recipient", a4);
                                    F.q(a5.c());
                                }
                            } else {
                                tup.a.o("Does not add custom headers.");
                            }
                        }
                        F.j(null);
                        F.i(null);
                        F.r(Optional.empty());
                        F.ac(ruz.a);
                        F.x(Optional.empty());
                        F.T(tupVar2.m.a());
                        F.an(4);
                        F.S(-1L);
                        F.w(true);
                        F.ae(messageCoreData.p() + 1);
                        if (messageCoreData.C().b()) {
                            C = messageCoreData.B();
                        } else {
                            C = messageCoreData.C();
                        }
                        F.I(C);
                        F.ab(tupVar2.d.f().toEpochMilli());
                        MessagesTable.BindData c2 = F.c();
                        tbs d3 = PartsTable.d();
                        d3.w("copyMessageAsANewHiddenOne");
                        d3.g(new ttr(messageCoreData, 3));
                        tbn tbnVar = (tbn) d3.b().n();
                        while (tbnVar.moveToNext()) {
                            try {
                                tbg r2 = ((PartsTable.BindData) tbnVar.cK()).r();
                                r2.J(c2.A());
                                PartsTable.BindData b = r2.b(new taq(6));
                                d = agnc.d("$primary");
                                d2 = agnc.d("$primary");
                                agnc.a(d2, "parts", b, new tbe(d, 0), new smq(b, 17));
                            } catch (Throwable th) {
                                try {
                                    tbnVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        tbnVar.close();
                    }
                });
                ((mbl) tupVar.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 3);
                new ProcessPendingMessagesAction().z();
            }
            return upm.b();
        }
        tut tutVar = (tut) obj;
        if (!tutVar.a) {
            tuu.a.q("SIGNAL_FTD FTD was processed but was not successful.");
            return upm.b();
        }
        ?? r82 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.a;
        if (tutVar.b.isEmpty()) {
            xyo e3 = tuu.a.e();
            e3.H("FTD handler did not provide a new identity. It's an FTD from an existing identity.");
            e3.z("remoteUserId", yyb.bh(tuu.a((qei) obj7, (String) obj6)));
            e3.z("remoteRegistrationId", yyb.bh(r82));
            e3.q();
        } else {
            qei qeiVar3 = (qei) obj7;
            String str4 = (String) obj6;
            String str5 = (String) r82;
            ((tuu) obj8).h.f(qeiVar3, str4, str5, (aozb) tutVar.b.get(), (Instant) this.b);
        }
        rve a3 = rve.a(((ReceiptInfo) this.f).getMessageId());
        final tuu tuuVar = (tuu) obj8;
        final MessageCoreData r2 = ((rwd) tuuVar.g.b()).r(a3);
        if (r2 == null) {
            xyo e4 = tuu.a.e();
            e4.H("Message not found");
            e4.g(a3);
            e4.q();
            ((mbl) tuuVar.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
        } else {
            final qei qeiVar4 = (qei) obj7;
            final String str6 = (String) obj6;
            final String str7 = (String) r82;
            tuuVar.j.e("copyMessageAsANewHiddenOne", new Runnable() { // from class: tuq
                @Override // java.lang.Runnable
                public final void run() {
                    MessageIdType C;
                    MessageCoreData messageCoreData = r2;
                    MessagesTable.BindData a4 = MessagesTable.a(messageCoreData.B());
                    tuu tuuVar2 = tuu.this;
                    if (a4 == null) {
                        ((mbl) tuuVar2.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
                        xyo e5 = tuu.a.e();
                        e5.H("Message did not exist. FTD can't be handled.");
                        e5.g(messageCoreData.E());
                        e5.q();
                        return;
                    }
                    rto z2 = ((uac) tuuVar2.e.b()).z(messageCoreData.z());
                    if (z2 == null) {
                        ((mbl) tuuVar2.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 15);
                        xyo e6 = tuu.a.e();
                        e6.H("Conversation does not exist. FTD can't be handled.");
                        e6.g(messageCoreData.E());
                        e6.b(messageCoreData.z());
                        e6.q();
                        return;
                    }
                    if (tuuVar2.d.f().toEpochMilli() - a4.u() >= ((Long) trz.b.e()).longValue()) {
                        ((mbl) tuuVar2.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 20);
                        alvw i5 = tuu.b.i();
                        i5.X(alwp.a, "BugleEtouffee");
                        ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/FtdHandlerV2", "copyMessageAsANewHiddenOne", 440, "FtdHandlerV2.java")).D("FTD ignored because the original message is old. RCS messageId: %s, conversationId: %s", messageCoreData.E().f(), messageCoreData.z().a());
                        return;
                    }
                    sxn F = a4.F();
                    if (z2.G() == 2) {
                        String str8 = str6;
                        qei qeiVar5 = qeiVar4;
                        armf armfVar = tuuVar2.f;
                        String a5 = tuu.a(qeiVar5, str8);
                        String k = ((rxq) armfVar.b()).k(a5);
                        if (TextUtils.isEmpty(k)) {
                            xyo e7 = tuu.a.e();
                            e7.H("Participant is missing for a message.");
                            e7.g(messageCoreData.E());
                            e7.b(messageCoreData.z());
                            e7.L("remoteUserIdFtdSender", a5);
                            e7.q();
                            return;
                        }
                        F.u(k);
                        if (tte.f()) {
                            rve E = messageCoreData.E();
                            xyo c = twu.a.c();
                            c.H("Add custom headers");
                            c.g(E);
                            c.q();
                            if (!E.i()) {
                                String str9 = str7;
                                vxu a6 = vxu.a();
                                a6.d(vxt.ETOUFFEE_NAMESPACE, "recipient", a5);
                                a6.d(vxt.ETOUFFEE_NAMESPACE, "registration", str9);
                                if (F.R.i()) {
                                    twu.a.l("Set original RCS message Id");
                                    F.K(E);
                                }
                                if (F.R.equals(messageCoreData.D())) {
                                    F.q(a6.c());
                                } else {
                                    throw new IllegalStateException("RCS message Ids do not match.");
                                }
                            }
                        } else {
                            tuu.a.o("Does not add custom headers.");
                        }
                    }
                    F.j(null);
                    F.i(null);
                    F.r(Optional.empty());
                    F.ac(ruz.a);
                    F.x(Optional.empty());
                    F.T(tuuVar2.m.a());
                    F.an(4);
                    F.S(-1L);
                    F.w(true);
                    F.ae(messageCoreData.p() + 1);
                    if (messageCoreData.C().b()) {
                        C = messageCoreData.B();
                    } else {
                        C = messageCoreData.C();
                    }
                    F.I(C);
                    F.ab(tuuVar2.d.f().toEpochMilli());
                    MessagesTable.BindData c2 = F.c();
                    tbs d = PartsTable.d();
                    d.w("copyMessageAsANewHiddenOne-parts");
                    d.g(new ttr(messageCoreData, 4));
                    tbn tbnVar = (tbn) d.b().n();
                    while (tbnVar.moveToNext()) {
                        try {
                            tbg r3 = ((PartsTable.BindData) tbnVar.cK()).r();
                            r3.J(c2.A());
                            r3.d();
                        } catch (Throwable th) {
                            try {
                                tbnVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    tbnVar.close();
                }
            });
            ((mbl) tuuVar.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 3);
            new ProcessPendingMessagesAction().z();
        }
        return upm.b();
    }

    public /* synthetic */ tus(vmf vmfVar, ConversationIdType conversationIdType, rru rruVar, alog alogVar, ConversationId conversationId, lrf lrfVar, int i) {
        this.g = i;
        this.d = vmfVar;
        this.b = conversationIdType;
        this.a = rruVar;
        this.e = alogVar;
        this.c = conversationId;
        this.f = lrfVar;
    }
}
