package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.popup.spam.SpamPopupView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrb implements lqv {
    public lqx a;
    public final armf b;
    public final armf c;
    public final armf d;
    private xvy e;
    private final anen f;

    public lrb(armf armfVar, armf armfVar2, armf armfVar3, anen anenVar) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.f = anenVar;
    }

    @Override // defpackage.lqv
    public final int a() {
        return lgb.r(2);
    }

    @Override // defpackage.lqv
    public final akul b() {
        return aktp.ai(new kva(this, 8), this.f);
    }

    @Override // defpackage.lqv
    public final void c(lqx lqxVar, ViewGroup viewGroup) {
        this.a = lqxVar;
    }

    @Override // defpackage.lqv
    public final void d() {
        xvy xvyVar = this.e;
        if (xvyVar != null) {
            xvyVar.e();
        }
        this.a.b();
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [armf, java.lang.Object] */
    @Override // defpackage.lqv
    public final boolean f(Context context, ViewGroup viewGroup, boolean z) {
        xvy xvyVar = new xvy(LayoutInflater.from(context).inflate(R.layout.spam_popup_stub, viewGroup, true), R.id.spam_popup_stub, R.id.spam_popup, R.layout.spam_popup_view);
        this.e = xvyVar;
        ((SpamPopupView) xvyVar.b()).e = this;
        this.e.g(0);
        yyt yytVar = (yyt) this.b.b();
        xyl.g();
        if (((ykw) yytVar.d.b()).e("spam_popup_seen_timestamp", -1L) == -1) {
            ((ykw) yytVar.d.b()).k("spam_popup_seen_timestamp", ((xnv) yytVar.a).f().toEpochMilli());
        }
        if (ymd.a()) {
            ((mho) this.d.b()).az(2);
        }
        return true;
    }

    @Override // defpackage.lqv
    public final int h() {
        return 12;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void g(Activity activity, int i) {
    }
}
