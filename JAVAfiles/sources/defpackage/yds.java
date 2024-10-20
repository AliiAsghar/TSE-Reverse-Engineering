package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yds extends alvz {
    private final Function e;

    public yds(Class cls, Function function) {
        super(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, cls, false);
        this.e = function;
    }

    @Override // defpackage.alvz
    public final void a(Object obj, alvy alvyVar) {
        Object apply;
        Function function = this.e;
        String str = this.a;
        apply = function.apply(obj);
        alvyVar.a(str, apply);
    }
}
