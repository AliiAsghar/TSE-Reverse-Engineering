package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myi implements Function {
    final /* synthetic */ MessagesTable.BindData a;

    public myi(MessagesTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        ConversationSuggestion conversationSuggestion = (ConversationSuggestion) obj;
        String serializeToJson = ConversationSuggestionResponseSerializer.serializeToJson(conversationSuggestion);
        if (conversationSuggestion.getSuggestionType() == 0) {
            str = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        } else {
            str = serializeToJson;
        }
        if (serializeToJson != null && str != null) {
            return new RbmSuggestionData(conversationSuggestion, this.a.A(), new myh(serializeToJson, str));
        }
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
