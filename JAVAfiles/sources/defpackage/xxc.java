package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxc {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final yni e;
    public final boolean f;
    public final tqc g;
    public final int h;
    public final int i;
    public final int j;

    public xxc(boolean z, String str, boolean z2, boolean z3, yni yniVar, int i, int i2, int i3, boolean z4, tqc tqcVar) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = yniVar;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.f = z4;
        this.g = tqcVar;
        if (str.length() > 0) {
            if (z3 && z4) {
                throw new IllegalArgumentException("We should not have any flows that result in an externally triggered update to be undone, \nas we don't currently have any semantic meaning attached to external updates (ex: we \nreceive updates to the system block list by receiving the whole list, not by receiving an\nintent to block/unblock/undo). As such, it's unclear what it would mean to undo one of\nthese changes, so calling undo in that case would be a bug");
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxc)) {
            return false;
        }
        xxc xxcVar = (xxc) obj;
        if (this.a == xxcVar.a && d.F(this.b, xxcVar.b) && this.c == xxcVar.c && this.d == xxcVar.d && d.F(this.e, xxcVar.e) && this.h == xxcVar.h && this.i == xxcVar.i && this.j == xxcVar.j && this.f == xxcVar.f && this.g == xxcVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int v = (a.v(this.a) * 31) + this.b.hashCode();
        yni yniVar = this.e;
        int i = 0;
        if (yniVar == null) {
            hashCode = 0;
        } else {
            hashCode = yniVar.hashCode();
        }
        int v2 = ((((((v * 31) + a.v(this.c)) * 31) + a.v(this.d)) * 31) + hashCode) * 31;
        int i2 = this.h;
        a.bm(i2);
        int i3 = (v2 + i2) * 31;
        int i4 = this.i;
        a.bm(i4);
        int i5 = (i3 + i4) * 31;
        int i6 = this.j;
        a.bm(i6);
        int v3 = (((i5 + i6) * 31) + a.v(this.f)) * 31;
        tqc tqcVar = this.g;
        if (tqcVar != null) {
            i = tqcVar.hashCode();
        }
        return v3 + i;
    }

    public final String toString() {
        return "BlockRequest(blockStatus=" + this.a + ", normalizedDestination=" + this.b + ", allowConversationArchiving=" + this.c + ", updateTriggeredExternally=" + this.d + ", metadata=" + this.e + ", scope=" + ((Object) aktp.au(this.h)) + ", entryPoint=" + ((Object) aktp.av(this.i)) + ", dialog=" + ((Object) aktp.aw(this.j)) + ", isUndo=" + this.f + ", archiveStatusForUndo=" + this.g + ")";
    }
}
