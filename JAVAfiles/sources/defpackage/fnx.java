package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnx extends fnv {
    @Override // defpackage.fnv
    protected final erk b(fnu fnuVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            fjl fjlVar = new fjl(byteBuffer.array(), byteBuffer.limit());
            fjlVar.s(12);
            int g = fjlVar.g() + fjlVar.i(12);
            fjlVar.s(44);
            fjlVar.t(fjlVar.i(12));
            fjlVar.s(16);
            ArrayList arrayList = new ArrayList();
            while (fjlVar.g() < g - 4) {
                fjlVar.s(48);
                int i = fjlVar.i(8);
                fjlVar.s(4);
                int g2 = fjlVar.g() + fjlVar.i(12);
                String str = null;
                String str2 = null;
                while (fjlVar.g() < g2) {
                    int i2 = fjlVar.i(8);
                    int i3 = fjlVar.i(8);
                    int g3 = fjlVar.g() + i3;
                    if (i2 == 2) {
                        int i4 = fjlVar.i(16);
                        fjlVar.s(8);
                        if (i4 != 3) {
                        }
                        while (fjlVar.g() < g3) {
                            str = fjlVar.k(fjlVar.i(8), StandardCharsets.US_ASCII);
                            int i5 = fjlVar.i(8);
                            for (int i6 = 0; i6 < i5; i6++) {
                                fjlVar.t(fjlVar.i(8));
                            }
                        }
                    } else if (i2 == 21) {
                        str2 = fjlVar.k(i3, StandardCharsets.US_ASCII);
                    }
                    fjlVar.q(g3 * 8);
                }
                fjlVar.q(g2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new fnw(i, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new erk(arrayList);
            }
        }
        return null;
    }
}
