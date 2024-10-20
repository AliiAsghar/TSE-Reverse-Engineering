package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefh {
    public static final ambk a;

    static {
        int i = ambp.a;
        ambk ambkVar = ambn.a;
        ambkVar.getClass();
        a = ambkVar;
    }

    public static final byte[] a(byte[] bArr, byte[] bArr2) {
        int i;
        bArr.getClass();
        bArr2.getClass();
        ambk ambkVar = a;
        arrt arrtVar = new arrt((byte[]) null);
        Object obj = arrtVar.c;
        int i2 = arrtVar.a;
        arrtVar.a = i2 + 1;
        ((byte[]) obj)[i2] = 1;
        arrtVar.a(bArr);
        arrtVar.a(bArr2);
        Object obj2 = arrtVar.c;
        arob it = new artb(0, 2).iterator();
        int i3 = 0;
        while (it.a) {
            Object obj3 = ((Object[]) arrtVar.b)[it.a()];
            if (obj3 != null) {
                i = arrt.b(obj3);
            } else {
                i = 1;
            }
            i3 += i;
        }
        byte[] bArr3 = new byte[i3];
        arob it2 = new artb(0, 2).iterator();
        int i4 = 0;
        int i5 = 0;
        while (it2.a) {
            int a2 = it2.a();
            Object obj4 = ((Object[]) arrtVar.b)[a2];
            if (obj4 != null) {
                if (i4 < a2) {
                    int i6 = a2 - i4;
                    System.arraycopy(obj2, i4, bArr3, i5, i6);
                    i5 += i6;
                }
                int b = arrt.b(obj4);
                System.arraycopy(obj4, 0, bArr3, i5, b);
                i5 += b;
                i4 = a2 + 1;
            }
        }
        if (i4 < 3) {
            System.arraycopy(obj2, i4, bArr3, i5, 3 - i4);
        }
        byte[] e = ambkVar.b(bArr3).e();
        e.getClass();
        return e;
    }
}
