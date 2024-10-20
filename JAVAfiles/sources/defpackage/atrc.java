package defpackage;

import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atrc implements atox {
    private static final aslz a = aotl.an("application/json; charset=UTF-8");
    private static final Charset b = Charset.forName("UTF-8");
    private final aonx c;
    private final aoon d;

    public atrc(aonx aonxVar, aoon aoonVar) {
        this.c = aonxVar;
        this.d = aoonVar;
    }

    @Override // defpackage.atox
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        asqu asquVar = new asqu();
        aorp d = this.c.d(new OutputStreamWriter(new asqt(asquVar), b));
        this.d.b(d, obj);
        d.close();
        return new asmi(a, asquVar.s());
    }
}
