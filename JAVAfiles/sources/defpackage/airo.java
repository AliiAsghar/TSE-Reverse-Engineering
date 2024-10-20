package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airo extends oo {
    public static final /* synthetic */ int u = 0;
    public final /* synthetic */ no s;
    public final View t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airo(afio afioVar, View view) {
        super(view);
        this.s = afioVar;
        View findViewById = view.findViewById(R.id.gallery_folders_tile_button);
        findViewById.getClass();
        this.t = (MaterialButton) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airo(airb airbVar, View view) {
        super(view);
        this.s = airbVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.sticker_thumbnail);
        this.t = imageView;
        if (airbVar.c.B()) {
            imageView.setBackground(view.getResources().getDrawable(R.drawable.sticker_icon_background_dark_mode));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airo(airp airpVar, View view) {
        super(view);
        this.s = airpVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.sticker_thumbnail);
        this.t = imageView;
        if (airpVar.d.y()) {
            imageView.setBackground(view.getResources().getDrawable(R.drawable.sticker_icon_background_dark_mode));
        }
    }
}
