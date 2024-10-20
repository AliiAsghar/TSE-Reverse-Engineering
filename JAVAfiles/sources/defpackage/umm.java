package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionsJsonParser;
import com.google.android.ims.rcsservice.chatsession.message.RichCardParser;
import j$.util.Collection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class umm extends unp {
    public static final uuf a = uuh.i(uuh.b, "enable_rbm_welcome_message_rich_cards", false);
    public static final xze b = xze.g("Bugle", "RbmChatbotDirectoryWelcomeMessageHandler");
    public final tqx c;
    public final rfr d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final xnv k;
    private final armf l;
    private final agnq m;

    public umm(tqx tqxVar, rfr rfrVar, armf armfVar, armf armfVar2, armf armfVar3, agnq agnqVar, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, xnv xnvVar) {
        this.c = tqxVar;
        this.d = rfrVar;
        this.l = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.m = agnqVar;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = xnvVar;
    }

    private static akul j() {
        return aktp.ag(upm.b());
    }

    private static akul k() {
        return aktp.ag(upm.d());
    }

    private final void l(final String str, final String str2, final ConversationIdType conversationIdType, final String str3, final boolean z, final List list) {
        this.m.e("RbmChatbotDirectoryWelcomeMessageHandler#createMessage", new Runnable() { // from class: uml
            @Override // java.lang.Runnable
            public final void run() {
                String str4;
                umm ummVar = umm.this;
                qwm g = ((vqu) ummVar.i.b()).g();
                rve a2 = ((qdx) ummVar.j.b()).a();
                long epochMilli = ummVar.k.f().toEpochMilli();
                SelfIdentityId g2 = g.g();
                String str5 = str3;
                boolean z2 = z;
                if (true != z2) {
                    str4 = str5;
                } else {
                    str4 = null;
                }
                tqx tqxVar = ummVar.c;
                ConversationIdType conversationIdType2 = conversationIdType;
                String str6 = str2;
                MessageCoreData r = tqxVar.r(a2, str6, g2, conversationIdType2, null, 100, 3, str4, true, true, epochMilli, epochMilli);
                xyo c = umm.b.c();
                c.H("Creating RCS message for Welcome Message");
                c.z("botId", str);
                c.e(str6);
                c.b(conversationIdType2);
                c.g(a2);
                c.q();
                if (z2) {
                    umm.b.o("Adding rich card parts for Welcome Message...");
                    ummVar.d.a(str5, r, true);
                }
                MessageIdType a3 = ((rvw) ummVar.e.b()).a(r);
                if (!a3.b()) {
                    List list2 = list;
                    xyo c2 = umm.b.c();
                    c2.H("Created rich card parts for Welcome Message");
                    c2.z("messageRowId", a3);
                    c2.q();
                    if (!list2.isEmpty()) {
                        xyo c3 = umm.b.c();
                        c3.H("Adding suggestions");
                        c3.x("count", list2.size());
                        c3.q();
                        Collection.EL.stream(list2).forEach(new rge(((qdx) ummVar.j.b()).a(), a2, 8));
                        ((wfh) ummVar.f.b()).E(list2, a3, true, epochMilli);
                    }
                    ((uhj) ummVar.h.b()).i(conversationIdType2);
                    ((ahiy) ummVar.g.b()).r(aktp.ag(conversationIdType2), "latest_message");
                    return;
                }
                umm.b.q("Unable to persist Welcome Message");
            }
        });
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RbmChatbotDirectoryWelcomeMessageHandler");
    }

    @Override // defpackage.unp
    protected final /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul akulVar;
        List list;
        umn umnVar = (umn) apbtVar;
        Uri parse = Uri.parse(umnVar.b);
        String ag = albo.ag(parse.getQueryParameter("welcome_message_content"));
        String ag2 = albo.ag(parse.getQueryParameter("welcome_message_type"));
        String queryParameter = parse.getQueryParameter("suggestions");
        ConversationIdType b2 = ruy.b(umnVar.c);
        String str = umnVar.d;
        akrh e = aktp.e("RbmChatbotDirectoryWelcomeMessageHandler#processPendingWorkItemAsync");
        try {
            if (!TextUtils.isEmpty(ag) && !TextUtils.isEmpty(ag2)) {
                if (!RbmSpecificMessage.CONTENT_TYPE.equals(ag2) && !"text/plain".equals(ag2)) {
                    xyo e2 = b.e();
                    e2.H("Unrecognized content type");
                    e2.z("welcomeMessageContentType", ag2);
                    e2.q();
                } else if (rwd.a(b2) > 0) {
                    xyo c = b.c();
                    c.H("There are messages in conversation, not inserting Welcome Message");
                    c.z("conversationId", b2);
                    c.q();
                } else {
                    ParticipantsTable.BindData b3 = ((rxq) this.l.b()).b(str);
                    if (b3 == null) {
                        xyo e3 = b.e();
                        e3.H("Participant wasn't found in database, skipping Welcome Message");
                        e3.z("botId", str);
                        e3.z("conversationId", b2);
                        e3.q();
                        akulVar = k();
                    } else {
                        int i = alog.d;
                        alog alogVar = alsx.a;
                        if (queryParameter != null && !queryParameter.isEmpty()) {
                            ArrayList<ConversationSuggestion> parse2 = new ConversationSuggestionsJsonParser().parse(new String(Base64.decode(queryParameter, 0), StandardCharsets.UTF_8));
                            xyo c2 = b.c();
                            c2.H("Adding suggestions");
                            c2.x("number", parse2.size());
                            c2.q();
                            list = parse2;
                        } else {
                            list = alogVar;
                        }
                        if ("text/plain".equals(ag2)) {
                            l(str, b3.M(), b2, ag, false, list);
                            akulVar = j();
                        } else if (!((Boolean) a.e()).booleanValue()) {
                            b.o("Rich cards are not enabled for Welcome Message");
                            akulVar = k();
                        } else {
                            String str2 = new String(Base64.decode(ag, 0), StandardCharsets.UTF_8);
                            if (new RichCardParser(str2).parse() == null) {
                                xyo e4 = b.e();
                                e4.H("Unable to parse JSON for Welcome Message:");
                                e4.L("richCard", str2);
                                e4.L("content", ag);
                                e4.q();
                                akulVar = k();
                            } else {
                                l(str, b3.M(), b2, str2, true, list);
                                akulVar = j();
                            }
                        }
                    }
                    e.close();
                    return akulVar;
                }
                akulVar = k();
                e.close();
                return akulVar;
            }
            b.o("There is no Welcome Message data in intent URI.");
            akulVar = k();
            e.close();
            return akulVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.unx
    public final apca e() {
        return umn.a.getParserForType();
    }
}
