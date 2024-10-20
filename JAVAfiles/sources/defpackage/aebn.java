package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.TartarusKt;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aebn implements aebo {
    private final adzj a;
    private final Optional b;

    public aebn(adzj adzjVar, Optional optional) {
        adzjVar.getClass();
        this.a = adzjVar;
        this.b = optional;
    }

    private static final byte[] b(aebn aebnVar, aecz aeczVar, aozb aozbVar) {
        return aebnVar.a.b(aozbVar, aeczVar.b);
    }

    @Override // defpackage.aebo
    public final Object i(aecz aeczVar, arpe arpeVar) {
        List<aoto> list;
        ByteBuffer put;
        if (aeczVar.e) {
            List list2 = aeczVar.d;
            list = new ArrayList(aqjn.J(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                aozy builder = ((aoto) it.next()).toBuilder();
                builder.getClass();
                aozb aozbVar = ((aoto) builder.b).b;
                aozbVar.getClass();
                aoue.b(aozb.w(b(this, aeczVar, aozbVar)), builder);
                list.add(aoue.a(builder));
            }
        } else {
            list = aeczVar.d;
        }
        if (aeczVar.c.G()) {
            int i = ambp.a;
            ambl f = ambn.a.f();
            amay amayVar = (amay) f;
            amayVar.a((byte) 0);
            amayVar.a((byte) 2);
            for (aoto aotoVar : list) {
                aotr b = aotr.b(aotoVar.c);
                if (b == null) {
                    b = aotr.UNRECOGNIZED;
                }
                f.h(b.a());
                f.i(aotoVar.b.d());
                amayVar.b(aotoVar.b.o());
            }
            byte[] e = f.q().e();
            e.getClass();
            return e;
        }
        this.b.isPresent();
        if (aeczVar.e) {
            byte[] b2 = b(this, aeczVar, aeczVar.c);
            put = ByteBuffer.allocateDirect(b2.length).put(b2);
        } else {
            put = ByteBuffer.allocateDirect(aeczVar.c.d()).put(aeczVar.c.o());
        }
        ByteBuffer byteBuffer = put;
        this.b.get();
        byteBuffer.getClass();
        aefg aefgVar = aeczVar.a;
        int i2 = aeff.a;
        int size = list.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((aoto) list.get(i3)).c;
        }
        int size2 = list.size();
        byte[][] bArr = new byte[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            byte[] H = ((aoto) list.get(i4)).b.H();
            H.getClass();
            bArr[i4] = H;
        }
        int i5 = aefgVar.a;
        int i6 = aefgVar.b;
        int i7 = aefgVar.c;
        int i8 = aefgVar.d;
        byte[] bArr2 = new byte[32];
        TartarusKt.hashScarAndProtectionComponentsV2(byteBuffer, i5, i6, i7, i8, iArr, bArr, bArr2);
        return bArr2;
    }
}
