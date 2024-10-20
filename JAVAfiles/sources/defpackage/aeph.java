package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeph {
    public final arqg a;
    public final arqg b;
    public final arqg c;

    public aeph(arqg arqgVar, arqg arqgVar2, arqg arqgVar3) {
        this.a = arqgVar;
        this.b = arqgVar2;
        this.c = arqgVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeph)) {
            return false;
        }
        aeph aephVar = (aeph) obj;
        if (d.F(this.a, aephVar.a) && d.F(this.b, aephVar.b) && d.F(this.c, aephVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SwipeUpToLockRecordingUiData(onPrepare=" + this.a + ", onDispose=" + this.b + ", onSwipeToLockRecording=" + this.c + ")";
    }
}
