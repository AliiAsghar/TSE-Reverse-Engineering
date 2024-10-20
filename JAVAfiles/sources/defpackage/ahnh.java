package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahnh {
    public float a;
    public int b;
    public armf c;
    public byte d;
    public int e;
    private algw f;

    public ahnh() {
        throw null;
    }

    public final ahni a() {
        int i;
        boolean z = true;
        if (this.d == 3 && (i = this.e) != 0) {
            ahni ahniVar = new ahni(i, this.a, this.b, this.c, this.f);
            float f = ahniVar.a;
            if (f <= brg.a || f > 100.0f) {
                z = false;
            }
            d.t(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return ahniVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.d & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.e = i;
    }

    public ahnh(byte[] bArr) {
        this.f = alfd.a;
    }
}
