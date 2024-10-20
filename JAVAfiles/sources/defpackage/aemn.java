package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemn {
    public final boolean a;
    public final arqg b;
    public final arqg c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aemn() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aemn.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aemn)) {
            return false;
        }
        aemn aemnVar = (aemn) obj;
        if (this.a == aemnVar.a && d.F(this.b, aemnVar.b) && d.F(this.c, aemnVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int v = (a.v(this.a) * 31) + this.b.hashCode();
        arqg arqgVar = this.c;
        if (arqgVar == null) {
            hashCode = 0;
        } else {
            hashCode = arqgVar.hashCode();
        }
        return (v * 31) + hashCode;
    }

    public final String toString() {
        return "CameraGalleryInputUiData(isEnabled=" + this.a + ", onLongPress=" + this.b + ", onShowCameraGalleryButton=" + this.c + ")";
    }

    public aemn(boolean z, arqg arqgVar, arqg arqgVar2) {
        arqgVar.getClass();
        this.a = z;
        this.b = arqgVar;
        this.c = arqgVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ aemn(defpackage.arqg r2, defpackage.arqg r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L6
            accd r2 = defpackage.accd.p
        L6:
            r0 = r4 & 1
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r4 = 1
            if (r4 == r0) goto L11
            r4 = 0
        L11:
            r1.<init>(r4, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aemn.<init>(arqg, arqg, int):void");
    }
}
