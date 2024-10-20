package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uah implements ujs {
    private final /* synthetic */ int a;

    public uah(int i) {
        this.a = i;
    }

    @Override // defpackage.ujs
    public final String a(rry rryVar) {
        if (this.a != 0) {
            rryVar.getClass();
            return "";
        }
        rryVar.getClass();
        return "";
    }

    @Override // defpackage.ujs
    public final void b(View view, TextView textView, rry rryVar, int i) {
        SpannableStringBuilder b;
        SpannableStringBuilder b2;
        if (this.a != 0) {
            textView.getClass();
            rryVar.getClass();
            int f = rryVar.f();
            if (f == 203) {
                b = uak.b(rryVar, textView, false, true);
                textView.setText(b);
                return;
            } else {
                if (f != 226) {
                    if (f == 229) {
                        b2 = uak.b(rryVar, textView, true, true);
                        textView.setText(b2);
                        return;
                    }
                    return;
                }
                textView.setText(uak.b(rryVar, textView, true, false));
                return;
            }
        }
        textView.getClass();
        rryVar.getClass();
        int f2 = rryVar.f();
        if (f2 != 215) {
            if (f2 != 216 && f2 != 219 && f2 != 237) {
                if (f2 != 238) {
                    switch (f2) {
                        case 233:
                            textView.setText(uak.a(textView, true));
                            return;
                        case 234:
                            textView.setText(uak.a(textView, false));
                            return;
                        case 235:
                            break;
                        default:
                            return;
                    }
                }
            }
            textView.setText(uak.c(textView, rryVar, true));
            return;
        }
        textView.setText(uak.c(textView, rryVar, false));
    }

    @Override // defpackage.ujs
    public final boolean c(rry rryVar) {
        if (this.a != 0) {
            rryVar.getClass();
            int f = rryVar.f();
            if (f != 203 && f != 226 && f != 229) {
                return false;
            }
            return true;
        }
        rryVar.getClass();
        int f2 = rryVar.f();
        if (f2 != 233 && f2 != 234) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ujs
    public final boolean d(boolean z) {
        return false;
    }

    public uah(ofy ofyVar, int i) {
        this.a = i;
        ofyVar.getClass();
    }
}
