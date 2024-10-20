package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzz implements ujs {
    private final trz a;
    private final ksi b;

    public tzz(trz trzVar, ksi ksiVar, ofy ofyVar) {
        trzVar.getClass();
        ksiVar.getClass();
        ofyVar.getClass();
        this.a = trzVar;
        this.b = ksiVar;
    }

    @Override // defpackage.ujs
    public final String a(rry rryVar) {
        rryVar.getClass();
        return "";
    }

    @Override // defpackage.ujs
    public final void b(View view, TextView textView, rry rryVar, int i) {
        textView.getClass();
        rryVar.getClass();
        int f = rryVar.f();
        if (f != 207) {
            if (f == 213) {
                textView.setText(uak.c(textView, rryVar, true));
                if (this.a.l()) {
                    textView.setTag(R.id.growthkit_view_tag, "etouffee_initialization_tombstone");
                    this.b.a();
                    return;
                }
                return;
            }
            return;
        }
        textView.setText(uak.c(textView, rryVar, false));
    }

    @Override // defpackage.ujs
    public final boolean c(rry rryVar) {
        rryVar.getClass();
        return false;
    }

    @Override // defpackage.ujs
    public final boolean d(boolean z) {
        return false;
    }
}
