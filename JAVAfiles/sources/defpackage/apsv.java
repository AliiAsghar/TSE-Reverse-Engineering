package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apsv extends aptb {
    public final aozb a;

    public apsv(aozb aozbVar) {
        this.a = aozbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aptb
    public final int a() {
        return c((byte) 64);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aptb aptbVar = (aptb) obj;
        if (a() != aptbVar.a()) {
            return a() - aptbVar.a();
        }
        apsv apsvVar = (apsv) aptbVar;
        aozb aozbVar = this.a;
        int d = aozbVar.d();
        aozb aozbVar2 = apsvVar.a;
        if (d != aozbVar2.d()) {
            return aozbVar.d() - aozbVar2.d();
        }
        return anbr.b.compare(aozbVar.H(), apsvVar.a.H());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((apsv) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    public final String toString() {
        amcn amcnVar = amcn.h;
        amcm amcmVar = (amcm) amcnVar;
        amcn amcnVar2 = amcmVar.d;
        if (amcnVar2 == null) {
            amci amciVar = amcmVar.b;
            if (amciVar.d()) {
                albo.U(!amciVar.e(), "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr = new char[amciVar.b.length];
                int i = 0;
                while (true) {
                    char[] cArr2 = amciVar.b;
                    if (i >= cArr2.length) {
                        break;
                    }
                    cArr[i] = albo.ao(cArr2[i]);
                    i++;
                }
                amci amciVar2 = new amci(amciVar.a.concat(".upperCase()"), cArr);
                if (amciVar.h) {
                    amciVar = amciVar2.c();
                } else {
                    amciVar = amciVar2;
                }
            }
            if (amciVar != amcmVar.b) {
                Character ch = amcmVar.c;
                amcnVar = new amcj(amciVar);
            }
            amcmVar.d = amcnVar;
            amcnVar2 = amcnVar;
        }
        return "h'" + amcnVar2.j(this.a.H()) + "'";
    }
}
