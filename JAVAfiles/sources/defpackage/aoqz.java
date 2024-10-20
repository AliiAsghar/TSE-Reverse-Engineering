package defpackage;

import java.io.Writer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqz extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        int t = aoroVar.t();
        if (t == 9) {
            aoroVar.p();
            return null;
        }
        if (t == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(aoroVar.j()));
        }
        return Boolean.valueOf(aoroVar.s());
    }

    @Override // defpackage.aoon
    public final /* synthetic */ void b(aorp aorpVar, Object obj) {
        String str;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            aorpVar.j();
            return;
        }
        aorpVar.c();
        aorpVar.a();
        Writer writer = aorpVar.a;
        if (true != bool.booleanValue()) {
            str = "false";
        } else {
            str = "true";
        }
        writer.write(str);
    }
}
