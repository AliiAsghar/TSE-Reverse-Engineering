package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aini extends ainh {
    private final aims a;

    public aini(aims aimsVar) {
        super(1);
        this.a = aimsVar;
    }

    @Override // defpackage.ainh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        this.a.a(stringBuffer);
        super.l(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // defpackage.ainh
    public final byte[] b() {
        StringBuffer stringBuffer = new StringBuffer();
        this.a.a(stringBuffer);
        byte[] bytes = stringBuffer.toString().getBytes(StandardCharsets.UTF_8);
        byte[] b = super.b();
        if (bytes != null && b != null) {
            int length = b.length;
            int length2 = bytes.length;
            byte[] bArr = new byte[length2 + length];
            System.arraycopy(bytes, 0, bArr, 0, length2);
            System.arraycopy(b, 0, bArr, length2, length);
            return bArr;
        }
        return null;
    }

    @Override // defpackage.ainh
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof aini) && this.a.equals(((aini) obj).a)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.ainh
    public final int hashCode() {
        return (this.a.hashCode() * 37) + super.hashCode();
    }

    @Override // defpackage.ainh
    public final String i() {
        return this.a.b;
    }

    public final String toString() {
        return a();
    }

    public final aiks w() {
        return this.a.a;
    }
}
