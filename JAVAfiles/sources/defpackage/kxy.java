package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.list.ConversationListItemView;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxy {
    public static final xze a = xze.g("Bugle", "ConversationListItemViewPeer");
    public final Map b;
    private final armf c;

    public kxy(ConversationListItemView conversationListItemView, Map map, armf armfVar) {
        this.b = map;
        this.c = armfVar;
        int paddingLeft = conversationListItemView.getPaddingLeft();
        int paddingTop = conversationListItemView.getPaddingTop();
        int paddingRight = conversationListItemView.getPaddingRight();
        int paddingBottom = conversationListItemView.getPaddingBottom();
        if (((ohb) armfVar.b()).a()) {
            conversationListItemView.setForeground(null);
            conversationListItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_go);
        } else {
            conversationListItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg);
        }
        conversationListItemView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        Iterator<E> it = ((alor) map).values().iterator();
        while (it.hasNext()) {
            ((kzy) it.next()).c(conversationListItemView);
        }
    }

    public final void a(kzx kzxVar, boolean z) {
        Iterator<E> it = ((alor) this.b).values().iterator();
        while (it.hasNext()) {
            ((kzy) it.next()).b(kzxVar, z);
        }
    }
}
