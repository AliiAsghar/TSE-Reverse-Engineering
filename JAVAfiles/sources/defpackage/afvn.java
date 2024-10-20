package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.libraries.compose.ui.views.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class afvn extends oo {
    public static final alvi u = alvi.m("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder");
    public final String A;
    public final String B;
    public afvo C;
    public final Context D;
    public final Activity v;
    public final afvp w;
    public final afke x;
    public final RoundedImageView y;
    public final String z;

    public afvn(Activity activity, afvp afvpVar, afke afkeVar, View view, RoundedImageView roundedImageView, afvo afvoVar) {
        super(view);
        this.v = activity;
        this.w = afvpVar;
        this.x = afkeVar;
        this.y = roundedImageView;
        this.z = "VisualLocalMediaViewHolder";
        this.A = "VisualLocalMediaViewHolder#onClick";
        this.B = "VisualLocalMediaViewHolder#onLongClick";
        this.C = afvoVar;
        this.D = activity.getBaseContext();
    }
}
