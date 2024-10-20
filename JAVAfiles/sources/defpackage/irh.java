package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irh extends ire {
    public List c;
    private boolean d;
    private List f;
    private final ahmn g;

    public irh(xnv xnvVar, ahmn ahmnVar, aack aackVar) {
        super(aackVar, xnvVar);
        this.c = new ArrayList();
        this.f = new ArrayList();
        this.g = ahmnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F() {
        List J = this.e.J(this.c, 1);
        if (this.f.equals(J)) {
            xzb.c("Bugle", "ConversationSuggestionsAdapter.refreshConversationSuggestions old and new suggestions are equal");
            return;
        }
        boolean isEmpty = J.isEmpty();
        boolean z = !isEmpty;
        this.f = J;
        if (!isEmpty && this.d) {
            xzb.c("Bugle", "ConversationSuggestionsAdapter.refreshConversationSuggestions already showing and new suggestions are present");
            q(0);
        } else if (!isEmpty && !this.d) {
            xzb.c("Bugle", "ConversationSuggestionsAdapter.refreshConversationSuggestions not already showing and new suggestions are present");
            s(0);
            this.e.s();
        } else if (isEmpty && this.d) {
            xzb.c("Bugle", "ConversationSuggestionsAdapter.refreshConversationSuggestions already showing and no new suggestions present, will hide");
            y(0);
        }
        this.d = z;
    }

    @Override // defpackage.no
    public final int b() {
        if (this.d) {
            return 1;
        }
        return 0;
    }

    @Override // defpackage.no
    public final /* synthetic */ void g(oo ooVar, int i) {
        akhx akhxVar = (akhx) ooVar;
        aksa m = this.g.m("ConversationSuggestionsAdapter onBindViewHolder");
        try {
            xyl.k(akhxVar.s instanceof ConversationSuggestionsView);
            ConversationSuggestionsView conversationSuggestionsView = (ConversationSuggestionsView) akhxVar.s;
            List list = this.f;
            aack aackVar = this.e;
            conversationSuggestionsView.c(list, new aafi(aackVar, ((ixd) ((itb) aackVar).an).cb));
            m.close();
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return -3L;
    }

    @Override // defpackage.ire
    protected final int m(int i) {
        return R.layout.conversation_suggestions_view;
    }
}
