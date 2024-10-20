package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atkh implements atkg {
    final int a;
    final atmk b;
    final int c;
    final int d;

    public atkh(atmk atmkVar, int i, atne atneVar, int i2, long j) {
        long j2;
        this.b = atmkVar;
        this.a = i;
        if (atneVar != null) {
            j2 = atneVar.b;
        } else {
            j2 = 0;
        }
        this.c = i2;
        this.d = atki.a(j2, j);
    }

    @Override // defpackage.atkg
    public final int a(int i) {
        return this.c - i;
    }

    @Override // defpackage.atkg
    public final boolean b() {
        if (((int) (System.currentTimeMillis() / 1000)) >= this.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.atkg
    public final int c() {
        return this.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a == 0) {
            StringBuffer stringBuffer2 = new StringBuffer("NXDOMAIN ");
            stringBuffer2.append(this.b);
            stringBuffer.append(stringBuffer2.toString());
        } else {
            StringBuffer stringBuffer3 = new StringBuffer("NXRRSET ");
            stringBuffer3.append(this.b);
            stringBuffer3.append(" ");
            stringBuffer3.append(atnu.a(this.a));
            stringBuffer.append(stringBuffer3.toString());
        }
        stringBuffer.append(" cl = ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }
}
