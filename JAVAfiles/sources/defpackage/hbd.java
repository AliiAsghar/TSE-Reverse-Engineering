package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionsJsonParser;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import j$.time.Instant;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hbd implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ hbd(aozy aozyVar, akul akulVar, akul akulVar2, int i) {
        this.d = i;
        this.c = aozyVar;
        this.a = akulVar;
        this.b = akulVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v138, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v147, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.text.Spannable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v56, types: [qby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        int i2 = 10;
        int i3 = -1;
        byte[] bArr = null;
        r9 = null;
        r9 = null;
        boolean z = true;
        switch (this.d) {
            case 0:
                return hbf.a((Context) this.a, (String) this.b, (String) this.c);
            case 1:
                gud gudVar = (gud) this.a;
                WorkDatabase workDatabase = gudVar.d;
                String str = (String) this.b;
                ((ArrayList) this.c).addAll(workDatabase.B().a(str));
                return gudVar.d.A().b(str);
            case 2:
                Object obj = this.b;
                Object obj2 = this.c;
                Object obj3 = this.a;
                akrh e = aktp.e("DraftDataService#processMessageData");
                try {
                    if (((Optional) obj2).isPresent()) {
                        MessageCoreData a = ((imk) obj3).e.a();
                        MessagesTable.BindData bindData = ((imd) ((Optional) obj2).get()).a;
                        SelfIdentityId f = ((rto) obj).f();
                        ((MessageData) a).aI(bindData);
                        ((MessageData) a).j.ad(((SelfIdentityIdImpl) f).a);
                        MessageIdType messageIdType = ((imd) ((Optional) obj2).get()).c;
                        if (!messageIdType.b()) {
                            ((MessageData) a).l = lua.a(messageIdType);
                        }
                        ((rxc) ((imk) obj3).i.b()).b(a, true);
                        for (MessagePartCoreData messagePartCoreData : ((MessageData) a).i) {
                            messagePartCoreData.ae();
                            messagePartCoreData.aM(rvc.a);
                        }
                        ((MessageData) a).j = ((MessageData) a).j.a().F();
                        bArr = a;
                    }
                    e.close();
                    return bArr;
                } finally {
                }
            case 3:
                alog alogVar = (alog) albo.bQ(this.b);
                alog alogVar2 = (alog) albo.bQ(this.c);
                int i4 = alog.d;
                return ((qya) ((tby) this.a).e).l(alogVar, alogVar2, alsx.a);
            case 4:
                zai zaiVar = (zai) ((tby) this.a).q;
                MessageCoreData f2 = ((rwd) zaiVar.a.b()).f((ConversationIdType) this.b);
                if (f2 != null) {
                    String aw = f2.aw();
                    if (!TextUtils.isEmpty(aw)) {
                        ?? r3 = this.c;
                        if (r3 != 0) {
                            for (ParticipantsTable.BindData bindData2 : r3) {
                                if (aw.equals(bindData2.M())) {
                                }
                            }
                        }
                        bindData2 = ((rxq) zaiVar.e.b()).a(aw);
                    }
                }
                if (bindData2 == null) {
                    return ParticipantsTable.c().a();
                }
                return bindData2;
            case 5:
                ?? r0 = this.a;
                Linkify.addLinks((Spannable) r0, 7);
                Object obj4 = this.c;
                Object obj5 = this.b;
                if (obj4 != null) {
                    URLSpan[] uRLSpanArr = (URLSpan[]) r0.getSpans(0, r0.length(), URLSpan.class);
                    int length = uRLSpanArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        URLSpan uRLSpan = uRLSpanArr[i5];
                        iix iixVar = new iix(obj4, uRLSpan, i2, bArr);
                        if (((lea) obj5).a.a()) {
                            iix iixVar2 = new iix(uRLSpan, obj4, 11);
                            String url = uRLSpan.getURL();
                            Pattern pattern = ytd.a;
                            int spanStart = r0.getSpanStart(uRLSpan);
                            int spanEnd = r0.getSpanEnd(uRLSpan);
                            int spanFlags = r0.getSpanFlags(uRLSpan);
                            if (spanStart != i3 && spanEnd != i3) {
                                r0.removeSpan(uRLSpan);
                                r0.setSpan(new ytc(url, iixVar2), spanStart, spanEnd, spanFlags);
                            }
                        } else {
                            String url2 = uRLSpan.getURL();
                            Pattern pattern2 = ytd.a;
                            int spanStart2 = r0.getSpanStart(uRLSpan);
                            int spanEnd2 = r0.getSpanEnd(uRLSpan);
                            int spanFlags2 = r0.getSpanFlags(uRLSpan);
                            if (spanStart2 != i3 && spanEnd2 != i3) {
                                r0.removeSpan(uRLSpan);
                                r0.setSpan(new ytb(url2, uRLSpan, iixVar), spanStart2, spanEnd2, spanFlags2);
                            }
                        }
                        i5++;
                        i2 = 10;
                        i3 = -1;
                    }
                }
                alor alorVar = (alor) DesugarArrays.stream((URLSpan[]) r0.getSpans(0, r0.length(), URLSpan.class)).collect(alls.a(Function$CC.identity(), new lcw(9)));
                return Pair.create(((lea) obj5).b.a(r0, alorVar), alorVar);
            case 6:
                lee leeVar = new lee();
                leeVar.b(false);
                leeVar.a(false);
                leeVar.c(false);
                leeVar.b(((Boolean) albo.bQ(this.a)).booleanValue());
                leeVar.a(((Boolean) albo.bQ(this.b)).booleanValue());
                leeVar.c(((Boolean) albo.bQ(this.c)).booleanValue());
                if (leeVar.d != 7) {
                    StringBuilder sb = new StringBuilder();
                    if ((leeVar.d & 1) == 0) {
                        sb.append(" linkPreviewEnabled");
                    }
                    if ((leeVar.d & 2) == 0) {
                        sb.append(" allRichCardsEnabled");
                    }
                    if ((leeVar.d & 4) == 0) {
                        sb.append(" richCardsWifiOnly");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                return new lef(leeVar.a, leeVar.b, leeVar.c);
            case 7:
                ?? r02 = this.a;
                alhr alhrVar = mic.h;
                aozy createBuilder = amkp.a.createBuilder();
                if (true != ((Boolean) albo.bQ(r02)).booleanValue()) {
                    i = 2;
                } else {
                    i = 3;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ?? r32 = this.b;
                amkp amkpVar = (amkp) createBuilder.b;
                amkpVar.c = i - 1;
                amkpVar.b |= 1;
                long longValue = ((Long) albo.bQ(r32)).longValue();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj6 = this.c;
                amkp amkpVar2 = (amkp) createBuilder.b;
                amkpVar2.b |= 2;
                amkpVar2.d = longValue;
                aozy aozyVar = (aozy) obj6;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amiq amiqVar = (amiq) aozyVar.b;
                amkp amkpVar3 = (amkp) createBuilder.s();
                amiq amiqVar2 = amiq.a;
                amkpVar3.getClass();
                amiqVar.am = amkpVar3;
                amiqVar.d |= 8;
                return obj6;
            case 8:
                return Boolean.valueOf(((xwt) ((mmg) this.b).d.b()).b(((BugleConversationId) this.a).a, tqc.ARCHIVED, (amfe) this.c));
            case 9:
                return Boolean.valueOf(((xwt) ((mmg) this.b).d.b()).b(((BugleConversationId) this.a).a, tqc.UNARCHIVED, (amfe) this.c));
            case 10:
                ((rtz) ((mmg) this.a).c.b()).ah((ConversationIdType) this.b, (sng) this.c);
                return null;
            case 11:
                mll mllVar = (mll) albo.bQ(this.b);
                alog alogVar3 = (alog) albo.bQ(this.c);
                if (!mllVar.q() && !alogVar3.isEmpty()) {
                    mwf mwfVar = (mwf) this.a;
                    mwfVar.f(mllVar.f());
                    if (mllVar.b() == mit.ONE_ON_ONE || mllVar.b() == mit.RBM) {
                        if (alogVar3.size() != 1) {
                            alwl alwlVar = (alwl) mwf.a.i();
                            alwlVar.X(ydl.q, mwfVar.h);
                            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/BugleComposeConstraintsSupplier", "maybeSubscribeToAllRcsObservables", 756, "BugleComposeConstraintsSupplier.java")).w("Compose Constraints: Found %s Recipients for 1:1 conversation. Properties: %s", alogVar3.size(), mllVar);
                        }
                        if (alogVar3.size() != 1) {
                            z = false;
                        }
                        d.s(z);
                        mwfVar.d(((ResolvedRecipient) alogVar3.get(0)).x(2));
                    }
                }
                return null;
            case 12:
                alog alogVar4 = (alog) albo.bQ(this.b);
                naf a2 = ((nag) albo.bQ(this.c)).a(alogVar4);
                return new nae(alogVar4, a2.a, a2.b, new mzp(this.a, 0));
            case 13:
                String f3 = ((qdx) ((psd) this.a).e.b()).a().f();
                qdk qdkVar = (qdk) this.b;
                String str2 = qdkVar.a.g;
                ArrayList<ConversationSuggestion> parse = new ConversationSuggestionsJsonParser().parse(((ChatMessage) this.c).b().D());
                int size = parse.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ConversationSuggestion conversationSuggestion = parse.get(i6);
                    conversationSuggestion.setRcsMessageId(f3);
                    conversationSuggestion.setTargetRcsMessageId(str2);
                }
                if (!Objects.isNull(parse) && !adom.o(parse) && !TextUtils.isEmpty(str2)) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS, parse);
                    qei qeiVar = qdkVar.a.d;
                    if (qeiVar == null) {
                        qeiVar = qei.a;
                    }
                    bundle.putString(RcsIntents.EXTRA_USER_ID, qeiVar.d);
                    rve.h(bundle, RcsIntents.EXTRA_MESSAGE_ID, rve.a(f3));
                    rve.h(bundle, RcsIntents.EXTRA_TARGET_RCS_MESSAGE_ID, rve.a(str2));
                    return Optional.of(bundle);
                }
                return Optional.empty();
            case 14:
                ((lgg) ((nej) this.a).a).g(new ksn(this.c, this.b, i2, bArr));
                return null;
            case 15:
                pto ptoVar = (pto) this.b;
                ptz a3 = ptoVar.a();
                Instant b = ptoVar.b();
                String str3 = ((qei) this.c).d;
                d.t(!str3.isEmpty(), "Cannot insert RCS capabilities into RcsRemoteCapabilitiesCacheTable, MSISDN is empty");
                Boolean bool = (Boolean) ((pth) this.a).b.b.c("RcsCapabilitiesDatabaseOperations#writeRcsCapabilitiesIfFresher", new mri(str3, a3, b, 15));
                bool.booleanValue();
                return bool;
            case 16:
                String str4 = ((qgv) this.b).c;
                qeg qegVar = ((qgx) this.c).c;
                if (qegVar == null) {
                    qegVar = qeg.a;
                }
                return ((qax) this.a).a(str4, qegVar);
            case 17:
                return this.b.a(this.c, (qbs) this.a);
            case 18:
                mut mutVar = new mut(this.a, this.b, 12, bArr);
                Object obj7 = this.c;
                qbs qbsVar = (qbs) sni.g((ConversationIdType) obj7, mutVar);
                if (qbsVar != null) {
                    return qbsVar;
                }
                alvw i7 = qcb.a.i();
                i7.X(alwp.a, "BugleGroupManagement");
                ((alvg) ((alvg) i7).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getGroupConversationMetadata", 223, "IncomingRcsGroupNotificationConversationGetter.java")).q("Failed to retrieve conversation to create GroupConversationMetadata.");
                throw new qcc(String.format("Cannot find conversation bind data to create GroupConversationMetadata. Bugle conversation ID: %s", obj7));
            case 19:
                ConversationIdType conversationIdType = (ConversationIdType) albo.bQ(this.b);
                qei qeiVar2 = (qei) albo.bQ(this.c);
                if (conversationIdType.b()) {
                    alvw i8 = qcb.a.i();
                    i8.X(alwp.a, "BugleGroupManagement");
                    ((alvg) ((alvg) i8).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getExistingConversation", 258, "IncomingRcsGroupNotificationConversationGetter.java")).q("Failed to retrieve conversation for an incoming GroupEvent notification.");
                    return null;
                }
                return (qbs) sni.h(conversationIdType, new mut(this.a, qeiVar2, 13, bArr));
            default:
                return ((qpn) this.a).b((String) this.b, this.c);
        }
    }

    public /* synthetic */ hbd(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hbd(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ hbd(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hbd(qby qbyVar, Object obj, qbs qbsVar, int i) {
        this.d = i;
        this.b = qbyVar;
        this.c = obj;
        this.a = qbsVar;
    }
}
