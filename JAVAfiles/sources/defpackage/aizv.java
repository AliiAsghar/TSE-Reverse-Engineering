package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aizv extends cg {
    public apro a;
    protected apqp b;
    protected Integer c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(apro aproVar, Integer num, int i) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("Question", aproVar.toByteArray());
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putInt("QuestionIndex", i);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ajbm d() {
        ajbm ajbmVar;
        Activity d;
        Object x = x();
        eoz eozVar = this.E;
        if (eozVar instanceof ajbm) {
            return (ajbm) eozVar;
        }
        if (!(x instanceof ajbm) || (d = (ajbmVar = (ajbm) x).d()) == null || d.isFinishing() || d.isDestroyed()) {
            return null;
        }
        return ajbmVar;
    }

    public abstract apqz e();

    @Override // defpackage.cg
    public void g(Bundle bundle) {
        Integer num;
        super.g(bundle);
        Bundle bundle2 = this.m;
        byte[] byteArray = bundle2.getByteArray("Question");
        if (byteArray != null) {
            this.a = (apro) aetn.aZ(apro.a, byteArray);
        }
        if (bundle2.containsKey("DisplayLogoResId")) {
            num = Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0));
        } else {
            num = null;
        }
        this.c = num;
        bundle2.getInt("QuestionIndex");
        byte[] byteArray2 = bundle2.getByteArray("Completion");
        if (byteArray2 != null) {
            this.b = (apqp) aetn.aZ(apqp.b, byteArray2);
        }
    }

    public abstract void p();

    public abstract void q(String str);

    public void o() {
    }
}
