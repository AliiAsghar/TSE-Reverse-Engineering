package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbu {
    public final String a;
    public int b;
    public long c;
    public fgv d;
    public boolean e;
    public boolean f;
    final /* synthetic */ fbv g;

    public fbu(fbv fbvVar, String str, int i, fgv fgvVar) {
        long j;
        this.g = fbvVar;
        this.a = str;
        this.b = i;
        if (fgvVar == null) {
            j = -1;
        } else {
            j = fgvVar.d;
        }
        this.c = j;
        if (fgvVar != null && fgvVar.b()) {
            this.d = fgvVar;
        }
    }

    public final boolean a(fbk fbkVar) {
        fgv fgvVar = fbkVar.d;
        if (fgvVar == null) {
            if (this.b != fbkVar.c) {
                return true;
            }
            return false;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (fgvVar.d > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        erz erzVar = fbkVar.b;
        int a = erzVar.a(fgvVar.a);
        int a2 = erzVar.a(this.d.a);
        fgv fgvVar2 = fbkVar.d;
        if (fgvVar2.d < this.d.d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (fgvVar2.b()) {
            fgv fgvVar3 = fbkVar.d;
            int i = fgvVar3.b;
            int i2 = fgvVar3.c;
            fgv fgvVar4 = this.d;
            int i3 = fgvVar4.b;
            if (i > i3) {
                return true;
            }
            if (i == i3 && i2 > fgvVar4.c) {
                return true;
            }
            return false;
        }
        int i4 = fbkVar.d.e;
        if (i4 == -1 || i4 > this.d.b) {
            return true;
        }
        return false;
    }
}
