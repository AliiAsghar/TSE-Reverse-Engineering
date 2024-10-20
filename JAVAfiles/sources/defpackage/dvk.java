package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvk extends dve implements dvs {
    protected final dvo al;
    public final ArrayList am;
    public final int an;

    public dvk(dvo dvoVar, int i) {
        super(dvoVar);
        this.am = new ArrayList();
        this.al = dvoVar;
        this.an = i;
    }

    @Override // defpackage.dve, defpackage.dvl
    public final dwc b() {
        return x();
    }

    public dwh x() {
        return null;
    }

    public final void y() {
        super.e();
    }

    public final void z(Object... objArr) {
        Collections.addAll(this.am, objArr);
    }

    @Override // defpackage.dve, defpackage.dvl
    public void e() {
    }
}
