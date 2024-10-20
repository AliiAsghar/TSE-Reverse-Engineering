package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyq implements kzy {
    private final /* synthetic */ int a;
    private Object b;

    public kyq(int i) {
        this.a = i;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        int i;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                ((xvy) this.b).g(kzxVar.q);
                return;
            } else {
                ((ImageView) this.b).setVisibility(kzxVar.p);
                return;
            }
        }
        if (true != kzxVar.R) {
            i = 8;
        } else {
            i = 0;
        }
        ((xvy) this.b).g(i);
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                this.b = new xvy(view, R.id.work_profile_icon, R.id.work_profile_icon, R.layout.work_profile_icon);
                return;
            } else {
                this.b = (ImageView) view.findViewById(R.id.conversation_notification_bell);
                return;
            }
        }
        this.b = new xvy(view, R.id.pin_to_top_view_stub, R.id.pin_to_top);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (kzxVar2.q == kzxVar.q) {
                    return false;
                }
                return true;
            }
            if (kzxVar2.p == kzxVar.p) {
                return false;
            }
            return true;
        }
        if (kzxVar.R == kzxVar2.R) {
            return false;
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        int i;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (true != kzdVar.p) {
                    i = 8;
                } else {
                    i = 0;
                }
                kzwVar.k(i);
                return;
            }
            kzwVar.f();
            return;
        }
        kzwVar.g(kzdVar.Q);
    }

    @Override // defpackage.kzy
    public final /* synthetic */ kzx a(kzx kzxVar) {
        return kzxVar;
    }
}
