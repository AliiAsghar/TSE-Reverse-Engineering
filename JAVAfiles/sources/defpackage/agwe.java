package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agwe extends oo {
    public final View s;
    public final Object t;
    public final Object u;

    public agwe(fyj fyjVar, View view) {
        super(view);
        int i = eul.a;
        this.s = (TextView) view.findViewById(R.id.exo_main_text);
        this.t = (TextView) view.findViewById(R.id.exo_sub_text);
        this.u = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new iix(this, fyjVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(boolean z) {
        int i;
        if (this.s != null) {
            ((ImageView) this.u).setSelected(z);
            View view = this.s;
            if (true != z) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            this.s.setSelected(z);
            return;
        }
        this.a.setSelected(z);
    }

    public agwe(View view, byte[] bArr) {
        super(view);
        this.u = view;
        this.t = (TextView) view.findViewById(R.id.group_name);
        this.s = (ImageView) view.findViewById(R.id.edit_group_name);
    }

    public agwe(zmr zmrVar, View view, aats aatsVar) {
        super(view);
        this.u = zmrVar;
        view.setClipToOutline(true);
        this.t = aatsVar;
        this.s = (TextView) view.findViewById(R.id.gif_browser_category_text);
    }

    public agwe(View view) {
        super(view);
        this.u = (ImageView) eek.b(view, R.id.emoji_picker_header_icon);
        this.t = (TextView) view.findViewById(R.id.emoji_picker_header_text);
        View findViewById = view.findViewById(R.id.emoji_picker_header_underline);
        this.s = (findViewById == null || findViewById.getVisibility() != 0) ? null : findViewById;
    }
}
