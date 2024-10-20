package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class atnq extends atmx {
    private static final long serialVersionUID = -4319510507246305931L;
    protected List a;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(h((byte[]) it.next(), true));
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = new ArrayList(2);
        while (atktVar.d() > 0) {
            this.a.add(atktVar.j());
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            atkvVar.c((byte[]) it.next());
        }
    }
}
