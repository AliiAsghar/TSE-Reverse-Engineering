package defpackage;

import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauf extends oo {
    public static final /* synthetic */ int w = 0;
    public final Object s;
    public final View t;
    public final Object u;
    public final View v;

    public aauf(View view, hlp hlpVar, aats aatsVar) {
        super(view);
        this.u = hlpVar;
        this.s = aatsVar;
        this.t = (ImageView) view.findViewById(R.id.gif_content_image);
        this.v = (ConstraintLayout) view;
        view.setClipToOutline(true);
    }

    public aauf(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.nearby_place_name);
        this.t = (TextView) view.findViewById(R.id.nearby_place_address);
        this.u = (TextView) view.findViewById(R.id.nearby_place_distance);
        this.v = (ImageView) view.findViewById(R.id.nearby_place_image);
    }
}
