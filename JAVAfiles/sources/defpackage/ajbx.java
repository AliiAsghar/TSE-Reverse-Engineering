package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbx extends oo {
    public static final /* synthetic */ int u = 0;
    public final Object s;
    public final Object t;

    public ajbx(View view, char[] cArr) {
        super(view);
        int i = eul.a;
        this.t = (TextView) view.findViewById(R.id.exo_text);
        this.s = view.findViewById(R.id.exo_check);
    }

    public ajbx(zjm zjmVar, oo ooVar) {
        super(ooVar.a);
        this.t = zjmVar;
        this.s = ooVar;
    }

    public ajbx(View view, byte[] bArr, byte[] bArr2) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.search_result_name);
        this.s = (TextView) view.findViewById(R.id.search_result_address);
    }

    public ajbx(View view, byte[] bArr) {
        super(view);
        this.s = view;
        View findViewById = view.findViewById(R.id.emoji);
        findViewById.getClass();
        this.t = (SingleEmojiView) findViewById;
    }

    public ajbx(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.country_code_selection_item_name);
        this.t = (TextView) view.findViewById(R.id.country_code_selection_item_code);
    }
}
