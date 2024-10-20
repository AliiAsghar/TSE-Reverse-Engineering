package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezj {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public aezj() {
        this((char[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aezj)) {
            return false;
        }
        aezj aezjVar = (aezj) obj;
        boolean z = aezjVar.a;
        boolean z2 = aezjVar.b;
        boolean z3 = aezjVar.c;
        return true;
    }

    public final int hashCode() {
        return 1228341;
    }

    public final String toString() {
        return "Flags(enableInBubbleReadReceipts=false, enableSwipeToShowTimestamps=false, enableColorSwap=false)";
    }

    public aezj(byte[] bArr) {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public /* synthetic */ aezj(char[] cArr) {
        this((byte[]) null);
    }
}
