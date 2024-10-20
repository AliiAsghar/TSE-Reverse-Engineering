package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayq implements View.OnClickListener {
    public final aayp a;
    public final armf b;
    public final armf c;
    public final akbo d;
    public final aksr e;
    public final wjr f;
    public View g;
    public final akbp h = new akbp<Boolean, Void>() { // from class: aayq.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            xzb.h("Bugle", "TermsAndConditions: failed to update consent: %s due to: %s", (Boolean) obj, th.getMessage());
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            xzb.k("Bugle", "TermsAndConditions: successfully updated consent: %s", bool);
            if (bool.booleanValue()) {
                aayq aayqVar = aayq.this;
                View view = aayqVar.g;
                ((vqu) aayqVar.b.b()).z();
                aayqVar.f.i(amww.TERMS_AND_CONDITIONS_ACCEPTED);
                aktp.L(new aayk(2), view);
                return;
            }
            aayq aayqVar2 = aayq.this;
            View view2 = aayqVar2.g;
            ((vqu) aayqVar2.b.b()).z();
            ((mho) aayqVar2.c.b()).x();
            aktp.L(new aayk(1), view2);
        }
    };
    private final armf i;
    private final whj j;

    public aayq(aayp aaypVar, armf armfVar, armf armfVar2, armf armfVar3, akbo akboVar, aksr aksrVar, whj whjVar, wjr wjrVar) {
        this.a = aaypVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.i = armfVar3;
        this.d = akboVar;
        this.e = aksrVar;
        this.j = whjVar;
        this.f = wjrVar;
    }

    public final akul a(whl whlVar) {
        return this.j.i(((adtl) this.i.b()).f(), uhy.b(whlVar));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.accept_button) {
            aozy createBuilder = whl.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((whl) createBuilder.b).b = a.an(3);
            this.d.j(ahlp.l(a((whl) createBuilder.s())), new ahlp((Object) true), this.h);
            return;
        }
        if (id == R.id.reject_button) {
            ((mho) this.c.b()).aS(47);
            new AlertDialog.Builder(this.a.fe()).setTitle(R.string.terms_and_conditions_double_check_dialog_title).setMessage(R.string.terms_and_conditions_double_check_dialog_text_v2).setCancelable(false).setNegativeButton(R.string.terms_and_conditions_double_check_dialog_negative_button_text, new aala(5)).setPositiveButton(R.string.terms_and_conditions_double_check_dialog_positive_button_text, new aajo(this, 9)).create().show();
        }
    }
}
