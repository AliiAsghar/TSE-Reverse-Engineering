package defpackage;

import com.google.android.apps.messaging.ui.conversation.suggestions.common.ConversationSuggestionStickerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaws implements hxb {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aaws(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hxb
    public final boolean eV(hpp hppVar, Object obj) {
        if (this.b != 0) {
            xyo e = ConversationSuggestionStickerView.a.e();
            e.H("Problem loading sticker suggestion.");
            if (hppVar == null) {
                e.q();
            } else {
                e.r(hppVar);
            }
            ((ConversationSuggestionStickerView) this.a).setVisibility(8);
            return true;
        }
        ((mbl) ((aawt) this.a).h.b()).c("Bugle.Share.FullScreenImage.FailedToLoad");
        return false;
    }

    @Override // defpackage.hxb
    public final /* synthetic */ boolean eW(Object obj, Object obj2) {
        if (this.b != 0) {
            ConversationSuggestionStickerView.a.p("Sticker suggestion loaded successfully.");
            return false;
        }
        return false;
    }
}
