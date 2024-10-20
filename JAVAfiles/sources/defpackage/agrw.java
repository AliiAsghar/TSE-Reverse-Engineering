package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agrw extends cg {
    protected aocl a;
    protected int b;
    protected int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(aocl aoclVar, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("Question", aoclVar.toByteArray());
        bundle.putInt("DispalyLogoResId", i);
        bundle.putInt("QuestionIndex", i2);
        return bundle;
    }

    public abstract aoco d();

    public abstract String e();

    @Override // defpackage.cg
    public void g(Bundle bundle) {
        super.g(bundle);
        Bundle bundle2 = this.m;
        this.a = (aocl) aetn.aZ(aocl.a, bundle2.getByteArray("Question"));
        this.b = bundle2.getInt("DispalyLogoResId", 0);
        this.c = bundle2.getInt("QuestionIndex");
    }

    public abstract void p();

    public abstract void q(String str);

    public void o() {
    }
}
