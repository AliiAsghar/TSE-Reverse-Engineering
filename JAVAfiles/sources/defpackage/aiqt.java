package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqt extends oo {
    final ImageView s;
    final TextView t;
    final TextView u;
    public final ImageButton v;
    final ImageButton w;
    public boolean x;
    public final /* synthetic */ aiqu y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiqt(aiqu aiquVar, View view) {
        super(view);
        this.y = aiquVar;
        this.s = (ImageView) view.findViewById(R.id.pack_icon);
        TextView textView = (TextView) view.findViewById(R.id.pack_name);
        this.t = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.pack_author);
        this.u = textView2;
        this.v = (ImageButton) view.findViewById(R.id.favorite_pack_icon);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.ordering_icon);
        this.w = imageButton;
        if (aiquVar.i.B()) {
            Context context = view.getContext();
            textView.setTextColor(context.getColor(R.color.white));
            textView2.setTextColor(context.getColor(R.color.sticker_pack_author_color_dark_mode));
            imageButton.setColorFilter(context.getColor(R.color.white));
        }
    }

    public final void D() {
        int i;
        int i2;
        Context context = this.a.getContext();
        if (this.x) {
            if (true != this.y.i.B()) {
                i2 = R.color.favorite_enabled_color;
            } else {
                i2 = R.color.favorite_enabled_color_dark_mode;
            }
            int color = context.getColor(i2);
            this.v.setImageResource(R.drawable.quantum_ic_favorite_white_24);
            this.v.setColorFilter(color);
            this.v.setContentDescription(context.getString(R.string.cd_sticker_favorite_on_icon));
            return;
        }
        if (true != this.y.i.B()) {
            i = R.color.favorite_disabled_color;
        } else {
            i = R.color.favorite_disabled_color_dark_mode;
        }
        int color2 = context.getColor(i);
        this.v.setImageResource(R.drawable.quantum_ic_favorite_border_white_24);
        this.v.setColorFilter(color2);
        this.v.setContentDescription(context.getString(R.string.cd_sticker_favorite_off_icon));
    }
}
