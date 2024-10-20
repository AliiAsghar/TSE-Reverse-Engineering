package defpackage;

import java.net.URL;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqq extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        String j = aoroVar.j();
        if (!j.equals("null")) {
            return new URL(j);
        }
        return null;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String externalForm;
        URL url = (URL) obj;
        if (url == null) {
            externalForm = null;
        } else {
            externalForm = url.toExternalForm();
        }
        aorpVar.m(externalForm);
    }
}
