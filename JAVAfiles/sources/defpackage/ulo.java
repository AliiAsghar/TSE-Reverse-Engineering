package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.List;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ulo implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ulo(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v104, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62, types: [mlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45, types: [armf, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        Object obj;
        long j;
        Uri parse;
        byte[] bArr = null;
        boolean z2 = false;
        switch (this.c) {
            case 0:
                Iterator<E> it = ((ulq) this.b).b.iterator();
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    if (longValue != -1) {
                        ((ulp) this.a).a.y(longValue);
                        xyo c = ulp.D.c();
                        c.H("Deleting file transfer from RCS engine.");
                        c.y("rcsFileTransferSessionId", longValue);
                        c.q();
                    }
                }
                return upm.b();
            case 1:
                Object obj2 = this.b;
                if (obj2 == null) {
                    return Optional.empty();
                }
                Object obj3 = this.a;
                aiut.b();
                alog c2 = ((tyo) obj3).e.e.c((String) obj2);
                ArrayList arrayList = new ArrayList();
                int i = ((alsx) c2).c;
                for (int i2 = 0; i2 < i; i2++) {
                    sec secVar = (sec) c2.get(i2);
                    if (secVar.j()) {
                        String i3 = secVar.i();
                        if (!TextUtils.isEmpty(i3)) {
                            arrayList.add(i3);
                        }
                    }
                }
                if (arrayList.size() != 1) {
                    if (arrayList.size() > 1) {
                        tyo.c.q("Multiple registration id's found for other participant");
                    }
                    return Optional.empty();
                }
                return Optional.of((String) arrayList.get(0));
            case 2:
                Object obj4 = this.a;
                Context context = ((ulr) obj4).a;
                Object obj5 = this.b;
                ContentResolver contentResolver = context.getContentResolver();
                for (String str : ((uls) obj5).b) {
                    try {
                        contentResolver.delete(Uri.parse(str), null, null);
                        ((ulr) obj4).b.ifPresent(new uhb(3));
                    } catch (IllegalArgumentException e) {
                        ulr.D.n("Unable to remove message part data content with uri: ".concat(String.valueOf(str)), e);
                    } catch (SecurityException e2) {
                        ulr.D.n("Unable to remove message part data content.", e2);
                    }
                }
                return upm.b();
            case 3:
                ulz ulzVar = (ulz) this.b;
                List list = (List) Collection.EL.stream(ulzVar.c).map(new uid(18)).collect(Collectors.toCollection(new tyr(9)));
                uly ulyVar = (uly) this.a;
                ulyVar.b.W(list);
                List<Uri> list2 = (List) Collection.EL.stream(ulzVar.b).map(new uid(19)).collect(Collectors.toCollection(new tyr(9)));
                ufv a = ((uie) ulyVar.a.a.b()).a(1);
                for (Uri uri : list2) {
                    if (uri != null) {
                        xzb.l("Bugle", "Clearing cache for ".concat(uri.toString()));
                        a.e(uri.toString());
                    }
                }
                return upm.b();
            case 4:
                int i4 = 0;
                while (true) {
                    ?? r2 = this.b;
                    if (i4 < ((alsx) r2).c) {
                        Object obj6 = this.a;
                        Uri parse2 = Uri.parse(((umb) r2.get(i4)).c);
                        if (parse2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        albo.T(z);
                        uma umaVar = (uma) obj6;
                        albo.T(umaVar.b.k(parse2));
                        File f = umaVar.b.f(parse2);
                        if (f != null) {
                            umaVar.a.i(f);
                        }
                        xyo a2 = uma.D.a();
                        a2.H("Scratch file was deleted:");
                        a2.z("file uri", parse2);
                        a2.q();
                        i4++;
                    } else {
                        return upm.b();
                    }
                }
            case 5:
                umd umdVar = (umd) this.b;
                long j2 = umdVar.c;
                long j3 = umdVar.d;
                umc umcVar = (umc) this.a;
                if (umcVar.b.R(j2, j3)) {
                    long j4 = umdVar.d;
                    long j5 = umdVar.c;
                    xyo c3 = umcVar.a.c();
                    c3.H("Deleted telephony");
                    c3.y("threadId", j5);
                    c3.y("cutoffTimestamp", j4);
                    c3.q();
                } else {
                    ConversationIdType b = ruy.b(umdVar.b);
                    long j6 = umdVar.d;
                    long j7 = umdVar.c;
                    xyo e3 = umcVar.a.e();
                    e3.H("there were no messages to delete. telephony:");
                    e3.b(b);
                    e3.y("threadId", j7);
                    e3.y("cutoffTimestamp", j6);
                    e3.H("[might have been a conversation with just a draft].");
                    e3.q();
                }
                return upm.b();
            case 6:
                Object obj7 = this.a;
                Object obj8 = this.b;
                try {
                    int i5 = ((umf) obj8).i;
                    MessageIdType b2 = rvc.b(((umf) obj8).c);
                    Uri parse3 = Uri.parse(((umf) obj8).h);
                    String str2 = ((umf) obj8).j;
                    String str3 = ((umf) obj8).g;
                    String str4 = ((umf) obj8).f;
                    boolean z3 = ((umf) obj8).k;
                    ConversationIdType b3 = ruy.b(((umf) obj8).d);
                    String str5 = ((umf) obj8).e;
                    int i6 = ((umf) obj8).l;
                    int i7 = ((umf) obj8).m;
                    if ((((umf) obj8).b & 4096) != 0) {
                        j = ((umf) obj8).o;
                    } else {
                        j = 0;
                    }
                    long j8 = j;
                    long k = riw.k(((ume) obj7).c.f().toEpochMilli());
                    if (TextUtils.isEmpty(str4)) {
                        parse = Uri.EMPTY;
                    } else {
                        parse = Uri.parse(str4);
                    }
                    Uri uri2 = parse;
                    String ag = albo.ag(MessageData.as(i7));
                    xyo c4 = ume.a.c();
                    c4.H("Downloading message.");
                    c4.H(ag);
                    c4.n(b2, b3);
                    c4.H("autoDownload:");
                    c4.I(z3);
                    c4.u(", contentLocation:");
                    c4.k(uri2);
                    c4.q();
                    if (MessageData.cj(i7)) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("status_if_failed", i6);
                        bundle.putBoolean("auto_download", z3);
                        ((ume) obj7).f.c(((ume) obj7).b, ((umf) obj8).n, bundle);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("message_id", b2.a());
                        bundle2.putString("conversation_id", b3.toString());
                        bundle2.putString("participant_id", str5);
                        bundle2.putInt("status_if_failed", i6);
                        bundle2.putLong("message_logging_id", j8);
                        ((mho) ((ume) obj7).d.b()).Q(b3, i5, j8);
                        obj = obj8;
                        try {
                            vqh o = ((ume) obj7).e.o(((ume) obj7).b, parse3, i5, str2, str3, uri2, z3, k / 1000, bundle2, j8);
                            if (o == vqh.a) {
                                xyo a3 = ume.a.a();
                                a3.H("Downloading MMS message asynchronously, waiting for pending intent.");
                                a3.n(b2, b3);
                                a3.q();
                            } else {
                                ((wzp) ((ume) obj7).g.b()).i(k);
                                rbv rbvVar = ((ume) obj7).h;
                                int i8 = o.f;
                                oia oiaVar = (oia) rbvVar.b.b();
                                oiaVar.getClass();
                                parse3.getClass();
                                str5.getClass();
                                uri2.getClass();
                                str2.getClass();
                                str3.getClass();
                                new ProcessDownloadedMmsAction(rbvVar.e, oiaVar, rbvVar.c, b2, parse3, b3, str5, uri2, i5, str2, i6, z3, str3, i8).z();
                            }
                        } catch (Exception unused) {
                            rbv rbvVar2 = ((ume) obj7).h;
                            umf umfVar = (umf) obj;
                            MessageIdType b4 = rvc.b(umfVar.c);
                            ConversationIdType b5 = ruy.b(umfVar.d);
                            String str6 = umfVar.e;
                            int i9 = umfVar.l;
                            int i10 = umfVar.i;
                            String str7 = umfVar.g;
                            oia oiaVar2 = (oia) rbvVar2.b.b();
                            oiaVar2.getClass();
                            str6.getClass();
                            str7.getClass();
                            new ProcessDownloadedMmsAction(rbvVar2.f, oiaVar2, rbvVar2.c, b4, b5, str6, i9, i10, str7).z();
                            return upm.b();
                        }
                    }
                } catch (Exception unused2) {
                    obj = obj8;
                }
                return upm.b();
            case 7:
                ((umh) this.a).j((umi) this.b);
                return upm.b();
            case 8:
                ugy ugyVar = (ugy) ((umq) this.a).a.b();
                umr umrVar = (umr) this.b;
                ugyVar.b(ruy.d(umrVar.c), tqc.values()[umrVar.d]);
                return upm.b();
            case 9:
                ((alwl) ums.a.m().h("com/google/android/apps/messaging/shared/datamodel/workhandlers/UpdateMarkUnreadHandler", "processPendingWorkItemAsync", 64, "UpdateMarkUnreadHandler.java")).q("Executing work inside UpdateMarkUnreadHandler.");
                umt umtVar = (umt) this.b;
                List list3 = (List) Collection.EL.stream(umtVar.b).map(new uid(20)).collect(Collectors.toCollection(new tyr(10)));
                ums umsVar = (ums) this.a;
                ums.j((rtz) umsVar.b.b(), umsVar.c, list3, umtVar.c);
                return upm.b();
            case 10:
                sqk sqkVar = new sqk();
                sqkVar.f("unflagMessage");
                sqkVar.b(new tux(this.a, this.b, 13));
                if (sqkVar.d() > 0) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 11:
                return Boolean.valueOf(uwc.d((MessageIdType) this.a, (tqg) this.b));
            case 12:
                sqk sqkVar2 = new sqk();
                sqkVar2.f("unflagMessages");
                sqkVar2.b(new tux(this.b, this.a, 15, bArr));
                if (sqkVar2.d() > 0) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 13:
                return ((wyp) this.b).e.A((BugleConversationId) this.a, true);
            case 14:
                alok alokVar = new alok();
                for (ango angoVar : this.b) {
                    angp angpVar = angoVar.c;
                    if (angpVar == null) {
                        angpVar = angp.a;
                    }
                    msk mskVar = (msk) ((ahmv) this.a).c.b();
                    angp angpVar2 = angoVar.c;
                    if (angpVar2 == null) {
                        angpVar2 = angp.a;
                    }
                    String str8 = angpVar2.c;
                    anha anhaVar = angoVar.h;
                    if (anhaVar == null) {
                        anhaVar = anha.a;
                    }
                    alokVar.h(angpVar, mskVar.t(str8, anhaVar.c));
                }
                return alokVar.g();
            case 15:
                aozy builder = ((apag) this.a).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ?? r22 = this.b;
                ((anfu) builder.b).b = anfu.emptyProtobufList();
                Iterator it2 = r22.iterator();
                while (it2.hasNext()) {
                    builder.aT((anfr) albo.bQ((akul) it2.next()));
                }
                return (anfu) builder.s();
            case 16:
                return ((vgk) this.a).b((aqfg) this.b);
            case 17:
                Object obj9 = this.b;
                Object obj10 = this.a;
                try {
                    Instant f2 = ((vjl) obj10).i.f();
                    String[] strArr = (String[]) ((vjl) obj10).k.c("MarkAsNotifiedHandler#processPendingWorkItemAsync", new ubu(obj10, obj9, 11));
                    if (strArr.length > 0) {
                        ((vjl) obj10).m.e(((vjl) obj10).b, strArr);
                    }
                    if (((vjm) obj9).b.size() > 0) {
                        Collection.EL.stream(((vjm) obj9).b).forEach(new uoa(obj10, 16));
                    } else {
                        ((vjl) obj10).c.J().m(ruy.a);
                    }
                    vco vcoVar = (vco) ((vjl) obj10).l.b();
                    vlm vlmVar = vlm.NT_SECONDARY_USER;
                    Object obj11 = ((vco) vcoVar.b).b;
                    aozy createBuilder = vkq.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    vkq vkqVar = (vkq) createBuilder.b;
                    vkqVar.c = vlmVar.i;
                    vkqVar.b = 1 | vkqVar.b;
                    ((vjs) obj11).w((vkq) createBuilder.s(), vco.t(vlmVar));
                    if (((vjm) obj9).c) {
                        ((vjl) obj10).j.e(3, Duration.between(f2, ((vjl) obj10).i.f()));
                    }
                    upk b6 = vjs.b();
                    return upm.c(alog.s(b6, vjs.g()));
                } catch (RuntimeException e4) {
                    vjm vjmVar = (vjm) obj9;
                    if (vjmVar.c) {
                        ((vjl) obj10).j.g(amwh.MESSAGE_TYPE_UNKNOWN, 4, viq.c(e4), Optional.of(Boolean.valueOf(vjmVar.c)));
                    }
                    throw e4;
                }
            case 18:
                Iterator<E> it3 = ((vjp) this.b).b.iterator();
                while (true) {
                    Object obj12 = this.a;
                    if (it3.hasNext()) {
                        vjo vjoVar = (vjo) it3.next();
                        int i11 = vjoVar.b;
                        if ((i11 & 1) != 0 && (i11 & 2) != 0) {
                            rwd rwdVar = (rwd) ((vjn) obj12).b.b();
                            ConversationIdType b7 = ruy.b(vjoVar.c);
                            MessageIdType b8 = rvc.b(vjoVar.d);
                            sya syaVar = new sya();
                            syaVar.aj("markFailedMessagesAsNotified");
                            syaVar.o(true);
                            if (rwdVar.O(b7, b8, syaVar)) {
                                alvw n = vjn.a.n();
                                n.X(ydl.o, vjoVar.c);
                                n.X(ydl.a, vjoVar.d);
                                ((alwl) n.h("com/google/android/apps/messaging/shared/notification/workhandlers/MarkFailuresAsNotifiedHandler", "markFailedMessagesAsNotified", 92, "MarkFailuresAsNotifiedHandler.java")).q("Marked failed message as notified");
                                z2 = true;
                            }
                        } else {
                            ((alwl) ((alwl) vjn.a.i()).h("com/google/android/apps/messaging/shared/notification/workhandlers/MarkFailuresAsNotifiedHandler", "markFailedMessagesAsNotified", 73, "MarkFailuresAsNotifiedHandler.java")).q("Conversation or message ID not found for resetting failed message notification");
                        }
                    } else {
                        if (z2) {
                            return upm.c(alog.r(vjs.g()));
                        }
                        return upm.b();
                    }
                }
                break;
            case 19:
                uuf uufVar = vlk.a;
                Iterator it4 = this.b.iterator();
                while (true) {
                    Object obj13 = this.a;
                    if (it4.hasNext()) {
                        dzi dziVar = (dzi) albo.bQ((akul) it4.next());
                        if (dziVar != null) {
                            dzj dzjVar = (dzj) obj13;
                            dzjVar.a.add(dziVar);
                            if (dzjVar.a.size() > 25) {
                                dzjVar.a.remove(0);
                            }
                        }
                    } else {
                        return obj13;
                    }
                }
            default:
                alwl alwlVar = (alwl) vlw.a.g();
                alwlVar.X(ydl.o, ((rto) this.a).L().a());
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createWearableActions", 309, "IncomingMessageActionCreator.java")).q("Wearable notification actions created");
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = this.b.iterator();
                while (it5.hasNext()) {
                    vke vkeVar = (vke) albo.bQ((akul) it5.next());
                    if (vkeVar != null) {
                        arrayList2.add(vkeVar);
                    }
                }
                List.EL.sort(arrayList2, vlw.c);
                return alog.n(arrayList2);
        }
    }

    public /* synthetic */ ulo(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
