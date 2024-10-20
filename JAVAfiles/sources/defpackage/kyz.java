package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyz implements kzy {
    private final Context a;
    private xvy b;

    public kyz(Context context) {
        this.a = context;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        Integer num;
        int d;
        String valueOf;
        this.b.g(kzxVar.O);
        if (kzxVar.O == 0 && (num = kzxVar.X) != null) {
            if (num.intValue() == 0) {
                d = ahnz.d(this.b.b(), R.attr.colorPrimary);
            } else {
                d = ahnz.d(this.b.b(), R.attr.colorOnPrimary);
            }
            ((TextView) this.b.b()).setTextColor(d);
            TextView textView = (TextView) this.b.b();
            Integer num2 = kzxVar.X;
            num2.getClass();
            int intValue = num2.intValue();
            if (intValue > 999) {
                valueOf = this.a.getString(R.string.overflow_unread_count);
            } else {
                valueOf = String.valueOf(intValue);
            }
            textView.setText(valueOf);
        }
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.b = new xvy(view, R.id.unread_badge_view_with_message_count_stub, R.id.unread_badge_with_message_count);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        boolean z = kzxVar.N;
        boolean z2 = kzxVar2.N;
        if (Objects.equals(kzxVar.X, kzxVar2.X)) {
            if (kzxVar.o == kzxVar2.o) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        int i;
        boolean K = lga.K(kzdVar);
        kzwVar.N = Integer.valueOf(kzdVar.Z);
        if (true != K) {
            i = 0;
        } else {
            i = 8;
        }
        kzwVar.j(i);
    }

    @Override // defpackage.kzy
    public final /* synthetic */ kzx a(kzx kzxVar) {
        return kzxVar;
    }
}
