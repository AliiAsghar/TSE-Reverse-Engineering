package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.suggestions.shortcuts.SuggestionShortcutView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zvp implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zvp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        switch (this.b) {
            case 0:
                snh snhVar = (snh) obj;
                snhVar.j((ConversationIdType) this.a);
                return snhVar;
            case 1:
                sco scoVar = (sco) obj;
                scoVar.b((ConversationIdType) this.a);
                return scoVar;
            case 2:
                snh snhVar2 = (snh) obj;
                snhVar2.j((ConversationIdType) this.a);
                return snhVar2;
            case 3:
                return d.X(this.a, obj);
            case 4:
                return ((aaak) this.a).a((String) obj);
            case 5:
                ((ConversationMessageView) this.a).k.getClass();
                return ((luc) obj).a();
            case 6:
                alog alogVar = (alog) obj;
                ConversationMessageView conversationMessageView = (ConversationMessageView) this.a;
                if (conversationMessageView.ac != null) {
                    conversationMessageView.ac = null;
                    conversationMessageView.u = alogVar;
                    if (!alogVar.isEmpty()) {
                        ((SuggestionShortcutView) conversationMessageView.j.b()).E().a(alogVar, conversationMessageView.s, conversationMessageView.e.u());
                        conversationMessageView.requestLayout();
                    }
                }
                return null;
            case 7:
                alwo alwoVar = aadu.a;
                return this.a.a(obj);
            case 8:
                return new RbmSuggestionData((ConversationSuggestion) obj, (MessageIdType) this.a);
            case 9:
                ConversationSuggestion conversationSuggestion = (ConversationSuggestion) this.a;
                conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
                conversationSuggestion.getPropertyValue("description");
                return ((ihi) obj).a();
            case 10:
                syc sycVar = (syc) obj;
                sycVar.f(((smr) this.a).x());
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 56000) {
                    agnc.t("draft_id", intValue);
                }
                sycVar.U(new agmg("messages.draft_id", 5));
                return sycVar;
            case 11:
                tbu tbuVar = (tbu) obj;
                tbuVar.i(((MessagesTable.BindData) this.a).A());
                return tbuVar;
            case 12:
                smo smoVar = (smo) obj;
                smoVar.b(((smr) this.a).x());
                return smoVar;
            case 13:
                slc slcVar = (slc) obj;
                slcVar.b(((smr) this.a).x());
                return slcVar;
            case 14:
                skr skrVar = (skr) obj;
                xze xzeVar = aalt.c;
                skrVar.b((ConversationIdType) this.a);
                return skrVar;
            case 15:
                tam tamVar = (tam) obj;
                xze xzeVar2 = aalt.c;
                tamVar.U(new agmf("participants_audit_log.participant_id", 3, tam.X(this.a), false));
                return tamVar;
            case 16:
                tht thtVar = (tht) obj;
                xze xzeVar3 = aalt.c;
                thtVar.b((String) this.a);
                return thtVar;
            case 17:
                tic ticVar = (tic) obj;
                xze xzeVar4 = aalt.c;
                ticVar.b((String) this.a);
                return ticVar;
            case 18:
                return ((vcc) ((aalt) this.a).z.b()).a(new vfm((String) obj));
            case 19:
                skr skrVar2 = (skr) obj;
                xze xzeVar5 = aalt.c;
                skrVar2.b((ConversationIdType) this.a);
                return skrVar2;
            default:
                tdm tdmVar = (tdm) obj;
                xze xzeVar6 = aalt.c;
                tdmVar.U(new agmf("profiles_table.participant_id", 3, tdm.X(this.a), true));
                return tdmVar;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
