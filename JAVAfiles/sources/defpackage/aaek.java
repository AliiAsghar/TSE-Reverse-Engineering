package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardCarouselView;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaek extends no {
    public final Set c = new to();
    private final aack d;
    private final ConversationRichCardCarouselView e;

    public aaek(ConversationRichCardCarouselView conversationRichCardCarouselView, aack aackVar) {
        this.e = conversationRichCardCarouselView;
        this.d = aackVar;
    }

    @Override // defpackage.no
    public final int b() {
        return this.e.ac.size();
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (true != ((Boolean) ((utz) aaem.a.get()).e()).booleanValue()) {
            i2 = R.layout.conversation_rich_card_view;
        } else {
            i2 = R.layout.conversation_rich_card_view2;
        }
        ConversationRichCardView conversationRichCardView = (ConversationRichCardView) from.inflate(i2, viewGroup, false);
        conversationRichCardView.m = this.d;
        conversationRichCardView.j = true;
        conversationRichCardView.l.d = true;
        return new akhx(conversationRichCardView);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        akhx akhxVar = (akhx) ooVar;
        this.c.add(akhxVar);
        View view = akhxVar.s;
        ConversationRichCardCarouselView conversationRichCardCarouselView = this.e;
        rry rryVar = conversationRichCardCarouselView.ab;
        GeneralPurposeRichCard generalPurposeRichCard = (GeneralPurposeRichCard) conversationRichCardCarouselView.ac.get(i);
        ConversationRichCardView conversationRichCardView = (ConversationRichCardView) view;
        conversationRichCardView.g = rryVar;
        conversationRichCardView.h = generalPurposeRichCard;
        conversationRichCardView.i = i;
        conversationRichCardView.l();
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void k(oo ooVar) {
        akhx akhxVar = (akhx) ooVar;
        ((ConversationRichCardView) akhxVar.s).b();
        this.c.remove(akhxVar);
    }
}
