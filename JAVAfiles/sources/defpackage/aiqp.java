package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqp extends oo {
    public final ryg A;
    aova s;
    final ImageView t;
    final ImageButton u;
    final TextView v;
    final TextView w;
    final GestureDetector.SimpleOnGestureListener x;
    boolean y;
    public final /* synthetic */ aiqq z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiqp(aiqq aiqqVar, View view) {
        super(view);
        this.z = aiqqVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.pack_icon);
        this.t = imageView;
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.favorite_pack_icon);
        this.u = imageButton;
        TextView textView = (TextView) view.findViewById(R.id.pack_name);
        this.v = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.pack_author);
        this.w = textView2;
        aiqo aiqoVar = new aiqo(this);
        this.x = aiqoVar;
        this.A = new ryg(view.getContext(), aiqoVar);
        if (aiqqVar.h.B()) {
            Context context = view.getContext();
            imageView.setBackground(context.getResources().getDrawable(R.drawable.sticker_icon_background_dark_mode));
            textView.setTextColor(context.getColor(R.color.white));
            textView2.setTextColor(context.getColor(R.color.sticker_pack_author_color_dark_mode));
            imageButton.setColorFilter(context.getColor(R.color.favorite_enabled_color_dark_mode));
        }
    }
}
