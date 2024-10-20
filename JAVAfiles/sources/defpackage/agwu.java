package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agwu extends no {
    public static final alvi q = alvi.m("com/google/android/libraries/inputmethod/emoji/picker/ItemListHolderAdapter");
    public final Context r;

    public agwu(Context context) {
        this.r = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int L(ViewGroup viewGroup) {
        return (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
    }

    @Override // defpackage.no
    public final void k(oo ooVar) {
        if (ooVar instanceof agwt) {
            agwr agwrVar = ((agwt) ooVar).t;
            return;
        }
        EmojiView emojiView = (EmojiView) ooVar.a.findViewById(R.id.emoji_view);
        if (emojiView != null) {
            emojiView.c = agxv.a;
            emojiView.a = emojiView.a.a("");
            emojiView.a();
            emojiView.b(null);
        }
    }
}
