package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.ui.conversation.suggestions.common.ConversationSuggestionContainerView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aahj {
    public final View a;
    public final SuggestionData b;
    public ImageView c;
    protected final akms d;
    private TextView e;

    public aahj(Context context, SuggestionData suggestionData, View view) {
        this.a = view;
        this.b = suggestionData;
        this.d = aktp.x(context).c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String g(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return a.co(str2, str, ": ");
    }

    public static final int h(aafw aafwVar) {
        return aafwVar.a();
    }

    public Optional a(int i) {
        return Optional.empty();
    }

    public String b() {
        return c();
    }

    public String c() {
        return this.b.a();
    }

    public final TextView d(int i) {
        TextView textView = this.e;
        if (textView != null) {
            return textView;
        }
        TextView textView2 = (TextView) this.a.findViewById(i);
        this.e = textView2;
        return textView2;
    }

    public final ConversationSuggestionContainerView e() {
        d.s(this.a instanceof ConversationSuggestionContainerView);
        return (ConversationSuggestionContainerView) this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Optional f(Context context, int i, int i2, boolean z) {
        Drawable mutate = context.getDrawable(i).mutate();
        if (z) {
            mutate.setTint(i2);
        }
        return Optional.of(this.d.g(mutate));
    }
}
