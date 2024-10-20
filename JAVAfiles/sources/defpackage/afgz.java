package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgz extends afgs {
    public static final /* synthetic */ int u = 0;
    private final afke v;
    private final afgo w;
    private final View x;
    private final View y;

    public afgz(afke afkeVar, View view, afgo afgoVar) {
        super(view);
        this.v = afkeVar;
        this.w = afgoVar;
        this.x = view.findViewById(R.id.system_camera_photo_button);
        this.y = view.findViewById(R.id.system_camera_video_button);
    }

    @Override // defpackage.afgs
    public final Object D() {
        afgp afgpVar = this.w.a;
        this.x.setOnClickListener(this.v.a("SystemCameraPickerViewHolder.photoButton#onClick", new acah(afgpVar, 4)));
        this.y.setOnClickListener(this.v.a("SystemCameraPickerViewHolder.videoButton#onClick", new acah(afgpVar, 5)));
        return arnb.a;
    }

    @Override // defpackage.afgs
    public final Object E() {
        return arnb.a;
    }
}
