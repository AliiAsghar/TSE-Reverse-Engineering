package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asx extends arrp implements arqv<cek, asw, Map<String, ? extends List<? extends Object>>> {
    public static final asx a = new asx();

    public asx() {
        super(2);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int i;
        asw aswVar = (asw) obj2;
        cea a2 = aswVar.a();
        if (a2 != null) {
            vh vhVar = aswVar.c;
            Object[] objArr = vhVar.b;
            long[] jArr = vhVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            i = 8 - ((~i3) >>> 31);
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                a2.f(objArr[(i2 << 3) + i4]);
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Map d = aswVar.a.d();
        if (d.isEmpty()) {
            return null;
        }
        return d;
    }
}
