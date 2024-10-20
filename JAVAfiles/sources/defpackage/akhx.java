package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerItemView;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akhx extends oo {
    public final View s;

    public akhx(View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        super(view);
        this.s = view;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        if (onLongClickListener != null) {
            view.setOnLongClickListener(onLongClickListener);
        }
    }

    public akhx(View view, char[] cArr) {
        super(view);
        this.s = (ConversationSettingsOptionItemView) view;
    }

    public akhx(SimPickerItemView simPickerItemView) {
        super(simPickerItemView);
        this.s = simPickerItemView;
    }

    public akhx(aaau aaauVar, View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.emoji_header);
        this.s = textView;
        textView.setHeight(aaauVar.r / 2);
        textView.setPadding(aaauVar.q, 0, 0, 0);
    }

    public akhx(ConversationRichCardView conversationRichCardView) {
        super(conversationRichCardView);
        this.s = conversationRichCardView;
    }

    public akhx(ViewGroup viewGroup, LayoutInflater layoutInflater, int i, int i2, agvv agvvVar) {
        super(layoutInflater.inflate(R.layout.emoji_view_holder, viewGroup, false));
        this.a.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        EmojiView emojiView = (EmojiView) this.a.findViewById(R.id.emoji_view);
        this.s = emojiView;
        emojiView.d = null;
        emojiView.e = null;
        emojiView.setClickable(true);
        emojiView.setOnTouchListener(agvvVar);
        emojiView.setOnHoverListener(agvvVar);
        emojiView.setOnClickListener(agvvVar);
        if (agvvVar != null) {
            eek.w(emojiView, efu.k(emojiView.getContext()));
        }
        emojiView.setOnLongClickListener(agvvVar);
    }

    public akhx(View view, byte[] bArr, byte[] bArr2) {
        super(view);
        this.s = view;
    }

    public akhx(View view, byte[] bArr) {
        super(view);
        this.s = view;
    }

    public akhx(View view) {
        super(view);
        this.s = view;
    }
}
