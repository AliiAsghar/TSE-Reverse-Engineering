package defpackage;

import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aecf extends adcx {
    public final String a;
    public final String b;
    private final ByteBuffer c;
    private final Map d;
    private final arus e;
    private final String f;
    private final String g;
    private final int h;

    public aecf(ByteBuffer byteBuffer, String str, String str2, int i, arus arusVar, String str3) {
        super(null, null);
        this.c = byteBuffer;
        this.a = str;
        this.b = str2;
        this.h = i;
        this.d = null;
        this.e = arusVar;
        this.f = str3;
        this.g = null;
        if (byteBuffer.isDirect()) {
        } else {
            throw new IllegalArgumentException("byteBuffer must be direct");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aecf)) {
            return false;
        }
        aecf aecfVar = (aecf) obj;
        if (!d.F(this.c, aecfVar.c) || !d.F(this.a, aecfVar.a) || !d.F(this.b, aecfVar.b) || this.h != aecfVar.h) {
            return false;
        }
        Map map = aecfVar.d;
        if (!d.F(null, null) || !d.F(this.e, aecfVar.e) || !d.F(this.f, aecfVar.f)) {
            return false;
        }
        String str = aecfVar.g;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        int i = this.h;
        a.bm(i);
        arus arusVar = this.e;
        int i2 = 0;
        if (arusVar == null) {
            hashCode = 0;
        } else {
            hashCode = arusVar.hashCode();
        }
        int i3 = ((((hashCode2 * 31) + i) * 961) + hashCode) * 31;
        String str = this.f;
        if (str != null) {
            i2 = str.hashCode();
        }
        return (i3 + i2) * 31;
    }
}
