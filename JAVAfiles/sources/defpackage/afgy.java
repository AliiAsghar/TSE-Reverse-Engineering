package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgy implements afgq {
    private final /* synthetic */ int a;
    private final Object b;

    public afgy(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [armf, java.lang.Object] */
    @Override // defpackage.afgq
    public final afgs a(ViewGroup viewGroup, afgo afgoVar, arqr arqrVar) {
        if (this.a != 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.camera_button, viewGroup, false);
            afke afkeVar = (afke) ((adze) this.b).a.b();
            afkeVar.getClass();
            inflate.getClass();
            return new afgw(afkeVar, inflate, afgoVar);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.system_camera_picker_layout, viewGroup, false);
        afke afkeVar2 = (afke) ((adwo) this.b).a.b();
        afkeVar2.getClass();
        inflate2.getClass();
        return new afgz(afkeVar2, inflate2, afgoVar);
    }
}
