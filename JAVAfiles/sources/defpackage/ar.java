package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ar extends an {
    public final ArrayList al = new ArrayList();

    public void D() {
        q();
        ArrayList arrayList = this.al;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                an anVar = (an) this.al.get(i);
                if (anVar instanceof ar) {
                    ((ar) anVar).D();
                }
            }
        }
    }

    public final void F(an anVar) {
        this.al.remove(anVar);
        anVar.r = null;
    }

    @Override // defpackage.an
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override // defpackage.an
    public final void n(int i, int i2) {
        super.n(i, i2);
        int size = this.al.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((an) this.al.get(i3)).n(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.an
    public final void q() {
        super.q();
        ArrayList arrayList = this.al;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                an anVar = (an) this.al.get(i);
                anVar.n(b(), c());
                if (!(anVar instanceof ao)) {
                    anVar.q();
                }
            }
        }
    }

    @Override // defpackage.an
    public final void z(ktk ktkVar) {
        super.z(ktkVar);
        int size = this.al.size();
        for (int i = 0; i < size; i++) {
            ((an) this.al.get(i)).z(ktkVar);
        }
    }
}
